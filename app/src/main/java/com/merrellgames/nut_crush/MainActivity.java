package com.merrellgames.nut_crush;

import com.merrellgames.nut_crush.Renderer.GameRenderer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SurfaceView;


public class MainActivity extends AppCompatActivity
{
    Game myGame; //= new Game();
    SurfaceView m_GameRenderer;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        myGame = new Game();

        m_GameRenderer = new SurfaceView(this, myGame);
        setContentView(m_GameRenderer);
        getActionBar().hide();

        myGame.GameSetup();
        myGame.Run();
    }


}
