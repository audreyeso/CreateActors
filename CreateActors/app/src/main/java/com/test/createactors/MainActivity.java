package com.test.createactors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView mListView;
    ArrayList<Actor> actors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView) findViewById(R.id.listView);

        actors = new ArrayList<>();
        actors.add(new Actor("Shaq", "March 6, 1972", 0));
        actors.add(new Actor("Will Smith", "September 25, 1968", 0));
        actors.add(new Actor("Christopher Waltz", "October 4, 1956", 0));

        ActorArrayAdapter actorArrayAdapter = new ActorArrayAdapter(actors, MainActivity.this);

        mListView.setAdapter(actorArrayAdapter);

    }
}
