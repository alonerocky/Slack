package dev.shoulongli.slack;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.google.gson.Gson;

import dev.shoulongli.slack.model.UserListResponse;

/**
 * Created by shoulongli on 7/23/16.
 */
public class DatabaseHandler extends SQLiteOpenHelper {

    // All Static variables
    // Database Version
    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "slack_users_db";

    // users table name
    private static final String TABLE_USERS = "slack_users_table";

    // users Table Columns names
    private static final String KEY_ID = "id";
    private static final String KEY_GSON = "gson";

    public DatabaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_CONTACTS_TABLE = "CREATE TABLE " + TABLE_USERS + "("
                + KEY_ID + " INTEGER PRIMARY KEY," + KEY_GSON + " TEXT" + ")";
        db.execSQL(CREATE_CONTACTS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_USERS);
        // Create tables again
        onCreate(db);
    }

    public void saveUsers(UserListResponse userList) {
        if (containsUserList()) {
            udateUsers(userList);
        } else {
            addUsers(userList);
        }

    }

    public void addUsers(UserListResponse userList) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        Gson gson = new Gson();
        values.put(KEY_GSON, gson.toJson(userList)); // Contact Name

        // Inserting Row
        db.insert(TABLE_USERS, null, values);
        db.close(); // Closing database connection

    }

    public int udateUsers(UserListResponse userList) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        Gson gson = new Gson();
        values.put(KEY_GSON, gson.toJson(userList));

        // updating row
        return db.update(TABLE_USERS, values, KEY_ID + " = ?",
                new String[]{String.valueOf(0)});
    }

    public UserListResponse getUsers() {
        UserListResponse userList = null;
        if (containsUserList()) {

            // Select All Query
            String selectQuery = "SELECT  * FROM " + TABLE_USERS;

            Cursor cursor = null;
            try {
                SQLiteDatabase db = this.getWritableDatabase();
                cursor = db.rawQuery(selectQuery, null);
                if (cursor.moveToFirst()) {
                    Gson gson = new Gson();
                    String userGson = cursor.getString(1);
                    userList = gson.fromJson(userGson, UserListResponse.class);
                }
            } finally {
                if (cursor != null) {
                    cursor.close();
                }

            }
        }
        return userList;
    }

    public boolean containsUserList() {
        String countQuery = "SELECT  * FROM " + TABLE_USERS;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = null;
        boolean result = false;
        try {
            cursor = db.rawQuery(countQuery, null);
            result = cursor.getCount() > 0;
            cursor.close();
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
        // return count
        return result;
    }
}
