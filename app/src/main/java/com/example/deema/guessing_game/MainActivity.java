package com.example.deema.guessing_game;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // TextView mytext=(TextView)findViewById(R.id.textView2);
        //EditText edittext = (EditText)findViewById(R.id.edittext);
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

    public void generate(View view) {
            Random rand = new Random();
            int randNumber = rand.nextInt(1000)+1;
            TextView mytext=(TextView)findViewById(R.id.textView2);
            String mystring=String.valueOf(randNumber);
            int comp=Integer.parseInt(mystring);
            EditText edittext = (EditText)findViewById(R.id.edittext);
            String mynum = edittext.getText().toString();
            int myguess=Integer.parseInt(mynum);
         if(myguess== comp+1 ||myguess== comp+2||myguess== comp+3||myguess== comp+4||myguess== comp+5){
            Toast.makeText(getApplicationContext(), "Too close! try again",
                    Toast.LENGTH_LONG).show();
             edittext.setText("");
        }
        else if(myguess==comp-5||myguess==comp-4||myguess==comp-3||myguess==comp-2||myguess==comp-1){
            Toast.makeText(getApplicationContext(), "Too close! try again",
                    Toast.LENGTH_LONG).show();
             edittext.setText("");

        }

        else if (myguess>comp){
            Toast.makeText(getApplicationContext(), "too large! try again",
                    Toast.LENGTH_LONG).show();
             edittext.setText("");
            }

       else if(myguess < comp){
            Toast.makeText(getApplicationContext(), "too small! try again",
                    Toast.LENGTH_LONG).show();
             edittext.setText("");
        }

      else  if(myguess == comp){
            Toast.makeText(getApplicationContext(), "You win!",
                    Toast.LENGTH_LONG).show();
             edittext.setText("");
        }


    }
}
// myText.setText(myString);
//   Toast.makeText(getApplicationContext(), myString,
// Toast.LENGTH_LONG).show();

         /*   if(myNum-number <=5 && myNum-number>=0 || number-myNum <=5){
            Toast.makeText(getApplicationContext(), "Too Close!",
                    Toast.LENGTH_LONG).show();
        }*/
     /*   if(myNum>number +5 && myNum< number -5){
            Toast.makeText(getApplicationContext(), "Too Close!",
                Toast.LENGTH_LONG).show();}*/