package com.merrellgames.nut_crush;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;



public class MainActivity extends AppCompatActivity
{
    Game myGame = new Game();


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myGame.GameSetup();
        myGame.Run();
    }


}
