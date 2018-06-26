package com.example.claudiabee.gorgotourguide;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        TopicFragmentPagerAdapter topicAdapter =
                new TopicFragmentPagerAdapter(MainActivity.this, getSupportFragmentManager());

        // Hook viewPager to a Pager Adapter using setAdapter method
        viewPager.setAdapter(topicAdapter);
    }
}
