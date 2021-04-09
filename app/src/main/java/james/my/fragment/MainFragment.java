package james.my.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;


public class MainFragment extends Fragment {

    Button B2task,I1task,I2task,A1task;
    LinearLayout mainFragmentlayout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        B2task = view.findViewById(R.id.B2task);
        I1task = view.findViewById(R.id.I1task);
        I2task = view.findViewById(R.id.I2task);
        A1task = view.findViewById(R.id.A1task);

        B2task.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.mainActivitylayout,new B2_Fragment_First()).commit();
            }
        });

        I1task.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.mainActivitylayout,new I1_Fragment()).commit();
            }
        });

        I2task.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.mainActivitylayout,new I2_Fragment_Login()).commit();
            }
        });

        A1task.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),A1_MainFragmentActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }
}