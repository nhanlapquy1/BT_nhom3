package VoLap.example.appLoship.View;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import VoLap.example.appLoship.R;

public class Login2_Activity extends AppCompatActivity {
    Button btcontinued;

    private EditText Editex_login_sdt;
    private Button buttonCall;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_2);

        overridePendingTransition(R.anim.trai_sang_phai, R.anim.phai_sang_trai);
        btcontinued = (Button) findViewById(R.id.dangkymk);
        btcontinued.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Dis2 = new Intent(Login2_Activity.this, Home_Activity.class);
                startActivity(Dis2);
            }
        });


    }
}
