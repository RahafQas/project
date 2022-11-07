package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class listItem extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.list_item );
    }
    public void click(View view){
        Intent intent =new Intent(this,MainActivity.class);
        startActivity( intent );

    }
}
