
package Bai2;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class SanPham {
    String tenSp;
    Double donGia;
    Double giamGia;
    void SanPham(String tenSp, Double donGia, Double giamGia){
        this.donGia=donGia;
        this.giamGia=giamGia;
        this.tenSp=tenSp;
    }
    Double getThueNhapKhau(){
        return 0.1*donGia;
    }

    void nhap(){
        Scanner in = new Scanner(System.in);
        System.out.println("ten sp: ");
        tenSp = in.nextLine();
        System.out.println("giam gia: ");
        giamGia = in.nextDouble();
        System.out.println("don gia: ");
        donGia = in.nextDouble();
    }
    
    public String toString(){
        return "SanPham: " + tenSp + ", don gia: " + donGia +  ", giam gia" + giamGia + ", thue " + getThueNhapKhau();
    }
    
}
