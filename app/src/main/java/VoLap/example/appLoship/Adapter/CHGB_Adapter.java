package VoLap.example.appLoship.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import VoLap.example.appLoship.R;

import java.util.List;

public class CHGB_Adapter extends  RecyclerView.Adapter<CHGB_Adapter.List_CHGB_ViewHolder>{
    private List<CHGB_sup>mList_CHGB;
    public  void  setData(List<CHGB_sup>list){
        this.mList_CHGB=list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public List_CHGB_ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_sup_giaodoan2,parent,false);
        return new List_CHGB_ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull List_CHGB_ViewHolder holder, int position) {
        CHGB_sup chgb= mList_CHGB.get(position);
        if (chgb == null){
            return;
        }

        holder.CHGB_name.setText(chgb.getCH_name());
        holder.CHGB_kc.setText(chgb.getCH_KC());
        holder.CHGB_freeship.setText(chgb.getCH_FS());
        holder.imgCHGB.setImageResource(chgb.getImg());
    }

    @Override
    public int getItemCount() {
        if (mList_CHGB!=null){
            return mList_CHGB.size();
        }
        return 0;
    }

    public class  List_CHGB_ViewHolder extends RecyclerView.ViewHolder{
        private ImageView imgCHGB;
        private TextView CHGB_name,CHGB_kc,CHGB_freeship;

        public List_CHGB_ViewHolder(@NonNull View itemView) {
            super(itemView);

            CHGB_name=itemView.findViewById(R.id.text_CH_name);
            CHGB_kc=itemView.findViewById(R.id.text_CH_khoangCach);
            CHGB_freeship=itemView.findViewById(R.id.text_CH_Freeship);
            imgCHGB=itemView.findViewById(R.id.img_CHGB1);
        }
    }
}
