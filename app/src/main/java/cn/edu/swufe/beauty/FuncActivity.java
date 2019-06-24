package cn.edu.swufe.beauty;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.linchaolong.android.imagepicker.cropper.CropImage;
import com.linchaolong.android.imagepicker.cropper.CropImageView;

import java.util.ArrayList;
import java.util.List;

public class FuncActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    private Spinner mSpinner = null;
    private Spinner mTypeSpinner = null;


    /*private GridView gridView;
    private GvAdapter adapter;
    private List<String> list;
    ImagePicker imagePicker ;
    String path;*/



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_func);
        /*gridView =(GridView) findViewById(R.id.grid_view);
        initView();*/


         mSpinner = (Spinner) findViewById(R.id.spinner);
         mTypeSpinner = (Spinner)findViewById(R.id.spinner1);

        String[] ctype = new String[]{"经济信息工程学院","金融学院","通识学院","人文学院","经贸外语学院"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,ctype);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner spinner = super.findViewById(R.id.spinner);
        mSpinner.setAdapter(adapter);



        String[] ctype1 = new String[]{"睫毛膏","口红","眼影","腮红","指甲油","粉底液","香水","面膜"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,ctype1);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner spinner1 = super.findViewById(R.id.spinner1);
        mTypeSpinner.setAdapter(adapter1);

        mSpinner.setOnItemSelectedListener(this);
        mTypeSpinner.setOnItemSelectedListener(this);

    }

    public void myClick(View view)    {
        EditText number=(EditText)findViewById(R.id.stnumber1);
        Spinner spinner= (Spinner)findViewById(R.id.spinner);
        Spinner spinner1= (Spinner)findViewById(R.id.spinner1);
        EditText introduce=(EditText)findViewById(R.id.intro1);
        Toast.makeText(FuncActivity.this,"学号为："+ number.getText().toString() +"学院为："+spinner.getSelectedItem().toString()
                +"种类为："+spinner1.getSelectedItem().toString()+"类别介绍为："+introduce.getText().toString() , Toast.LENGTH_LONG).show();
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String content = parent.getItemAtPosition(position).toString();
        switch (parent.getId()){
            case R.id.spinner:
                Toast toast = Toast.makeText(FuncActivity.this,"选择的学院是：" + content, Toast.LENGTH_SHORT);
                toast.show();
                break;
            case R.id.spinner1:
                Toast.makeText(FuncActivity.this,"闲置类别是：" + content,
                        Toast.LENGTH_SHORT).show();
                break;

                default:
                    break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
    }

    /*private void initView(){
        imagePicker = new ImagePicker();
        imagePicker.setTitle("设置头像");
        imagePicker.setCropImage(true);
        list = new ArrayList<>();
        adapter = new GvAdapter(this, list);
        gridView.setAdapter((ListAdapter) adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View
                    view, int position, long id) {
                //判断是否是最后一个。
                if (position==parent.getChildCount()-1){
                    if (position==6){//不能点击了
                    }else{
                        opnePhoto();
                    }
                }else{     //可以加点预览功能。
                }
            }
        });
    }
    public void opnePhoto() {
        // 启动图片选择器
        imagePicker.startChooser(this, new ImagePicker.Callback() {
            // 选择图片回调

            public void onPickImage(Uri imageUri) {
            }
            // 裁剪图片回调

            public void onCropImage(Uri imageUri) {
                if (list.size()>=6){
                    Toast.makeText(FuncActivity.this,"最多选择六张图片",Toast.LENGTH_LONG).show();
                }else{
                    list.add(String.valueOf(imageUri));
                }
                adapter.notifyDataSetChanged();
//                path= String.valueOf(imageUri);
            }

            public void cropConfig(CropImage.ActivityBuilder
                                           builder) {
                builder
                        // 是否启动多点触摸
                        .setMultiTouchEnabled(false)
                        // 设置网格显示模式
                        .setGuidelines(CropImageView.Guidelines.OFF)
                        // 圆形/矩形
                        .setCropShape(CropImageView.CropShape
                                .RECTANGLE)
                        // 调整裁剪后的图片最终大小
                        .setRequestedSize(960, 540)
                        // 宽高比
                        .setAspectRatio(16, 9);
            }
            // 用户拒绝授权回调

            public void onPermissionDenied(int requestCode,
                                           String[] permissions,
                                           int[] grantResults) {
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int
            resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        imagePicker.onActivityResult(FuncActivity.this,requestCode, resultCode, data);

    }*/

}