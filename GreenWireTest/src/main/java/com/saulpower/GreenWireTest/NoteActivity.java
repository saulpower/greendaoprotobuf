/*
 * Copyright (C) 2011 Markus Junginger, greenrobot (http://greenrobot.de)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.saulpower.GreenWireTest;

import android.app.ListActivity;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.google.gson.*;
import de.greenrobot.dao.DaoEnum;
import de.greenrobot.daoexample.database.*;
import de.greenrobot.daoexample.database.DaoMaster.DevOpenHelper;
import de.greenrobot.sync.GreenSync;

import java.lang.reflect.Type;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;

public class NoteActivity extends ListActivity {

    public final String TAG = getClass().getSimpleName();

    private SQLiteDatabase db;

    private EditText editText;

    private DaoMaster daoMaster;
    private DaoSession daoSession;
    private NoteDao noteDao;
    private List<Note> notes;
    private MyAdapter adapter;
    private GreenSync greenSync;

    public static class MyAdapter extends ArrayAdapter<Note> {

        int mResource;
        LayoutInflater mInflater;

        public MyAdapter(Context context, int resource, List<Note> objects) {
            super(context, resource, objects);

            mResource = resource;
            mInflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            View view = convertView;
            ViewHolder viewHolder;

            if (view == null) {
                view = mInflater.inflate(mResource, parent, false);
                TextView title = (TextView) view.findViewById(android.R.id.text1);
                TextView subTitle = (TextView) view.findViewById(android.R.id.text2);
                viewHolder = new ViewHolder(title, subTitle);
                view.setTag(viewHolder);
            } else {
                viewHolder = (ViewHolder) view.getTag();
            }

            Note note = getItem(position);

            viewHolder.title.setText(note.getText());
            viewHolder.subTitle.setText(note.getComment());

            return view;
        }

        static class ViewHolder {

            public ViewHolder(TextView title, TextView subTitle) {
                this.title = title;
                this.subTitle = subTitle;
            }

            TextView title;
            TextView subTitle;
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.notes);

        greenSync = new GreenSync();

        DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, "notes-db", null);
        db = helper.getWritableDatabase();
        daoMaster = new DaoMaster(db);
        daoSession = daoMaster.newSession();
        noteDao = daoSession.getNoteDao();

        notes = noteDao.loadAll();
        toJson();

        adapter = new MyAdapter(this, android.R.layout.simple_list_item_2, notes);
        setListAdapter(adapter);

        editText = (EditText) findViewById(R.id.editTextNote);
        addUiListeners();
    }

    protected void addUiListeners() {
        editText.setOnEditorActionListener(new OnEditorActionListener() {

            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    addNote();
                    return true;
                }
                return false;
            }
        });

        final View button = findViewById(R.id.buttonAdd);
        button.setEnabled(false);
        editText.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                boolean enable = s.length() != 0;
                button.setEnabled(enable);
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
    }

    public void onMyButtonClick(View view) {
        addNote();
    }

    private void addNote() {
        String noteText = editText.getText().toString();
        editText.setText("");

        final DateFormat df = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);
        String comment = "Added on " + df.format(new Date());
        Note note = new Note(comment, noteText, null, NoteType.FRISBEE);
        note.setCreatedOn(new Date());
        note.setUpdatedOn(new Date());
        noteDao.insert(note);

        notes.add(note);
        adapter.notifyDataSetChanged();

        toJson();
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {

        noteDao.delete(notes.get(position));

        notes.remove(position);
        adapter.notifyDataSetChanged();
    }

    private void toJson() {
        Log.i(TAG, "JSON: " + greenSync.<Note>sync(Note.class, notes));
    }

    private class EnumSerializer<T extends DaoEnum> implements JsonSerializer<T>, JsonDeserializer<T> {
        public JsonElement serialize(T src, Type typeOfSrc, JsonSerializationContext context) {
            return new JsonPrimitive(src.getValue());
        }

        @Override
        public T deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {

            return null;
        }
    }

    private class DateSerializer implements JsonSerializer<Date> {
        public JsonElement serialize(Date src, Type typeOfSrc, JsonSerializationContext context) {
            return new JsonPrimitive(src.getTime());
        }
    }
}