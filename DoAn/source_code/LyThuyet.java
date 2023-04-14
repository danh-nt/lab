package quanlisgk;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class LyThuyet extends SGK{

    public LyThuyet() {
    }

    public LyThuyet(String maSach, String tenSach,  String nhaXuatBan, int lop, int namXuatBan, int soLuong, double giaSach, Date ngayNhap) {
        super(maSach, tenSach, lop, namXuatBan, nhaXuatBan, soLuong, giaSach, ngayNhap);
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String ngayNhapLT = sdf.format(ngayNhap);
        return "Sach Ly thuyet [" + "Ma sach: " + maSach + ", ten sach: " + tenSach + ", lop: " + lop + ", nam xuat ban: " + namXuatBan + ", nha xuat ban: " + nhaXuatBan + ", so luong: " + soLuong + ", gia sach: " + giaSach + ", ngay nhap: " + ngayNhapLT + "]";
    }
    @Override
    public Date hien(int day,int month,int year){
        Calendar cl = Calendar.getInstance();
        cl.set(year, month-1, day);
        return this.ngayNhap = cl.getTime();
    }
    @Override
    public Date xuat(int day,int month,int year){
        Calendar cl = Calendar.getInstance();
        cl.set(year, month-1, day);
        return this.ngayXuat=cl.getTime();
    }
    
}
