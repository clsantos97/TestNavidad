package carlos.testnavidad;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;

/**
 * Created by Carlos on 20/12/2017.
 */

public class Postal extends View {


    public Postal(Context context) {
        super(context);
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paintText = new Paint();
        paintText.setColor(Color.BLACK);

        Paint myPaint = new Paint();
        myPaint.setColor(Color.rgb(178, 7, 0));
        myPaint.setStrokeWidth(10);
        myPaint.setStyle(Paint.Style.STROKE);

        Paint gradPaint = new Paint();
        gradPaint.setShader(new RadialGradient(getWidth() / 2, getHeight() / 2,
                getHeight() / 3, getResources().getColor(R.color.postalBackgroundLg),
                getResources().getColor(R.color.postalBackgroundDk), Shader.TileMode.CLAMP));

        Bitmap bmp = BitmapFactory.decodeResource(getResources(),R.drawable.ct01min);
        Path trazo = new Path();

        RectF oval = new RectF(400, 400, 400, 400);
        trazo.addArc(oval, 180, 90);





        canvas.drawPaint(gradPaint);
        //canvas.drawBitmap(bmp,getWidth() / 2, getHeight() / 2,null);
        canvas.drawBitmap(bmp,65, 200,null);
        canvas.drawRect(100, 100, 200, 200, myPaint);

        canvas.drawTextOnPath("Feliz Navidad",trazo, 20, 200,myPaint);

    }
}
