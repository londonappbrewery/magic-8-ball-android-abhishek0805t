package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{
    private ImageView image;
    private Button button;
    private int[] images;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image = findViewById(R.id.image);
        button = findViewById(R.id.btn);
        images = new int[]{R.drawable.ball1,R.drawable.ball2,R.drawable.ball3,R.drawable.ball4,R.drawable.ball5};
        button.setOnClickListener(new View.OnClickListener()
    {
        @Override
        public void onClick(View view)
        {
            Random rand = new Random();
            int randomNumber = rand.nextInt(4);
            image.setImageResource(images[randomNumber]);
        }
    });
    }

}
