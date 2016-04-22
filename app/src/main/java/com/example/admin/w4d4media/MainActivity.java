package com.example.admin.w4d4media;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    private static final String URL = "http://techslides.com/demos/sample-videos/small.mp4";

    private VideoView mVideoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Uri uri = Uri.parse(URL);

        mVideoView = (VideoView) findViewById(R.id.a_main_videoview);

        mVideoView.setVideoURI(uri);
        mVideoView.requestFocus();
        mVideoView.start();
    }

    public void onPlay(View view) {
        mVideoView.start();
    }

    public void onPause(View view) {
        mVideoView.pause();
    }
}
