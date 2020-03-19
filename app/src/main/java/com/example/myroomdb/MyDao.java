package com.example.myroomdb;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface MyDao  {
    @Insert
    public void addData(MyDataList mydatalist);

    @Query("select * from mydatalist")
    public List<MyDataList>getMyData();


    @Delete
    public void deleteALL(MyDataList myDataList);

    @Update
    public void update(MyDataList mydatalist);

}
