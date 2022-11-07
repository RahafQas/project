package com.example.project;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class forth extends Activity {
    private Button About;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.relative );

    }
    public void back(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity( i );
    }
}



            
       



