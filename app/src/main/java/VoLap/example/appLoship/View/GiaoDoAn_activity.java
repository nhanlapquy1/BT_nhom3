package VoLap.example.appLoship.View;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.circleview.R;

import java.util.ArrayList;
import java.util.List;

import VoLap.example.appLoship.Adapter.CHGB_Adapter;
import VoLap.example.appLoship.Adapter.CHGB_sup;
import VoLap.example.appLoship.Adapter.MonAn_Adapter;
import VoLap.example.appLoship.Adapter.MonAn_sup;

public class  GiaoDoAn_activity extends AppCompatActivity {
    ViewFlipper viewFlipper2;
    ImageView img_giamgia,img_backhome, img_giaodoan1,img_giaodoan2;
    Button bt_menu_all2, bt_cuaHang2,bt_cuaHang3;
    TextView txtMaps;
    private RecyclerView rcv1, rcv2, rcv3,rcv4,rcv5;
    private MonAn_Adapter monAn_adapter;
    private CHGB_Adapter chgb_adapter;
    private Context context, context2, context3,context4,context5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giaodoan_3);

        viewFlipper2 = (ViewFlipper) findViewById(R.id.viewFlipper2);
        viewFlipper2.setFlipInterval(2000);
        viewFlipper2.setAutoStart(true);

        overridePendingTransition(R.anim.trai_sang_phai,R.anim.phai_sang_trai);
        img_giamgia = (ImageView)findViewById(R.id.btn_GiamGia);
        img_giamgia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GiaoDoAn_activity.this, GiamGia.class);
                startActivity(intent);
            }
        });

        img_backhome = (ImageView)findViewById(R.id.btn_back_home);
        img_backhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GiaoDoAn_activity.this, Home_Activity.class);
                startActivity(intent);
            }
        });

        bt_menu_all2=(Button)findViewById(R.id.btn_menu_ALL);
        bt_menu_all2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Dis2=new Intent(GiaoDoAn_activity.this, Menu_GiaoDoAn.class);
                startActivity(Dis2);
            }
        });

        bt_cuaHang2=(Button)findViewById(R.id.btn_cua_hang2);
        bt_cuaHang2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Dis2=new Intent(GiaoDoAn_activity.this, List_MonAn.class);
                startActivity(Dis2);
            }
        });

        bt_cuaHang3=(Button)findViewById(R.id.btn_cua_hang3);
        bt_cuaHang3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Dis2=new Intent(GiaoDoAn_activity.this,GiamGia.class);
                startActivity(Dis2);
            }
        });

        rcv1 = findViewById(R.id.RecyclerView_main1);
        rcv1.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(context, RecyclerView.HORIZONTAL, false);
        rcv1.setLayoutManager(linearLayoutManager1);
        monAn_adapter = new MonAn_Adapter();
        monAn_adapter.setData(getListMonAn());
        rcv1.setAdapter(monAn_adapter);
        rcv1.addOnItemTouchListener(new RecyclerItemClickListener(this, rcv1, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Intent intent=new Intent(GiaoDoAn_activity.this, List_MonAn.class);
                startActivity(intent);
            }

            @Override
            public void onLongItemClick(View view, int position) {

            }
        }));

        txtMaps = findViewById(R.id.txtMap2);
        txtMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GiaoDoAn_activity.this, MapsActivity.class);
                startActivity(intent);
            }
        });


        rcv2 = findViewById(R.id.RecyclerView_main2);
        rcv2.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(context2, RecyclerView.HORIZONTAL, false);
        rcv2.setLayoutManager(linearLayoutManager2);
        chgb_adapter = new CHGB_Adapter();
        chgb_adapter.setData(getListCHGB1());
        rcv2.setAdapter(chgb_adapter);

        rcv3 = findViewById(R.id.RecyclerView_main3);
        rcv3.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager3 = new LinearLayoutManager(context3, RecyclerView.HORIZONTAL, false);
        rcv3.setLayoutManager(linearLayoutManager3);
        chgb_adapter = new CHGB_Adapter();
        chgb_adapter.setData(getListCHGB2());
        rcv3.setAdapter(chgb_adapter);

        rcv4 = findViewById(R.id.RecyclerView_main4);
        rcv4.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager4 = new LinearLayoutManager(context4, RecyclerView.HORIZONTAL, false);
        rcv4.setLayoutManager(linearLayoutManager4);
        chgb_adapter = new CHGB_Adapter();
        chgb_adapter.setData(getListCHGB3());
        rcv4.setAdapter(chgb_adapter);

        rcv5 = findViewById(R.id.RecyclerView_main5);
        rcv5.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager5 = new LinearLayoutManager(context5, RecyclerView.HORIZONTAL, false);
        rcv5.setLayoutManager(linearLayoutManager5);
        chgb_adapter = new CHGB_Adapter();
        chgb_adapter.setData(getListCHGB4());
        rcv5.setAdapter(chgb_adapter);


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

    class RecyclerItemClickListener implements RecyclerView.OnItemTouchListener {
    private OnItemClickListener mListener;

    public interface OnItemClickListener {
        public void onItemClick(View view, int position);

        public void onLongItemClick(View view, int position);
    }

    GestureDetector mGestureDetector;

    public RecyclerItemClickListener(Context context, final RecyclerView recyclerView, OnItemClickListener listener) {
        mListener = listener;
        mGestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() {
            @Override
            public boolean onSingleTapUp(MotionEvent e) {
                return true;
            }

            @Override
            public void onLongPress(MotionEvent e) {
                View child = recyclerView.findChildViewUnder(e.getX(), e.getY());
                if (child != null && mListener != null) {
                    mListener.onLongItemClick(child, recyclerView.getChildAdapterPosition(child));
                }
            }
        });
    }

    @Override public boolean onInterceptTouchEvent(RecyclerView view, MotionEvent e) {
        View childView = view.findChildViewUnder(e.getX(), e.getY());
        if (childView != null && mListener != null && mGestureDetector.onTouchEvent(e)) {
            mListener.onItemClick(childView, view.getChildAdapterPosition(childView));
            return true;
        }
        return false;
    }

    @Override public void onTouchEvent(RecyclerView view, MotionEvent motionEvent) { }

    @Override
    public void onRequestDisallowInterceptTouchEvent (boolean disallowIntercept){}

}