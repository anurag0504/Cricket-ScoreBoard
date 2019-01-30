package com.example.cricketscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {
    private Button singleplus, doubleplus, wideplus, fourplus, sixplus, wicketplus;
    private EditText singles, doubles, wides, fours, sixs, overs, wickets, score;
    private int sr = 0, fr = 0, sx = 0, wd = 0, wk = 0, ds = 0, ss = 0, balls = 0, ov = 0, balls1 = 60;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        singleplus = findViewById(R.id.singleplus);
        doubleplus = findViewById(R.id.doubleplus);
        fourplus = findViewById(R.id.fourplus);
        sixplus = findViewById(R.id.sixplus);
        wicketplus = findViewById(R.id.wicketplus);
        singles = findViewById(R.id.singles);
        doubles = findViewById(R.id.doubles);
        sixplus = findViewById(R.id.sixplus);
        fourplus = findViewById(R.id.fourplus);
        wickets = findViewById(R.id.wickets);
        overs = findViewById(R.id.overs);
        score = findViewById(R.id.score);
        sixs = findViewById(R.id.sixs);
        fours = findViewById(R.id.foures);
        wides = findViewById(R.id.wides);
        wideplus = findViewById(R.id.wideplus);


            singleplus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                   if(ov<10 && wk <10)
                   {
                        balls1--;
                        balls++;
                        ss++;
                        sr++;
                        score.setText(sr + "");
                        singles.setText(ss + "");
                        if (balls == 6) {
                            balls = 0;
                            ov = ov + 1;
                            overs.setText(ov + "." + balls);
                        } else {
                            overs.setText(ov + "." + balls);
                        }

                    }
                   else
                       Toast.makeText(getApplication(), "OVERS COMPLETED OR ALL OUT", Toast.LENGTH_LONG).show();
                }
            });

            doubleplus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ov<10 && wk <10)
                    {
                        balls++;
                        balls1--;
                        ds++;
                        sr = sr + 2;
                        score.setText(sr + "");
                        doubles.setText(ds + "");
                        if (balls == 6) {
                            balls = 0;
                            ov = ov + 1;
                            overs.setText(ov + "." + balls);
                        } else {
                            overs.setText(ov + "." + balls);
                        }

                    }
                    else
                        Toast.makeText(getApplication(), "OVERS COMPLETED OR ALL OUT", Toast.LENGTH_LONG).show();
                }
            });

            sixplus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ov<10 && wk <10) {
                        balls++;
                        balls1--;
                        sx++;
                        sr = sr + 6;
                        sixs.setText(sx + "");
                        score.setText(sr + "");
                        if (balls == 6) {
                            balls = 0;
                            ov = ov + 1;
                            overs.setText(ov + "." + balls);
                        } else {
                            overs.setText(ov + "." + balls);
                        }
                    }
                    else
                        Toast.makeText(getApplication(), "OVERS COMPLETED OR ALL OUT", Toast.LENGTH_LONG).show();
                }
            });

            fourplus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ov<10&& wk <10){
                        balls1--;
                        balls++;
                        fr++;
                        sr = sr + 4;
                        score.setText(sr + "");
                        fours.setText(fr + "");
                        if (balls == 6) {
                            balls = 0;
                            ov = ov + 1;
                            overs.setText(ov + "." + balls);
                        } else {
                            overs.setText(ov + "." + balls);
                        }
                    }
                    else
                        Toast.makeText(getApplication(), "OVERS COMPLETED OR ALL OUT", Toast.LENGTH_LONG).show();
                }
            });

            wideplus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ov<10 && wk <10){
                        wd++;
                        sr = sr + 1;
                        score.setText(sr + "");
                        wides.setText(wd + "");
                    }
                    else
                        Toast.makeText(getApplication(), "OVERS COMPLETED OR ALL OUT", Toast.LENGTH_LONG).show();

                }
            });

            wicketplus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (wk < 10 && ov < 10) {
                        balls++;
                        wk++;
                        score.setText(sr + "-" + wk);
                        wickets.setText(wk + "");
                        if (balls == 6) {
                            balls = 0;
                            ov = ov + 1;
                            overs.setText(ov + "." + balls);
                        } else {
                            overs.setText(ov + "." + balls);
                        }
                    }
                    else
                        Toast.makeText(getApplication(), "OVERS COMPLETED OR ALL OUT", Toast.LENGTH_LONG).show();
                }
            });

        }
    }

