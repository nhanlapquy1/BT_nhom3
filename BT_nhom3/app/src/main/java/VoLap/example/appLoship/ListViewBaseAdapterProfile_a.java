package VoLap.example.appLoship;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.circleview.R;

import java.util.ArrayList;
import java.util.List;

public  class ListViewBaseAdapterProfile_a extends BaseAdapter {
    public ArrayList<ListViewBeanProfile_a> arraylistListener;
    private List<ListViewBeanProfile_a> mListenerList;
    Context mContext;

    public ListViewBaseAdapterProfile_a(List<ListViewBeanProfile_a> mListenerList, Context context){
        mContext = context;
        this.mListenerList = mListenerList;
        this.arraylistListener = new ArrayList<ListViewBeanProfile_a>();
        this.arraylistListener.addAll(mListenerList);
    }
    public class  ViewHolder{
        ImageView mItemPic;
        TextView mLangName;
    }
    @Override
    public int getCount(){
        return mListenerList.size();
    }
    @Override
    public Object getItem(int position){
        return mListenerList.size();
    }
    @Override
    public long getItemId(int position){
        return position;
    }
    @Override
    public View getView(final int position, View view, ViewGroup parent) {
        final ViewHolder holder;
        if (view == null) {
            view = LayoutInflater.from(mContext).inflate(R.layout.list_myprofile_a, null);
            holder = new ViewHolder();
            holder.mItemPic = (ImageView) view.findViewById(R.id.hinhanh);
            holder.mLangName=(TextView)view.findViewById(R.id.tieude);


            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();

        }
        try {
            int image = mListenerList.get(position).getImage();
            holder.mItemPic.setImageResource(image);
            holder.mLangName.setText(mListenerList.get(position).getFriend());
        }catch (Exception ex){
        }
        return view;
    }
}
