package VoLap.example.appLoship.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.circleview.R;

import java.util.List;


public class DatMonAn_Adapter  extends BaseAdapter{
    Context context;
    int Layout;
    List<DatMonAn_Sup> arrayList;

    public DatMonAn_Adapter(Context context, int layout, List<DatMonAn_Sup> arrayList) {
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
        TextView tvMoney;
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
            viewHolder.tvName=(TextView) convertView.findViewById(R.id.tv_dma_name);
            viewHolder.tvMoney=(TextView) convertView.findViewById(R.id.tv_dma_gia);
            viewHolder.img=(ImageView) convertView.findViewById(R.id.imag_dma);

            convertView.setTag(viewHolder);


        }else {
            viewHolder= (ViewHolder) convertView.getTag();
        }
        //
        viewHolder.tvName.setText(arrayList.get(position).name_dma);
        viewHolder.tvMoney.setText(arrayList.get(position).Money_dma);
        viewHolder.img.setImageResource(arrayList.get(position).img_dma);
        return convertView;
    }
}

