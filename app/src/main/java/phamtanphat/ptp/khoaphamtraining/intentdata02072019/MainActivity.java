package phamtanphat.ptp.khoaphamtraining.intentdata02072019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {

    Button btnIntentString,btnIntentInteger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIntentString = findViewById(R.id.textviewString);
        btnIntentInteger = findViewById(R.id.textviewInteger);

        //1 . 8 : lambda
        btnIntentString.setOnClickListener(view -> {
            sendDataIntent(Appconstant.KEY_STRING,"Hello main 2");
        });
        btnIntentInteger.setOnClickListener(view -> {
            sendDataIntent(Appconstant.KEY_INTEGER,10);
//            Serializable;
//            Parcelable;
            // Send data object
            // send data Arraylist<Object>

            // Viet generic cho 2 dua tren

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
        startActivity(intent);
    }

}
