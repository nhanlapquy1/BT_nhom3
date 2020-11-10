package VoLap.example.appLoship;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.circleview.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class  Home_Activity extends AppCompatActivity {
    Button bt_GiaoDoAn,bt_List_GiaoDoAn,bt_MenuMonAn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_a);
        bt_GiaoDoAn=(Button)findViewById(R.id.bt_GiaoDoAn);
        bt_GiaoDoAn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Dis2=new Intent(Home_Activity.this,GiaoDoAn_activity.class);
                startActivity(Dis2);
            }
        });

        bt_List_GiaoDoAn=(Button)findViewById(R.id.bt_listdoan);
        bt_List_GiaoDoAn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Dis3=new Intent(Home_Activity.this,List_GiaoDoAn.class);
                startActivity(Dis3);
            }
        });

        bt_MenuMonAn=(Button)findViewById(R.id.bt_menumonan);
        bt_MenuMonAn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Dis3=new Intent(Home_Activity.this,MenuMonAn.class);
                startActivity(Dis3);
            }
        });

        BottomNavigationView btnview;
        btnview = (BottomNavigationView) findViewById(R.id.bottom_navigation);

        btnview.setSelectedItemId(R.id.home);
        btnview.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.home:
                        return true;
                    case R.id.thongbao:
                        startActivity(new Intent(getApplicationContext(), ThongBaoActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.canhan:
                        startActivity(new Intent(getApplicationContext(), ProfileUserActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                }
                return false;
            }
        });

    }
}
