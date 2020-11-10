package VoLap.example.appLoship;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.circleview.R;

import java.util.List;

public class GridViewBaseAdapter_a extends BaseAdapter {

    private Context context;
    private int layout;
    private List<GridViewBean_a> hinhanhList;

    public GridViewBaseAdapter_a(Context context, int layout, List<GridViewBean_a> hinhanhList) {
        this.context = context;
        this.layout = layout;
        this.hinhanhList = hinhanhList;
    }

    @Override
    public int getCount() {
        return hinhanhList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    private class ViewHolder{
        ImageView imgView;
        TextView tenView;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView == null){
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(layout,null);
            holder.imgView = (ImageView)convertView.findViewById(R.id.imghinhanh);
            holder.tenView = (TextView)convertView.findViewById(R.id.tenServices);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder)convertView.getTag();
        }
        GridViewBean_a hinhanh = hinhanhList.get(position);
        holder.imgView.setImageResource(hinhanh.getHinhanh());
        holder.tenView.setText(hinhanhList.get(position).getTen());
        return convertView;
    }
}
