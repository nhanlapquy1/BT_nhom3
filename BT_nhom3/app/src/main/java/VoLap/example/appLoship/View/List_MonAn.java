package VoLap.example.appLoship.View;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.circleview.R;

import java.util.ArrayList;

import VoLap.example.appLoship.Adapter.List_monan_Adapter;
import VoLap.example.appLoship.Adapter.List_monan_BaseAdapter;

public class List_MonAn extends AppCompatActivity {

    GridView gridView;
    ArrayList<List_monan_BaseAdapter> arrayList;
    List_monan_Adapter adapter;
    ImageView img_back_giaodoan1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_mon_an_4);
        overridePendingTransition(R.anim.trai_sang_phai,R.anim.phai_sang_trai);

        img_back_giaodoan1= (ImageView)findViewById(R.id.img_back_giaodoan1);
        img_back_giaodoan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2= new Intent(List_MonAn.this, GiaoDoAn_activity.class);
                startActivity(intent2);
            }
        });


        gridView =(GridView) findViewById(R.id.gv2);
        arrayList=new ArrayList<>();

        arrayList.add(new List_monan_BaseAdapter("Milk"," 6.5km","Đối tác Loship","Freeship","60%",R.drawable.quan_moi1));
        arrayList.add(new List_monan_BaseAdapter("Milk"," 6.5km","Đối tác Loship","Freeship","60%",R.drawable.quan_moi1));
        arrayList.add(new List_monan_BaseAdapter("Milk"," 6.5km","Đối tác Loship","Freeship","60%",R.drawable.quan_moi1));
        arrayList.add(new List_monan_BaseAdapter("Milk"," 6.5km","Đối tác Loship","Freeship","60%",R.drawable.quan_moi1));
        arrayList.add(new List_monan_BaseAdapter("Milk"," 6.5km","Đối tác Loship","Freeship","60%",R.drawable.quan_moi1));
        arrayList.add(new List_monan_BaseAdapter("Milk"," 6.5km","Đối tác Loship","Freeship","60%",R.drawable.quan_moi1));
        arrayList.add(new List_monan_BaseAdapter("Milk"," 6.5km","Đối tác Loship","Freeship","60%",R.drawable.quan_moi1));
        arrayList.add(new List_monan_BaseAdapter("Milk"," 6.5km","Đối tác Loship","Freeship","60%",R.drawable.quan_moi1));
        arrayList.add(new List_monan_BaseAdapter("Milk"," 6.5km","Đối tác Loship","Freeship","60%",R.drawable.quan_moi1));
        arrayList.add(new List_monan_BaseAdapter("Milk"," 6.5km","Đối tác Loship","Freeship","60%",R.drawable.quan_moi1));


        adapter =new List_monan_Adapter(this,R.layout.activity_sup_giam_gia_4,arrayList);
        gridView.setAdapter(adapter);
    }
}

