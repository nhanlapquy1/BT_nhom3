package VoLap.example.appLoship;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.circleview.R;

public class DoAnActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doan_banhmi);

        overridePendingTransition(R.anim.trai_sang_phai,R.anim.phai_sang_trai);

    }
}

