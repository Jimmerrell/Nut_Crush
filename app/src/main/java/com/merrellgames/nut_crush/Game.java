/**
 * Created by James on 12/15/2016.
 */
package com.merrellgames.nut_crush;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;




public class Game
{
    private boolean bRunning = true;
    public Canvas canvas;
    private Paint paint = new Paint();

    public void Run()
    {
        while(!bRunning)
        {
            canvas.drawCircle(200,200,200,paint);
        }
    }

    public void CloseGame()
    {
        bRunning = false;

    }

    public void GameSetup()
    {
        paint.setColor(Color.BLACK);
    }

}
