package com.example.android.appcount;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.android.appcount.R;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState != null){
            scoreA = savedInstanceState.getInt(SCORE_FOR_A);
            scoreB = savedInstanceState.getInt(SCORE_FOR_B);
            display(scoreA,scoreB);
        }
        else{

        }
    }
    public void Points3ForA(View view){
        scoreA = scoreA + 3;
        display(scoreA,scoreB);
    }
    public void Points2ForA(View view){
        scoreA = scoreA + 2;
        display(scoreA,scoreB);
    }
    public void FreeRunForA(View view){
        scoreA = scoreA+ 1;
        display(scoreA,scoreB);
    }
    public void Points3ForB(View view){
        scoreB = scoreB + 3;
        display(scoreA,scoreB);
    }
    public void Points2ForB(View view){
        scoreB = scoreB + 2;
        display(scoreA,scoreB);
    }
    public void FreeRunForB(View view){
        scoreB = scoreB+ 1;
        display(scoreA,scoreB);
    }
    public void Reset(View view) {
        scoreA = 0;
        scoreB = 0;
        display(scoreA,scoreB);
    }
    private void display(int sA, int sB)
    {   scoreA = sA;
        scoreB = sB;
        TextView scoreTextView = (TextView) findViewById(R.id.team_score_A);
        scoreTextView.setText("" + scoreA);
        TextView scoreTextView1 = (TextView) findViewById(R.id.team_score_B);
        scoreTextView1.setText("" + scoreB);
    }

    static final String SCORE_FOR_A = "scoreA";
    static final String SCORE_FOR_B = "scoreB";
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        /* Save the user's current game state */
        savedInstanceState.putInt(SCORE_FOR_A,scoreA );
        savedInstanceState.putInt(SCORE_FOR_B, scoreB);
        // Always call the superclass so it can save the view hierarchy state
        super.onSaveInstanceState(savedInstanceState);
    }
}
