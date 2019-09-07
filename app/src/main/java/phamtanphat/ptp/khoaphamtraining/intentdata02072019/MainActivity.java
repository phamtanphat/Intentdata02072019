package phamtanphat.ptp.khoaphamtraining.intentdata02072019;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txt;
    Mainmodel mainmodel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = findViewById(R.id.textview);
        mainmodel = new Mainmodel(getLifecycle());
        mainmodel.setTxtMain(txt);
    }
}
