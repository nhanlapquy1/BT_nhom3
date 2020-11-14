package VoLap.example.appLoship.View;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.circleview.R;

public class Login2_Activity extends AppCompatActivity{

    Button btStartHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_longin2);

        overridePendingTransition(R.anim.trai_sang_phai,R.anim.phai_sang_trai);
        btStartHome=(Button)findViewById(R.id.bt_StartHome);
        btStartHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Dis2=new Intent(Login2_Activity.this, Home_Activity.class);
                startActivity(Dis2);
            }
        });
    }
}
