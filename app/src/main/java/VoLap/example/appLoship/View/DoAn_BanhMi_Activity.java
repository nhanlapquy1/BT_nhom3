package VoLap.example.appLoship.View;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;

import androidx.appcompat.app.AppCompatActivity;

import VoLap.example.appLoship.R;

import java.util.ArrayList;

import VoLap.example.appLoship.Adapter.DatMonAn_Adapter;
import VoLap.example.appLoship.Adapter.DatMonAn_Sup;
import VoLap.example.appLoship.Adapter.List_monan_Adapter;
import VoLap.example.appLoship.Adapter.List_monan_Sup;

public class DoAn_BanhMi_Activity extends AppCompatActivity{
    ImageView image_back_giaodoan3, image_giohang;
    Button btDatNgay;
    GridView gridView_dma;
    ArrayList<DatMonAn_Sup> arrayList;
    DatMonAn_Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datmonan_banhmi);

        overridePendingTransition(R.anim.trai_sang_phai,R.anim.phai_sang_trai);

        image_back_giaodoan3 = (ImageView)findViewById(R.id.btn_back_menudoan);
        image_back_giaodoan3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( DoAn_BanhMi_Activity.this,Menu_GiaoDoAn.class);
                startActivity(intent);
            }
        });
        image_giohang = (ImageView)findViewById(R.id.img_giohang);
        image_giohang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent( DoAn_BanhMi_Activity.this,GioHangActivity.class);
                startActivity(intent2);
            }
        });
        btDatNgay=(Button)findViewById(R.id.btn_bm_DatNgay);
        btDatNgay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent(DoAn_BanhMi_Activity.this, GioHangActivity.class);
                startActivity(intent3);
            }
        });


        gridView_dma =(GridView) findViewById(R.id.grv_dma);
        arrayList=new ArrayList<>();

        arrayList.add(new DatMonAn_Sup("Bánh Mì chả + trứng","29.000",R.drawable.mk_3));
        arrayList.add(new DatMonAn_Sup("Bánh Mì Thập cẩm","29.000",R.drawable.mk_3));
        arrayList.add(new DatMonAn_Sup("Bánh Mì Chả + cá","29.000",R.drawable.mk_4));
        arrayList.add(new DatMonAn_Sup("Bánh Mì Xúc sích","29.000",R.drawable.mk_5));
        arrayList.add(new DatMonAn_Sup("Trà sữa","29.000",R.drawable.mk_6));
        arrayList.add(new DatMonAn_Sup("Bánh tráng trứng","15.000",R.drawable.mk_7));

        adapter =new DatMonAn_Adapter(this,R.layout.activity_sup_datmonan,arrayList);
        gridView_dma.setAdapter((ListAdapter) adapter);
    }
}


