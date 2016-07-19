package com.example.giorgi.projectforpresentations;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class ScaleMeActivity extends AppCompatActivity {

    private ImageView simple_ImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scale_me);
        initView();

    }

    private void initView() {
        simple_ImageView = (ImageView) findViewById(R.id.simple_ImageView);
        simple_ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ScaleActivity.startMe(ScaleMeActivity.this, simple_ImageView, R.drawable.placeholder);

            }
        });
    }

}
