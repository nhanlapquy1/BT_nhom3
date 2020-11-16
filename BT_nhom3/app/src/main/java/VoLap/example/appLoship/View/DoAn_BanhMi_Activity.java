package VoLap.example.appLoship.View;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.circleview.R;

public class DoAn_BanhMi_Activity extends AppCompatActivity{
    ImageView image_back_giaodoan3, image_giohang;
    Button btDatNgay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doan_banhmi);

        overridePendingTransition(R.anim.trai_sang_phai,R.anim.phai_sang_trai);

        image_back_giaodoan3 = (ImageView)findViewById(R.id.btn_back_menudoan);
        image_back_giaodoan3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( DoAn_BanhMi_Activity.this,Menu_GiaoDoAn.class);
                startActivity(intent);
            }
        });

        image_giohang = (ImageView)findViewById(R.id.img_giohang);
        image_giohang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent( DoAn_BanhMi_Activity.this,GioHangActivity.class);
                startActivity(intent2);
            }
        });

        btDatNgay=(Button)findViewById(R.id.btn_bm_DatNgay);
        btDatNgay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent(DoAn_BanhMi_Activity.this, GioHangActivity.class);
                startActivity(intent3);
            }
        });


    }
}

