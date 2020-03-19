package com.example.myroomdb;

import android.os.AsyncTask;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ReaddataActivity extends AppCompatActivity {
    private RecyclerView rv;
    final MyDataList md = new MyDataList();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.read_data);
        rv=(RecyclerView)findViewById(R.id.rec);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));
        getData();
    }

    private void getData() {
        class GetData extends AsyncTask<Void,Void,List<MyDataList>>{

        @Override
        protected List<MyDataList> doInBackground(Void... voids) {
            List<MyDataList>myDataLists=MainActivity.myDatabase.myDao().getMyData();
            return myDataLists;

        }

        @Override
        protected void onPostExecute(List<MyDataList> myDataList) {
            MyAdapter adapter=new MyAdapter(myDataList);
            rv.setAdapter(adapter);
            super.onPostExecute(myDataList);
        }
        }
        GetData gd=new GetData();
        gd.execute();

    }
}