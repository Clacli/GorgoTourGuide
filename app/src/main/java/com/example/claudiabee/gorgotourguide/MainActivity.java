package com.example.claudiabee.gorgotourguide;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.claudiabee.gorgotourguide.adapters.TopicFragmentPagerAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.viewpager) ViewPager viewPager;
    @BindView(R.id.tabs) TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        // Create an adapter that knows which fragment should be shown on each page
        TopicFragmentPagerAdapter topicAdapter =
                new TopicFragmentPagerAdapter(MainActivity.this, getSupportFragmentManager());

        // Hook viewPager to a Pager Adapter using setAdapter method
        viewPager.setAdapter(topicAdapter);

        tabLayout.setupWithViewPager(viewPager);

        tabLayout.setSelectedTabIndicatorColor(Color.parseColor("#000000"));
        tabLayout.setTabTextColors(Color.parseColor("#FFFFFF"), Color.parseColor("#000000"));
    }
}
