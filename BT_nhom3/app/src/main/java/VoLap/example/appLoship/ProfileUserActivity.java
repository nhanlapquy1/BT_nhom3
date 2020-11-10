package VoLap.example.appLoship;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.circleview.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ProfileUserActivity extends AppCompatActivity {
    ImageView img_profile, nexta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_user);


        img_profile = (ImageView)findViewById(R.id.img_thongbao_user);
        img_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(ProfileUserActivity.this, DangXuat.class);
                startActivity(intent2);
            }
        });


        nexta= (ImageView)findViewById(R.id.next3);
        nexta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(ProfileUserActivity.this, DangXuat.class);
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