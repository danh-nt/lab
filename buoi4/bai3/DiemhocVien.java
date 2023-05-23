
package bai3;
import java.util.Scanner;
public class DiemhocVien {
    String hoten;
    String namsinh;
    Float toan,ly,hoa,tienganh,nguvan;
    Scanner in = new Scanner(System.in);
    public DiemhocVien(){
        
    }
    public DiemhocVien(String hoten, String namsinh,Float toan, Float ly, Float hoa, Float tienganh, Float nguvan){
        this.hoa=hoa;
        this.hoten=hoten;
        this.ly=ly;
        this.namsinh=namsinh;
        this.nguvan=nguvan;
        this.tienganh=tienganh;
        this.toan=toan;
    }
    public void nhaptt(){
        System.out.println("Nhap ho va ten: ");
        hoten = in.nextLine();
        System.out.println("Nhap nam sinh: ");
        namsinh = in.nextLine();
        System.out.println("Nhap diem toan: ");
        toan = in.nextFloat();
        System.out.println("nhap diem toan:");
        ly = in.nextFloat();
        System.out.println("nhap diem hoa:");
        hoa = in.nextFloat();
        System.out.println("nhap diem ngu van: ");
        nguvan = in.nextFloat();
        System.out.println("Nhap diem tieng anh: ");
        tienganh = in.nextFloat();
    }
    
    
}
