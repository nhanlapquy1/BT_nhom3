package VoLap.example.appLoship.View;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import VoLap.example.appLoship.R;

public class GioHangActivity extends AppCompatActivity {
    Button bt_giohang;
        ImageButton imageButtonTru,imageButtonCong;
    TextView txtSoLuong, txtMaps;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gio_hang);
        imageButtonTru=findViewById(R.id.imageButtonTru);
        imageButtonCong=findViewById(R.id.imageButtonCong);
        txtSoLuong=findViewById(R.id.txtSoLuong);

        bt_giohang=(Button)findViewById(R.id.btn_giohang);
        bt_giohang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Dis2=new Intent(GioHangActivity.this, DonHang_activity.class);
                startActivity(Dis2);
            }
        });
        imageButtonTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sl=Integer.parseInt(txtSoLuong.getText().toString());
                if(sl>1)
                    txtSoLuong.setText(Integer.toString(sl-1));
            }
        });
        imageButtonCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sl=Integer.parseInt(txtSoLuong.getText().toString());

                txtSoLuong.setText(Integer.toString(sl+1));
            }
        });


        txtMaps = findViewById(R.id.txtMap3);
        txtMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GioHangActivity.this, MapsActivity.class);
                startActivity(intent);
            }
        });

    }


}