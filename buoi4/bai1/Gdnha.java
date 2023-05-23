
package bai1;

public class Gdnha extends gdich {
    String loainha;
    String diachi;
    public Gdnha(){
        
    }
    public Gdnha(String loainha, String diachi){
        this.diachi=diachi;
        this.loainha=loainha;
    }

    public String getLoainha() {
        return loainha;
    }

    public void setLoainha(String loainha) {
        this.loainha = loainha;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
    public void loainha(){
        
        System.out.println("nhap Loai nha:");
        loainha = in.nextLine();
        System.out.println("nhap Dia chi:");
        diachi = in.nextLine();
        super.thongtin();
    }
    @Override
   public String toString(){
       return super.toString() + "Loai nha: " + loainha + "Dia chi: " + diachi;
   }
}
