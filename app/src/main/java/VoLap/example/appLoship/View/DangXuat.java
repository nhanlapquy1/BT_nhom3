package VoLap.example.appLoship.View;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import VoLap.example.appLoship.R;

public class DangXuat extends AppCompatActivity {
    ImageView img_thongbao3,img_dangNhap;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_dang_xuat);

            overridePendingTransition(R.anim.trai_sang_phai,R.anim.phai_sang_trai);
            img_thongbao3= (ImageView)findViewById(R.id.btn_thongbao_dang_xuat);
            img_thongbao3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(DangXuat.this, ThongBaoActivity.class);
                    startActivity(intent);
                }
            });

            img_dangNhap= (ImageView)findViewById(R.id.img_go_Login);
            img_dangNhap.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent2 = new Intent(DangXuat.this, Login1_Activity.class);
                    startActivity(intent2);
                }
            });
        }
    }


