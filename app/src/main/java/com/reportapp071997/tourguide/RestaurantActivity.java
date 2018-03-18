package com.reportapp071997.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tourist);
        ArrayList<Word> place = new ArrayList<Word>();
        place.add(new Word(R.string.tapri));
        place.add(new Word(R.string.lakshmi));
        place.add(new Word(R.string.rawat));
        place.add(new Word(R.string.om));
        place.add(new Word(R.string.spice));
        place.add(new Word(R.string.dragon));
        place.add(new Word(R.string.sharma));
        PlaceAdapter adapter = new PlaceAdapter(this, place);
        ListView list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);
    }
}
