package VoLap.example.appLoship.View;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.circleview.R;

public class NhanHang_activity extends AppCompatActivity {
    Button BT_back_DoAn;
   ImageView img_back_nhanhang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_da_nhan_donhang1);

        overridePendingTransition(R.anim.trai_sang_phai,R.anim.phai_sang_trai);

        img_back_nhanhang= (ImageView)findViewById(R.id.img_back_DonHang);
        img_back_nhanhang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(NhanHang_activity.this, DonHang_activity.class);
                startActivity(intent2);
            }
        });

        BT_back_DoAn=(Button)findViewById(R.id.NH_BTN_back_DatDoAn) ;
        BT_back_DoAn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent3=new Intent(NhanHang_activity.this,DoAn_BanhMi_Activity.class);
               startActivity(intent3);
            }
          });
    }
}