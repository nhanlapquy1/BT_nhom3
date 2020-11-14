package VoLap.example.appLoship.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import com.example.circleview.R;

public class List_monan_Adapter extends BaseAdapter {

    Context context;
    int Layout;
    List<List_monan_BaseAdapter> arrayList;

    public List_monan_Adapter(Context context, int layout, List<List_monan_BaseAdapter> arrayList) {
        this.context = context;
        Layout = layout;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


    class ViewHolder{
        TextView tvName;
        TextView tvAdd;
        TextView tvTitle;
        TextView tvKM;
        TextView tvlike;
        ImageView img;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder;

        if (convertView == null){

            LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(Layout,null);
            viewHolder=new ViewHolder();

            //
            viewHolder.tvName=(TextView) convertView.findViewById(R.id.name_monan);
            viewHolder.tvAdd=(TextView) convertView.findViewById(R.id.tv_khoangcach);
            viewHolder.tvTitle=(TextView) convertView.findViewById(R.id.tv_doitac);
            viewHolder.tvKM=(TextView) convertView.findViewById(R.id.tv_freeship);
            viewHolder.tvlike=(TextView) convertView.findViewById(R.id.tv_like);
            viewHolder.img=(ImageView) convertView.findViewById(R.id.img2);

            convertView.setTag(viewHolder);


        }else {
            viewHolder= (ViewHolder) convertView.getTag();
        }
        //
        viewHolder.tvName.setText(arrayList.get(position).name);
        viewHolder.tvAdd.setText(arrayList.get(position).add);
        viewHolder.tvTitle.setText(arrayList.get(position).title);
        viewHolder.tvKM.setText(arrayList.get(position).KM);
        viewHolder.tvlike.setText(arrayList.get(position).like);
        viewHolder.img.setImageResource(arrayList.get(position).img);
        return convertView;
    }
}
