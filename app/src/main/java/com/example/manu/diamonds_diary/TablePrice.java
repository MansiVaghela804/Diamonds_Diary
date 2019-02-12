package com.example.manu.diamonds_diary;

public class TablePrice {

    public static final String TABLE_NAME = "price";
    private static final String COLUMN_USER_ID = "id";
    public static final String COLUMN_PRICE_1 = "price1";
    public static final String COLUMN_PRICE_2 = "price2";
    public static final String COLUMN_PRICE_3 = "price3";
    public static final String COLUMN_PRICE_4 = "price4";
    public static final String COLUMN_PRICE_5 = "price5";
    public static final String COLUMN_PRICE_6 = "price6";

    //  Create table SQL query
    public static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + COLUMN_USER_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + COLUMN_PRICE_1 + " INTEGER,"
                    + COLUMN_PRICE_2 + " INTEGER,"
                    + COLUMN_PRICE_3 + " INTEGER,"
                    + COLUMN_PRICE_4 + " INTEGER,"
                    + COLUMN_PRICE_5 + " INTEGER,"
                    + COLUMN_PRICE_6 + " INTEGER" + ")";

    private int id;
    private Integer price1,price2,price3,price4,price5,price6;

    public TablePrice(int id,Integer price1, Integer price2, Integer price3, Integer price4, Integer price5, Integer price6) {
        this.id = id;
        this.price1 = price1;
        this.price2 = price2;
        this.price3 = price3;
        this.price4 = price4;
        this.price5 = price5;
        this.price6 = price6;
    }

    public TablePrice() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getPrice1() {
        return price1;
    }

    public void setPrice1(Integer price1) {
        this.price1 = price1;
    }

    public Integer getPrice2() {
        return price2;
    }

    public void setPrice2(Integer price2) {
        this.price2 = price2;
    }

    public Integer getPrice3() {
        return price3;
    }

    public void setPrice3(Integer price3) {
        this.price3 = price3;
    }

    public Integer getPrice4() {
        return price4;
    }

    public void setPrice4(Integer price4) {
        this.price4 = price4;
    }

    public Integer getPrice5() {
        return price5;
    }

    public void setPrice5(Integer price5) {
        this.price5 = price5;
    }

    public Integer getPrice6() {
        return price6;
    }

    public void setPrice6(Integer price6) {
        this.price6 = price6;
    }

    @Override
    public String toString() {
        return "TablePrice{" +
                "price1=" + price1 +
                ", price2='" + price2 + '\'' +
                ", price3='" + price3 + '\'' +
                ", price4='" + price4 + '\'' +
                ", price5='" + price5 + '\'' +
                ", price6='" + price6 + '\'' +
                '}';
    }
}
