package quanlisgk;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import java.util.Scanner;

public class ListBaiTap {
    public ArrayList<BaiTap> list2;
    BaiTap BT = new BaiTap();

    public ListBaiTap() {
        this.list2 = new ArrayList<BaiTap>();
    }

    public ListBaiTap(ArrayList<BaiTap> list2) {
        this.list2 = list2;

    }

    // 1.Thêm sách vào kho sách Bài Tập
    public void themSBT(BaiTap tvst){
        this.list2.add(tvst);
    }

    //2.  In ra số lượng sách bài tập
    public void inSBT(){
        if(list2.isEmpty()){
            System.out.println("Kho trong");
        }
        for(BaiTap SachBT : list2){
            System.out.println(SachBT+"\n");   
        }
    }
    

    //3.Đếm số lượng sách bài tập 
    public int demSBT() {
        return this.list2.size();
    }

    //4.Tìm kiếm sách bài tập
    public void timSBT(String maSach){
        if(list2.isEmpty())
            System.out.println("Khong co sach nao trong kho!");
        else
        for(BaiTap SachBT : list2){
            if(SachBT.getMaSach().contains(maSach)){
               System.out.println(SachBT);
            }
            else
                System.out.println("Khong tim thay!");
        } 
    }
    
    //5.Sắp xếp lại sách lý thuyết
    public void SXSBT(){
        Collections.sort(this.list2, new Comparator<BaiTap>(){
            @Override
            public int compare(BaiTap ten1, BaiTap ten2) {
                String ten1name = ten1.getTenSach().toUpperCase();
                String ten2name = ten2.getTenSach().toUpperCase();
                return ten2name.compareTo(ten1name);
            }   
    });
    }

    //6.Sửa thông tin sách Bài tập
    public void suaSBT() {
        Scanner input = new Scanner(System.in);
        System.out.println("-------------- SUA THONG TIN SACH  BAI TAP --------------");
        System.out.println("Ma Sach : ");
        String id = input.nextLine();

        for (int i = 0; i < list2.size(); i++) {
            if (id.equals(list2.get(i).getMaSach())) {
                System.out.println("-------------- NHAP DU LIEU MOI --------------");
                System.out.print("Nhap ma sach : "); String ma = input.nextLine();
                System.out.print("Nhap ten sach : "); String ten = input.nextLine();
                int lop;
                    do {
                        System.out.print("Nhap lop: ");
                        lop = input.nextInt();    
                    } while (lop <= 0 || lop > 12);
                System.out.print("Nhap nha xuat ban sach : "); String nhaXB = input.next();
                int namXB;
                    do {
                        System.out.print("Nhap nam xuat ban: ");
                        namXB = input.nextInt();
                    } while (namXB <= 0);
                System.out.print("Nhap ngay nhap: "); int day = input.nextInt();
                System.out.print("Nhap thang nhap: "); int month = input.nextInt();
                System.out.print("Nhap nam nhap: "); int year = input.nextInt();
                BT.hien(day, month, year);
                int soLuong;
                do {
                    System.out.print("Nhap so luong: ");
                    soLuong = input.nextInt();    
                } while (soLuong<0);
                double gia;
                do {
                    System.out.print("Nhap gia tien:  ");
                    gia = input.nextDouble();    
                } while (gia<0);
                list2.get(i).setMaSach(ma);
                list2.get(i).setTenSach(ten);
                list2.get(i).setLop(lop);
                list2.get(i).setNamXuatBan(namXB);
                list2.get(i).setNhaXuatBan(nhaXB);
                list2.get(i).setSoLuong(soLuong);
                list2.get(i).setGiaSach(gia);
                list2.get(i).setNgayNhap(BT.getNgayNhap());
            }
        }
    }

    //7. Xóa sách Bài tập
    public void xoaSBT() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ma sach can xoa : ");
        String id = input.nextLine();

        int d = -1;
        boolean position = false;
        for (int i = 0; i < list2.size(); i++) {
            if (id.equals(list2.get(i).getMaSach())) {
                position = true;
                d = i;
                break;
            }
        }
        
        if (position == false) {
            System.out.println("Khong tim thay ma sach!");
        } else {
            list2.remove(d);
            System.out.println("Xoa thanh cong!");
        }
    }

    //8.Lưu file
    public void luuSBT(File file) {
        try {
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            for (BaiTap SachBT : list2) {
                bw.newLine();
                bw.write(SachBT.toString());
                bw.newLine();
            }
            bw.close();
            System.out.println("Luu thanh cong!");
        } catch (Exception e) {
        }
    }

    //9."-------------- Xuất kho --------------"
    public void xuatSBT(){
    Scanner input = new Scanner(System.in);
    System.out.println("-------------- XUAT KHO --------------");
    System.out.println("Ma sach can xuat kho: ");
    String id =  input.nextLine();
    boolean position = false;
    int d=-1;
    for(int i = 0; i < list2.size(); i++){
        if(id.equals(list2.get(i).getMaSach())){
        position = true;
        d=i;
        do{
            System.out.print("Nhap ngay xuat: ");  int day = input.nextInt();
            System.out.print("Nhap thang xuat: ");  int month = input.nextInt();
            System.out.print("Nhap nam xuat: ");  int year = input.nextInt();
            BT.xuat(day, month, year);
            if(list2.get(i).getNgayNhap().compareTo(BT.ngayXuat)>0){
                System.out.println("Nhap lai: ");
            }
        }while(list2.get(i).getNgayNhap().compareTo(BT.ngayXuat)>0);
            System.out.println("Nhap so sach bai tap can xuat kho: ");
            int xKho = input.nextInt();
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            String nXuat = sdf.format(BT.ngayXuat);
            String ngayNhapBT = sdf.format(list2.get(i).getNgayNhap());
            System.out.println("Ma sach : "+ id +", Nhap ngay : "+ngayNhapBT+", Xuat ngay :"+nXuat+", So luong xuat kho : "+xKho+", Sach bai tap con lai :"+(list2.get(i).getSoLuong()-xKho)+", So tien sach : "+xKho*1*list2.get(i).getGiaSach());
            list2.get(i).setSoLuong(list2.get(i).getSoLuong()-xKho);
        try {
            FileWriter fw = new FileWriter("PhieuxuatkhoBT.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Ma sach : "+ id +", Ngay nhap: "+ngayNhapBT+", Ngay xuat : "+nXuat+", So luong xuat : "+xKho+", Con lai : "+list2.get(i).getSoLuong()+", so tien hang: "+xKho*1*list2.get(i).getGiaSach());
            bw.newLine();
            bw.close();
            } catch (Exception e) {
            }
            }    
        }if(position==false){
            System.out.println("Khong tim thay sach!");}
            else if(list2.get(d).getSoLuong()==0){
                list2.remove(d);
       }
    }
}
