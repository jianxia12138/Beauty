package cn.edu.swufe.beauty;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;


public class SettingFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater , ViewGroup container,
                             Bundle savedInstanceState){
        return inflater.inflate(R.layout.fragment_setting,container);
    }

    TextView chat1;
    TextView commun1;
    TextView user1;
    TextView payment1;

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        TextView tv = (TextView)getView().findViewById(R.id.settingTextView);
        tv.setText("这是设置页面");
        chat1= (TextView) getView().findViewById(R.id.chat1);
        commun1 = (TextView) getView().findViewById(R.id.commun1);
        user1 = (TextView) getView().findViewById(R.id.user1);
        payment1 = (TextView) getView().findViewById(R.id.payment1);

        chat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.chat1) {
                    Intent listchat = new Intent(getActivity(), ChatActivity.class);
                    startActivity(listchat);
                }
            }
        });

        commun1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.commun1) {
                    Intent listcommun = new Intent(getActivity(), CommunActivity.class);
                    startActivity(listcommun);
                }
            }
        });

         user1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.user1) {
                    Intent listuser = new Intent(getActivity(), UserActivity.class);
                    startActivity(listuser);
                }
            }
        });

        payment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.payment1) {
                    Intent listpayment = new Intent(getActivity(), PaymentActivity.class);
                    startActivity(listpayment);
                }
            }
        });

    }
}