package com.wind.simonview4;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by zhangcong on 2017/10/11.
 */

public class RotateView extends View {
    public RotateView(Context context) {
        super(context);
    }

    public RotateView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public RotateView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Bitmap bitmap= BitmapFactory.decodeResource(getResources(),R.drawable.circle);
        canvas.rotate(45,200,200);
        canvas.drawBitmap(bitmap,100,100,new Paint());

        Matrix matrix=new Matrix();
        matrix.postRotate(50,300,500);
        canvas.concat(matrix);
        canvas.drawBitmap(bitmap,100,400,new Paint());
    }
}
