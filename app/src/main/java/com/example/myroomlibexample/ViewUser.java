package com.example.myroomlibexample;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ViewUser extends Fragment {

    TextView ViewUser_tv;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
    View view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_view_user,container,false);

    ViewUser_tv = view.findViewById(R.id.ViewUser_Tv);

        List<User> users = MainActivity.myAppDatabase.myDao().getUser();

        String Myusers="";
        for(int i=0;i<users.size();i++){

            Myusers = Myusers+"Id: " + users.get(i).getId()+"\n"+
                    "Name: "+ users.get(i).getName() + "\n" + "email: " +
                     users.get(i).getEmail()+"\n\n\n\n";
        }

        ViewUser_tv.setText(Myusers);


        return view;
    }
}
