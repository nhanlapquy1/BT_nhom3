package VoLap.example.appLoship.View;

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

        overridePendingTransition(R.anim.trai_sang_phai,R.anim.phai_sang_trai);
        btnext=(Button)findViewById(R.id.bt_next);
        btnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Dis2=new Intent(MainActivity.this, Login1_Activity.class);
                startActivity(Dis2);
            }
        });
    }
}





