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
