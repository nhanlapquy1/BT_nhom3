package VoLap.example.appLoship.View;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "DuLieuTaiKhoan.db";
    private static final String TABLE_NAME = "DuLieuTaiKhoan";
    private static final int VERSION = 1;
    private static final String COLUMN_ID = "id";
    private static final String COLUMN_PASS = "pass";

    private static final String TABLE_CREATE = "create table DuLieuTaiKhoan (id text primary key not null, pass text not null);";

    SQLiteDatabase db;


    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TABLE_CREATE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String query = "DROP TABLE IF EXISTS " + TABLE_NAME;
        db.execSQL(query);
        this.onCreate(db);
    }

    public void insertTK(TaiKhoan kh) {
        db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_ID, kh.getM_TK());
        values.put(COLUMN_PASS, kh.getM_Matkhau());
        db.insert(TABLE_NAME, null, values);
        db.close();
    }

    public void UpdateTK(String id, String pass) {
        db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_PASS, pass);
        db.update(TABLE_NAME, values, COLUMN_ID + "= ?", new String[]{String.valueOf(id)});
        db.close();
    }

    public boolean searchTK(String tk) {
        db = this.getReadableDatabase();
        String query = "select id from" + TABLE_NAME;
        Cursor cursor = db.rawQuery(query, null);
        String username;
        if (cursor.moveToFirst()) {
            do {
                username = cursor.getString(0);
                if (username.equals(tk)) {
                    db.close();
                    return true;

                }
            } while (cursor.moveToNext());
        }
        db.close();
        return false;
    }

    public String searchPass(String tk) {
        db = this.getReadableDatabase();
        String query = "select id, pass from" + TABLE_NAME;
        Cursor cursor = db.rawQuery(query, null);
        String username;
        String pass = "not found";
        if (cursor.moveToFirst()) {
            do {
                username = cursor.getString(0);
                if (username.equals(tk)) {
                    pass = cursor.getString(1);
                    break;
                }
            } while (cursor.moveToNext());
        }
        db.close();
        return pass;
    }

    public void deleteUser(String id){
        db = this.getWritableDatabase();
        db.delete(TABLE_NAME, COLUMN_ID + "= ?", new String[]{String.valueOf(id)});
        db.close();
    }
}
