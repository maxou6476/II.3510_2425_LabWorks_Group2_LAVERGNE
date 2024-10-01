package fr.isep.tp1;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private TextView textView;
    private Button button1;
    private Button button2;
    private Button button3;
    private int[] colors = {Color.RED, Color.GREEN, Color.BLUE};
    private int[] fontsizes = {10, 20, 30, 40, 50, 60, 70, 80, 90};
    private int colorIndex = 0;
    private int fontIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText_app);
        textView = findViewById(R.id.textView_app);
        button1 = findViewById(R.id.button1_app);
        button2 = findViewById(R.id.button2_app);
        button3 = findViewById(R.id.button3_app);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText = editText.getText().toString();
                textView.setText(inputText);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setTextColor(colors[colorIndex]);

                colorIndex = (colorIndex + 1) % colors.length;
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setTextSize(fontsizes[fontIndex]);

                fontIndex = (fontIndex + 1) % fontsizes.length;
            }
        });
    }
}
