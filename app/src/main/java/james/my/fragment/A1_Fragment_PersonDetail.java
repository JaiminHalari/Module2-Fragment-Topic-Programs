package james.my.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


public class A1_Fragment_PersonDetail extends Fragment {

    LinearLayout linearLayout;
    TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_a1_person_detail, container, false);

        linearLayout = view.findViewById(R.id.persondetails);
        textView = view.findViewById(R.id.txt_result_id);   //bind object to id

        return view;
    }

    //create display method
    public void DisplatData(String msg)
    {
        //text view in settext
        textView.setText("Received Data :" + msg);
        linearLayout.setBackgroundColor(Color.RED);
    }

}