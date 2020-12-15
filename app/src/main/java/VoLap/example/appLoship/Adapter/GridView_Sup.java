package VoLap.example.appLoship.Adapter;

public class GridView_Sup {
    private  int hinhanh;
    private String ten;

    public GridView_Sup(String ten, int hinhanh){
        this.hinhanh = hinhanh;
        this.ten = ten;
    }
    public int getHinhanh(){
        return hinhanh;
    }
    public String getTen(){
        return ten;
    }
    public void setHinhanh(int hinhanh){
        this.hinhanh = hinhanh;
    }
    public void setTen(String ten){
        this.ten = ten;
    }
}
