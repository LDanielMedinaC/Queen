package android.itesm.edu.queen;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RandomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);
    }

    private String[] song = {"Bohemian Rhapsody", "Don't stop me now", "Somebody to love", "We woll rock you", "Radio gaga"};

    public void done(View view){
        Intent intent = new Intent();
        String value = song[((int)(Math.random()* 5))];
        ((TextView)findViewById(R.id.textView)).setText(value);
        intent.putExtra("random", value);
        setResult(Activity.RESULT_OK, intent);
        finish();
    }
}
