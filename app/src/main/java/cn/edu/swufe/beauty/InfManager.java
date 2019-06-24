package cn.edu.swufe.beauty;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

public class InfManager {
    private DBHelper dbHelper;
    private String TBNAME;

    public InfManager(Context context){
        dbHelper = new DBHelper(context);
        TBNAME = DBHelper.TB_NAME;
    }

    public void add(InfItem item){
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("curNumber",item.getCurNumber());
        values.put("curCollege",item.getCurCollege());
        values.put("curSpice",item.getCurSpice());
        values.put("curIntro",item.getCurIntro());
        db.insert(TBNAME,null,values);
        db.close();
    }
    public void deleteAll(){
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        db.delete(TBNAME,null,null);
        db.close();
    }

    public List<InfItem> listAll(){
        List<InfItem> infList = null;
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        Cursor cursor = db.query(TBNAME,null,null,null,null,null,null);
        if(cursor!=null){
            infList = new ArrayList<InfItem>();
            while(cursor.moveToNext()){
                InfItem item = new InfItem();
                item.setId(cursor.getInt(cursor.getColumnIndex("ID")));
                item.setCurNumber(cursor.getString(cursor.getColumnIndex("CURNUMBER")));
                item.setCurCollege(cursor.getString(cursor.getColumnIndex("CURCOLLEGE")));
                item.setCurSpice(cursor.getString(cursor.getColumnIndex("CURSPICE")));
                item.setCurIntro(cursor.getString(cursor.getColumnIndex("CURINTRO")));
                infList.add(item);
            }
            cursor.close();
        }
        db.close();
        return infList;
    }

    public void deleteAll(int id){
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        db.delete(TBNAME,null,null);
        db.close();
    }
    public void update(InfItem item){
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("curnumber",item.getCurNumber());
        values.put("curcollege",item.getCurCollege());
        values.put("curspice",item.getCurSpice());
        values.put("curintro",item.getCurIntro());
        db.update(TBNAME,values,"ID=?",new String[]{String.valueOf(item.getId())});
        db.close();
    }
    public InfItem findById(int id){
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        Cursor cursor = db.query(TBNAME,null,"ID=?",new String[]{String.valueOf(id)},null,null,null);
        InfItem infItem = null;
        if(cursor!=null&&cursor.moveToFirst()){
            infItem = new InfItem();
            infItem.setId(cursor.getInt(cursor.getColumnIndex("ID")));
            infItem.setCurNumber(cursor.getString(cursor.getColumnIndex("CURNUMBER")));
            infItem.setCurCollege(cursor.getString(cursor.getColumnIndex("COLLEGE")));
            infItem.setCurSpice(cursor.getString(cursor.getColumnIndex("SPICE")));
            infItem.setCurIntro(cursor.getString(cursor.getColumnIndex("INTRO")));
            cursor.close();
        }
        db.close();
        return infItem;
    }

}
