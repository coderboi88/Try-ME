package com.example.tryme;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private View windowView;
    private Button trymeButton;
    private int[] colors;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colors = new int[]{Color.RED,Color.YELLOW,Color.CYAN,Color.GRAY,Color.GREEN,Color.BLACK,Color.BLUE,Color.MAGENTA,Color.WHITE,Color.LTGRAY};


        windowView = findViewById(R.id.windowView);

        trymeButton = (Button) findViewById(R.id.tryMeButton);
        trymeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int randomNum = random.nextInt(colors.length);

                windowView.setBackgroundColor(colors[randomNum]);
            }
        });
    }
}
