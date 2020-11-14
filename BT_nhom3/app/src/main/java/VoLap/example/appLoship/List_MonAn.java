package VoLap.example.appLoship;

import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.circleview.R;

import java.util.ArrayList;

public class List_MonAn extends AppCompatActivity {

    GridView gridView;
    ArrayList<List_monan_BaseAdapter> arrayList;
    List_monan_Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_mon_an_4);
        overridePendingTransition(R.anim.trai_sang_phai,R.anim.phai_sang_trai);


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

