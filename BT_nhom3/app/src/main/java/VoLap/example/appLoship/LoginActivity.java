package VoLap.example.appLoship;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.circleview.R;

public class LoginActivity extends AppCompatActivity {
    Button btcontinued;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btcontinued=(Button)findViewById(R.id.bt_continued);
        btcontinued.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Dis2=new Intent(LoginActivity.this,User1Activity.class);
                startActivity(Dis2);
            }
        });
    }


}

