package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        Button button3 = findViewById( R.id.button3 );
        button3.setOnLongClickListener( new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText( MainActivity.this, "Sunday 8 AM-12 AM\n" +
                        "Monday 8 AM-12 AM\n" +
                        "Tuesday 8 AM-12 AM\n" +
                        "Wednesday 8 AM-12 AM\n" +
                        "Thursday 8 AM-2 AM\n" +
                        "Friday 1 PM-2 AM\n" +
                        "Saturday 8 AM-12 AM", Toast.LENGTH_SHORT ).show();
                return false;
            }
        } );
        Button but = findViewById( R.id.button3 );
        but.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText( MainActivity.this,"Long click",Toast.LENGTH_SHORT ).show();
            }
        } );

        Button button = findViewById( R.id.button2 );
        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( Intent.ACTION_VIEW, Uri.parse( "tel:011 270 0104" ) );
                startActivity( intent );
            }
        } );
    }

    public void click(View view) {
        Intent i = new Intent( this, secondActivity.class );
        startActivity( i );
    }


    public void about(View view) {
        Intent i = new Intent( this, forth.class );
        startActivity( i );

    }
}
