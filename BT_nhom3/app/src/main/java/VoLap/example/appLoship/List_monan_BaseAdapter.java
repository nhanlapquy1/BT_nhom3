package VoLap.example.appLoship;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class List_monan_BaseAdapter extends BaseAdapter {
    public String name;
    public String add;
    public  String title;
    public  String KM;
    public  String like;
    public int img;

    public List_monan_BaseAdapter(String name, String add, String title, String KM,String like, int img) {
        this.name = name;
        this.add = add;
        this.title = title;
        this.KM = KM;
        this.like = like;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getKM() {
        return KM;
    }

    public void setKM(String KM) {
        this.KM = KM;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
