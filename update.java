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
