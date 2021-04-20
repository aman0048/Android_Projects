package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int countA=0;
    int countB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(countA);
        displayForTeamB(countB);
    }

    public void display3(View view){
        countA+=3;
        displayForTeamA(countA);
    }

    public void display2(View view){
        countA+=2;
        displayForTeamA(countA);
    }
    public void freeThrow(View view){
        countA+=1;
        displayForTeamA(countA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {

        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));

    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));

    }
    public void displayB3(View view){
        countB+=3;
        displayForTeamB(countB);
    }

    public void displayB2(View view){
        countB+=2;
        displayForTeamB(countB);
    }
    public void freeThrowB(View view){
        countB+=1;
        displayForTeamB(countB);
    }

    public void reset(View view){
        countA = 0;
        countB = 0;
        displayForTeamA(countA);
        displayForTeamB(countB);
    }

}