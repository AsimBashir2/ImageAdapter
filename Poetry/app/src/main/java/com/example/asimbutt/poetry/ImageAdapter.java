package com.example.asimbutt.poetry;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by Asim Butt on 4/11/2017.
 */

public class ImageAdapter extends PagerAdapter
{
    Context mContext;

    ImageAdapter(Context context) {
        this.mContext = context;
    }

    @Override
    public int getCount() {
        return sliderImagesId.length;
    }

    private int[] sliderImagesId = new int[]{
            R.drawable.a1, R.drawable.a2, R.drawable.a3,
            R.drawable.a4, R.drawable.a5, R.drawable.a6,
            R.drawable.a7, R.drawable.a8, R.drawable.a9,
            R.drawable.a10, R.drawable.a11, R.drawable.a12,
            R.drawable.a13, R.drawable.a14, R.drawable.a15,
            R.drawable.a16, R.drawable.a17, R.drawable.a18,
            R.drawable.a19, R.drawable.a20, R.drawable.a21,
            R.drawable.a22, R.drawable.a23, R.drawable.a24,
            R.drawable.a25, R.drawable.a26, R.drawable.a27,
            R.drawable.a25, R.drawable.a26, R.drawable.a27,
            R.drawable.a28, R.drawable.a29, R.drawable.a30,
            R.drawable.a31, R.drawable.a32, R.drawable.a33,
            R.drawable.a34, R.drawable.a35, R.drawable.a36,
            R.drawable.a37, R.drawable.a38,
            


    };

    @Override
    public boolean isViewFromObject(View v, Object obj) {
        return v == ((ImageView) obj);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int i) {
        ImageView mImageView = new ImageView(mContext);
        mImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        mImageView.setImageResource(sliderImagesId[i]);
        ((ViewPager) container).addView(mImageView, 0);
        return mImageView;
    }

    @Override
    public void destroyItem(ViewGroup container, int i, Object obj) {
        ((ViewPager) container).removeView((ImageView) obj);
    }
}


