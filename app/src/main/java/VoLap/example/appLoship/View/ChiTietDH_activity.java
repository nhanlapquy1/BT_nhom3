package VoLap.example.appLoship.View;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.circleview.R;

public class ChiTietDH_activity   extends AppCompatActivity {
    Button btn_donhang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chitiet_donhang);

        overridePendingTransition(R.anim.trai_sang_phai,R.anim.phai_sang_trai);
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