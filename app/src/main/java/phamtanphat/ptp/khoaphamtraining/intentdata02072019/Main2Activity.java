package phamtanphat.ptp.khoaphamtraining.intentdata02072019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // 1 : Lay du lieu dang String
        Intent intent = getIntent();
        String value = intent.getStringExtra("chuoi");
        Toast.makeText(this, value, Toast.LENGTH_SHORT).show();
    }
}