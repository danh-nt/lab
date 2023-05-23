
package bai1;
import java.util.Scanner;
import java.util.ArrayList;
public class main {
    public static void main(String[] args) {
        ArrayList<Gddat> Adat = new ArrayList<>();
        ArrayList<Gdnha> Anha = new ArrayList<>();
        int sldat=0;
        int slnha=0;
        Double tongtien = 0.0;
        Double tbtiendat=0.0;
        Scanner in =new Scanner(System.in);
        
        System.out.println("Nhap so luong giao dich dat:");
        sldat = in.nextInt();
        System.out.println("Nhap so luong giao dich nha");
        slnha = in.nextInt();
        
        System.out.println("Nhap thong tin giao dich dat:");
        for(int i = 1; i <= sldat; i++){
            System.out.println("Giao dich dat thu " + i);
            Gddat datt = new Gddat();
            datt.loaidat();
            Adat.add(datt);
        }
        
        System.out.println("Nhap thong tin giao dich nha:");
        for(int i = 1; i <= slnha; i++){
            System.out.println("Giao dich nha thu "+i);
            Gdnha nhaa = new Gdnha();
            nhaa.loainha();
            Anha.add(nhaa);
        }
        for(int i = 0; i < Adat.size(); i++){
            if(Adat.get(i).getLoaidat().equalsIgnoreCase("A")){
                tongtien += Adat.get(i).getDientich() * Adat.get(i).getDongia() * 1.5;
            }else{
                if(Adat.get(i).getLoaidat().equalsIgnoreCase("B") || Adat.get(i).getLoaidat().equalsIgnoreCase("C"))
                    tongtien += Adat.get(i).getDientich() * Adat.get(i).getDongia();
            }
                
        }
        tbtiendat = tongtien/Adat.size();
        
        System.out.println("thong tin giao dich dat:");
        for(int i = 0; i < Adat.size(); i++){
            System.out.println(Adat.get(i).toString());
        }
        System.out.println("Trung binh thanh tien giao dich dat:" + tbtiendat);
        System.out.println("thong tin giao dich nha:");
        for(int i = 0; i < Anha.size(); i++){
            System.out.println(Anha.get(i).toString());
        }
        
    }
}
