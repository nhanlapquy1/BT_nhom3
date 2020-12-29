package VoLap.example.appLoship.View;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

import VoLap.example.appLoship.R;

public class QLHS  extends AppCompatActivity {
    ImageView img_thongbao4;
    Button bt_face2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ql_hoso);
        overridePendingTransition(R.anim.trai_sang_phai,R.anim.phai_sang_trai);

        img_thongbao4= (ImageView)findViewById(R.id.img_back_user5);
        img_thongbao4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QLHS.this, ProfileUserActivity.class);
                startActivity(intent);
            }
        });

        bt_face2=(Button)findViewById(R.id.bt_facebook3);
        bt_face2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Dis2=new Intent(QLHS.this, NewAccount.class);
                startActivity(Dis2);
            }
        });
    }

}
