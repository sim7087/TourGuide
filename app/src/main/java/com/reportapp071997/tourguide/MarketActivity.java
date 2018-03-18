package com.reportapp071997.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MarketActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tourist);
        ArrayList<Word> place = new ArrayList<Word>();
        place.add(new Word(R.string.johari));
        place.add(new Word(R.string.tripolia));
        place.add(new Word(R.string.chandpole));
        place.add(new Word(R.string.kishan));
        place.add(new Word(R.string.nehru));
        place.add(new Word(R.string.sireh));
        place.add(new Word(R.string.bapu));
        place.add(new Word(R.string.mirza));
        PlaceAdapter adapter = new PlaceAdapter(this, place);
        ListView list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);
    }
}
