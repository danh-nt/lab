
package bai1;

public class Gddat extends gdich {
    private String loaidat;
    public Gddat(){
       
    }
    public Gddat(String loaidat,String magd, String ngaygd, Double dongia, Double dientich){
        this.loaidat=loaidat;
        super.dientich = dientich;
        super.dongia=dongia;
        super.magd=magd;
        super.ngaygd=ngaygd;
    }

    public String getLoaidat() {
        return loaidat;
    }

    public void setLoaidat(String loaidat) {
        this.loaidat = loaidat;
    }
    public void loaidat(){
        
        System.out.println("nhap Loai dat: ");
        loaidat = in.nextLine();
        super.thongtin();
    }
    @Override
    public String toString(){
        return super.toString() + "Loai dat: " + loaidat;
    }
}
