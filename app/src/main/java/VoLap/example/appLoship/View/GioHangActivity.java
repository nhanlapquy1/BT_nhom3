package VoLap.example.appLoship.View;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import VoLap.example.appLoship.R;

public class GioHangActivity extends AppCompatActivity implements ValueEventListener {
    Button bt_giohang;
    ImageButton imageButtonTru,imageButtonCong;
    TextView txtSoLuong, txtMaps, txtDonGia, txtThanhTien;

    public static final String KEY_TO_MAIN = "KEY_TO_MAIN";


    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gio_hang);
        imageButtonTru=findViewById(R.id.imageButtonTru);
        imageButtonCong=findViewById(R.id.imageButtonCong);

        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();
        databaseReference.addValueEventListener(this);

        txtDonGia= (TextView) findViewById(R.id.txtDonGia);
        txtSoLuong= (TextView)findViewById(R.id.txtSoLuong);
        txtThanhTien = (TextView)findViewById(R.id.txtGia);

        bt_giohang=(Button)findViewById(R.id.btn_giohang);

        imageButtonTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sl=Integer.parseInt(txtSoLuong.getText().toString());
                if(sl>1)
                    txtSoLuong.setText(Integer.toString(sl-1));
                txtThanhTien.setText(Integer.toString(Integer.parseInt(txtDonGia.getText().toString())*Integer.parseInt(txtSoLuong.getText().toString())) + " đ");
            }
        });
        imageButtonCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sl=Integer.parseInt(txtSoLuong.getText().toString());

                txtSoLuong.setText(Integer.toString(sl+1));
                txtThanhTien.setText(Integer.toString(Integer.parseInt(txtDonGia.getText().toString())*Integer.parseInt(txtSoLuong.getText().toString())) + " đ");
            }
        });


        bt_giohang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String gia = txtThanhTien.getText().toString();
                Intent Dis2=new Intent(GioHangActivity.this, DonHang_activity.class);
                Dis2.putExtra(KEY_TO_MAIN,gia);
                startActivity(Dis2);

                DonHang donHang  = new DonHang(txtDonGia.getText().toString(),txtSoLuong.getText().toString(),txtThanhTien.getText().toString());
                databaseReference.child("donhang").child("donhang3").setValue(donHang);
            }
        });


        txtMaps = findViewById(R.id.txtMap3);
        txtMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(GioHangActivity.this, MapsActivity.class);

                startActivity(intent);

            }
        });

    }


    @Override
    public void onDataChange(@NonNull DataSnapshot snapshot) {
        txtDonGia.setText(snapshot.child("gia").child("banhmy").getValue().toString());
    }

    @Override
    public void onCancelled(@NonNull DatabaseError error) {

    }
    class DonHang{
        String dongia;
        String soluong;
        String thanhtien;

        public DonHang(){}

        public DonHang(String dongia, String soluong, String thanhtien) {
            this.dongia = dongia;
            this.soluong = soluong;
            this.thanhtien = thanhtien;
        }

        public String getDongia() {
            return dongia;
        }

        public void setDongia(String dongia) {
            this.dongia = dongia;
        }

        public String getSoluong() {
            return soluong;
        }

        public void setSoluong(String soluong) {
            this.soluong = soluong;
        }

        public String getThanhtien() {
            return thanhtien;
        }

        public void setThanhtien(String thanhtien) {
            this.thanhtien = thanhtien;
        }
    }
}