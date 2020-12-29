package VoLap.example.appLoship.View;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import VoLap.example.appLoship.R;

public class ChiTietDH_activity   extends AppCompatActivity implements ValueEventListener {
    Button btn_donhang;
    TextView txttong2, txttong;

    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chitiet_donhang);

        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference().child("gia");
        databaseReference.addValueEventListener(this);

        overridePendingTransition(R.anim.trai_sang_phai,R.anim.phai_sang_trai);

        txttong = (TextView) findViewById(R.id.CTdh_tong);
        txttong2 = (TextView) findViewById(R.id.CTDH_tong2);
        txttong.setText(getIntent().getStringExtra(DonHang_activity.KEY_TO_MAIN));
        txttong2.setText(getIntent().getStringExtra(DonHang_activity.KEY_TO_MAIN));


     /*
        btn_donhang= (ImageView)findViewById(R.id.btn_thongbao_dang_xuat);
        btn_donhang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DangXuat.this, ThongBaoActivity.class);
                startActivity(intent);
            }
        });


      */

    }

    @Override
    public void onDataChange(@NonNull DataSnapshot snapshot) {

    }

    @Override
    public void onCancelled(@NonNull DatabaseError error) {

    }
}