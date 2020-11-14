package VoLap.example.appLoship;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import androidx.appcompat.app.AppCompatActivity;

import com.example.circleview.R;

public class  GiaoDoAn_activity extends AppCompatActivity {
    ViewFlipper viewFlipper2;
    ImageView img_giamgia,img_backhome;
    Button bt_menu_all2, bt_cuaHang2,bt_cuaHang3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giaodoan_3);

        viewFlipper2 = (ViewFlipper) findViewById(R.id.viewFlipper2);
        viewFlipper2.setFlipInterval(2000);
        viewFlipper2.setAutoStart(true);

        overridePendingTransition(R.anim.trai_sang_phai,R.anim.phai_sang_trai);
        img_giamgia = (ImageView)findViewById(R.id.btn_GiamGia);
        img_giamgia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GiaoDoAn_activity.this, GiamGia.class);
                startActivity(intent);
            }
        });

        img_backhome = (ImageView)findViewById(R.id.btn_back_home);
        img_backhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GiaoDoAn_activity.this, Home_Activity.class);
                startActivity(intent);
            }
        });


        bt_menu_all2=(Button)findViewById(R.id.btn_menu_ALL);
        bt_menu_all2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Dis2=new Intent(GiaoDoAn_activity.this, Menu_GiaoDoAn.class);
                startActivity(Dis2);
            }
        });

        bt_cuaHang2=(Button)findViewById(R.id.btn_cua_hang2);
        bt_cuaHang2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Dis2=new Intent(GiaoDoAn_activity.this,List_MonAn.class);
                startActivity(Dis2);
            }
        });

        bt_cuaHang3=(Button)findViewById(R.id.btn_cua_hang3);
        bt_cuaHang3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Dis2=new Intent(GiaoDoAn_activity.this,GiamGia.class);
                startActivity(Dis2);
            }
        });

    }
}
