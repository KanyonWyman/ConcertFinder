package cnm.edu.deepdive.concertfinder.model;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import cnm.edu.deepdive.concertfinder.model.entity.User;
import java.util.ArrayList;
import java.util.List;

public class DBHandler extends SQLiteOpenHelper {

  private static final int DATABASE_VERSION = 1;

  private static final String DATABASE_NAME = "user";

  private static final String TABLE_USER_DETAIL = "userDetails";

  private static final String KEY_ID = "id";
  private static final String KEY_NAME = "name";
  private static final String KEY_EMAIL = "email";
  private static final String KEY_PHONE_NO = "phone_number";

  public DBHandler(Context context) { super(context, DATABASE_NAME, null, DATABASE_VERSION);
  }

  @Override
  public void onCreate(SQLiteDatabase db) {

    String CREATE_USER_DETAIL_TABLE = "CREATE TABLE " + TABLE_USER_DETAIL + "("
            + KEY_EMAIL + " TEXT,"
            + KEY_ID + " INTERGER PRIMARY KEY,"
            + KEY_NAME + " TEXT,"
            + KEY_PHONE_NO + " TEXT" + ")";
    db.execSQL(CREATE_USER_DETAIL_TABLE);
  }

  @Override
  public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    db.execSQL("DROP TABLE IF EXISTS " + TABLE_USER_DETAIL);
    onCreate(db);
  }
  void addNewStudent(User newUser) {

    SQLiteDatabase db = this.getWritableDatabase();

    ContentValues values = new ContentValues();

    values.put(KEY_EMAIL, newUser.get_email());
    values.put(KEY_NAME, newUser.get_name());
    values.put(KEY_PHONE_NO, newUser.get_phone_number());


    db.insert(TABLE_USER_DETAIL, null, values);
    db.close();
  }


  public boolean updateStudentInfo(int updId, String updEmail, String updName, String updPhoneNo) {

    SQLiteDatabase db = this.getWritableDatabase();

    ContentValues args = new ContentValues();

    args.put(KEY_EMAIL, updEmail);
    args.put(KEY_NAME, updName);
    args.put(KEY_PHONE_NO, updPhoneNo);

    return db.update(TABLE_USER_DETAIL, args, KEY_ID + "=" + updId, null) > 0;
  }


  public boolean deleteStudent(int delID){

    SQLiteDatabase db = this.getWritableDatabase();

    return db.delete(TABLE_USER_DETAIL, KEY_ID + "=" + delID, null) > 0;

  }


  public List<User> getAllUserList() {


    List<User> userList = new ArrayList<User>();

    // Select All Query
    String selectQuery = "SELECT  * FROM " + TABLE_USER_DETAIL;

    SQLiteDatabase db = this.getWritableDatabase();
    Cursor cursor = db.rawQuery(selectQuery, null);

    if (cursor.moveToFirst()) {
      do {

        User user = new User();
        user.set_id(Integer.parseInt(cursor.getString(0)));
        user.set_email(cursor.getString(1));
        user.set_name(cursor.getString(2));
        user.set_phone_number(cursor.getString(3));

        userList.add(user);

      } while (cursor.moveToNext());
    }

    return userList;
  }

}
