package VoLap.example.appLoship.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import VoLap.example.appLoship.R;

public class DangKyActivity extends AppCompatActivity {

    private EditText inputEmail, inputPassword, inputPassword2;
    private Button btnSignIn, btnSignUp, btnResetPassword;
    private ProgressBar progressBar;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_ky);
        mAuth = FirebaseAuth.getInstance();

        btnSignIn = (Button) findViewById(R.id.btnDangNhap);
        btnSignUp = (Button) findViewById(R.id.btnDangKy);
        inputEmail = (EditText) findViewById(R.id.emaildki);
        inputPassword = (EditText) findViewById(R.id.passdki);
        inputPassword2 = (EditText) findViewById(R.id.passdki2);
        progressBar = (ProgressBar) findViewById(R.id.progressBar1);


        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DangKyActivity.this, DangNhapActivity.class);
                startActivity(intent);
            }
        });

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(inputEmail.getText().toString().isEmpty() || inputPassword.getText().toString().isEmpty() || inputPassword2.getText().toString().isEmpty())
                    Toast.makeText(DangKyActivity.this,"Vui lòng điền đầy đủ thông tin",Toast.LENGTH_SHORT).show();
                else
                if(inputPassword.getText().toString().equals(inputPassword2.getText().toString())) {
                    if(inputPassword.getText().toString().length()>=8) {
                        DangKy(inputEmail.getText().toString(), inputPassword.getText().toString());
                        progressBar.setVisibility(View.VISIBLE);
                    }
                    else {
                        Toast.makeText(DangKyActivity.this,"Mật khẩu phải có ít nhất 8 ký tự",Toast.LENGTH_SHORT).show();
                    }
                }
                else
                    Toast.makeText(DangKyActivity.this,"Mật khẩu không giống nhau, vui lòng điền lại",Toast.LENGTH_SHORT).show();
            }




        });
    }

    void DangKy(String email,String mk){
        mAuth.createUserWithEmailAndPassword(email, mk)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            FirebaseUser user = mAuth.getCurrentUser();
                            Log.d("trang thai", "Tạo tài khoản thành công");

                            Toast.makeText(DangKyActivity.this, "Tạo tài khoản thành công", Toast.LENGTH_SHORT).show();
                            Intent iUpdateProfile=new Intent(DangKyActivity.this, DangNhapActivity.class);
                            startActivity(iUpdateProfile);
                            finish();
                        } else {
                            // If sign in fails, display a message to the user.
                            Log.w("trạng thái", "createUserWithEmail:failure", task.getException());
                            Toast.makeText(DangKyActivity.this, "Tài khoản đã tồn tại",
                                    Toast.LENGTH_SHORT).show();
                        }

                        // ...
                    }
                });
    }
}