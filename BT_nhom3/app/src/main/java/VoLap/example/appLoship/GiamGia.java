package VoLap.example.appLoship;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import androidx.appcompat.app.AppCompatActivity;

import com.example.circleview.R;

public class  GiamGia extends AppCompatActivity {
    ViewFlipper viewFlipper;
    ImageView img_back_giaodoan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giam_gia);


        img_back_giaodoan= (ImageView)findViewById(R.id.btn_giao_do_an);
        img_back_giaodoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GiamGia.this, GiaoDoAn_activity.class);
                startActivity(intent);
            }
        });
    }
}