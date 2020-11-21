package VoLap.example.appLoship.Adapter;

public class CHGB_sup {
    private  int img;
    private String CH_name,CH_KC, CH_FS;

    public CHGB_sup( String CH_name, String CH_KC, String CH_FS,int img) {
        this.CH_name = CH_name;
        this.CH_KC = CH_KC;
        this.CH_FS = CH_FS;
        this.img = img;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getCH_name() {
        return CH_name;
    }

    public void setCH_name(String CH_name) {
        this.CH_name = CH_name;
    }

    public String getCH_KC() {
        return CH_KC;
    }

    public void setCH_KC(String CH_KC) {
        this.CH_KC = CH_KC;
    }

    public String getCH_FS() {
        return CH_FS;
    }

    public void setCH_FS(String CH_FS) {
        this.CH_FS = CH_FS;
    }

}
