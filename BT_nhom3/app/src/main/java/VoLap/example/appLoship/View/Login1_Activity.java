package VoLap.example.appLoship.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.circleview.R;


public class Login1_Activity extends AppCompatActivity {
    Button btcontinued;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_1);

        overridePendingTransition(R.anim.trai_sang_phai,R.anim.phai_sang_trai);
        btcontinued=(Button)findViewById(R.id.bt_continued);
        btcontinued.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Dis2=new Intent(Login1_Activity.this, Login2_Activity.class);
                startActivity(Dis2);
            }
        });
    }


}

