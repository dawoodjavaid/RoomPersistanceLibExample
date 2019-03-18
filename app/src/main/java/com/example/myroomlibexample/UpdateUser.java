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

public class UpdateUser extends Fragment {


    Button UpdateUserBtn;
    EditText id,name,email;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_update_user,container,false);

        id = view.findViewById(R.id.Update_id_Ed);
        name = view.findViewById(R.id.Update_name_Ed);
        email = view.findViewById(R.id.Update_email_Ed);
        UpdateUserBtn = view.findViewById(R.id.Update_user_btn);

        UpdateUserBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                User user = new User();
                user.setId(Integer.parseInt(id.getText().toString()));
                user.setName(name.getText().toString());
                user.setEmail(email.getText().toString());

                MainActivity.myAppDatabase.myDao().updateUser(user);
                Toast.makeText(getActivity(), "User Update Successfully", Toast.LENGTH_SHORT).show();
                id.setText("");
                name.setText("");
                email.setText("");

            }
        });

        return view;
    }
}
