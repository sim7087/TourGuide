package com.reportapp071997.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView touristPlace;
    TextView restaurant;
    TextView streetFood;
    TextView localMarket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        touristPlace = (TextView) findViewById(R.id.tourist_text_view);
        restaurant = (TextView) findViewById(R.id.eat_text_view);
        streetFood = (TextView) findViewById(R.id.street_text_view);
        localMarket = (TextView) findViewById(R.id.market_text_view);
        touristPlace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, TouristActivity.class);
                startActivity(i);
            }
        });
        streetFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, StreetFoodActivity.class);
                startActivity(i);
            }
        });
        localMarket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, MarketActivity.class);
                startActivity(i);
            }
        });
        restaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, RestaurantActivity.class);
                startActivity(i);
            }
        });
    }
}
