package cn.edu.swufe.beauty;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class EyeshadowActivity extends AppCompatActivity {

    /*private ListView mListView;
    private  String[] names={"全新nyx眼影盘","七成新日落盘"};
    private int[] icons={R.drawable.nyx,R.drawable.dls};*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eyeshadow);
        //mListView= (ListView)findViewById(R.id.lv);
        //mListView.setAdapter((ListAdapter) new MyBaseAdapter());
    }
       /*class MyBaseAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return names.length;
        }
        @Override
        public Object getItem(int position) {
            return names [position];
        }
        @Override
        public long getItemId(int position) {
            return position;
        }
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {//组装数据
            View view=View.inflate(EyeshadowActivity.this,R.layout.eyelist_item,null);//在list_item中有两个id,现在要把他们拿过来
            TextView mTextView=(TextView) view.findViewById(R.id.tv_list);
            ImageView imageView=(ImageView)view.findViewById(R.id.image);            //组件一拿到，开始组装
            mTextView.setText(names[position]);
            imageView.setBackgroundResource(icons[position]);            //组装完开始返回
            return view;
        }



    }*/

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.user, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.open_list) {
            Intent list = new Intent(this,CreamListActivity.class);
            startActivity(list); }
        return super.onOptionsItemSelected(item);
    }
}

