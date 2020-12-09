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

public class HinhAnhHomeAdapter extends BaseAdapter {
    private List<HinhAnhHome> listData;
    private LayoutInflater layoutInflater;
    private Context context;

    public HinhAnhHomeAdapter(Context aContext,  List<HinhAnhHome> listData) {
        this.context = aContext;
        this.listData = listData;
        layoutInflater = LayoutInflater.from(aContext);
    }
    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public Object getItem(int position) {
        return listData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.activity_sup_home, null);
            holder = new ViewHolder();
            holder.image = (ImageView) convertView.findViewById(R.id.imageviewHinhAnh);
            holder.text = (TextView) convertView.findViewById(R.id.textViewHinhAnh);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        HinhAnhHome photo = this.listData.get(position);
        holder.image.setImageResource(photo.getHinh());
        holder.text.setText(photo.getTen());
        return convertView;
    }
    static class ViewHolder {
        ImageView image;
        TextView text;
    }
}
