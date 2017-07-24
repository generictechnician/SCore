package net.cherry.score;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import java.io.Console;

public class Main extends AppCompatActivity {

    public int ScoreA = 0;
    public int ScoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        buttonClickListener();

    }

    private void buttonClickListener(){
        Button btnA = (Button)findViewById(R.id.btn_t_A);
        btnA.setOnClickListener(new View.OnClickListener(){
           public void onClick(View v){
               ScoreA = ScoreA + 1;
               TextView text = (TextView) findViewById(R.id.lbl_sco_A);
               text.setText(ScoreA+"");
           }
        });

        Button btnB = (Button)findViewById(R.id.btn_t_B);
        btnB.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                ScoreB = ScoreB + 1;
                TextView text = (TextView) findViewById(R.id.lbl_sco_B);
                text.setText(ScoreB+"");
            }
        });
    }

    //----------------Menu Generation--------------//
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
