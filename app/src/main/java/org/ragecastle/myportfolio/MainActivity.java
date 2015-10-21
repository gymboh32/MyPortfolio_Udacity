package org.ragecastle.myportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View v){
        String appName = "";
        int id = v.getId();

        switch (id){
            case R.id.spotify_streamer_button:
                appName = "Spotify Streamer";
                break;
            case R.id.scores_button:
                appName = "Scores";
                break;
            case R.id.library_button:
                appName = "Library";
                break;
            case R.id.build_it_bigger_button:
                appName = "Build It Bigger";
                break;
            case R.id.xyz_reader_button:
                appName = "XYZ Reader";
                break;
            case R.id.capstone_button:
                appName = "Capstone";
                break;
        }

        Toast.makeText(MainActivity.this,"This button will launch the " + appName + " app.", Toast.LENGTH_LONG).show();
    }
}
