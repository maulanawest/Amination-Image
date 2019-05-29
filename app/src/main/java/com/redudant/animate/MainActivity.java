package com.redudant.animate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView ironman, tony;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ironman = (ImageView) findViewById(R.id.ironman);
        tony = (ImageView) findViewById(R.id.tony);
    }

    public void fade(View view) {

        ironman.animate().alpha(0.f).setDuration(2000);
        tony.animate().alpha(1.f).setDuration(2000);

    }
}
