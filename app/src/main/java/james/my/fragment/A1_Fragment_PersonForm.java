package james.my.fragment;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import androidx.fragment.app.Fragment;


public class A1_Fragment_PersonForm extends Fragment {

    //object created
    LinearLayout linearLayout;
    EditText editText;
    Button button;
    FragmentCommunication fragmentCommunication;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        fragmentCommunication = (FragmentCommunication) context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_a1_personform, container, false);

        //bind object to id
        linearLayout = view.findViewById(R.id.persondataform);
        editText = view.findViewById(R.id.edt_enter_id);
        button = view.findViewById(R.id.btn_send_id);

        //button onclick listner created
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String message = editText.getText().toString();
                fragmentCommunication.sendData(message);

                linearLayout.setBackgroundColor(Color.GREEN);

            }
        });

        return view;
    }

    //created interface
    interface FragmentCommunication
    {
        void sendData(String msg);
    }

}