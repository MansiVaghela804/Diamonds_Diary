package com.example.manu.diamonds_diary;

public class TablePrice {

    public static final String TABLE_NAME = "price";

    public static final String COLUMN_PRICE_1 = "price1";
    public static final String COLUMN_PRICE_2 = "price2";
    public static final String COLUMN_PRICE_3 = "price3";
    public static final String COLUMN_PRICE_4 = "price4";
    public static final String COLUMN_PRICE_5 = "price5";
    public static final String COLUMN_PRICE_6 = "price6";

    //  Create table SQL query
    public static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + COLUMN_PRICE_1 + " NUMBER,"
                    + COLUMN_PRICE_2 + " NUMBER,"
                    + COLUMN_PRICE_3 + " NUMBER,"
                    + COLUMN_PRICE_4 + " NUMBER,"
                    + COLUMN_PRICE_5 + " NUMBER,"
                    + COLUMN_PRICE_6 + " NUMBER" + ")";
}
