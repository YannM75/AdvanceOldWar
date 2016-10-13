package com.javascource.advanceoldwars.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;

/**
 * Created by Yann on 13/10/2016.
 */

public class GameTestView extends SurfaceView implements View.OnClickListener,
        View.OnTouchListener, SurfaceHolder.Callback, Runnable {

    public GameTestView(Context context, AttributeSet attrs){
        super(context, attrs);
    }
    @Override
    public void surfaceCreated(SurfaceHolder holder) {

    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {

    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return false;
    }

    @Override
    public void run() {

    }
}
