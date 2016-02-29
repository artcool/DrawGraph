package com.sinwao.drawgraph.View;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by artcool.
 *
 * @创建时间 16/2/29
 * @描述  自定义view
 */
public class GraphicsView extends View {

    private final Paint mPaint;

    public GraphicsView(Context context) {
        super(context);

        mPaint = new Paint();   //初始化paint对象；画笔
    }

    //重写onDraw方法，进行详细绘制
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //设置画布背景色
        canvas.drawColor(Color.BLUE);   //蓝色

        //设置画笔颜色
        mPaint.setColor(Color.BLACK);   //黑色

        //使用当前画笔绘制一个矩形
        canvas.drawRect(100,30,//左上角
                360,180,        //右下角
                mPaint);

        //设置画笔颜色
        mPaint.setColor(Color.RED);

        //使用当前画笔绘制一个圆形
        canvas.drawCircle(200,100,  //圆心坐标
                60,mPaint);
    }
}
