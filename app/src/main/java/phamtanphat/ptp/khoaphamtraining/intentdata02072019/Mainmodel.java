package phamtanphat.ptp.khoaphamtraining.intentdata02072019;

import android.os.Handler;
import android.widget.TextView;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModel;

public class Mainmodel extends ViewModel implements LifecycleObserver {

    public Mainmodel() {
    }

    private TextView txtMain;
    public void setTxtMain(TextView txtMain){
        this.txtMain = txtMain;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void asigntextCreate(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                txtMain.setText("ON_CREATE");
            }
        },1000);
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void asigntextStart(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                txtMain.setText("ON_START");
            }
        },1000);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void asigntextResume(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                txtMain.setText("ON_RESUME");
            }
        },1000);
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void asigntextPause(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                txtMain.setText("ON_PAUSE");
            }
        },1000);
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void asigntextStop(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                txtMain.setText("ON_STOP");
            }
        },1000);
    }

}
