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
                    + COLUMN_PRICE_1 + " INTEGER,"
                    + COLUMN_PRICE_2 + " INTEGER,"
                    + COLUMN_PRICE_3 + " INTEGER,"
                    + COLUMN_PRICE_4 + " INTEGER,"
                    + COLUMN_PRICE_5 + " INTEGER,"
                    + COLUMN_PRICE_6 + " INTEGER" + ")";

    private String price1,price2,price3,price4,price5,price6;

    public static String getPrice1() {
        return COLUMN_PRICE_1;
    }

    public void setPrice1(String price1) {
        this.price1 = price1;
    }

    public static String getPrice2() {
        return COLUMN_PRICE_2;
    }

    public void setPrice2(String price2) {
        this.price2 = price2;
    }

    public static String getPrice3() {
        return COLUMN_PRICE_3;
    }

    public void setPrice3(String price3) {
        this.price3 = price3;
    }

    public static String getPrice4() {
        return COLUMN_PRICE_4;
    }

    public void setPrice4(String price4) {
        this.price4 = price4;
    }

    public static String getPrice5() {
        return COLUMN_PRICE_5;
    }

    public void setPrice5(String price5) {
        this.price5 = price5;
    }

    public static String getPrice6() {
        return COLUMN_PRICE_6;
    }

    public void setPrice6(String price6) {
        this.price6 = price6;
    }
}
