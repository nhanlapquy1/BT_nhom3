package VoLap.example.appLoship;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.circleview.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ThongBaoActivity extends AppCompatActivity {
    ListView listView;
    ImageView img_thongbao1;

    String mTitle[] = {"Đặt ngay bữa sáng đồng giá 17k nào, vừa rẻ mà lại no căng bụng đấy. Đặc biệt được freeship 1,8km nhé."
            ,"Chiều nay uống gì thì đặt thôi nào, đồng giá 17k freeship lun à nha"
            ,"Bị bệnh đừng quên lên Lomed. Mua thuốc giao hàng tận nhà lại còn rất nhanh."
            ,"Một tuần làm việc thật năng lượng khi lấp đầy cái bụng đói trưa nay, đồng giá 19k freeship 5km. Đặt ngay^^"
            ,"Hoa rơi hữu ý, giao hàng nhớ Losend nhé, giao hàng nhanh lại còn rẻ :D"
            ,"Reng reng reng, dậy thôi. Tới giờ ăn sáng đi làm rồi. Bữa sáng sảng khoái đồng giá 17k freeship 5km nha ^^ :D"
            ,"Hoa rơi hữu ý, giao hàng nhớ Losend nhé, giao hàng nhanh lại còn rẻ :D"};
    String mDescription[] = {"2 giờ","2 giờ","2 giờ","2 giờ","2 giờ","2 giờ","2 giờ"};
    int images[] = {R.drawable.ic_loship_placeholder,R.drawable.ic_loship_placeholder,R.drawable.ic_loship_placeholder,R.drawable.ic_loship_placeholder,R.drawable.ic_loship_placeholder,R.drawable.ic_loship_placeholder,R.drawable.ic_loship_placeholder};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thongbao);

        img_thongbao1 = (ImageView)findViewById(R.id.img_thongbao);
        img_thongbao1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThongBaoActivity.this, DangXuat.class);
                startActivity(intent);
            }
        });


        BottomNavigationView btnview;
        btnview = (BottomNavigationView) findViewById(R.id.bottom_ring);
        btnview.setSelectedItemId(R.id.thongbao);
        btnview.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(), Home_Activity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.thongbao:
                        return true;
                    case R.id.canhan:
                        startActivity(new Intent(getApplicationContext(), ProfileUserActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                }
                return false;
            }
        });


        listView = findViewById(R.id.listView);
        // now create an adapter class

        MyAdapter adapter = new MyAdapter(this, mTitle, mDescription, images);
        listView.setAdapter(adapter);
        // there is my mistake...
        // now again check this..

        // now set item click on list view
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position ==  0) {
                    Toast.makeText(ThongBaoActivity.this, "2 giờ", Toast.LENGTH_SHORT).show();
                }
                if (position ==  0) {
                    Toast.makeText(ThongBaoActivity.this, "2 giờ", Toast.LENGTH_SHORT).show();
                }
                if (position ==  0) {
                    Toast.makeText(ThongBaoActivity.this, "2 giờ", Toast.LENGTH_SHORT).show();
                }
                if (position ==  0) {
                    Toast.makeText(ThongBaoActivity.this, "2 giờ", Toast.LENGTH_SHORT).show();
                }
                if (position ==  0) {
                    Toast.makeText(ThongBaoActivity.this, "2 giờ", Toast.LENGTH_SHORT).show();
                }
                if (position ==  0) {
                    Toast.makeText(ThongBaoActivity.this, "2 giờ", Toast.LENGTH_SHORT).show();
                }
                if (position ==  0) {
                    Toast.makeText(ThongBaoActivity.this, "2 giờ", Toast.LENGTH_SHORT).show();
                }
            }
        });
        // so item click is done now check list view
    }
    class MyAdapter extends ArrayAdapter<String> {

        Context context;
        String rTitle[];
        String rDescription[];
        int rImgs[];

        MyAdapter(Context c, String title[], String description[], int imgs[]) {
            super(c, R.layout.activity_row_thongbao, R.id.textView1, title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rImgs = imgs;

        }

        @Override
        public View getView(int position,  View convertView, ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.activity_row_thongbao, parent, false);
            ImageView images = row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.textView1);
            TextView myDescription = row.findViewById(R.id.textView2);
            // now set our resources on views
            images.setImageResource(rImgs[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);
            return row;
        }
    }

}
