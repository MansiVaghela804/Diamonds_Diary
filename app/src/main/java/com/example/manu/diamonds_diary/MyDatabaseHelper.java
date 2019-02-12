package com.example.manu.diamonds_diary;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static com.example.manu.diamonds_diary.TablePrice.CREATE_TABLE;

public class MyDatabaseHelper extends SQLiteOpenHelper {
    //  Database Name
    private static final String DB_NAME  = "databaseDiary";
    //  Database Version
    private static final int VERSION = 1;
    // drop table sql query
//    private String DROP_USER_TABLE = "DROP TABLE IF EXISTS " + TABLE_USER;

    //    Constructor
    public MyDatabaseHelper(Context context){
        super(context, DB_NAME, null,VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TablePrice.CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //Drop User Table if exist
        db.execSQL("DROP TABLE IF EXISTS " + TablePrice.TABLE_NAME);
        // Create tables again
        onCreate(db);
    }
    //  To insert a note in the table
    public void insertprice(TablePrice price){
//  get writable database as we want to write data
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues cv = new ContentValues();
        cv.put(TablePrice.COLUMN_PRICE_1, price.getPrice1());
        cv.put(TablePrice.COLUMN_PRICE_2, price.getPrice2());
        cv.put(TablePrice.COLUMN_PRICE_3, price.getPrice3());
        cv.put(TablePrice.COLUMN_PRICE_4, price.getPrice4());
        cv.put(TablePrice.COLUMN_PRICE_5, price.getPrice5());
        cv.put(TablePrice.COLUMN_PRICE_6, price.getPrice6());
//      Insert Row
        db.insert(TablePrice.TABLE_NAME,null,cv);
//         db.update(TablePrice.TABLE_NAME,cv,"id",new String[]{String.valueOf(price.getId())});
//        DB Connection Close
        db.close();
    }
    public Cursor getPrice(){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(
                TablePrice.TABLE_NAME,
                new String[]{TablePrice.COLUMN_PRICE_1,TablePrice.COLUMN_PRICE_2,TablePrice.COLUMN_PRICE_3,
                        TablePrice.COLUMN_PRICE_4,TablePrice.COLUMN_PRICE_5,TablePrice.COLUMN_PRICE_6},
                null,null,null,null,null);
        return cursor;
    }


}
