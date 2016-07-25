package com.test.createactors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Actor> actors;
    ActorArrayAdapter mAdapter;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

HEAD
        System.out.println("This is Sterling");
        System.out.println("Per Jamey's instructions, I am wreaking havoc on the main activity")



        Actor johnnyDepp = new Actor("Johnny Depp", "March 7, 1967", 3);
        Actor tinaFey = new Actor("Tina Fey", "April 9, 1960", 1);
        Actor regisPhilbin = new Actor("Regis Philbin", "August 25, 1931", 0);

        actorList = new ArrayList<Actor>();

        actorList.add(johnnyDepp);
        actorList.add(tinaFey);

        actors = new ArrayList<>();
        actors.add(new Actor("Shaq", "March 6, 1972", 0));
        actors.add(new Actor("Will Smith", "September 25, 1968", 0));
        actors.add(new Actor("Christopher Waltz", "October 4, 1956", 0));


        listView = (ListView) findViewById(R.id.listView);
        mAdapter = new ActorArrayAdapter(actors, MainActivity.this);
        listView.setAdapter(mAdapter);

    }
}
