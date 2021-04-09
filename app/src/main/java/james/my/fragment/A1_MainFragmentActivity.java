package james.my.fragment;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

public class A1_MainFragmentActivity extends AppCompatActivity implements A1_Fragment_PersonForm.FragmentCommunication{

    FragmentManager fragmentManager;
    A1_Fragment_PersonForm fragmentFirst;
    A1_Fragment_PersonDetail fragmentSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a1_main_fragment);

        fragmentFirst = new A1_Fragment_PersonForm();
        fragmentSecond = new A1_Fragment_PersonDetail();

        getSupportFragmentManager().beginTransaction().add(R.id.firstfragment_container_id,fragmentFirst,"First").commit();
        getSupportFragmentManager().beginTransaction().add(R.id.secondfragment_container_id,fragmentSecond,"Second").commit();
    }

    @Override
    public void sendData(String msg) {
        A1_Fragment_PersonDetail fragmentSecondActivity = (A1_Fragment_PersonDetail) getSupportFragmentManager().findFragmentByTag("Second");

        if (fragmentSecond != null)
        {
            fragmentSecond.DisplatData(msg);
        }
    }
}