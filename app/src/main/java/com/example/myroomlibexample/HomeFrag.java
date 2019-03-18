package com.example.myroomlibexample;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class HomeFrag extends Fragment implements View.OnClickListener {

    Button AddUserbtn,ViewUserBtn,DeleteUserBtn,UpdateUserBtn;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

         View view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_home,container,false);

         ViewUserBtn = view.findViewById(R.id.ViewUser_Id);
         AddUserbtn = view.findViewById(R.id.AddUser_Id);
         DeleteUserBtn = view.findViewById(R.id.DeleteUser_Id);
         UpdateUserBtn = view.findViewById(R.id.UpdateUser_Id);

         AddUserbtn.setOnClickListener(this);
         ViewUserBtn.setOnClickListener(this);
         DeleteUserBtn.setOnClickListener(this);
         UpdateUserBtn.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.AddUser_Id: {
                MainActivity.fragmentManager.beginTransaction().replace(R.id.MyHomeFragPlace_Id, new AddUser()).addToBackStack(null).commit();
                break;
            }

            case R.id.ViewUser_Id:{
                MainActivity.fragmentManager.beginTransaction().replace(R.id.MyHomeFragPlace_Id,new ViewUser()).addToBackStack(null).commit();
                break;
            }
            case R.id.DeleteUser_Id:{
                MainActivity.fragmentManager.beginTransaction().replace(R.id.MyHomeFragPlace_Id,new DeleteUser()).addToBackStack(null).commit();
                break;
            }
            case R.id.UpdateUser_Id:{
                MainActivity.fragmentManager.beginTransaction().replace(R.id.MyHomeFragPlace_Id,new UpdateUser()).addToBackStack(null).commit();
                break;
            }

        }
    }
}
