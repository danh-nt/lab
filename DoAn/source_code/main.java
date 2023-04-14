package quanlisgk;
import quanlisgk.ListBaiTap;
import quanlisgk.ListLyThuyet;
import quanlisgk.LyThuyet;
import quanlisgk.BaiTap;
import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int day, month, year;
        Scanner input = new Scanner(System.in);
        ListBaiTap LBT = new ListBaiTap();
        ListLyThuyet LLT = new ListLyThuyet();
        LyThuyet LT = new LyThuyet();
        BaiTap BT = new BaiTap();
        int chon = 0;
        int chon2 = 0;
        int chon3 = 0;
        do{
            System.out.println("-------------------------QUAN LY KHO SACH GIAO KHOA-------------------------");
            System.out.println("SACH GIAO KHOA BAO GOM : SACH GIAO KHOA -LY THUYET- VA SACH GIAO KHOA -BAI TAP-");
            System.out.println("BAN CHON:");
            System.out.println("1. QUAN LY SACH GIAO KHOA LY THUYET");
            System.out.println("2. QUAN LY SACH GIAO KHOA BAI TAP");
            System.out.println("0. THOAT KHOI CHUONG TRINH");
            
            chon = input.nextInt();
            input.nextLine();
            switch(chon){
                case 1:{
        do{
            System.out.println("\n-------------------------QUAN LY SACH GIAO KHOA |LY THUYET|-------------------------");
            System.out.println("CHON : ");
            System.out.println("1. Them SGK ly thuyet");
            System.out.println("2. In danh sach");
            System.out.println("3. Dem so luong SGK ly thuyet");
            System.out.println("4. Tim ten SGK ly thuyet");
            System.out.println("5. Sap xep SGK ly thuyet theo ten giam dan");
            System.out.println("6. Sua doi thong tin SGK ly thuyet");
            System.out.println("7. Xoa SGK");
            System.out.println("8. Luu file");
            System.out.println("9. Tao ra phieu xuat");
            System.out.println("0. Thoat ra khoi chuong trinh \n");
            
            chon2 = input.nextInt();
            input.nextLine();
            switch(chon2){
            case 1:
            { 
                java.util.Date date = new java.util.Date();
                Calendar cl = Calendar.getInstance();
                date = cl.getTime();
                Date ngayNhap = cl.getTime();
                System.out.print("Nhap ma SGK Ly thuyet: "); String ma = input.next();
                System.out.print("Nhap ten SGK Ly thuyet: "); String ten = input.next();
                System.out.print("Nhap lop: "); int lop = input.nextInt();
                    while (lop <= 0 || lop > 12) {
                            System.out.print("Hay nhap lai lop: ");
                            lop = input.nextInt();    
                        }
                System.out.print("Nha xuat ban: "); String NXB = input.next();
                System.out.print("Nhap nam xuat ban: "); int namXB = input.nextInt();
                    while (namXB <= 0 || namXB > 2023) {
                        System.out.print("Nhap nam xuat ban: ");
                        namXB = input.nextInt();
                    };
                do{
                    do{
                        System.out.print("Nhap ngay nhap: "); day = input.nextInt();
                        System.out.print("Nhap thang nhap: "); month = input.nextInt();
                        System.out.print("Nhap nam nhap: "); year = input.nextInt();
                        if(day<=0 || day>31 || month<=0 || month>12 || year<=0)
                            System.out.println("Vui long nhap lai: ");
                    } while(day<=0 || day>31 || month>12 || month<=0 || year<=0);
                } while(ngayNhap.compareTo(date)>0);
                LT.hien(day, month, year);
                System.out.print("Nhap so luong: "); int SL = input.nextInt();
                    while (SL <= 0) {
                        System.out.print("Hay nhap lai so luong: ");
                        SL = input.nextInt();    
                    }
                System.out.print("Nhap don gia sach: "); double gia = input.nextDouble();
                    while (gia <= 0) {
                        System.out.print("Hay nhap lai don gia sach: ");
                        gia = input.nextDouble();    
                    }
                LyThuyet SLT1 = new LyThuyet(ma,ten,NXB,lop,namXB,SL,gia,LT.getNgayNhap());
                LLT.themSLT(SLT1);
                break;
            }
                case 2:{
                    LLT.inSLT();
                    break; 
            }
                case 3:{
                    System.out.println("So luong: " + LLT.demSLT());
                    break;
            }
                case 4:{
                System.out.println("Ten SGK Ly Thuyet: "); String ten = input.nextLine();
                System.out.println("Ket qua: ");
                LLT.timSLT(ten);
                break;
            }
                case 5:{
                LLT.SXSLT();
                LLT.inSLT();
                break;
            }
                case 6:{
                LLT.suaSLT();
                break;
            }
             case 7:{
                LLT.xoaSLT();
                break;
            }
            case 8:{
                System.out.print("Nhap ten can luu: ");
                String tenfilel = input.nextLine();
                File fl = new File(tenfilel);
                LBT.luuSBT(fl);
                break;
            }
            case 9:{
                 LLT.xuatSLT();
                 break;
            }      
        }   
        }while(chon2!=0);
        break;
                }
                case 2:{
        do{
            System.out.println("\n-------------------------QUAN LY SACH GIAO KHOA |BAI TAP|-------------------------");
            System.out.println("CHON : ");
            System.out.println("1. Them SGK Bai Tap");
            System.out.println("2. In danh sach");
            System.out.println("3. Dem so luong SGK Bai Tap");
            System.out.println("4. Tim ten SGK Bai Tap1");
            System.out.println("5. Sap xep SGK Bai Tap theo ten giam dan");
            System.out.println("6. Sua doi thong tin SGK Bai Tap");
            System.out.println("7. Xoa SGK ");
            System.out.println("8. Luu file");
            System.out.println("9. Tao ra phieu xuat");
            System.out.println("0. Thoat ra khoi chuong trinh");
            
            chon3 = input.nextInt();
            input.nextLine();
            switch(chon3){
                case 1:{
                    java.util.Date date = new java.util.Date();
                    Calendar cl = Calendar.getInstance();
                    date = cl.getTime();
                    Date ngayNhap = cl.getTime();
                    System.out.print("Nhap ma SGK Bai tap: "); String ma = input.next();
                    System.out.print("Nhap ten SGK Bai tap: "); String ten = input.next();
                    System.out.print("Nhap lop: "); int lop = input.nextInt();
                        while (lop <= 0 || lop > 12) {
                                System.out.print("Hay nhap lai lop: ");
                                lop = input.nextInt();    
                            }
                    System.out.print("Nha xuat ban: "); String NXB = input.next();
                    System.out.print("Nhap nam xuat ban: "); int namXB = input.nextInt();
                        while (namXB <= 0 || namXB > 2023) {
                            System.out.print("Nhap nam xuat ban: ");
                            namXB = input.nextInt();
                        };
                    do{
                        do{
                            System.out.print("Nhap ngay nhap: "); day = input.nextInt();
                            System.out.print("Nhap thang nhap: "); month = input.nextInt();
                            System.out.print("Nhap nam nhap: "); year = input.nextInt();
                            if(day<=0 || day>31 || month<=0 || month>12 || year<=0)
                                System.out.println("Vui long nhap lai: ");
                        } while(day<=0 || day>31 || month>12 || month<=0 || year<=0);
                    } while(ngayNhap.compareTo(date)>0);
                    LT.hien(day, month, year);
                    System.out.print("Nhap so luong: "); int SL = input.nextInt();
                        while (SL <= 0) {
                            System.out.print("Hay nhap lai so luong: ");
                            SL = input.nextInt();    
                        }
                    System.out.print("Nhap don gia sach: "); double gia = input.nextDouble();
                        while (gia <= 0) {
                            System.out.print("Hay nhap lai don gia sach: ");
                            gia = input.nextDouble();    
                        }
                    BaiTap BT1 = new BaiTap(ma,ten,NXB,lop,namXB,SL,gia,BT.getNgayNhap());
                    LBT.themSBT(BT1);
                    break;
                }

                case 2:{
                    LBT.inSBT();
                    break;
                }
                case 3:{
                    System.out.println("So luong : " + LBT.demSBT());
                    break;
                }
                case 4:{
                    System.out.println("Ten SGK Bai Tap: "); String ten = input.nextLine();
                    System.out.println("Ket qua: ");
                    LBT.timSBT(ten);
                    break;
                }
                case 5:{
                    LBT.SXSBT();
                    LBT.inSBT();
                    break;
                }
                case 6:{
                    LBT.suaSBT();
                    break;
                }
                case 7:{
                    LBT.xoaSBT();
                    break;
                }
                case 8:{
                    System.out.print("Nhap ten can luu: ");
                    String tenfilel = input.nextLine();
                    File fl = new File(tenfilel);
                    LBT.luuSBT(fl);
                    break;
                }
                case 9:{
                    LBT.xuatSBT();
                }    
            }
            } while(chon3!=0);
                break;
                }
                }
            }while(chon!=0);

        }
}
    
