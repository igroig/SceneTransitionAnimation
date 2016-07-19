package com.example.giorgi.projectforpresentations;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

public class ScaleActivity extends AppCompatActivity implements View.OnClickListener {
    public static final String DRAWABLE_ID_KEY = "drawableId";
    private SubsamplingScaleImageView subsanpleScaleImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {

        subsanpleScaleImageView = (SubsamplingScaleImageView) findViewById(R.id.subsanpleScaleImageView);
        subsanpleScaleImageView.setOnClickListener(this);
        int drawableId = getIntent().getIntExtra(DRAWABLE_ID_KEY, R.drawable.ic_action_alarm);
        subsanpleScaleImageView.setImage(ImageSource.resource(drawableId));

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

        }
    }


    public static void startMe(Activity activity, View sharedView, int drawableId) {
        Intent intent = new Intent(activity, ScaleActivity.class);
        intent.putExtra(DRAWABLE_ID_KEY, drawableId);
        ActivityOptionsCompat compat = ActivityOptionsCompat.makeSceneTransitionAnimation(activity, sharedView, activity.getResources().getText(R.string.trans).toString());
        activity.startActivity(intent, compat.toBundle());
    }

}
