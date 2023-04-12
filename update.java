    //2.  In ra số lượng sách lý thuyết
    public void inSLT(){
        if(list1.isEmpty()){
            System.out.println("kho trong");
        }
        for(LyThuyet SachLT : list1){
            System.out.println(SachLT+"\n");   
    }
        
    }
     //4.Tìm kiếm sách lý thuyết
    public void timSLT(String maSach){
        if(list1.isEmpty())
            System.out.println("khong co sach nao trong kho");
        else
        for(LyThuyet SachLT : list1){
            if(SachLT.getMaSach().contains(maSach)){
               System.out.println(SachLT);
            }
            else
                System.out.println("khong tim thay");
        }
        
    }
    
      //5.Sắp xếp lại sách lý thuyết
     public void SXSLT(){
        Collections.sort(this.list1, new Comparator<LyThuyet>(){
            @Override
            public int compare(LyThuyet sl1, LyThuyet sl2) {
                String sl1name = sl1.getTenSach().toUpperCase();
                String sl2name = sl2.getTenSach().toUpperCase();
                return sl2name.compareTo(sl1name);
            }   
    });
    }
//10."-------------- Xuất kho --------------"

       public void xuatSLT(){
        Scanner input = new Scanner(System.in);
        System.out.println("-------------- XUAT KHO --------------");
        System.out.println("Ma sach can xuat kho : ");
        String maSach =  input.nextLine();
        boolean position = false;
        int d=-1;
        for(int i = 0;i < list1.size();i++){
            if(maSach.equals(list1.get(i).getMaSach())){
            position = true;
            d=i;
            do{
               
                System.out.print("Nhap ngay xuat: ");  int day = input.nextInt();
                System.out.print("Nhap thang xuat: ");  int month = input.nextInt();
                System.out.print("Nhap nam xuat: ");  int year = input.nextInt();
                lt.xuat(day, month, year);
                if(list1.get(i).getNgayNhap().compareTo(lt.ngayXuat)>0)
                    System.out.println("Nhap lai: ");

                
                
                
            
             }while(list1.get(i).getNgayNhap().compareTo(lt.ngayXuat)>0);
                System.out.println("Nhap -so sach- can xuat kho");
                int xKho = input.nextInt();
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                String nXuat = sdf.format(lt.ngayXuat);
                String ngayNhapLT = sdf.format(list1.get(i).getNgayNhap());
                System.out.println("Ma sach ="+ maSach +", Ngay nhap="+ngayNhapLT+", Ngay xuat="+nXuat+", so luong xuat kho: "+xKho);
                list1.get(i).setSoLuong(list1.get(i).getSoLuong());
            try {
            FileWriter fw = new FileWriter("Xuat_Sach_Ly_Thuyet.txt",true);
                try (BufferedWriter bw = new BufferedWriter(fw)) {
                    bw.write("Ma sach ly thuyet = "+ maSach +", Ngay nhap="+ngayNhapLT+", Ngay xuat="+nXuat+", so luong xuat kho: "+xKho);
                    bw.newLine();
                }
           } catch (IOException e) {
           }
           }    
       }if(position==false){
                System.out.println("---------------Khong Tim Thay---------------");}
       else if(list1.get(d).getSoLuong()==0){
           list1.remove(d);
       }
    }
}  

// qua main sửa

package JavaApplication7;

import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;



public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day, month, year;
        ListBaiTap LBT = new ListBaiTap();
        ListLyThuyet LLT = new ListLyThuyet();
        LyThuyet LT = new LyThuyet();
        BaiTap BT = new BaiTap();
        int chon = 0;
        int chon2 = 0;
        int chon3 = 0;
        do{
            System.out.println("-------------------------QUAN LY KHO SACH GIAO KHOA-------------------------");
            System.out.println("SACH GIAO KHOA BAO GOM : SACH GIAO KHOA -LY THUYET  VA   SACH GIAO KHOA -BAI TAP-");
            System.out.println("Nhap vao lua chon: \n");
            System.out.println("1 : QUAN LY SACH GIAO KHOA LY THUYET");
            System.out.println("2 : QUAN LY SACH GIAO KHOA BAI TAP");
            System.out.println("0 : THOAT KHOI CHUONG TRINH");
            
            chon = input.nextInt();
            input.nextLine();
            switch(chon){
                case 1 -> {
        do{
            System.out.println("\n-------------------------QUAN LY SACH GIAO KHOA |LY THUYET|-------------------------");
            System.out.println("CHON : ");
            System.out.println("1. Them SGK ly thuyet");
            System.out.println("2. Sach trong kho");
            System.out.println("3. Dem so luong SGK ly thuyet");
            System.out.println("4. Tim ten SGK ly thuyet");
            System.out.println("5. Sap xep SGK ly thuyet theo so luong giam dan");
            System.out.println("6. Sua thong tin SGK ly thuyet");
            System.out.println("7. Xoa SGK ");
            System.out.println("8. Luu thanh 1 file txt");
            System.out.println("9. Doc du lieu file txt");
            System.out.println("10. Tao ra phieu xuat ");
            System.out.println("0. Thoat ra khoi chuong trinh \n");
            
            chon2 = input.nextInt();
            input.nextLine();
            switch(chon2){
            case 1 ->             { 
                java.util.Date date = new java.util.Date();
                Calendar cl = Calendar.getInstance();
                date = cl.getTime();
                Date ngayNhap = cl.getTime();
                System.out.print("Ma SGK Ly thuyet : "); String ma = input.nextLine();
                    System.out.print("Ten SGK Ly thuyet : "); String ten = input.nextLine();
                    System.out.print("Nha xuat ban : "); String NXB = input.nextLine();
                    System.out.print("Nam xuat ban : "); int namXB = input.nextInt();
                    while(namXB<=0||namXB>2023){
                        System.out.println("Hay nhap lai Nam Xuat Ban : ");
                        namXB = input.nextInt();    
                    }
                   

                    do{
                        do{
                      
                            
                    System.out.println("Nhap ngay - thang - nam : ");
                    System.out.print("Ngay:"); day = input.nextInt();
                    System.out.print("Thang:"); month = input.nextInt();
                    System.out.print("Nam:"); year = input.nextInt();
                    if(day<=0||day>31||month<=0||month>12||year<=0)
                            System.out.println("vui long nhap lai");
                        
                    }while(day<=0||day>31||month>12||month<=0||year<=0);
                    }while(ngayNhap.compareTo(date)>0);
                    LT.hien(day, month, year);
                    System.out.print("So luong : "); int SL = input.nextInt();
                    while(SL<0){
                        System.out.print("Nhap lai so luong : ");
                        SL = input.nextInt();    
                    }
                    System.out.print("Gia sach : \n"); double gia = input.nextDouble();
                    while(gia <= 0){
                        System.out.print("Nhap lai  Gia Sach : \n");
                        gia = input.nextDouble();    
                    }
                    
                    LyThuyet SLT1 = new LyThuyet(ma,ten,NXB,namXB,SL,gia,LT.getNgayNhap());
                    LLT.themSLT(SLT1);
            }


                case 2 -> {
                    LLT.inSLT();
            }
                case 3 -> {
                    System.out.println("So luong : " + LLT.demSLT());
            }
                case 4 -> {
                System.out.println("Ten SGK Ly Thuyet : "); String ten = input.nextLine();
                System.out.println("Ket qua : ");
                LLT.timSLT(ten);
            }
                case 5 -> {
                LLT.SXSLT();
                LLT.inSLT();
            }
                case 6 -> {
                LLT.suaSLT();
            }
             case 7 -> {
                LLT.xoaSLT();
            }
             case 8 -> {
                System.out.print("Ten file : ");
                String tenfilel = input.nextLine();
                File fl = new File(tenfilel);
                LLT.luuSLT(fl);
            }
             case 9 -> {
                System.out.print("Nhap ten file : ");
                String tenfiled = input.nextLine();
                File fd = new File(tenfiled);
                LLT.docSLT(fd);
                LLT.inSLT();
            }
             case 10 -> {
                 LLT.xuatSLT();
             }  
                    
        }   
        }while(chon2!=0);
                }
                case 2 -> {
        do{
            System.out.println("\n-------------------------QUAN LY SACH GIAO KHOA |BAI TAP|-------------------------");
            System.out.println("CHON : ");
            System.out.println("1. Them SGK Bai Tap");
            System.out.println("2. Sach trong kho");
            System.out.println("3. Dem so luong SGK Bai Tap");
            System.out.println("4. Tim ten SGK Bai Tap");
            System.out.println("5. Sap xep SGK Bai Tap theo so luong giam dan");
            System.out.println("6. Sua doi thong thin SGK Bai Tap");
            System.out.println("7. Xoa SGK ");
            System.out.println("8. Luu thanh 1 file txt");
            System.out.println("9. Doc du lieu file txt");
            System.out.println("10. Tao ra phieu xuat ");
            System.out.println("0. Thoat ra khoi chuong trinh ");
            
            chon3 = input.nextInt();
            input.nextLine();
            switch(chon3){
                case 1 -> {
                    System.out.print("Ma SGK Bai Tap : "); String ma = input.nextLine();
                    System.out.print("Ten SGK Bai Tap : "); String ten = input.nextLine();
                    System.out.print("Nha xuat ban : "); String NXB = input.nextLine();
                    System.out.print("Nam xuat ban : "); int namXB = input.nextInt();
                    if(namXB <= 0){
                        System.out.print("Hay nhap lai NAM XUAT BAN : ");
                        namXB = input.nextInt();    
                    }
                    System.out.println("Nhap Ngay - thang - nam : ");
                        System.out.print("ngay:"); day = input.nextInt();
                        System.out.print("thang:");  month = input.nextInt();
                        System.out.print("nam:"); year = input.nextInt();
                        BT.hien(day, month, year);
                    System.out.print("So luong : "); int SL = input.nextInt();
                    if(SL <= 0){
                        System.out.print("Hay nhap lai SO LUONG : ");
                        SL = input.nextInt();    
                    }
                    System.out.print("Gia sach : \n"); double gia = input.nextDouble();
                    if(gia <= 0){
                        System.out.print(" Hay nhap lai gia sach: \n");
                        gia = input.nextDouble();    
                    }
                 
                    BaiTap BT1 = new BaiTap(ma,ten,namXB,NXB,SL,gia,BT.getNgayNhap());
                    LBT.themSBT(BT1);
                }
                case 2 -> {
                    LBT.inSBT();
                }
                case 3 -> {
                    System.out.println("So luong : " + LBT.demSBT());
                }
                case 4 -> {
                    System.out.println("Ten SGK Bai Tap :"); String ten = input.nextLine();
                    System.out.println("Ket qua : ");
                    LBT.timSBT(ten);
                }
                case 5 -> {
                    LBT.sapXepSBT();
                    LBT.inSBT();
                }
                case 6 -> {
                    LBT.suaSBT();
                }
                case 7 -> {
                    LBT.xoaSBT();
                }
                case 8 -> {
                    System.out.print("Ten file luu : ");
                    String tenfilel = input.nextLine();
                    File fl = new File(tenfilel);
                    LBT.luuSBT(fl);
                }
                case 9 -> {
                    System.out.print("Ten file de doc du lieu : ");
                    String tenfiled = input.nextLine();
                    File fd = new File(tenfiled);
                    LBT.docSBT(fd);
                    LBT.inSBT();
                }
                case 10 -> {
                    LBT.xuatSBT();
                }    
            }
            } while(chon3!=0);
                }
                }
            }while(chon!=0);

        }
}
    
