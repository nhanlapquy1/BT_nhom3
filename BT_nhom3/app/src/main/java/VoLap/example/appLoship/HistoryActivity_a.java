package VoLap.example.appLoship;

import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.circleview.R;

import java.util.ArrayList;

public class HistoryActivity_a extends AppCompatActivity {

    GridView gridHinhAnh;
    ArrayList<GridViewBean_a> arrayList;
    GridViewBaseAdapter_a adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_a);

        Anhxa();

        adapter = new GridViewBaseAdapter_a(this,R.layout.activity_picture,arrayList);
        gridHinhAnh.setAdapter(adapter);

        /*
        BottomNavigationView btnview;
        btnview = (BottomNavigationView)findViewById(R.id.bottom_navigation);

        btnview.setSelectedItemId(R.id.thongbao);

        btnview.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(), GameHomeActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.thongbao:
                        return true;
                    case R.id.canhan:
                        startActivity(new Intent(getApplicationContext(),SettingsActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });

         */

    }
    private void Anhxa(){
        gridHinhAnh = (GridView)findViewById(R.id.gridviewServices);
        arrayList = new ArrayList<>();
        arrayList.add(new GridViewBean_a("Nghe nhạc",R.drawable.app1));
        arrayList.add(new GridViewBean_a("Học lập trình",R.drawable.app2));
        arrayList.add(new GridViewBean_a("Edit Video",R.drawable.app3));
        arrayList.add(new GridViewBean_a("Edit ảnh",R.drawable.app4));
        arrayList.add(new GridViewBean_a("chơi game",R.drawable.game6));
        arrayList.add(new GridViewBean_a("xem Youtobe",R.drawable.app6));
    }

}
