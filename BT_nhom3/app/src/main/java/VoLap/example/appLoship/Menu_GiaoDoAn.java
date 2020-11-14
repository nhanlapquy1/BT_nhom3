package VoLap.example.appLoship;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.circleview.R;

import java.util.ArrayList;

public class Menu_GiaoDoAn extends AppCompatActivity {
ImageView img_back_giaodoan;
    GridView gridHinhAnh;
    ArrayList<GridViewBean_a> arrayList;
    GridViewBaseAdapter_a adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_giao_do_an_4);

        overridePendingTransition(R.anim.trai_sang_phai,R.anim.phai_sang_trai);

        img_back_giaodoan = (ImageView)findViewById(R.id.btn_back_giaodoan);
        img_back_giaodoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu_GiaoDoAn.this,GiaoDoAn_activity.class);
                startActivity(intent);
            }
        });


        Anhxa();
        adapter = new GridViewBaseAdapter_a(this,R.layout.activity_sup_menu_giaodoan_4,arrayList);
        gridHinhAnh.setAdapter(adapter);

    }
    private void Anhxa(){
        gridHinhAnh = (GridView)findViewById(R.id.gridviewServices);
        arrayList = new ArrayList<>();
        arrayList.add(new GridViewBean_a("Bánh mỳ",R.drawable.monan_banhmy));
        arrayList.add(new GridViewBean_a("Bánh canh ghẹ",R.drawable.monan_banhcanhghe));
        arrayList.add(new GridViewBean_a("Bánh canh giò",R.drawable.monan_banhcanhgio));
        arrayList.add(new GridViewBean_a("Bánh tráng",R.drawable.monan_banhtrang));
        arrayList.add(new GridViewBean_a("Bánh cuộn",R.drawable.monan_banhtrangcuon));
        arrayList.add(new GridViewBean_a("Cá viên chiên",R.drawable.monan_cavienchien));
        arrayList.add(new GridViewBean_a("Cơm",R.drawable.monan_com));
        arrayList.add(new GridViewBean_a("Đồ ăn combo",R.drawable.monan_combo));
        arrayList.add(new GridViewBean_a("Bánh cuộn",R.drawable.monan_banhtrangcuon));
        arrayList.add(new GridViewBean_a("Bánh tráng",R.drawable.monan_banhtrang));
        arrayList.add(new GridViewBean_a("Cơm sườn",R.drawable.monan_comsuon));
        arrayList.add(new GridViewBean_a("Trà sửa",R.drawable.monan_trasua));
        arrayList.add(new GridViewBean_a("Trà sửa",R.drawable.monan_trasua1));
        arrayList.add(new GridViewBean_a("Trà sửa",R.drawable.monan_trasua2));
    }

}

