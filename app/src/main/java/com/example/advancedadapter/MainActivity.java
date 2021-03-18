package com.example.advancedadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import model.Student;

public class MainActivity extends AppCompatActivity {


    private ListView listView;
    private Student one;
    private Student two;
    private Student three;
    private Student four;
    private Student five;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.student);
        one = new Student("Amber", "Arvizu", "Business");
        two = new Student("Jacob", "Lastinger", "Graphic Design");
        three = new Student("Alisha", "Paschall", "Marketing");
        four = new Student("Caitlin", "McKee", "Dance");
        five = new Student("Victoria", "Grant", "Chemistry");

        ArrayList<Student> students = new ArrayList<Student>(5);
        students.add(one);
        students.add(two);
        students.add(three);
        students.add(four);
        students.add(five);

        StudentAdapter adapter = new StudentAdapter(this, students);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String toast = "You Clicked: " + students.get(position).getFirstname();
                Toast.makeText(getApplicationContext(),toast,Toast.LENGTH_SHORT).show();
            }
        });


    }
}