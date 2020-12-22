package VoLap.example.appLoship.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import VoLap.example.appLoship.R;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;

import android.util.Log;

import com.google.firebase.auth.FirebaseAuth;


public class DangNhapActivity extends AppCompatActivity {
    private EditText inputEmail, inputPassword;
    private FirebaseAuth mAuth;
    private ProgressBar progressBar;
    private Button btnSignup, btnLogin, btnReset;
    public boolean test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_nhap);

        mAuth = FirebaseAuth.getInstance();

        /*if (auth.getCurrentUser() != null) {
            startActivity(new Intent(DangNhapActivity.this, Home_Activity.class));
            finish();
        } */

        // set the view now

        inputEmail = (EditText) findViewById(R.id.email);
        inputPassword = (EditText) findViewById(R.id.pass);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        btnSignup = (Button) findViewById(R.id.btnDangKy);
        btnLogin = (Button) findViewById(R.id.btnQuen);
        btnReset = (Button) findViewById(R.id.reset);


        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DangNhapActivity.this, DangKyActivity.class));
            }
        });


        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DangNhapActivity.this, QuenMKActivity.class));
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inputEmail.getText().toString().isEmpty() || inputPassword.getText().toString().isEmpty())
                    Toast.makeText(DangNhapActivity.this,"Vui lòng điền đầy đủ thông tin",Toast.LENGTH_SHORT).show();
                else
                    Login(inputEmail.getText().toString(), inputPassword.getText().toString());


            }
        });
    }

    void Login(String email,String password){
        mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Intent iTrangChu=new Intent(DangNhapActivity.this, Home_Activity.class);
                            startActivity(iTrangChu);
                            Toast.makeText(DangNhapActivity.this, "Đăng nhập thành công",Toast.LENGTH_SHORT).show();
                            finish();
                        } else {
                            // If sign in fails, display a message to the user.
                            Log.w("Trạng thái", "signInWithEmail:failure", task.getException());
                            Toast.makeText(DangNhapActivity.this, "Tài khoản hoặc mật khẩu không hợp lệ",
                                    Toast.LENGTH_SHORT).show();
                        }


                    }
                });

    }


}