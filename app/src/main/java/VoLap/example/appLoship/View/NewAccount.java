package VoLap.example.appLoship.View;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import VoLap.example.appLoship.R;

public class NewAccount  extends AppCompatActivity {
    ImageView img_back3;
    Button btgoHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_account);

        overridePendingTransition(R.anim.trai_sang_phai,R.anim.phai_sang_trai);

        img_back3 = (ImageView)findViewById(R.id.img_back_QLHS);
        img_back3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NewAccount.this, QLHS.class);
                startActivity(intent);
            }
        });

       btgoHome=(Button)findViewById(R.id.btn_go_home2);
        btgoHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Dis2=new Intent(NewAccount.this, Home_Activity.class);
                startActivity(Dis2);
            }
        });
    }
}