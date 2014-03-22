package com.saulpower.GreenWireTest;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.saulpower.GreenWireTest.database.Person;
import com.saulpower.GreenWireTest.database.PersonDao;
import com.saulpower.GreenWireTest.database.Student;
import com.saulpower.GreenWireTest.database.StudentDao;

import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class MyActivity extends Activity {

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        smartTest();
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
}
