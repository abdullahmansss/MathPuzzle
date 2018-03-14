package com.example.abdullah_mansour.mathpuzzle.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.example.abdullah_mansour.mathpuzzle.data.QuizzesContract.QuizzesEntry;

/**
 * Created by Abdullah-Mansour on 3/13/2018.
 */

public class QuizzesDBHelper extends SQLiteOpenHelper {
    // db name
    private static final String DATABASE_NAME = "quizzes.db";
    // db version
    private static final int DATABASE_VERSION = 1;

    // constructor
    public QuizzesDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        // creating db table
        String SQL_CREATE_QUIZZES_TABLE =
                "CREATE TABLE " + QuizzesEntry.TABLE_NAME + "("
                + QuizzesEntry._ID +  " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + QuizzesEntry.COLUMN_QUIZ_NUMBER + " BLOB NOT NULL);";

        sqLiteDatabase.execSQL(SQL_CREATE_QUIZZES_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        // upgrading db
    }
}
