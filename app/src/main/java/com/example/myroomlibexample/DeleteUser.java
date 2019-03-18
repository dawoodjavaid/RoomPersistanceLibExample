package com.example.myroomlibexample;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DeleteUser extends Fragment {

    EditText IdEd;
    Button DeleteUserbtn;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_delete_user,container,false);

        IdEd = view.findViewById(R.id.delete_id_Ed);
        DeleteUserbtn = view.findViewById(R.id.delete_user_btn);

        DeleteUserbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                User user = new User();

                user.setId(Integer.parseInt(IdEd.getText().toString()));

                MainActivity.myAppDatabase.myDao().deleteUser(user);

                IdEd.setText("");
                Toast.makeText(getActivity(), "user Delete Successfully", Toast.LENGTH_SHORT).show();

            }
        });


        return view;
    }
}
