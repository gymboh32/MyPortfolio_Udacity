package org.ragecastle.myportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button spotifyStreamerButton = (Button) findViewById(R.id.spotify_streamer_button);
        spotifyStreamerButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,
                        "This button will launch the Spotify Streamer app",
                        Toast.LENGTH_LONG)
                        .show();
            }
        });

        Button scoresButton = (Button) findViewById(R.id.scores_button);
        scoresButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,
                        "This button will launch the Scores app",
                        Toast.LENGTH_LONG)
                        .show();
            }
        });

        Button libraryButton = (Button) findViewById(R.id.library_button);
        libraryButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,
                        "This button will launch the Library app",
                        Toast.LENGTH_LONG)
                        .show();
            }
        });

        Button buildItBiggerButton = (Button) findViewById(R.id.build_it_bigger_button);
        buildItBiggerButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,
                        "This button will launch Build It Bigger",
                        Toast.LENGTH_LONG)
                        .show();
            }
        });

        Button xyzReaderButton = (Button) findViewById(R.id.xyz_reader_button);
        xyzReaderButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,
                        "This button will launch the XYZ Reader",
                        Toast.LENGTH_LONG)
                        .show();
            }
        });

        Button capstoneButton = (Button) findViewById(R.id.capstone_button);
        capstoneButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,
                        "This button will launch my capstone app",
                        Toast.LENGTH_LONG)
                        .show();
            }
        });


    }
}
