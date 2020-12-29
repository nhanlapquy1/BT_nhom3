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

public class MonAn_Adapter extends RecyclerView.Adapter<MonAn_Adapter.MonAnViewHoder>{
       private List<MonAn_sup> listMonan;

        public MonAn_Adapter() {
        }

        public void  setData(List<MonAn_sup>list){
           this.listMonan=list;
           notifyDataSetChanged();
       }

       private OnItemClickListener mListMonAn;
       public interface OnItemClickListener{
            void onItemClick(int position);
       }
       public void setOnItemClickListener(OnItemClickListener listener ){
           mListMonAn=listener;
       }

        @NonNull
        @Override
        public MonAnViewHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_sup_giaodoan, parent,false);
            return  new MonAnViewHoder(view,mListMonAn);
        }

        @Override
        public void onBindViewHolder(@NonNull MonAnViewHoder holder, int position) {
            MonAn_sup user=listMonan.get(position);
            if (user==null){
                return;
            }
            holder.tvname_MA.setText(user.getName());
            holder.img_MA.setImageResource(user.getImg());

        }

        @Override
        public int getItemCount() {

            if ( listMonan !=null){
                return listMonan.size();
            }
            return 0;
        }

        public class MonAnViewHoder extends RecyclerView.ViewHolder{

            private TextView tvname_MA;
            private ImageView img_MA;

            public MonAnViewHoder(@NonNull View itemView, final OnItemClickListener listener  ) {
                super(itemView);
                tvname_MA=itemView.findViewById(R.id.text_MonAn);
                img_MA=itemView.findViewById(R.id.img_MonAn);

                itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (listener !=null){
                            int position =getAdapterPosition();
                            if (position!=RecyclerView.NO_POSITION){
                                listener.onItemClick(position);
                            }
                        }
                    }
                });
            }
        }
}
