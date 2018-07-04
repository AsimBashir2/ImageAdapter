package com.example.asimbutt.poetry;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;

/**
 * Created by Asim Butt on 4/11/2017.
 */

public class Poetry extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.poetry_layout);
         ViewPager mViewPager = (ViewPager) findViewById(R.id.view_image);
        ImageAdapter adapterView = new ImageAdapter(this);
        mViewPager.setAdapter(adapterView);
    }
}
