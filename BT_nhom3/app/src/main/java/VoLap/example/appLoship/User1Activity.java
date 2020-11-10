package VoLap.example.appLoship;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.circleview.R;

public class User1Activity extends AppCompatActivity{

    Button btStartHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user1);
        btStartHome=(Button)findViewById(R.id.bt_StartHome);
        btStartHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Dis2=new Intent(User1Activity.this,Home_Activity.class);
                startActivity(Dis2);
            }
        });
    }
}
