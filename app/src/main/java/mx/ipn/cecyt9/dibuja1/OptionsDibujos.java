package mx.ipn.cecyt9.dibuja1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.view.View;

public class OptionsDibujos extends View {
    Paint config = new Paint();

    public OptionsDibujos(Context context) {
        super(context);
    }

    @Override
    public void onDraw(Canvas canvas) {

        config.reset();
        config.setStyle(Paint.Style.FILL);

        RectF ovalo1 =  new RectF(40,700,50,30);
        Path trazo = new Path();
        trazo.moveTo(140, 600);
        trazo.cubicTo(140,600, 240,800, 340,600);
        trazo.moveTo(340, 600);
        trazo.cubicTo(340,600, 390,520, 440,700);
        trazo.moveTo(440, 700);
        trazo.cubicTo(440,700, 390,880, 340,800);
        trazo.moveTo(340, 800);
        trazo.cubicTo(340,800, 240,600, 140,800);
        trazo.moveTo(140, 800);
        trazo.cubicTo(140,800, 90,880, 40,700);
        trazo.moveTo(40, 700);
        trazo.cubicTo(40,700, 90,520, 140,600);

        config.reset();
        config.setColor(Color.RED);
        config.setStrokeWidth(4);
        config.setStyle(Paint.Style.STROKE);
        canvas.drawPath(trazo, config);
        config.setStrokeWidth(3);
        config.setStyle(Paint.Style.FILL);
        config.setTextSize(30);
        config.setTypeface(Typeface.SERIF);
        canvas.drawTextOnPath("Carol Zapata", trazo, 0, 30, config);

        config.reset();
        //.drawText(text, x, y, paint)
        config.setColor(Color.BLACK);
        config.setTextSize(30);
        config.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD_ITALIC));
        canvas.drawText("Figuras", 350, 30, config);
        canvas.drawText("Carol Zapata", 350, 60, config);

        config.reset();
        //octagono
        Path octagono = new Path();
        float[] puntos = new float[16];
        puntos[0] = (float) 200+160;
        puntos[1] = (float) 200+80;
        //puntos[2] = (float) 200+80;
        //puntos[3] = (float) 200+160;
        puntos[4] = (float) 200-80;
       // puntos[5] = (float) 200+160;
        puntos[6] = (float) 200-160;
       // puntos[7] = (float) 200+80;
        //puntos[8] = (float) 200-160;
        //puntos[9] = (float) 200-80;
        //puntos[10] = (float) 200-80;
        //puntos[11] = (float) 200-160;
        //puntos[12] = (float) 200+80;
        //puntos[13] = (float) 200-160;
        //puntos[14] = (float) 200+160;
        //puntos[15] = (float) 200-80;

        config.setColor(Color.RED);
        config.setStrokeWidth(4);
        canvas.drawLine(puntos[0], puntos[1], puntos[1], puntos[0], config);
        canvas.drawLine(puntos[1], puntos[0], puntos[4], puntos[0], config);
        canvas.drawLine(puntos[4], puntos[0], puntos[6], puntos[1], config);
        canvas.drawLine(puntos[6], puntos[1], puntos[6], puntos[4], config);
        canvas.drawLine(puntos[6], puntos[4], puntos[4], puntos[6], config);
        canvas.drawLine(puntos[4], puntos[6], puntos[1], puntos[6], config);
        canvas.drawLine(puntos[1], puntos[6], puntos[0], puntos[4], config);
        canvas.drawLine(puntos[0], puntos[4], puntos[0], puntos[1], config);

        config.reset();
        //estrella
        config.setColor(Color.RED);
        float[] Arista = new float[20];
        Arista[0] = (float) 1200-80;
        Arista[1] = (float) 430-40;
        Arista[2] = (float) 1200-120;
        Arista[3] = (float) 430-160;
        Arista[4] = (float) 1200-40;
        Arista[5] = (float) 430-230;
        Arista[6] = (float) 1200-160;
        Arista[7] = (float) 430-240;
        Arista[8] = (float) 1200-200;
        Arista[9] = (float) 430-350;
        Arista[10] = (float) 1200-240;
        Arista[11] = (float) 430-240;
        Arista[12] = (float) 1200-380;
        Arista[13] = (float) 430-230;
        Arista[14] = (float) 1200-280;
        Arista[15] = (float) 430-160;
        Arista[16] = (float) 1200-320;
        Arista[17] = (float) 430-40;
        Arista[18] = (float) 1200-200;
        Arista[19] = (float) 430-120;

        config.setStrokeWidth(3);
        canvas.drawLine(Arista[0], Arista[1], Arista[2], Arista[3], config);
        canvas.drawLine(Arista[2], Arista[3], Arista[4], Arista[5], config);
        canvas.drawLine(Arista[4], Arista[5], Arista[6], Arista[7], config);
        canvas.drawLine(Arista[6], Arista[7], Arista[8], Arista[9], config);
        canvas.drawLine(Arista[8], Arista[9], Arista[10], Arista[11], config);
        canvas.drawLine(Arista[10], Arista[11], Arista[12], Arista[13], config);
        canvas.drawLine(Arista[12], Arista[13], Arista[14], Arista[15], config);
        canvas.drawLine(Arista[14],   Arista[15], Arista[16], Arista[17], config);
        canvas.drawLine(Arista[16], Arista[17], Arista[18], Arista[19], config);
        canvas.drawLine(Arista[18], Arista[19], Arista[0], Arista[1], config);


    }

}
