package VoLap.example.appLoship;

public class GridViewBean_a {
    private  int hinhanh;
    private String ten;

    public GridViewBean_a(String ten, int hinhanh){
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
