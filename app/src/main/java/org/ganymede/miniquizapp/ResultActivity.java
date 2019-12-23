package org.ganymede.miniquizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView t1, t2, t3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

   //     t1 = (TextView) findViewById(R.id.tv_jumlah_soal);
        t2 = (TextView) findViewById(R.id.tv_jawab_benar);
        t3 = (TextView) findViewById(R.id.tv_jawab_salah);

        Intent i = getIntent();

     //   String questions  = i.getStringExtra("Total");
        String correct  = i.getStringExtra("Correct");
        String wrong  = i.getStringExtra("Incorrect");

       // t1.setText(questions);
        t2.setText(correct);
        t3.setText(wrong);
    }
}
