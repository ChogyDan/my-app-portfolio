package org.example.nanodegreeportfolioapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    private Toast toaster;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

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

    private void makeToast(String message) {
        if(toaster != null){
            toaster.cancel();
        }
        toaster = Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT);
        toaster.show();

    }

    public void mediaStreamerClick(View v){
        makeToast("You clicked the media streamer button");
    }

    public void superDuo1Click(View v){
        makeToast("You clicked the super duo 1 button");
    }

    public void superDuo2Click(View v){
        makeToast("You clicked the super duo 2 button");
    }

    public void antTerminatorClick(View v){
        makeToast("You clicked the ant terminator button");
    }

    public void materializeClick(View v){
        makeToast("You clicked the materialize button");
    }

    public void capstoneClick(View v){
        makeToast("You clicked the capstone button");
    }

}
