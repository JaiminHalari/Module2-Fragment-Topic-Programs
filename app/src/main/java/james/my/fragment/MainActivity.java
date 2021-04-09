package james.my.fragment;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    Button showFragment,I1task,I2task,A1task;
//    TextView mainHeading,heading1,heading2,heading3;
    LinearLayout mainActivitylayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainActivitylayout = findViewById(R.id.mainActivitylayout);

        showFragment = findViewById(R.id.B2task);
        I1task = findViewById(R.id.I1task);
        I2task = findViewById(R.id.I2task);
        A1task = findViewById(R.id.A1task);


        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.mainActivitylayout,new MainFragment()).commit();

    }

}