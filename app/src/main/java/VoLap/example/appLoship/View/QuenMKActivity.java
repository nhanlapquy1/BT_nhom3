package VoLap.example.appLoship.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

import VoLap.example.appLoship.R;

public class QuenMKActivity extends AppCompatActivity {

    FirebaseAuth auth;
    EditText email_qmk;
    Button bt_GuiEmailKP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quen_m_k);

        auth = FirebaseAuth.getInstance();
        auth.setLanguageCode("vi");

        email_qmk = (EditText) findViewById(R.id.emailquen);
        bt_GuiEmailKP = (Button) findViewById(R.id.btnQuen);
        bt_GuiEmailKP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(email_qmk.getText().toString().isEmpty())
                    Toast.makeText(QuenMKActivity.this, "Vui lòng điền địa chỉ email" ,
                            Toast.LENGTH_SHORT).show();
                else
                    FcQuenMK(email_qmk.getText().toString());
                    startActivity(new Intent(QuenMKActivity.this, DangNhapActivity.class));
            }
        });
    }
    void FcQuenMK(String email){
        auth.sendPasswordResetEmail(email)
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(QuenMKActivity.this, "Vui lòng kiểm tra hộp thư email",
                                    Toast.LENGTH_SHORT).show();
                        }
                        else
                            Toast.makeText(QuenMKActivity.this, "Địa chỉ email không hợp lệ",
                                    Toast.LENGTH_SHORT).show();
                    }
                });
    }
}