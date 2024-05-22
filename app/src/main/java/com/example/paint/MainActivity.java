package com.example.paint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

        import android.graphics.Color;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.LinearLayout;

        import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private DrawingView drawingView;
    private Button colorButton, clearButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawingView = new DrawingView(this, null);
        drawingView.setBackgroundColor(Color.WHITE);

        colorButton = findViewById(R.id.color_button);
        colorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set color of the drawing view
                drawingView.setColor(Color.RED); // Change color here as needed
            }
        });

        clearButton = findViewById(R.id.clear_button);
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Clear drawing on the drawing view
                drawingView.clearDrawing();
            }
        });

        LinearLayout drawingLayout = findViewById(R.id.drawing_layout);
        drawingLayout.addView(drawingView);
    }
}


