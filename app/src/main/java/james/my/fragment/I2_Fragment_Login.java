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


public class I2_Fragment_Login extends Fragment {

    TextInputEditText name,password;
    TextView forgotpass;
    Button signin;
    TextView signuplink;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_i2_login, container, false);

        name = view.findViewById(R.id.nameid);
        password = view.findViewById(R.id.passwordid);
        forgotpass = view.findViewById(R.id.forgot_link_id);
        signin = view.findViewById(R.id.signin_button_id);
        signuplink = view.findViewById(R.id.signup_link_id);

        forgotpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Forgot Password Clicked", Toast.LENGTH_SHORT).show();

            }
        });

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = name.getText().toString();
                String userPassword = password.getText().toString();

                if (userName.isEmpty())
                {
                    name.setError("Please enter name");
                    name.requestFocus();
                } else if (userPassword.isEmpty())
                {
                    password.setError("Please enter password");
                    password.requestFocus();
                } else {
                    Toast.makeText(getContext(), "Login Successfully.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        signuplink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.mainActivitylayout,new I2_Fragment_Register()).commit();
            }
        });

        return view;

    }
}