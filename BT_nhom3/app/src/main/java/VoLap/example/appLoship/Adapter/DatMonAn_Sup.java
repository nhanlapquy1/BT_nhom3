package VoLap.example.appLoship.Adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class DatMonAn_Sup  {
      public String name_dma;
      public String Money_dma;
      public int img_dma;

    public DatMonAn_Sup(String name_dma, String money_dma, int img_dma) {
        this.name_dma = name_dma;
        this.Money_dma = money_dma;
        this.img_dma = img_dma;
    }

    public String getName_dma() {
        return name_dma;
    }

    public void setName_dma(String name_dma) {
        this.name_dma = name_dma;
    }

    public String getMoney_dma() {
        return Money_dma;
    }

    public void setMoney_dma(String money_dma) {
        Money_dma = money_dma;
    }

    public int getImg_dma() {
        return img_dma;
    }

    public void setImg_dma(int img_dma) {
        this.img_dma = img_dma;
    }
}
