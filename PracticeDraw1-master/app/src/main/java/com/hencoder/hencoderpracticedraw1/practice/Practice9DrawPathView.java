package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice9DrawPathView extends View {

    public Practice9DrawPathView(Context context) {
        super(context);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float x = getWidth()/2-50;
        float y = getHeight() / 2-50;
        RectF rectF = new RectF(x,y,x+100,y+100);
        RectF rectF1 = new RectF(x + 100, y, x + 200, y + 100);
//        练习内容：使用 canvas.drawPath() 方法画心形
       // canvas.drawPath();

        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        Path path = new Path();
        path.arcTo(rectF,0,-220);
        path.lineTo(x+100,y+150);
       // path.moveTo(x + 100, y +50);
        path.arcTo(rectF1,-180,220,true);
        path.lineTo(x+100,y+150);
        //path.setFillType(Path.FillType.EVEN_ODD);
//        path.addOval(rectF, Path.Direction.CCW);
//        path.addOval(rectF1, Path.Direction.CCW);
//        path.moveTo(x,y+50);
//        path.lineTo(x+100,y+150);
//        path.rLineTo(100,-100);
       // paint.setStyle(Paint.Style.STROKE);
//        path.lineTo(x+100,y+150);
//        path.rLineTo(-100,-100);
        canvas.drawPath(path,paint);

    }
}
