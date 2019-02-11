package com.example.manu.diamonds_diary;

public class TableNotes {
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
                    + COLUMN_PRICE_1 + " TEXT,"
                    + COLUMN_PRICE_2 + " TEXT,"
                    + COLUMN_PRICE_3 + " TEXT"
                    + ")";

    private String name,email,password;

    public static String getName() {
        return COLUMN_USER_NAME;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getEmail() {
        return COLUMN_USER_EMAIL;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static String getPassword() {
        return COLUMN_USER_PASSWORD;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public TableNotes(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;

    }
}

