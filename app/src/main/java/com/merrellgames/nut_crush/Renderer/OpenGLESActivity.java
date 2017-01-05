/**
 * Created by Jim on 12/20/16.
 */

package com.merrellgames.nut_crush.Renderer;

import android.opengl.GLSurfaceView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;



public class OpenGLESActivity extends AppCompatActivity
{
    private GLSurfaceView mGLView;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        mGLView = new MyGLSurfaceView(this);
        setContentView(mGLView);
    }
}
