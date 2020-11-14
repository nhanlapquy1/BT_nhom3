package VoLap.example.appLoship.Model;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.circleview.R;

import VoLap.example.appLoship.View.Login1_Activity;

public class SignupActivity extends AppCompatActivity {

    ImageView arrow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_1);

        arrow = (ImageView)findViewById(R.id.arrow);
        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignupActivity.this, Login1_Activity.class);
                startActivity(intent);
            }
        });
    }
}