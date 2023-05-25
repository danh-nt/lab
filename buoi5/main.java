package buoi5;
import java.util.Scanner;
import java.util.ArrayList;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Lythuyet> lthuyet = new ArrayList<>();
		ArrayList<Maytinh> mtinh = new ArrayList<>();
		ArrayList<ThiNghiem> tnghiem= new ArrayList<>();
		Scanner e  = new Scanner(System.in);
		int  chon, chon1,chon2;
		Lythuyet lt = new Lythuyet();
		Maytinh mt = new Maytinh();
		ThiNghiem tn = new ThiNghiem();
		System.out.println("--------Menu------");
		System.out.println("1.Them phong hoc:");
		System.out.println("2.Tim phong");
		System.out.println("3.Xuat tat ca cac phong");
		System.out.println("4.Phong hoc dat chuan");
		System.out.println("Nhap lua chon: ");
		chon = e.nextInt();
		
		do {
			switch (chon){
				case 1:
					do {
					System.out.println("1.Ly thuyet");
					System.out.println("2.May tinh");
					System.out.println("3.Thi nghiem");
					System.out.println("nhap lua chon: ");
					chon1 = e.nextInt();
				
					switch (chon1) {
					case 1:
						lt.nhap();
						lthuyet.add(lt);
						break;
					case 2:
						mt.nhap();
						mtinh.add(mt);
						break;
					case 3:
						tn.nhap();
						tnghiem.add(tn);
						break;
					}
				
					
				}while(chon1!=0);
				break;
			
				case 2:{
					System.out.println("1.Ly thuyet");
					System.out.println("2.May tinh");
					System.out.println("3.Thi nghiem");
					chon2 = e.nextInt();
					while(chon2!=0) {
					switch(chon2) {
						
					case 1:
						System.out.println("a");
						break;
					case 2:
						
						break;
					case 3:
						
						break;
						}
					}
					
				}
				break;
				case 3:{
					for(int i=0 ; i<lthuyet.size() ; i++) {
						System.out.println(lthuyet.get(i).toString());
					}
					for(int i=0 ; i<mtinh.size() ; i++) {
						System.out.println(mtinh.get(i).toString());
					}
					for(int i=0 ; i<tnghiem.size() ; i++) {
						System.out.println(tnghiem.get(i).toString());
					}
					
				}
				break;
				
			}
		}while(chon!=0);

	}

}
