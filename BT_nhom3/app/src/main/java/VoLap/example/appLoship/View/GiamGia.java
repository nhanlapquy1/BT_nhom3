package VoLap.example.appLoship.View;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;

import androidx.appcompat.app.AppCompatActivity;

import com.example.circleview.R;

import java.util.ArrayList;

import VoLap.example.appLoship.Adapter.List_monan_Adapter;
import VoLap.example.appLoship.Adapter.List_monan_BaseAdapter;

public class  GiamGia extends AppCompatActivity {

    ImageView img_back_giaodoan;


    GridView gridView;
    ArrayList<List_monan_BaseAdapter> arrayList;
    List_monan_Adapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giam_gia_4);

        overridePendingTransition(R.anim.trai_sang_phai,R.anim.phai_sang_trai);
        img_back_giaodoan= (ImageView)findViewById(R.id.btn_giao_do_an);
        img_back_giaodoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GiamGia.this, GiaoDoAn_activity.class);
                startActivity(intent);
            }
        });

        gridView =(GridView) findViewById(R.id.gv3);
        arrayList=new ArrayList<>();

        arrayList.add(new List_monan_BaseAdapter("Milk"," 6.5km","Đối tác Loship","Freeship","60%",R.drawable.mk_15));
        arrayList.add(new List_monan_BaseAdapter("Milk"," 6.5km","Đối tác Loship","Freeship","60%",R.drawable.mk_15));
        arrayList.add(new List_monan_BaseAdapter("Milk"," 6.5km","Đối tác Loship","Freeship","60%",R.drawable.mk_15));
        arrayList.add(new List_monan_BaseAdapter("Milk"," 6.5km","Đối tác Loship","Freeship","60%",R.drawable.mk_15));
        arrayList.add(new List_monan_BaseAdapter("Milk"," 6.5km","Đối tác Loship","Freeship","60%",R.drawable.mk_15));
        arrayList.add(new List_monan_BaseAdapter("Milk"," 6.5km","Đối tác Loship","Freeship","60%",R.drawable.mk_15));
        arrayList.add(new List_monan_BaseAdapter("Milk"," 6.5km","Đối tác Loship","Freeship","60%",R.drawable.mk_15));
        arrayList.add(new List_monan_BaseAdapter("Milk"," 6.5km","Đối tác Loship","Freeship","60%",R.drawable.mk_15));
        arrayList.add(new List_monan_BaseAdapter("Milk"," 6.5km","Đối tác Loship","Freeship","60%",R.drawable.mk_15));
        arrayList.add(new List_monan_BaseAdapter("Milk"," 6.5km","Đối tác Loship","Freeship","60%",R.drawable.mk_15));


        adapter =new  List_monan_Adapter(this,R.layout.activity_sup_giam_gia_4,arrayList);
        gridView.setAdapter((ListAdapter) adapter);
    }
}