package com.reportapp071997.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class TouristActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tourist);
        ArrayList<Word> place = new ArrayList<Word>();
        place.add(new Word(R.drawable.amber_fort, R.string.amber));
        place.add(new Word(R.drawable.hawa, R.string.hawa));
        place.add(new Word(R.drawable.city, R.string.city));
        place.add(new Word(R.drawable.jantar, R.string.jantar));
        place.add(new Word(R.drawable.jaigarh, R.string.jaigarh));
        place.add(new Word(R.drawable.jal, R.string.jal));
        place.add(new Word(R.drawable.albert, R.string.albert));
        place.add(new Word(R.drawable.birla, R.string.birla));
        place.add(new Word(R.drawable.rambagh, R.string.ram));
        PlaceAdapter adapter = new PlaceAdapter(this, place);
        ListView list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);
    }
}
