package com.spacemodal.bossrush;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;


public class LoginActivity extends AppCompatActivity {
    Button loginButton;
    MediaPlayer music;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setupMusic();
        setupLoginButton();
    }

    public void setupMusic(){
        music = MediaPlayer.create(this, R.raw.pc_title_music);
        music.start();
    }

    public void setupLoginButton(){
        loginButton = findViewById(R.id.login_button);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToCharacterCreation();
            }
        });
    }

    public void goToCharacterCreation(){
        music.stop();
        Intent characterCreationIntent = new Intent(getApplicationContext(), CharacterCreationActivity.class);
        startActivity(characterCreationIntent);
        finish();
    }
}
