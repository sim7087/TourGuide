package com.reportapp071997.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class StreetFoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tourist);
        ArrayList<Word> place = new ArrayList<Word>();
        place.add(new Word(R.drawable.gol, R.string.gol));
        place.add(new Word(R.drawable.kachori, R.string.pyaaz));
        place.add(new Word(R.drawable.masala, R.string.masalChai));
        place.add(new Word(R.drawable.kathi, R.string.roll));
        place.add(new Word(R.drawable.pav, R.string.pav));
        place.add(new Word(R.drawable.omelette, R.string.omlete));
        place.add(new Word(R.drawable.chicken, R.string.chick));
        place.add(new Word(R.drawable.sri, R.string.fal));
        PlaceAdapter adapter = new PlaceAdapter(this, place);
        ListView list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);
    }
}
