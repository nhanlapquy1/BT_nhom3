package VoLap.example.appLoship.View;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.circleview.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class Login2_Activity extends AppCompatActivity {
    Button btcontinued;

    private EditText Editex_login_sdt;
    private Button buttonCall;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_2);

        overridePendingTransition(R.anim.trai_sang_phai, R.anim.phai_sang_trai);
        btcontinued = (Button) findViewById(R.id.bt_continued2);
        btcontinued.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Dis2 = new Intent(Login2_Activity.this, Login3_Activity.class);
                startActivity(Dis2);
            }
        });


    }
}
