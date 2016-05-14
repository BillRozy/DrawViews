package com.example.fd.learndraw;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import java.util.ArrayList;

/**
 * Created by FD on 12.05.2016.
 */
public class TrackView extends LinearLayout {
    public TrackView(Context context){
        super(context);
        this.setBackgroundColor(Color.GRAY);
        init();
    }
    public TrackView(Context context, AttributeSet attrs){
        super(context,attrs);
        this.setBackgroundColor(Color.GRAY);
        init();
    }

    public void init(){
        hitViewArrayList = new ArrayList<>();
        int mNumberOfHits = 16;
        for(int i = 0; i< mNumberOfHits; i++){
            hitViewArrayList.add(new HitView(this.getContext(),false));
        }
   }

   // @Override
    //protected void onDraw(Canvas canvas) {
       // super.onDraw(canvas);
     //  for(HitView hit : hitViewArrayList){
     //    this.addView(hit);
     //  }
    //}

    @Override
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        LayoutParams lp = new LayoutParams(0,0);
        //for(HitView hit : hitViewArrayList){
            this.addView(hitViewArrayList.get(0));
       // }
    }

    private ArrayList<HitView> hitViewArrayList = null;
}
