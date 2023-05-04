package lab.pkg2;

import java.util.Scanner;

public class main {
    static Scanner sc = new Scanner(System.in);

    static void nhaptk(Account tk) {
        System.out.println("Nhap so tai khoan : ");
        tk.setSotk(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhap ten tai khoan : ");
        tk.setTentk(sc.nextLine());
        tk.setSoTien(50000);
    }

    public static void main(String[] args) {
        Account a[] = null;
        Account acc = new Account();
        int k, b, n = 0;
        long s, d, c, f;
        boolean flag = true;
        do {
            System.out.println("Ban chon :  ");
            System.out.println("1.Them tai khoan \n" + "2.So TK hien co \n"
                    + "3.In thong tin tat ca tai khoan \n" + "4.Nap tien\n" + "5.Rut tien\n"
                    + "6.Chuyen tien\n" + "0.De thoat");
            b = sc.nextInt();
            switch (b) {
                case 0:
                    flag = false;
                    break;
                case 1:
                    System.out.println("So luong khach ma ban muon nhap :  ");
                    n = sc.nextInt();
                    a = new Account[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("Khach hang " + (i + 1));
                        a[i] = new Account();
                        nhaptk(a[i]);
                    }
                    break;
                case 2:
                    acc.inSoTien();
                    break;
                case 3:
                    System.out.printf("%-5s %-10s %-10s\n", "So TK", "Ten TK", "So tien trong TK");
                    for (int i = 0; i < n; i++) {
                        a[i].inTK();
                    }
                    break;
                case 4:
                    System.out.println("Nhap so tai khoan ban muon nap tien : ");
                    s = sc.nextLong();
                    for (int i = 0; i < n; i++) {
                        d = a[i].getSotk();
                        if (s == d) {
                            System.out.println("Ban chon tk : " + d);
                            a[i].naptien();
                        } else {
                            System.out.println("");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Nhap so tai khoan can rut tien :  ");
                    s = sc.nextLong();
                    for (int i = 0; i < n; i++) {
                        d = a[i].getSotk();
                        if (s == d) {
                            System.out.println("Ban chon tai khoan : " + d);
                            a[i].ruttien();
                        }
                    }
                    break;
                case 6:
                    double chuyen,
                            nhan,
                            tienChuyen;
                    System.out.print("Nhap tai khoan de chuyen : ");
                    s = sc.nextLong();
                    System.out.print("Nhap so tai khoan nhan tien : ");
                    c = sc.nextLong();
                    for (int i = 0; i < n; i++) {
                        d = a[i].getSotk();
                        if (s == d) {
                            chuyen = a[i].getSoTien();
                            for (int j = 0; j < n; j++) {
                                f = a[j].getSotk();
                                if (c == f) {
                                    nhan = a[j].getSoTien();
                                    System.out.println("Nhap so tien can chuyen");
                                    tienChuyen = sc.nextDouble();
                                    if (tienChuyen <= chuyen) {
                                        chuyen = chuyen - tienChuyen;
                                        nhan = nhan + tienChuyen;
                                        a[i].setSoTien(chuyen);
                                        a[j].setSoTien(nhan);
                                        System.out.println("Tai khoan  " + d + " Vua chuyen :" + tienChuyen);
                                        System.out.println("Tai khoan " + f + " Vua nhan duoc : " + tienChuyen);
                                    } else {
                                        System.out.println("So tien nhap khong hop le");
                                    }
                                } else {
                                    System.out.println("");
                                }
                            }
                        } else {
                            System.out.println("");
                        }
                    }
                    break;
                default:
                    System.out.println("Tam biet ");
                    flag = false;
                    break;
            }
        } while (flag);

    }
}
