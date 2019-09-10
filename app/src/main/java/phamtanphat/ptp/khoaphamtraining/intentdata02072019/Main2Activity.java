package phamtanphat.ptp.khoaphamtraining.intentdata02072019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // 1 : Lay du lieu dang String
//        Intent intent = getIntent();
//        String value = intent.getStringExtra(Appconstant.KEY_STRING);
//        Toast.makeText(this, value, Toast.LENGTH_SHORT).show();
        //2 : Lay du lieu dang int
//        Intent intent = getIntent();
//        int value = intent.getIntExtra(Appconstant.KEY_INTEGER,Integer.MIN_VALUE);
//        Toast.makeText(this, value + "", Toast.LENGTH_SHORT).show();
        //3 : Lay dang object
        Intent intent = getIntent();
        ArrayList<Sinhvien> sinhvien = (ArrayList<Sinhvien>) intent.getSerializableExtra(Appconstant.KEY_ARRAY_OBJECT.toString());
        Toast.makeText(this, sinhvien.get(0).ten+ "", Toast.LENGTH_SHORT).show();
    }
}
