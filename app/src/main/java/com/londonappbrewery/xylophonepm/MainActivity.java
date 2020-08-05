package com.londonappbrewery.xylophonepm;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    // Helpful Constants
    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;

    // TODO: Add member variables here
    private SoundPool mSoundPool;
    private int mCSoundId;
    private int mDSoundId;
    private int mESoundId;
    private int mFSoundId;
    private int mGSoundId;
    private int mASoundId;
    private int mBSoundId;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Create a new SoundPool
        mSoundPool = new SoundPool.Builder().setMaxStreams(NR_OF_SIMULTANEOUS_SOUNDS).build();


        // TODO: Load and get the IDs to identify the sounds
        mCSoundId = mSoundPool.load(getApplicationContext(), R.raw.note1_c, 1);
        mDSoundId = mSoundPool.load(getApplicationContext(), R.raw.note2_d, 1);
        mESoundId = mSoundPool.load(getApplicationContext(), R.raw.note3_e, 1);
        mFSoundId = mSoundPool.load(getApplicationContext(), R.raw.note4_f, 1);
        mGSoundId = mSoundPool.load(getApplicationContext(), R.raw.note5_g, 1);
        mASoundId = mSoundPool.load(getApplicationContext(), R.raw.note6_a, 1);
        mBSoundId = mSoundPool.load(getApplicationContext(), R.raw.note7_b, 1);


    }

    // TODO: Add the play methods triggered by the buttons
    public void playC(View V){
        mSoundPool.play(mCSoundId, 1, 1,1,0, 1);
    }

    public void playD(View V){
        mSoundPool.play(mDSoundId, 1, 1,1,0, 1);
    }

    public void playE(View V){
        mSoundPool.play(mESoundId, 1, 1,1,0, 1);
    }

    public void playF(View V){
        mSoundPool.play(mFSoundId, 1, 1,1,0, 1);
    }

    public void playG(View V){
        mSoundPool.play(mGSoundId, 1, 1,1,0, 1);
    }

    public void playA(View V){
        mSoundPool.play(mASoundId, 1, 1,1,0, 1);
    }

    public void playB(View V){
        mSoundPool.play(mBSoundId, 1, 1,1,0, 1);
    }

}
