package com.example.drawingboardview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private DrawingBoardView drawingBoardView;
    private LinearLayout llChooseColor;
    private int[] colors = new int[] {R.color.black, R.color.red, R.color.yellow, R.color.green, R.color.perpul};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawingBoardView = findViewById(R.id.drawingboardview);
        llChooseColor = findViewById(R.id.ll_choosecolor);

        findViewById(R.id.tv_clear).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawingBoardView.clearPanel();
            }
        });

        findViewById(R.id.tv_save).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        for (int i=0;i<llChooseColor.getChildCount();i++) {
            final int finalI = i;
            llChooseColor.getChildAt(i).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    drawingBoardView.setPaintColor(getResources().getColor(colors[finalI]));
                }
            });
        }
    }
}