package com.example.myroomdb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import android.os.AsyncTask;
import android.os.Bundle;

public class DeletedataActivity extends AppCompatActivity {
    public static MyDatabase myDatabase1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deletedata);
        final MyDataList md1 = new MyDataList();
        myDatabase1 = Room.databaseBuilder(getApplicationContext(), MyDatabase.class, "infodb").allowMainThreadQueries().build();

                DeletedataActivity.myDatabase1.myDao().deleteALL(md1);
    }
}
