package com.example.myroomlibexample;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class AddUser extends Fragment {

    Button AddUserBtn;
    EditText id,name,email;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_add_user,container,false);

        AddUserBtn = view.findViewById(R.id.Add_user_btn);
        id = view.findViewById(R.id.Add_id_Ed);
        name = view.findViewById(R.id.Add_name_Ed);
        email = view.findViewById(R.id.Add_email_Ed);

        AddUserBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                User user = new User();
                user.setId(Integer.parseInt(id.getText().toString()));
                user.setName(name.getText().toString());
                user.setEmail(email.getText().toString());

                MainActivity.myAppDatabase.myDao().addUser(user);

                id.setText("");
                name.setText("");
                email.setText("");
                Toast.makeText(getActivity(), "Add user Successfully", Toast.LENGTH_SHORT).show();

            }
        });

        return view;
    }
}
