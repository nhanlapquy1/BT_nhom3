package VoLap.example.appLoship.View;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.circleview.R;

import java.util.ArrayList;
import java.util.List;

import VoLap.example.appLoship.Adapter.GridView_Adapter;
import VoLap.example.appLoship.Adapter.GridView_Sup;
import VoLap.example.appLoship.Adapter.HinhAnhHomeAdapter;

public class Menu_GiaoDoAn extends AppCompatActivity {
ImageView img_back_giaodoan;
    GridView gridHinhAnh;
    ArrayList<GridView_Sup> arrayList;
    GridView_Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_giao_do_an_4);

        overridePendingTransition(R.anim.trai_sang_phai,R.anim.phai_sang_trai);

        img_back_giaodoan = (ImageView)findViewById(R.id.btn_back_giaodoan);
        img_back_giaodoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu_GiaoDoAn.this, GiaoDoAn_activity.class);
                startActivity(intent);
            }
        });




        Anhxa();
        adapter = new GridView_Adapter(this,R.layout.activity_sup_menu_giaodoan_4,arrayList);
        gridHinhAnh.setAdapter(adapter);
        gridHinhAnh.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object o = gridHinhAnh.getItemAtPosition(position);
                if(o == gridHinhAnh.getItemAtPosition(0)){
                    Intent intent = new Intent(Menu_GiaoDoAn.this, DoAn_BanhMi_Activity.class);
                    startActivity(intent);
                }
            }
        });

    }

    private List<GridView_Sup> Anhxa(){
        gridHinhAnh = (GridView)findViewById(R.id.gridviewServices);
        arrayList = new ArrayList<>();
        arrayList.add(new GridView_Sup("Bánh mỳ",R.drawable.monan_banhmy));
        arrayList.add(new GridView_Sup("Bánh canh ",R.drawable.monan_banhcanhghe));
        arrayList.add(new GridView_Sup("Bánh tráng",R.drawable.monan_banhtrang));
        arrayList.add(new GridView_Sup("Bánh cuộn",R.drawable.monan_banhtrangcuon));
        arrayList.add(new GridView_Sup("Cá viên chiên",R.drawable.monan_cavienchien));
        arrayList.add(new GridView_Sup("Cơm",R.drawable.monan_com));
        arrayList.add(new GridView_Sup("Đồ ăn combo",R.drawable.monan_combo));
        arrayList.add(new GridView_Sup("Bánh cuộn",R.drawable.monan_banhtrangcuon));
        arrayList.add(new GridView_Sup("Bánh tráng",R.drawable.monan_banhtrang));
        arrayList.add(new GridView_Sup("Cơm sườn",R.drawable.monan_comsuon));
        arrayList.add(new GridView_Sup("Trà sửa",R.drawable.monan_trasua));
        arrayList.add(new GridView_Sup("Trà sửa",R.drawable.monan_trasua1));
        arrayList.add(new GridView_Sup("Trà sửa",R.drawable.monan_trasua2));
        arrayList.add(new GridView_Sup("Đồ ăn combo",R.drawable.monan_combo));
        arrayList.add(new GridView_Sup("Bánh cuộn",R.drawable.monan_banhtrangcuon));
        return null;
    }

}

