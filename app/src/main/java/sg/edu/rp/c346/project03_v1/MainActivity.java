package sg.edu.rp.c346.project03_v1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnPlay;
    Button btnAnswers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnPlay = (Button)findViewById(R.id.btnPlay);
        btnAnswers = (Button)findViewById(R.id.btnAns);

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent list = new Intent(getBaseContext(), ThemeList.class);
                startActivity(list);
            }
        });

        btnAnswers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent list = new Intent(getBaseContext(), Answers.class);
                startActivity(list);
            }
        });
    }
}
