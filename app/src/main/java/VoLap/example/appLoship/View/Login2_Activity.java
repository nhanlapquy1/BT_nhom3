package VoLap.example.appLoship.View;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;

import com.example.circleview.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class Login2_Activity extends AppCompatActivity{

    Button btStartHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_longin2);

        overridePendingTransition(R.anim.trai_sang_phai,R.anim.phai_sang_trai);
        btStartHome=(Button)findViewById(R.id.bt_StartHome);
        btStartHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Dis2=new Intent(Login2_Activity.this, Home_Activity.class);
                startActivity(Dis2);
            }
        });

        final TextInputEditText editText = findViewById(R.id.edt_name);
        final TextInputLayout usernameWrapper = findViewById(R.id.R_name);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence , int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence , int start, int before, int count) {

                if (charSequence.length() ==0) {
                    usernameWrapper.setError("Bạn bắt buộc phải nhập usernam");
                } else {
                    usernameWrapper.setError("Tên hợp lệ");
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });


    }
}
