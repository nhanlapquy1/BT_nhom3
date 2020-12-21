package VoLap.example.appLoship.View;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;

<<<<<<< HEAD
import VoLap.example.appLoship.R;
=======
import com.example.circleview.R;
>>>>>>> 29f1e845917dc0bb7b96159e21dad47eb5a81c08
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class Login3_Activity extends AppCompatActivity{

    Button btStartHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_longin_3);

<<<<<<< HEAD
        /*btStartHome=(Button)findViewById(R.id.bt_StartHome);
=======
        overridePendingTransition(R.anim.trai_sang_phai,R.anim.phai_sang_trai);
        btStartHome=(Button)findViewById(R.id.bt_StartHome);
>>>>>>> 29f1e845917dc0bb7b96159e21dad47eb5a81c08
        btStartHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Dis2=new Intent(Login3_Activity.this, Home_Activity.class);
                startActivity(Dis2);
            }
<<<<<<< HEAD
        }); */
=======
        });
>>>>>>> 29f1e845917dc0bb7b96159e21dad47eb5a81c08

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
