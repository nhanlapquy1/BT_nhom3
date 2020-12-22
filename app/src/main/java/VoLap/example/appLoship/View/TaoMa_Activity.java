package VoLap.example.appLoship.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import VoLap.example.appLoship.R;

public class TaoMa_Activity extends AppCompatActivity {
    Button taoma;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tao_ma);

        /*taoma.findViewById(R.id.bt_taoma);
        taoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it =new Intent(TaoMa_Activity.this, SignUp2_Activity.class);
                startActivity(it);
            }
        });*/
    }
}