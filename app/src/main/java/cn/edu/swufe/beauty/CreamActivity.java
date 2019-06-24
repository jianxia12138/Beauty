package cn.edu.swufe.beauty;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import java.util.List;

public class CreamActivity extends AppCompatActivity{

    private static final String TAG ="College" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cream);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.user, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.open_list) {
            Intent list = new Intent(this,CreamListActivity.class);
            startActivity(list);
            /*InfItem item1 = new InfItem("aaaa","123");
            InfManager manager = new InfManager(this);
            manager.add(item1);
            manager.add(new InfItem("bbbb","23.5"));
            Log.i(TAG,"onOptionsItemSelected:写入数据完毕");

            List<InfItem> testList = manager.listAll();
            for(InfItem i:testList){
                Log.i(TAG,"onOptionsItemSelected:取出数据[id="+i.getId()+"]NUMBER="+i.getCurNumber() + "COLLEGE=" +i.getCurCollege());

            }*/
        }
        return super.onOptionsItemSelected(item);
    }
}
