package VoLap.example.appLoship.View;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.circleview.R;

public class DonHang_activity  extends AppCompatActivity {
    Button btn_donhang;
    TextView DH_xct;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donhang1);

        overridePendingTransition(R.anim.trai_sang_phai,R.anim.phai_sang_trai);

        DH_xct=(TextView)findViewById(R.id.DH_xemchitiet);
        DH_xct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DonHang_activity.this, ChiTietDH_activity.class);
                startActivity(intent);
            }
        });

     /*
        btn_donhang= (ImageView)findViewById(R.id.btn_thongbao_dang_xuat);
        btn_donhang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DangXuat.this, ThongBaoActivity.class);
                startActivity(intent);
            }
        });


      */

    }
}
