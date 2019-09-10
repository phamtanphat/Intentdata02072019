package phamtanphat.ptp.khoaphamtraining.intentdata02072019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    Button btnIntentString,btnIntentInteger,btnIntentObject,btnIntentArrayObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIntentString = findViewById(R.id.textviewString);
        btnIntentInteger = findViewById(R.id.textviewInteger);
        btnIntentObject = findViewById(R.id.textviewObject);
        btnIntentArrayObject = findViewById(R.id.textviewArrayObject);

        //1 . 8 : lambda
        btnIntentString.setOnClickListener(view -> {
            sendDataIntent(Appconstant.KEY_STRING.toString(),"Hello main 2");
        });
        btnIntentInteger.setOnClickListener(view -> {
            sendDataIntent(Appconstant.KEY_INTEGER.toString(),10);
        });
        btnIntentObject.setOnClickListener(view -> {
            Sinhvien sinhvien = new Sinhvien("Sinh vien A");

//            Intent intent = new Intent(MainActivity.this,Main2Activity.class);
//            intent.putExtra(Appconstant.KEY_OBJECT.toString(), sinhvien);
//            startActivity(intent);
            sendDataIntent(Appconstant.KEY_OBJECT.toString(),sinhvien);
        });

       btnIntentArrayObject.setOnClickListener(view -> {
           ArrayList<Sinhvien> sinhviens = new ArrayList<>();
           sinhviens.add(new Sinhvien("A"));
           sinhviens.add(new Sinhvien("B"));
           sinhviens.add(new Sinhvien("C"));
           sinhviens.add(new Sinhvien("D"));

       });
    }
    //generic type : tu thay doi kieu du lieu
    private <T> void sendDataIntent(String key ,T value ){
        Intent intent = new Intent(MainActivity.this,Main2Activity.class);
        if (value instanceof String){
            intent.putExtra(key,(String) value);
        }
        if (value instanceof Integer){
            intent.putExtra(key,(Integer) value);
        }
        if (value instanceof Sinhvien){
            intent.putExtra(key,(Serializable) value);
        }
        startActivity(intent);
    }

}
