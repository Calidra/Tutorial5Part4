package my.tutorial.tutorial5part4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.ToggleButton;
import android.widget.TextView;
import android.widget.ProgressBar;
import android.os.Handler;


public class MainActivity extends AppCompatActivity {

    ProgressBar progressBar;
    private final Handler handler = new Handler();
    Integer progressValue;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView response = findViewById(R.id.textView);
        response.setText("Update Progress Bar");
        progressValue = 0;
        progressBar = findViewById(R.id.progressBar);
        progressBar.setProgress(0);

    }

    public void Start(View view)
    {
        progressBar.setProgress(0);
    }

    public void Q1(View view)
    {
        progressBar.setProgress(25);

    }

    public void Q2(View view)
    {
        progressBar.setProgress(50);

    }

    public void Q3(View view)
    {
        progressBar.setProgress(75);
    }

    public void CompleteBtn(View view){
        progressBar.setProgress(100);
    }
}