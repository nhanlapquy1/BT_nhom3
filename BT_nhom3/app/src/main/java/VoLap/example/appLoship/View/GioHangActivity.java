package VoLap.example.appLoship.View;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.circleview.R;

public class GioHangActivity extends AppCompatActivity {
    Button bt_giohang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gio_hang);

        bt_giohang=(Button)findViewById(R.id.btn_giohang);
        bt_giohang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Dis2=new Intent(GioHangActivity.this, DoAn_BanhMi_Activity.class);
                startActivity(Dis2);
            }
        });


    }


}