package com.spacemodal.bossrush;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class CharacterCreationActivity extends AppCompatActivity {

    Button doneButton;
    MediaPlayer music;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_creation);
        setupMusic();
        setupDoneButton();
    }

    public void setupMusic(){
        music = MediaPlayer.create(this, R.raw.pc_cc_music);
        music.start();
    }
    public void setupDoneButton(){
        doneButton = findViewById(R.id.cc_done_button);

        doneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToBossRoom();
            }
        });
    }

    public void goToBossRoom(){
        music.stop();
        Intent bossRoomIntent = new Intent(getApplicationContext(), BossRoomActivity.class);
        startActivity(bossRoomIntent);
        finish();
    }

}
