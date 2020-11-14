package VoLap.example.appLoship.View;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.circleview.R;

public class DoAn_BanhMi_Activity extends AppCompatActivity{
ImageView img_back_giaodoan3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doan_banhmi);

        overridePendingTransition(R.anim.trai_sang_phai,R.anim.phai_sang_trai);

        img_back_giaodoan3 = (ImageView)findViewById(R.id.btn_back_menudoan);
        img_back_giaodoan3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( DoAn_BanhMi_Activity.this,Menu_GiaoDoAn.class);
                startActivity(intent);
            }
        });

    }
}

