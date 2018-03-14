package com.example.abdullah_mansour.mathpuzzle.data;

import android.provider.BaseColumns;

/**
 * Created by Abdullah-Mansour on 3/13/2018.
 */

public final class QuizzesContract {

    QuizzesContract (){}

    public static final class QuizzesEntry implements BaseColumns
    {
        public static final String TABLE_NAME = "quizzes";

        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_QUIZ_NUMBER = "number";
    }

}
