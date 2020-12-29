package VoLap.example.appLoship.View;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import VoLap.example.appLoship.R;

import java.util.ArrayList;

import VoLap.example.appLoship.Adapter.DatMonAn_Adapter;
import VoLap.example.appLoship.Adapter.DatMonAn_Sup;

public class DoAn_BanhCanh_activity extends AppCompatActivity implements ValueEventListener {
    ImageView image_back_giaodoan3, image_giohang;
    Button btDatNgay;
    GridView gridView_dma;
    ArrayList<DatMonAn_Sup> arrayList;
    DatMonAn_Adapter adapter;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;
    TextView txtgia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datmonan_banhcanh);

        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference().child("gia");
        databaseReference.addValueEventListener(this);

        txtgia = (TextView) findViewById(R.id.dat_ngay);

        overridePendingTransition(R.anim.trai_sang_phai,R.anim.phai_sang_trai);

        image_back_giaodoan3 = (ImageView)findViewById(R.id.btn_back_menudoan_bc);
        image_back_giaodoan3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( DoAn_BanhCanh_activity.this,Menu_GiaoDoAn.class);
                startActivity(intent);
            }
        });
        image_giohang = (ImageView)findViewById(R.id.img_giohang_bc);
        image_giohang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent( DoAn_BanhCanh_activity.this,GioHangActivity.class);
                startActivity(intent2);
            }
        });
        btDatNgay=(Button)findViewById(R.id.btn_bc_DatNgay);
        btDatNgay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent(DoAn_BanhCanh_activity.this, GioHangActivity.class);
                startActivity(intent3);
            }
        });


        gridView_dma =(GridView) findViewById(R.id.grv_banhcanh);
        arrayList=new ArrayList<>();

        arrayList.add(new DatMonAn_Sup("Bánh Canh Cua","29.000",R.drawable.bc_2));
        arrayList.add(new DatMonAn_Sup("Bánh Canh Ớt đỏ","29.000",R.drawable.bc_3));
        arrayList.add(new DatMonAn_Sup("Bánh Canh giò heo","29.000",R.drawable.bc_4));
        arrayList.add(new DatMonAn_Sup("Bánh Canh sườn","29.000",R.drawable.bc_5));
        arrayList.add(new DatMonAn_Sup("Bánh Canh Chả cá","29.000",R.drawable.bc_1));
        arrayList.add(new DatMonAn_Sup("Bánh Canh Ớt đỏ","29.000",R.drawable.bc_3));

        adapter =new DatMonAn_Adapter(this,R.layout.activity_sup_datmonan,arrayList);
        gridView_dma.setAdapter((ListAdapter) adapter);
    }

    @Override
    public void onDataChange(@NonNull DataSnapshot snapshot) {
        txtgia.setText(snapshot.child("banhcanh").getValue().toString());

    }

    @Override
    public void onCancelled(@NonNull DatabaseError error) {

    }
}
