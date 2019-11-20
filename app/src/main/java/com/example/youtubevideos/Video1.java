package com.example.youtubevideos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.youtubevideos.R;
import com.example.youtubevideos.youtubeConfig;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import java.util.ArrayList;
import java.util.List;

public class Video1 extends YouTubeBaseActivity {

    YouTubePlayerView youtubeplayer2;
    Button button;
    YouTubePlayer.OnInitializedListener onInitializedListener1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video1);
        youtubeplayer2 = (YouTubePlayerView) findViewById(R.id.view2);
        button = (Button) findViewById(R.id.button);

        onInitializedListener1 = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                //List<String> videoList = new ArrayList<>();
                //videoList.add("fhzLI3kD4Y0");
                //videoList.add("JCjIrEQCzWM");
                youTubePlayer.loadVideo("fhzLI3kD4Y0");
                //youTubePlayer.loadPlaylist("PLzBvnj9Rw7cDVN3yE7mscKmLcMmDTRDsM");
                //thumbnailLoader.setPlaylist("PLzBvnj9Rw7cDVN3yE7mscKmLcMmDTRDsM");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };

         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                youtubeplayer2.initialize(youtubeConfig.getApiKey(), onInitializedListener1);
            }
         });
    }
}
