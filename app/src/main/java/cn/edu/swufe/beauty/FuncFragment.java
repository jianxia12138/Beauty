package cn.edu.swufe.beauty;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;


public class FuncFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater , ViewGroup container,
                             Bundle savedInstanceState){
        return inflater.inflate(R.layout.fragment_func,container);
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        TextView tv = (TextView)getView().findViewById(R.id.funcTextView);
        tv.setText("这是功能页面");

        Intent list = new Intent(getActivity(),FuncActivity.class);
        startActivity(list);
    }





    /*@Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_func);

        String[] ctype = new String[]{"经济信息工程学院","通识学院","金融学院","人文学院","统计学院"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item ,ctype);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Spinner spinner = super.findViewById(R.id.spinner);
        spinner.setAdapter(adapter);
    }*/


}