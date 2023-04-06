
package lab5;

public class ChuyenXe {
    String Hotentaixe;
    Double Masochuyen;
    Double Soxe;
    Double Doanhthu;
    public ChuyenXe(){
        
    }
    public ChuyenXe(String Hotentaixe, Double Masochuyen, Double Soxe){
        this.Hotentaixe=Hotentaixe;
        this.Masochuyen=Masochuyen;
        this.Soxe=Soxe;
    }

    public String getHotentaixe() {
        return Hotentaixe;
    }

    public Double getMasochuyen() {
        return Masochuyen;
    }

    public void setHotentaixe(String Hotentaixe) {
        this.Hotentaixe = Hotentaixe;
    }

    public void setMasochuyen(Double Masochuyen) {
        this.Masochuyen = Masochuyen;
    }

    public Double getSoxe() {
        return Soxe;
    }

    public void setSoxe(Double Soxe) {
        this.Soxe = Soxe;
    }

    public Double getDoanhthu() {
        return Doanhthu;
    }

    public void setDoanhthu(Double Doanhthu) {
        this.Doanhthu = Doanhthu;
    }
    
}
