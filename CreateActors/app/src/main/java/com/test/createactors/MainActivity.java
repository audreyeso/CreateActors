package com.test.createactors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActorArrayAdapter mAdapter;
    ArrayList <Actor> actorList;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("This is Sterling");
        System.out.println("Per Jamey's instructions, I am wreaking havoc on the main activity")



        Actor johnnyDepp = new Actor("Johnny Depp", "March 7, 1967", 3);
        Actor tinaFey = new Actor("Tina Fey", "April 9, 1960", 1);
        Actor regisPhilbin = new Actor("Regis Philbin", "August 25, 1931", 0);

        actorList = new ArrayList<Actor>();

        actorList.add(johnnyDepp);
        actorList.add(tinaFey);
        actorList.add(regisPhilbin);

        listView = (ListView) findViewById(R.id.listView);
        mAdapter = new ActorArrayAdapter(actorList, MainActivity.this);
        listView.setAdapter(mAdapter);

    }
}
