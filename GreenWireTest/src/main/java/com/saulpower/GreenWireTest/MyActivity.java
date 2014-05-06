package com.saulpower.GreenWireTest;

import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.saulpower.GreenWireTest.database.*;
import de.greenrobot.dao.sync.GreenSync;
import de.greenrobot.dao.sync.SyncService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Modifier;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class MyActivity extends Activity {

    public final String TAG = getClass().getSimpleName();

    private GreenSync greenSync;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, "notes-db", null);
        SQLiteDatabase db = helper.getWritableDatabase();

        DaoMaster daoMaster = new DaoMaster(db);
        greenSync = new GreenSync(daoMaster.newSession(), MySyncServce.get(this));

//        smartTest();
//        jsonTest();
        loadTest();
    }

    private void smartTest() {
        StudentDao studentDao = GreenWireApplication.getDaoSession().getStudentDao();
        PersonDao personDao = GreenWireApplication.getDaoSession().getPersonDao();

        Student student = studentDao.load(Long.valueOf(1));
        Person person = personDao.load(Long.valueOf(1));

//        Student student = new Student();
//        student.setYearInSchool("Sophomore");
//
//        studentDao.insert(student);

//        Person person = new Person();
//        person.setFirstName("Saul");
//        person.setLastName("Howard");
//        person.setEmailAddresses("saulpower1@gmail.com");
//        person.setBlackListStudentId(student.getId());
//
//        personDao.insert(person);

        final GsonBuilder builder = new GsonBuilder();
        builder.excludeFieldsWithModifiers(Modifier.TRANSIENT);
        final Gson gson = builder.create();

        Map<String, Object> data = new HashMap<String, Object>();
        data.put("student", student);
        data.put("person", person);

        String json = gson.toJson(data);

        Log.i("MyActivity", "Inserted new student, ID: " + student.getId());

        String guid = "21EC2020-3AEA-4069-A2DD-08002B30309D".toLowerCase();
        UUID id = UUID.fromString(guid);
        long least = id.getLeastSignificantBits();
        long most = id.getMostSignificantBits();

        UUID second = new UUID(most, least);
        String secondId = second.toString();

        TextView textView = (TextView) findViewById(R.id.text);
        textView.setText((guid.equalsIgnoreCase(secondId) ? "MATCH" : "WRONG") + "\nFirst:\t\t\t" + guid + "\nSecond:\t" + secondId + "\nMost:\t\t\t" + Long.toString(most) + "\nLeast:\t\t\t" + Long.toString(least) + "\n\nJSON:\n\n" + json);
    }

    private void loadTest() {

        greenSync.loadAll(Center.class, new SyncService.ObjectListener<Center>() {
            @Override
            public void onObjectsLoaded(List<Center> objects) {
                for (Center center : objects) {
                    Log.i(TAG, "M Center: " + center.getGuid());
                }
            }
        });

        greenSync.load(Center.class, "e975e690-301d-49d2-ad7f-b7efea93df54", new SyncService.ObjectListener<Center>() {
            @Override
            public void onObjectsLoaded(List<Center> objects) {
                for (Center center : objects) {
                    Log.i(TAG, "S Center: " + center.getGuid());
                }
            }
        });
    }

    private void jsonTest() {

        String centers = loadFile("center");
        Gson gson = greenSync.getGson();

        Center center =  gson.fromJson(centers, Center.class);

        // 2014-03-31T20:07:21.123
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'kk:mm:ss.SSS", Locale.ENGLISH);

        try {
            Date date = df.parse(center.getDateCreated());
            Log.i(TAG, "Center: " + center.getDateCreated() + " = " + df.format(date));
        } catch (Exception ex) {

        }
    }

    private String loadFile(String file) {
        try {
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(getAssets().open(file)));

            StringBuilder builder = new StringBuilder();

            // do reading, usually loop until end of file reading
            String mLine = reader.readLine();
            while (mLine != null) {
                builder.append(mLine);
                mLine = reader.readLine();
            }
            reader.close();

            return builder.toString();

        } catch (IOException e) {
            //log the exception
        }

        return null;
    }
}
