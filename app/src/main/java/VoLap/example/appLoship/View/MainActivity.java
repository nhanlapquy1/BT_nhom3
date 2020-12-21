package VoLap.example.appLoship.View;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import VoLap.example.appLoship.R;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {
    Button btnext, dnhap, dky;
    EditText ipmail, ippass;
    private static int SPLASH_SCREEN = 1000;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAuth=FirebaseAuth.getInstance();
        mAuth.signOut();
        /*new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, Login1_Activity.class);
                startActivity(intent);
            }
        }, SPLASH_SCREEN); */

        overridePendingTransition(R.anim.trai_sang_phai,R.anim.phai_sang_trai);
        btnext=(Button)findViewById(R.id.bt_next);
        btnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Dis2=new Intent(MainActivity.this, Home_Activity.class);
                startActivity(Dis2);
            }
        });

        mAuth = FirebaseAuth.getInstance();


    }
}





