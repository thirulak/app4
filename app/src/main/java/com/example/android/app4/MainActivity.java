package com.example.android.app4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.facebook.shimmer.ShimmerFrameLayout;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            ShimmerFrameLayout container= (ShimmerFrameLayout) findViewById(R.id.shimmer_view_container1);
            container.startShimmerAnimation();
        }
}
