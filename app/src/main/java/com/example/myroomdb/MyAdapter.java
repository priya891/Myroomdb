package com.example.myroomdb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import static androidx.recyclerview.widget.RecyclerView.Adapter;

public class MyAdapter  extends Adapter<MyAdapter.ViewHolder> {
        List<MyDataList>myDataLists;
    Context context;

public MyAdapter(List<MyDataList> myDataLists) {
        this.myDataLists = myDataLists;
        }

@NonNull
@Override
public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
    View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_data,viewGroup,false);
    return new ViewHolder(view);
        }

    @Override
public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        MyDataList md=myDataLists.get(i);
        viewHolder.txtname.setText(md.getName());
        viewHolder.txtemail.setText(md.getEmail());
        viewHolder.txtcity.setText(md.getCity());

        }

@Override
public int getItemCount() {
        return myDataLists.size();
        }

public class ViewHolder extends RecyclerView.ViewHolder{
    private TextView txtid,txtname,txtemail,txtcity;
    private LinearLayout linearLayout;
    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        //txtid=(TextView)itemView.findViewById(R.id.txt_id);
        txtname=(TextView)itemView.findViewById(R.id.txt_name);
        txtemail=(TextView)itemView.findViewById(R.id.txt_email);
        txtcity=(TextView)itemView.findViewById(R.id.txt_city);
        linearLayout= (LinearLayout) itemView.findViewById(R.id.linear);
    }
}
}

