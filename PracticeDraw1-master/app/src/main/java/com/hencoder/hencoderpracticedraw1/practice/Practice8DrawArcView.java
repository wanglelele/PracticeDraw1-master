package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //        练习内容：使用 canvas.drawArc() 方法画弧形和扇形
        float x = (getWidth() - getHeight() / 2) / 2;
        float y = getHeight() / 4;
        RectF oval = new RectF( x, y, getWidth() - x, getHeight() - y);//圆弧或扇形所在的正方形边框
        Paint pRect = new Paint();//绘制正方形边框的画笔
        pRect.setStyle(Paint.Style.STROKE);//设置为画线模式
        pRect.setColor(Color.RED);//设置边框颜色为红色
        canvas.drawRect(oval,pRect);//画边框

        Paint pArc = new Paint();//绘制圆弧或扇形的画笔
        pArc.setStyle(Paint.Style.STROKE);//设置画笔为画线模式
        canvas.drawArc(oval,-120,-60,false,pArc);//绘制圆弧或扇形

        Paint pArc1 = new Paint();//绘制圆弧或扇形的画笔
        pArc1.setStyle(Paint.Style.FILL);
        canvas.drawArc(oval,-120,100,true,pArc1);//绘扇形

        Paint pArc2 = new Paint();//绘制圆弧或扇形的画笔
        pArc2.setStyle(Paint.Style.FILL);
        canvas.drawArc(oval,15,145,false,pArc2);//绘制圆弧
       // canvas.drawArc(100,100,400,300,-30,90,true,paint);
        //canvas.drawArc(100,100,200,300,30,90,true,paint);
        //canvas.drawArc(200, 100, 800, 500, 20, 140, false, paint); // 绘制弧形

        //canvas.drawArc(50,300,400,500,-30,90,true,paint);
       // canvas.drawArc(200, 100, 300, 300, -90, 90, false, paint); // 绘制扇形
    }
}
