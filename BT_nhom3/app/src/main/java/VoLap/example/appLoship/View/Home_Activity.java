package VoLap.example.appLoship.View;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.circleview.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

import VoLap.example.appLoship.Adapter.CHGB_Adapter;
import VoLap.example.appLoship.Adapter.CHGB_sup;
import VoLap.example.appLoship.Adapter.HinhAnhHome;
import VoLap.example.appLoship.Adapter.HinhAnhHomeAdapter;
import VoLap.example.appLoship.Adapter.MonAn_Adapter;
import VoLap.example.appLoship.Adapter.MonAn_sup;

public class  Home_Activity extends AppCompatActivity {
    ViewFlipper viewFlipper1;
    Button bt_menu_all2, bt_cuaHang2;
    ImageView img_doan1,img_doan2;
    GridView gvHinhAnh;
    private RecyclerView rcv1, rcv2, rcv3,rcv4,rcv5;
    private MonAn_Adapter monAn_adapter;
    private CHGB_Adapter chgb_adapter;
    private Context context, context2, context3,context4,context5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_2);

        viewFlipper1 = (ViewFlipper) findViewById(R.id.viewFlipper1);
        viewFlipper1.setFlipInterval(2000);
        viewFlipper1.setAutoStart(true);

        bt_menu_all2=(Button)findViewById(R.id.btn_menu_ALL);
        bt_menu_all2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Dis2=new Intent(Home_Activity.this, Menu_GiaoDoAn.class);
                startActivity(Dis2);
            }
        });

/*
        bt_cuaHang2=(Button)findViewById(R.id.btn_cua_hang);
        bt_cuaHang2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Dis2=new Intent(Home_Activity.this, List_MonAn.class);
                startActivity(Dis2);
            }
        });

        img_doan1= (ImageView)findViewById(R.id.img_banh_mi1);
        img_doan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2= new Intent(Home_Activity.this, List_MonAn.class);
                startActivity(intent2);
            }
        });

        img_doan2= (ImageView)findViewById(R.id.img_chgb_1);
        img_doan2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2= new Intent(Home_Activity.this, List_MonAn.class);
                startActivity(intent2);
            }
        });
*/




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

        overridePendingTransition(R.anim.trai_sang_phai,R.anim.phai_sang_trai);

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


        rcv1 = findViewById(R.id.RecyclerView_home1);
        rcv1.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(context, RecyclerView.HORIZONTAL, false);
        rcv1.setLayoutManager(linearLayoutManager1);
        monAn_adapter = new MonAn_Adapter();
        monAn_adapter.setData(getListMonAn());
        rcv1.setAdapter(monAn_adapter);


        rcv2 = findViewById(R.id.RecyclerView_home2);
        rcv2.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(context2, RecyclerView.HORIZONTAL, false);
        rcv2.setLayoutManager(linearLayoutManager2);
        chgb_adapter = new CHGB_Adapter();
        chgb_adapter.setData(getListCHGB1());
        rcv2.setAdapter(chgb_adapter);

        rcv3 = findViewById(R.id.RecyclerView_home3);
        rcv3.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager3 = new LinearLayoutManager(context3, RecyclerView.HORIZONTAL, false);
        rcv3.setLayoutManager(linearLayoutManager3);
        chgb_adapter = new CHGB_Adapter();
        chgb_adapter.setData(getListCHGB2());
        rcv3.setAdapter(chgb_adapter);

        rcv4 = findViewById(R.id.RecyclerView_home4);
        rcv4.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager4 = new LinearLayoutManager(context4, RecyclerView.HORIZONTAL, false);
        rcv4.setLayoutManager(linearLayoutManager4);
        chgb_adapter = new CHGB_Adapter();
        chgb_adapter.setData(getListCHGB3());
        rcv4.setAdapter(chgb_adapter);

        rcv5 = findViewById(R.id.RecyclerView_home5);
        rcv5.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager5 = new LinearLayoutManager(context5, RecyclerView.HORIZONTAL, false);
        rcv5.setLayoutManager(linearLayoutManager5);
        chgb_adapter = new CHGB_Adapter();
        chgb_adapter.setData(getListCHGB4());
        rcv5.setAdapter(chgb_adapter);


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

    private List<MonAn_sup> getListMonAn() {
        List<MonAn_sup> listMonAn = new ArrayList<>();
        listMonAn.add(new MonAn_sup("Bánh mì", R.drawable.cttl_1));
        listMonAn.add(new MonAn_sup("Mì ý", R.drawable.cttl_2));
        listMonAn.add(new MonAn_sup("Cơm Tấm", R.drawable.cttl_3));
        listMonAn.add(new MonAn_sup("Bún đậu", R.drawable.cttl_4));
        listMonAn.add(new MonAn_sup("Bánh canh", R.drawable.cttl_5));
        listMonAn.add(new MonAn_sup("Ăn vặt", R.drawable.cttl_6));
        listMonAn.add(new MonAn_sup("Đồ uống", R.drawable.cttl_7));
        return listMonAn;
    }

    private List<CHGB_sup> getListCHGB1() {
        List<CHGB_sup> list_CHGB = new ArrayList<>();
        list_CHGB.add(new CHGB_sup("Milk Tea", " 0.1 km", "Freeship", R.drawable.chgb_1));
        list_CHGB.add(new CHGB_sup("Bánh mì Bình Minh", " 0.2 km", "Freeship", R.drawable.chgb_2));
        list_CHGB.add(new CHGB_sup("Mỳ ý Josin", " 1.1 km", "Freeship", R.drawable.chgb_3));
        list_CHGB.add(new CHGB_sup("Trà sữa OchaHouse", " 2.1 km", "Freeship", R.drawable.chgb_4));
        list_CHGB.add(new CHGB_sup("Bún đậu TipTip", " 0.5 km", "Freeship", R.drawable.chgb_5));
        list_CHGB.add(new CHGB_sup("Phúc Long", " 0.2 km", "Freeship", R.drawable.chgb_1));
        list_CHGB.add(new CHGB_sup("Bánh Mì Pew", " 1.1 km", "Freeship", R.drawable.chgb_2));
        list_CHGB.add(new CHGB_sup("Bún đậu K18", " 2.5km", "Freeship", R.drawable.chgb_5));
        list_CHGB.add(new CHGB_sup("Mỳ Ý Yagao", " 1.5km", "Freeship", R.drawable.chgb_3));
        return list_CHGB;
    }

    private List<CHGB_sup> getListCHGB2() {
        List<CHGB_sup> list_CHGB = new ArrayList<>();
        list_CHGB.add(new CHGB_sup("Trà sữa KOI", " 1.2km", "Freeship", R.drawable.qm_1));
        list_CHGB.add(new CHGB_sup("Trà sữa GongCha", " 2.3km", "Freeship", R.drawable.qm_2));
        list_CHGB.add(new CHGB_sup("Trà sữa BoBuPop", " 1.4km", "Freeship", R.drawable.qm_3));
        list_CHGB.add(new CHGB_sup("Trà sữa Mr.GOOD Tea", " 1.1km", "Freeship", R.drawable.qm_4));
        list_CHGB.add(new CHGB_sup("Trà sữa Ông Thọ", " 1.5km", "Freeship", R.drawable.qm_5));
        list_CHGB.add(new CHGB_sup("Trà sữa GongCha", " 2.3km", "Freeship", R.drawable.qm_2));
        list_CHGB.add(new CHGB_sup("Trà sữa BoBuPop", " 1.4km", "Freeship", R.drawable.qm_3));
        return list_CHGB;
    }
    private List<CHGB_sup> getListCHGB3() {
        List<CHGB_sup> list_CHGB = new ArrayList<>();
        list_CHGB.add(new CHGB_sup("Nhà hàng Sáu Quê", " 6.5km", "", R.drawable.dkm_1));
        list_CHGB.add(new CHGB_sup("Bánh Mì VietSub", " 6.5km", "Freeship", R.drawable.dkm_2));
        list_CHGB.add(new CHGB_sup("Nhà hàng Nường Thanh", " 6.5km", "Freeship", R.drawable.dkm_3));
        list_CHGB.add(new CHGB_sup("Nhà hàn Nam Thanh", " 6.5km", "Freeship", R.drawable.dkm_4));
        list_CHGB.add(new CHGB_sup("Khách sạn Restaurans", " 6.5km", "Freeship", R.drawable.dkm_5));
        list_CHGB.add(new CHGB_sup("Nhà hàng Sáu Quê", " 6.5km", "", R.drawable.dkm_1));
        list_CHGB.add(new CHGB_sup("Bánh Mì VietSub", " 6.5km", "Freeship", R.drawable.dkm_2));
        return list_CHGB;
    }

    private List<CHGB_sup> getListCHGB4() {
        List<CHGB_sup> list_CHGB = new ArrayList<>();
        list_CHGB.add(new CHGB_sup("Bóp bư bự", " 6.5km", "Freeship", R.drawable.dkm_1));
        list_CHGB.add(new CHGB_sup("Bánh Mì", " 6.5km", "Freeship", R.drawable.chgb_2));
        list_CHGB.add(new CHGB_sup("Mì Ys", " 6.5km", "Freeship", R.drawable.chgb_3));
        list_CHGB.add(new CHGB_sup("Bóp bư bự", " 6.5km", "Freeship", R.drawable.chgb_2));
        list_CHGB.add(new CHGB_sup("TikTIK", " 6.5km", "Freeship", R.drawable.qm_3));
        list_CHGB.add(new CHGB_sup("Mường Thanh", " 6.5km", "Freeship", R.drawable.chgb_1));
        list_CHGB.add(new CHGB_sup("Bóp bư bự", " 6.5km", "Freeship", R.drawable.dkm_3));
        list_CHGB.add(new CHGB_sup("Bóp bư bự", " 6.5km", "Freeship", R.drawable.chgb_3));
        return list_CHGB;
    }
}
