package VoLap.example.appLoship.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import VoLap.example.appLoship.R;

public class SingUp_Activity extends AppCompatActivity {
    Button dkitieptuc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);

        /*dkitieptuc.findViewById(R.id.bt_dkitieptuc);
        dkitieptuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it =new Intent(SingUp_Activity.this, TaoMa_Activity.class);
                startActivity(it);
            }
        });*/
    }
}