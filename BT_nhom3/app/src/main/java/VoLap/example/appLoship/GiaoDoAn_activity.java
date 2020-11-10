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
    ViewFlipper viewFlipper;
ImageView img_giamgia,img_backhome;
Button bt_menu_all, bt_cuaHang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giaodoan);

        viewFlipper = (ViewFlipper) findViewById(R.id.viewFlipper);
        viewFlipper.setFlipInterval(2000);
        viewFlipper.setAutoStart(true);

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


        bt_menu_all=(Button)findViewById(R.id.btn_menu_ALL);
        bt_menu_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Dis2=new Intent(GiaoDoAn_activity.this,List_GiaoDoAn.class);
                startActivity(Dis2);
            }
        });

        bt_cuaHang=(Button)findViewById(R.id.btn_cua_hang);
        bt_cuaHang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Dis2=new Intent(GiaoDoAn_activity.this,MenuMonAn.class);
                startActivity(Dis2);
            }
        });

    }
}
