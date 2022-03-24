package com.example.lab6mc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity3 extends AppCompatActivity {
ImageView img;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        img = (ImageView) this.findViewById(R.id.imageView2);


    }
      public void onclick(View view)
      {
          Intent intent=new Intent(MainActivity3.this,MainActivity.class);
          startActivity(intent);
      }


    }
