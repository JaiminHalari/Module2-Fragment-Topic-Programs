package james.my.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;


public class I2_Fragment_Register extends Fragment {

    TextInputEditText name,email,password;
    TextView birthdate;
    Button signup;
    TextView signinlink;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_i2_register, container, false);

        name = view.findViewById(R.id.nameid);
        email = view.findViewById(R.id.emailid);
        password = view.findViewById(R.id.passwordid);
        birthdate = view.findViewById(R.id.birthdateid);
        signup = view.findViewById(R.id.signup_button_id);
        signinlink = view.findViewById(R.id.signin_link_id);

        birthdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Birthdate Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = name.getText().toString();
                String userEmail = email.getText().toString();
                String userPassword = password.getText().toString();
                String birthdates = birthdate.getText().toString();

                if (userName.isEmpty())
                {
                    name.setError("Please enter name");
                    name.requestFocus();
                } else if (userEmail.isEmpty())
                {
                   email.setError("Please enter password");
                   email.requestFocus();
                } else if (userPassword.isEmpty())
                {
                    password.setError("Please Enter Password");
                    password.requestFocus();
                } else if (birthdates.isEmpty())
                {
                    birthdate.setError("Please fill birthdate");
                    birthdate.requestFocus();
                }
                else {
                    Toast.makeText(getContext(), "Register Successfully.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        signinlink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.mainActivitylayout,new I2_Fragment_Login()).commit();
            }
        });

        return view;
    }
}