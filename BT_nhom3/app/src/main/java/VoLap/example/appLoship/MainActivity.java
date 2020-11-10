package VoLap.example.appLoship;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.circleview.R;

public class MainActivity extends AppCompatActivity {
    Button btnext;
    private static int SPLASH_SCREEN = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, Home_Activity.class);
                startActivity(intent);
            }
        }, SPLASH_SCREEN);

        btnext=(Button)findViewById(R.id.bt_next);
        btnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Dis2=new Intent(MainActivity.this,LoginActivity.class);
                startActivity(Dis2);
            }
        });
    }
}





