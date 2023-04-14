
package quanlisgk;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;


public class SGK implements Serializable {
    public String maSach;
    public String tenSach;
    public int lop;
    public int namXuatBan;
    public String nhaXuatBan;
    public int soLuong;
    public double giaSach;
    public Date ngayNhap, ngayXuat;
    
    public SGK(){
    }
    
    public SGK(String maSach, String tenSach, int lop, int namXuatBan, String nhaXuatBan, int soLuong, double giaSach, Date ngayNhap) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.lop = lop;
        this.namXuatBan = namXuatBan;
        this.nhaXuatBan = nhaXuatBan;
        this.soLuong = soLuong;
        this.giaSach = giaSach;
        this.ngayNhap = ngayNhap;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public int getLop() {
        return lop;
    }

    public void setLop(int lop) {
        this.lop = lop;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGiaSach() {
        return giaSach;
    }

    public void setGiaSach(double giaSach) {
        this.giaSach = giaSach;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String ngayNhapLT = sdf.format(ngayNhap);
        return "SGK{" + "maSach=" + maSach + ", tenSach=" + tenSach + ", lop=" + lop + ", namXuatBan=" + namXuatBan + ", nhaXuatBan=" + nhaXuatBan + ", soLuong=" + soLuong + ", giaSach=" + giaSach + ", ngayNhap=" + ngayNhapLT;
    }
    
    public Date hien(int day,int month,int year){
        return this.ngayNhap;
    }
    public Date xuat(int day,int month,int year){
        return this.ngayXuat;
    }
}
