
package lab.pkg2;
import java.util.Scanner;

public class main {
    static Scanner sc = new Scanner(System.in);
    static void nhapCD(CD cd) {
    	cd.setMaCD(999999);
        System.out.print("ma CD : ");
        cd.setMaCD(sc.nextInt());
        sc.nextLine();
        cd.setTuaCD("chua xac dinh");
        System.out.print("tua CD: ");
        cd.setTuaCD(sc.nextLine());
        System.out.print("so luong bai hat: ");
        cd.setSoBaiHat(sc.nextInt());
        System.out.print("gia: ");
        cd.setGiaThanh(sc.nextFloat());
    }
    public static void main(String[] args) {
    	CD alb[] = null;
        int a, n = 0;
        boolean flag = true;
        do {
            
            System.out.println("\n1.nhap thong tin CD \n" +
                    "2.xuat ds CD.\n" + "3.dem so luong CD \n" + "4.tong gia CD \n" +
                    "5.xep giam dan theo gia\n"+"6.xep tang dan theo tua CD\n"+"0.thoat\n");
            System.out.println("nhap lua chon: ");
            a = sc.nextInt();
            switch (a) {
            	case 0 :
            		System.out.println("--------------------");
            		flag = false;
            		break;
                case 1:
                    System.out.println("nhap so luong Cd : ");
                    n = sc.nextInt();
                    alb = new CD[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("CD " + (i + 1)+": ");
                        alb[i] = new CD();
                        nhapCD(alb[i]);
                    }
                    break;
                case 2:
                    System.out.printf( "%-10s %-20s %-10s %-20s \n", "ma CD", "Ten CD", "so bai hat", "Gia");
                    for (int i = 0; i < n; i++) {
                        alb[i].hienThi();
                    }
                    break;
                case 3:
                    System.out.println("tong so luong CD : " + n);
                    break;    
                case 4:
                    int tong = 0;
                    for (int i = 0; i < n; i++) {
                        tong += alb[i].getGiaThanh();
                    }
                    System.out.println("" +
                            "tong gia : " + tong);
                    break;
                
                case 5:
                	CD temp = alb[0];
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = i + 1; j < n; j++) {
                            if (alb[i].getGiaThanh() < alb[j].getGiaThanh()) {
                                temp = alb[j];
                                alb[j] = alb[i];
                                alb[i] = temp;
                            }
                        }
                    }
                    System.out.println("xep giam theo gia ");
                    System.out.printf( "%-10s %-20s %-10s %-20s \n","ma CD", "Ten CD", "so bai hat", "Gia");
                    for (int i = 0; i < n; i++) {
                        alb[i].hienThi();
                    }
                    break;
                case 6:
                    temp = alb[0];
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = i + 1; j < n; j++) {
                            if (alb[i].getTuaCD().compareTo(alb[j].getTuaCD())>0) {
                                temp = alb[j];
                                alb[j] = alb[i];
                                alb[i] = temp;
                            }
                        }
                    }
                    System.out.println("xep tang dan theo tua CD : ");
                    System.out.printf("%-10s %-20s %-10s %-20s \n","ma CD", "tua CD", "so bai hat", "Gia");
                    for (int i = 0; i < n; i++) {
                        alb[i].hienThi();
                    }
                    break;
                default:
			    System.out.println("=============");
			    flag = false;
			    break;
            	}
				}while (flag) ;
    }
}
