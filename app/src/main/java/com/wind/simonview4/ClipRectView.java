package com.wind.simonview4;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by zhangcong on 2017/9/29.
 */

public class ClipRectView extends View {
    public ClipRectView(Context context) {
        super(context);
    }

    public ClipRectView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ClipRectView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        Bitmap bitmap= BitmapFactory.decodeResource(getResources(),R.drawable.circle);
        canvas.clipRect(100,100,300,200);
        canvas.drawBitmap(bitmap,0,0,new Paint());
        canvas.restore();

        canvas.save();
        //canvas.translate(100,100);
        canvas.drawBitmap(bitmap,100,300,new Paint());
        canvas.restore();

        canvas.translate(50,300);
        canvas.drawBitmap(bitmap,100,300,new Paint());


    }
}
