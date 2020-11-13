package VoLap.example.appLoship;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ViewFlipper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.circleview.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class  Home_Activity extends AppCompatActivity {
    ViewFlipper viewFlipper1;
    Button bt_GiaoDoAn,bt_List_GiaoDoAn,bt_MenuMonAn;
    GridView gvHinhAnh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        viewFlipper1 = (ViewFlipper) findViewById(R.id.viewFlipper1);
        viewFlipper1.setFlipInterval(2000);
        viewFlipper1.setAutoStart(true);


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

        List<HinhAnhHome> image_details = AnhXa();
        final GridView gridView = (GridView) findViewById(R.id.gridviewHinhAnh);
        gridView.setAdapter(new HinhAnhHomeAdapter(this, image_details));
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object o = gridView.getItemAtPosition(position);
                if(o == gridView.getItemAtPosition(0)){
                    Intent intent = new Intent(Home_Activity.this, GiaoDoAn_activity.class);
                    startActivity(intent);
                }
            }
        });
    }



    public List<HinhAnhHome> AnhXa(){
        List<HinhAnhHome> arrayImage = new ArrayList<>();
        arrayImage.add(new HinhAnhHome("Giao Đồ Ăn",R.drawable.ic_loship_circle));
        arrayImage.add(new HinhAnhHome("Gọi Xe",R.drawable.ic_loxe));
        arrayImage.add(new HinhAnhHome("Đi chợ",R.drawable.ic_lomart));
        arrayImage.add(new HinhAnhHome("Gửi hàng",R.drawable.ic_losend));
        arrayImage.add(new HinhAnhHome("Giặt ủi",R.drawable.ic_lozat));
        arrayImage.add(new HinhAnhHome("Mua thuốc",R.drawable.ic_lomed));
        arrayImage.add(new HinhAnhHome("Mua gì cũng có",R.drawable.ic_lozi_landing));
        arrayImage.add(new HinhAnhHome("Mua đồ thú cưng",R.drawable.ic_lopet));
        arrayImage.add(new HinhAnhHome("Mua hoa",R.drawable.ic_lohoa));
        return arrayImage;
    }
}
