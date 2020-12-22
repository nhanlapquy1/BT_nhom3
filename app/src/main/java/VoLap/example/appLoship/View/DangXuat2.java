package VoLap.example.appLoship.View;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

import VoLap.example.appLoship.R;

public class DangXuat2 extends AppCompatActivity {

    ImageView img_thongbao3,img_dangNhap2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_xuat2);

        overridePendingTransition(R.anim.trai_sang_phai,R.anim.phai_sang_trai);

        img_thongbao3= (ImageView)findViewById(R.id.btn_thongbao_dang_xuat3);
        img_thongbao3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DangXuat2.this, ProfileUserActivity.class);
                startActivity(intent);
            }
        });
        img_dangNhap2= (ImageView)findViewById(R.id.img_go_Login2);
        img_dangNhap2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth auth=FirebaseAuth.getInstance();
                auth.signOut();
                Intent intent2 = new Intent(DangXuat2.this, Home_Activity.class);
                startActivity(intent2);

            }
        });
    }
}


