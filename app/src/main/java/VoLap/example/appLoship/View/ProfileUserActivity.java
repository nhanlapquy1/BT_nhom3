package VoLap.example.appLoship.View;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.ImageView;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import VoLap.example.appLoship.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ProfileUserActivity extends AppCompatActivity {
    ImageView img_profile2, nexta, img_goto_QLHS;
    TextView linkdkdn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_user_2);

        overridePendingTransition(R.anim.trai_sang_phai,R.anim.phai_sang_trai);

        img_profile2= (ImageView)findViewById(R.id.img_thongbao3);
        img_profile2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2= new Intent(ProfileUserActivity.this, DangXuat2.class);
                startActivity(intent2);
            }
        });

        linkdkdn=(TextView) findViewById(R.id.linkdndk);
       linkdkdn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Log.d("Test","Co click");
               Intent intent= new Intent(ProfileUserActivity.this, DangNhapActivity.class);
               startActivity(intent);
               Log.d("Test","Co chay Intent");
           }
       });

        nexta= (ImageView)findViewById(R.id.next2);
        nexta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2= new Intent(ProfileUserActivity.this, DangXuat2.class);
                startActivity(intent2);
            }
        });

        img_goto_QLHS= (ImageView)findViewById(R.id.img_QLHS1);
        img_goto_QLHS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(ProfileUserActivity.this, QLHS.class);
                startActivity(intent3);
            }
        });

        BottomNavigationView btnview;
        btnview = (BottomNavigationView) findViewById(R.id.bottom_ProFile);
        btnview.setSelectedItemId(R.id.canhan);
        btnview.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(), Home_Activity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.thongbao:
                        startActivity(new Intent(getApplicationContext(), ThongBaoActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.canhan:
                        return true;
                }
                return false;
            }
        });

    }
}