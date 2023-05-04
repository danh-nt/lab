package lab.pkg2;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Account {
    double soTien;
    long sotk;
    String tentk;
    String trangthai;

    public Account() {

    }

    public Account(long sotk, String tentk, String trangthai, double soTien) {
        this.soTien = soTien;
        this.sotk = sotk;
        this.tentk = tentk;
        this.trangthai = trangthai;
    }

    public double getSoTien() {
        return soTien;
    }

    public long getSotk() {
        return sotk;
    }

    public String getTentk() {
        return tentk;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setSoTien(double soTien) {
        this.soTien = soTien;
    }

    public void setSotk(long sotk) {
        this.sotk = sotk;
    }

    public void setTentk(String tentk) {
        this.tentk = tentk;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    public String toString() {
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
        String str1 = currencyVN.format(sotk);
        return sotk + "-" + tentk + "-" + str1;
    }

    public double naptien() {
        Scanner sc = new Scanner(System.in);
        double nap;
        System.out.print("So tien can nap : ");
        nap = sc.nextDouble();
        if (nap >= 0) {
            soTien = nap + soTien;
            Locale localeVN = new Locale("vi", "VN");
            NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
            String str1 = currencyVN.format(nap);
            System.out.println("Ban vua nap " + str1 + " vao tai khaoan.");
        } else {
            System.out.println("So tien khong hop le");
        }
        return nap;
    }

    public double ruttien() {
        Scanner sc = new Scanner(System.in);
        double rut;
        System.out.print("Nhap so tien ban muon rut : ");
        rut = sc.nextDouble();

        if (rut <= (soTien)) {
            soTien = soTien - (rut);
            Locale localeVN = new Locale("vi", "VN");
            NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
            String str1 = currencyVN.format(rut);
            System.out.println("Ban vua rut " + str1 + "tu tai khoan");
        } else {
            System.out.println("So tien muon rut khong hop le");
            return ruttien();
        }
        return rut;
    }

    public double DaoHan() {
        double laiSuat = 0.035;
        soTien = soTien + soTien * laiSuat;
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
        String str1 = currencyVN.format(soTien);
        System.out.println("Ban vua nhan duoc " + str1);
        return soTien;
    }

    void inSoTien() {
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
        String str1 = currencyVN.format(soTien);
        System.out.println("So tien :" + str1);
    }

    void inTK() {
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
        String str1 = currencyVN.format(soTien);
        System.out.printf("%-5d %-10s %-10s \n", sotk, tentk, str1);
    }
}
