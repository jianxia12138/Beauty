package cn.edu.swufe.beauty;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class HomeFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container);
    }

    TextView out;
    EditText inp;
    TextView cream1;
    TextView eyeshadow1;
    TextView lip1;
    TextView makeup1;
    TextView mask1;
    TextView perfume1;
    TextView polish1;
    TextView rouge1;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        out = (TextView) getView().findViewById(R.id.homeTextView);
        inp = (EditText) getView().findViewById(R.id.inpText);
        cream1 = (TextView) getView().findViewById(R.id.cream1);
        eyeshadow1 = (TextView) getView().findViewById(R.id.eyeshadow1);
        lip1 = (TextView) getView().findViewById(R.id.lip1);
        makeup1 = (TextView) getView().findViewById(R.id.makeup1);
        mask1 = (TextView) getView().findViewById(R.id.mask1);
        perfume1 = (TextView) getView().findViewById(R.id.perfume1);
        polish1 = (TextView) getView().findViewById(R.id.polish1);
        rouge1 = (TextView) getView().findViewById(R.id.rouge1);

        //String str = inp.getText().toString();
        //Log.i("main","input=" + str);

        Button btn = (Button) getView().findViewById(R.id.btn1);

        cream1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.cream1) {
                    Intent listcream = new Intent(getActivity(), CreamActivity.class);
                    startActivity(listcream);
                }
            }
        });

        eyeshadow1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.eyeshadow1) {
                    Intent listeyeshadow = new Intent(getActivity(), EyeshadowActivity.class);
                    startActivity(listeyeshadow);
                }
            }
        });

        lip1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.lip1) {
                    Intent listlip = new Intent(getActivity(), LipActivity.class);
                    startActivity(listlip);
                }
            }
        });

        makeup1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.makeup1) {
                    Intent listmake = new Intent(getActivity(), MakeupActivity.class);
                    startActivity(listmake);
                }
            }
        });

        mask1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.mask1) {
                    Intent listmask = new Intent(getActivity(), MaskActivity.class);
                    startActivity(listmask);
                }
            }
        });

        perfume1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.perfume1) {
                    Intent listperfume = new Intent(getActivity(), PerfumeActivity.class);
                    startActivity(listperfume);
                }
            }
        });

        polish1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.polish1) {
                    Intent listpolish = new Intent(getActivity(), PolishActivity.class);
                    startActivity(listpolish);
                }
            }
        });

        rouge1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.rouge1) {
                    Intent listrouge = new Intent(getActivity(), RougeActivity.class);
                    startActivity(listrouge);
                }
            }
        });



    }

}