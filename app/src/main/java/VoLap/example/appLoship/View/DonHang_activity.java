package VoLap.example.appLoship.View;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.MediaParser;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import VoLap.example.appLoship.R;

import java.util.ArrayList;

import VoLap.example.appLoship.Adapter.Nhac;

public class DonHang_activity  extends AppCompatActivity implements ValueEventListener {

    private static final int MY_PERMISSION_REQUEST_CODE_CALL_PHONE = 555;
    public static final String KEY_TO_MAIN = "KEY_TO_MAIN";

    private static final String LOG_TAG = "AndroidExample";

    private EditText Editex_login_sdt;
    private Button buttonCall;

    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;


    Button btn_donhang;
    TextView DH_xct, txtgia;
    ImageView img_play_nhac;
ArrayList<Nhac>arrayListNhac;
    int position = 0;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donhang1);

        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference().child("gia");
        databaseReference.addValueEventListener(this);

        overridePendingTransition(R.anim.trai_sang_phai, R.anim.phai_sang_trai);

        txtgia = (TextView) findViewById(R.id.dh_tong);
        txtgia.setText(getIntent().getStringExtra(GioHangActivity.KEY_TO_MAIN));

        DH_xct = (TextView) findViewById(R.id.DH_xemchitiet);
        DH_xct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tong = txtgia.getText().toString();
                Intent intent = new Intent(DonHang_activity.this, ChiTietDH_activity.class);
                intent.putExtra(KEY_TO_MAIN,tong);
                startActivity(intent);
            }
        });

        //Nghe nhạc
        NgheNhac();
        AddNhac();
        mediaPlayer =MediaPlayer.create(DonHang_activity.this, arrayListNhac.get(position).getFile());
        img_play_nhac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mediaPlayer.isPlaying()){
                    mediaPlayer.pause();
                    img_play_nhac.setImageResource(R.drawable.ic_play);
                }else {
                    mediaPlayer .start();
                    img_play_nhac.setImageResource(R.drawable.ic_pause_button);
                }


            }
        });

        //khai báo

        this.Editex_login_sdt = (EditText) this.findViewById(R.id.DH_sdt_2);
        Editex_login_sdt.setText("0375163016");

        this.buttonCall = (Button) this.findViewById(R.id.DH_goi);
        this.buttonCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                askPermissionAndCall();
            }
        });
    }

    private void AddNhac() {
        arrayListNhac   = new ArrayList<>();
        arrayListNhac.add(new Nhac(R.raw.aa));
        arrayListNhac.add(new Nhac(R.raw.ab));
    }

    private void NgheNhac() {
        img_play_nhac=(ImageView)findViewById(R.id.DH_play_nhac);
    }

    private void askPermissionAndCall() {
        // bạn phải hỏi người dùng
        // cho phép Gọi.
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) { // 23

            // Kiểm tra xem chúng tôi có quyền Gọi hay không
            int sendSmsPermisson = ActivityCompat.checkSelfPermission(this,
                    Manifest.permission.CALL_PHONE);

            if (sendSmsPermisson != PackageManager.PERMISSION_GRANTED) {
                // Nếu không có quyền, hãy nhắc người dùng.
                this.requestPermissions(
                        new String[]{Manifest.permission.CALL_PHONE},
                        MY_PERMISSION_REQUEST_CODE_CALL_PHONE
                );
                return;
            }
        }
        this.callNow();
    }
    //Thiếu quyền
    @SuppressLint("MissingPermission")
    private void callNow() {
        String phoneNumber = this.Editex_login_sdt.getText().toString();

        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:" + phoneNumber));
        try {
            this.startActivity(callIntent);
        } catch (Exception ex) {
            //cuộc gọi k thành công FAILED
            Toast.makeText(getApplicationContext(),"Your call failed... " + ex.getMessage(),
                    Toast.LENGTH_LONG).show();
            ex.printStackTrace();
        }
    }


    // Khi bạn có kết quả yêu cầu
    @Override
    public void onRequestPermissionsResult(int requestCode,
                                           String permissions[], int[] grantResults) {

        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        //
        switch (requestCode) {
            case MY_PERMISSION_REQUEST_CODE_CALL_PHONE: {

                // Lưu ý: Nếu yêu cầu bị hủy, các mảng kết quả sẽ trống.
                // Quyền được cấp (CALL_PHONE).
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                    Log.i( LOG_TAG,"Đã được phép!");
                    Toast.makeText(this, "Đã được phép!", Toast.LENGTH_LONG).show();

                    this.callNow();
                }
                // Bị hủy hoặc bị từ chối.
                else {
                    Log.i( LOG_TAG,"Đã từ chối cuộc gọi!");
                    Toast.makeText(this, "Đã từ chối cuộc gọi!", Toast.LENGTH_LONG).show();
                }
                break;
            }
        }
    }


    // Khi kết quả trả về
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == MY_PERMISSION_REQUEST_CODE_CALL_PHONE) {
            if (resultCode == RESULT_OK) {
                // Do something with data (Result returned).
                Toast.makeText(this, "Thực hiện thành công", Toast.LENGTH_LONG).show();
            } else if (resultCode == RESULT_CANCELED) {
                Toast.makeText(this, "Đã hủy", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(this, "Thực hiện thất bại!!! Thử lại", Toast.LENGTH_LONG).show();
            }
        }
    }


    @Override
    public void onDataChange(@NonNull DataSnapshot snapshot) {

    }

    @Override
    public void onCancelled(@NonNull DatabaseError error) {

    }
}


