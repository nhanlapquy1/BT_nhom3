package VoLap.example.appLoship.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
<<<<<<< HEAD
import android.widget.TextView;
=======
>>>>>>> 29f1e845917dc0bb7b96159e21dad47eb5a81c08

import VoLap.example.appLoship.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;


public class Login1_Activity extends AppCompatActivity {
    Button btcontinued;
    TextView linkdangky;
    private EditText Editex_login_sdt;
    private Button buttonCall;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_1);

        overridePendingTransition(R.anim.trai_sang_phai,R.anim.phai_sang_trai);
        btcontinued=(Button)findViewById(R.id.bt_dkitieptuc);
        btcontinued.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Dis2=new Intent(Login1_Activity.this, Login2_Activity.class);
                startActivity(Dis2);
            }
        });

        /*linkdangky.findViewById(R.id.link_signup);
        linkdangky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it2 =new Intent(Login1_Activity.this, SingUp_Activity.class);
                startActivity(it2);
            }
        }); */

        final TextInputEditText editText = findViewById(R.id.login1_sdt);
        final TextInputLayout usernameWrapper = findViewById(R.id.R_edt_sdt);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence , int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence , int start, int before, int count) {
                if (charSequence.length() ==0) {
                    usernameWrapper.setError("Vui lòng nhập số ");
                } else {
                    usernameWrapper.setError("Số hợp lệ");
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
}




