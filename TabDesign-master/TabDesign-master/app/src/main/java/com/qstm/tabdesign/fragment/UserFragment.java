package com.qstm.tabdesign.fragment;



import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.qstm.tabdesign.Login.loginActivity;
import com.qstm.tabdesign.R;
import com.qstm.tabdesign.question.MainActivity;


/**
 * 我的
 */
public class UserFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_user, container, false);


        return view;

    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        // final User user ;
        Button btn_send = (Button) getActivity().findViewById(R.id.bt_main_logout);

        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //String username=user.getUsername().toString();
                Toast.makeText(getActivity(), "成功退出", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getActivity(), loginActivity.class);
                startActivity(intent);
            }
        });
    }
}

