package lap7;

public class Maybay extends Phuongtien {
    public String loaiNhienLieu;

    public Maybay() {
    }

    public Maybay(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }

    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public void catCanh() {
        System.out.println(" cat canh ");
    }

    public void haCanh() {
        System.out.println(" ha canh ");
    }

    @Override
    public double layVanToc() {
        return 0;
    }
}
