package com.coolweather.xiaoming.coolweather.db;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by xiaoming on 17-4-4.
 * chuang jian shuju ku
 * chuangjian san ge biao sheng shu ju province_name 表示省名 province_code 表示省级代号
 * city_name 表示城市名 city_code 表示市级代号 province_id 是City 表关联 Province 表的外键
 * county_name 表示县名,county_code 表示县级代号 city_id 是County 表关联 City 表的外键
 */

public class CoolWeatherOpenHelper extends SQLiteOpenHelper {
    public static final String CREATE_PROVINCE = "create table Province (" +
            " id integer primary key autoincrement," +
            " province_name text," +
            " province_code text)";

    public static final String CREATE_CITY = "create table City (" +
            " id integer primary key autoincrement," +
            " city_name text," +
            " city_code text," +
            " province_id integer)";

    public static final String CREATE_COUNTY = "create table County (" +
            " id integer primary key autoincrement," +
            " county_name text," +
            " county_code text," +
            " city_id integer)";
    public CoolWeatherOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory,
                                 int version){
        super(context,name,factory,version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_PROVINCE);
        db.execSQL(CREATE_CITY);
        db.execSQL(CREATE_COUNTY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
