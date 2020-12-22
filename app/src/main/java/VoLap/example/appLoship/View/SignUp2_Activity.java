package VoLap.example.appLoship.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import VoLap.example.appLoship.R;

public class SignUp2_Activity extends AppCompatActivity {
    Button mkdangky1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up2);

        /*mkdangky1.findViewById(R.id.dangkymk);
        mkdangky1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(SignUp2_Activity.this, Login3_Activity.class);
                startActivity(it);
            }
        });*/
    }
}