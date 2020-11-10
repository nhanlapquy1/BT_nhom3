package VoLap.example.appLoship;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.circleview.R;
public class Loading_activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);
        Thread myThread = new Thread(){
            @Override
            public void run(){
                try {
                    //CheckInternetConnection.ShowToast_Short(getApplicationContext(),"Login Success");
                    sleep(1000);
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);

                    finish ();
                } catch (InterruptedException e)
                { e.printStackTrace();}

            }
        };
        myThread.start();
    }
}
