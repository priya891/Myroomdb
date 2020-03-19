package com.example.myroomdb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public static MyDatabase myDatabase;
    private Button adddata,readdata,deletedata,updatedata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myDatabase= Room.databaseBuilder(getApplicationContext(),MyDatabase.class,"infodb").allowMainThreadQueries().build();

        adddata=(Button)findViewById(R.id.button_add);
        readdata=(Button)findViewById(R.id.button_read);
        deletedata=(Button)findViewById(R.id.button_delete);
        updatedata=(Button)findViewById(R.id.button_update);


        adddata.setOnClickListener(this);
        readdata.setOnClickListener(this);
        deletedata.setOnClickListener(this);
        updatedata.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int id=v.getId();

        switch (id){
            case R.id.button_add:{
                startActivity(new Intent(MainActivity.this,AddDataActivity.class));
                break;
            }
            case R.id.button_read:{
                startActivity(new Intent(MainActivity.this,ReaddataActivity.class));
                break;
            }
            case R.id.button_delete:{
                startActivity(new Intent(MainActivity.this,DeletedataActivity.class));
                break;
            }
            case R.id.button_update:{
                startActivity(new Intent(MainActivity.this,UpdatedataActivity.class));
                break;
            }
        }
    }
}
