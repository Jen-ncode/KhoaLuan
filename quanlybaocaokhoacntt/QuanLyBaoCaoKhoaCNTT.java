/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vtn.quanlybaocaokhoacntt;

import java.text.ParseException;
import java.util.Scanner;
/**
 *
 * @author TuanNhat
 */
public class QuanLyBaoCaoKhoaCNTT {

    private static QuanLyBaoCao qLBaoCao = new QuanLyBaoCao();
    private static NhomSinhVien nSinhVien = new NhomSinhVien();
    protected static HoiDong hoiDong = new HoiDong();
    public static final Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) throws ParseException, ClassNotFoundException {
        menu();
    }
    
    public static void menu() throws ParseException, ClassNotFoundException {
        int choose;
        do {
        System.out.println("======== MENU ========");
        System.out.println("1.Quan Ly Bao Cao");
        System.out.println("2.Quan Ly Giang Vien Va Hoi Dong");
        System.out.println("3.Thoat");
        System.out.print("Moi ban chon: ");
        choose = sc.nextInt();
        switch(choose) {
            case 1 ->  {
                QuanLyBaoCao();
                break;
            }
            case 2 ->  {
                QuanLyHoiDong();
                break;
            }
            case 3 ->  {
                break;

            }
            default -> {
                System.exit(0);
                }
            }  
        }while(choose < 3);
    }
    
    public static void themBaoCaoThucTap() throws ParseException {
        System.out.println("=== THEM BAO CAO THUC TAP ===");
        System.out.print("Nhap so bao cao muon them: ");
                int n = sc.nextInt();
                sc.nextLine();
        BaoCao[] BC = new BaoCaoThucTap[n];
        for(int i = 0; i < n; i++) {
            System.out.println("=== NHAP THONG TIN BAO CAO " + (i+1) + " ====");
             BC[i] = new BaoCaoThucTap();
             BC[i].nhapBaoCao();
             qLBaoCao.themBaoCao(BC[i]);
        }
        System.out.println("=> Them bao cao thanh cong !!!");
    }
    
    public static void themBaoCaoKhoaLuan() throws ParseException {
        System.out.println("=== THEM BAO CAO KHOA LUAN ===");
        System.out.print("Nhap so bao cao muon them: ");
                int n = sc.nextInt();
                sc.nextLine();
        BaoCao[] BC = new BaoCaoKhoaLuan[n];
        for(int i = 0; i < n; i++) {
            System.out.println("=== NHAP THONG TIN BAO CAO " + (i+1) + " ====");
             BC[i] = new BaoCaoKhoaLuan();
             BC[i].nhapBaoCao();
             qLBaoCao.themBaoCao(BC[i]);
        }
        System.out.println("=> Them bao cao thanh cong !!!");
    }
    
     public static void themBaoCaoDoAnNganh() throws ParseException {
        System.out.println("=== THEM BAO CAO DO AN NGANH ===");
        System.out.print("Nhap so bao cao muon them: ");
                int n = sc.nextInt();
                sc.nextLine();
        BaoCao[] BC = new BaoCaoDoAnNganh[n];
        for(int i = 0; i < n; i++) {
            System.out.println("=== NHAP THONG TIN BAO CAO " + (i+1) + " ====");
             BC[i] = new BaoCaoDoAnNganh();
             BC[i].nhapBaoCao();
             qLBaoCao.themBaoCao(BC[i]);
        }
        System.out.println("=> Them bao cao thanh cong !!!");
    }
    
    public static void xoaBaoCao() {
        System.out.println("===== XOA BAO CAO =====");
        System.out.print("Nhap ma bao cao muon xoa: ");
        sc.nextLine();
        String s = sc.nextLine();
        qLBaoCao.xoaBaoCao(s);
    }
    
    public static void suaBaoCao() throws ParseException {
        System.out.println("===== SUA BAO CAO =====");
        System.out.print("Nhap loai bao cao(1: Thuc tap, 2: Khoa Luan, 3: Do An Nganh:");
        int s = sc.nextInt();
        sc.nextLine();
        switch(s) {
            case 1: {
                 System.out.print("Nhap stt bao cao muon sua(0..1): ");
                int s1 = sc.nextInt();
                System.out.println("Nhap lai bao cao: ");
                BaoCao b1 = new BaoCaoThucTap();
                b1.nhapBaoCao();
                qLBaoCao.suaBaoCao(s1, b1);
                System.out.println("=> Sua bao cao thanh cong !!!");
                break;
            }
            case 2: {
                 System.out.print("Nhap stt bao cao muon sua(0..1): ");
                int s1 = sc.nextInt();
                System.out.println("Nhap lai bao cao: ");
                BaoCao b1 = new BaoCaoKhoaLuan();
                b1.nhapBaoCao();
                qLBaoCao.suaBaoCao(s1, b1);
                System.out.println("=> Sua bao cao thanh cong !!!");
                break;
            }
            case 3: {
                 System.out.print("Nhap stt bao cao muon sua(0..1): ");
                int s1 = sc.nextInt();
                System.out.println("Nhap lai bao cao: ");
                BaoCao b1 = new BaoCaoDoAnNganh();
                b1.nhapBaoCao();
                qLBaoCao.suaBaoCao(s1, b1);
                System.out.println("=> Sua bao cao thanh cong !!!");
                break;
            }
        } 
    }
    
    public static void xemDsBcThucTap() throws ClassNotFoundException {
        System.out.println("==== DANH SACH BAO CAO THUC TAP ====");
        String s = "com.vtn.quanlybaocaokhoacntt.BaoCaoThucTap";
        qLBaoCao.traCuuTheoLoai(s).forEach(h -> h.xuatBaoCao());
    }
    
    public static void xemDsBcKhoaLuan() throws ClassNotFoundException {
        System.out.println("==== DANH SACH BAO CAO KHOA LUAN ====");
        String s = "com.vtn.quanlybaocaokhoacntt.BaoCaoKhoaLuan";
        qLBaoCao.traCuuTheoLoai(s).forEach(h -> h.xuatBaoCao());
    }
    
    public static void xemDsBcDoAnNganh() throws ClassNotFoundException {
        System.out.println("==== DANH SACH BAO CAO DO AN NGANH ====");
        String s = "com.vtn.quanlybaocaokhoacntt.BaoCaoDoAnNganh";
        qLBaoCao.traCuuTheoLoai(s).forEach(h -> h.xuatBaoCao());
    }
     
    public static void timKiemBcTheoTen() {
        System.out.println("==== TIM KIEM BAO CAO THEO TEN ====");
        System.out.print("Nhap ten bao cao muon tim: ");
        sc.nextLine();
        String s = sc.nextLine();
        qLBaoCao.traCuuBaoCaoTheoTen(s).forEach(h -> h.xuatBaoCao());
     }
    
    public static void timKiemBcTheoNgay() {
        System.out.println("==== TIM KIEM BAO CAO THEO NGAY ====");
        System.out.print("Nhap ngay bao cao muon tim: ");
        sc.nextLine();
        String s = sc.nextLine();
        qLBaoCao.traCuuBaoCaoTheoNgay(s).forEach(h -> h.xuatBaoCao());
     }
    
    public static void QuanLyBaoCao() throws ParseException, ClassNotFoundException {
        int choose;
        do {
        System.out.println("======== Quan Ly Bao Cao ========");
        System.out.println("1.Them bao cao thuc tap");
        System.out.println("2.Them bao cao khoa luan");
        System.out.println("3.Them bao cao do an nganh");
        System.out.println("4.Xoa bao cao");
        System.out.println("5.Sua bao cao");
        System.out.println("6.Xuat danh sach bao cao");
        System.out.println("7.Xem danh sach bao cao thuc tap");
        System.out.println("8.Xem danh sach bao cao khoa luan");
        System.out.println("9.Xem danh sach bao cao do an nganh");
        System.out.println("10.Tim kiem bao cao theo ten");
        System.out.println("11.Tim kiem bao cao theo ngay");
        System.out.println("12.Sap xep theo ten");
        System.out.println("13.Sap xep theo ngay");
        System.out.println("14.Thoat");
        System.out.print("Moi ban chon: ");
        choose = sc.nextInt();
        switch(choose) {
            case 1:{
                themBaoCaoThucTap();
                break;
            }
            case 2: {
                themBaoCaoKhoaLuan();
                break;
            }
            case 3: {
                themBaoCaoDoAnNganh();
                break;
            }
            case 4: {
                xoaBaoCao();
                break;
            }
            case 5: {
                suaBaoCao();
                break;
            }
            case 6: {
                qLBaoCao.xuatDsBaoCao();
                break;
            }
            case 7: {
               xemDsBcThucTap();
               break;
            }
            case 8: {
               xemDsBcKhoaLuan();
               break;
            }
            case 9: {
               xemDsBcDoAnNganh();
               break;
            }
            case 10: {
                timKiemBcTheoTen();
                break;
            }
            case 11: {
                timKiemBcTheoNgay();
                break;
            }
            case 13: {
                break;
            }
            default: {
                
            }
        }
    }while(choose < 14);
}
    public static void themGiangVien() throws ParseException {
        System.out.println("=== THEM GIANG VIEN ===");
        System.out.print("Nhap so giang vien muon them: ");
                int n = sc.nextInt();
                sc.nextLine();
        GiangVien[] GV = new GiangVien[n];
        for(int i = 0; i < n; i++) {
            System.out.println("=== NHAP THONG TIN GIANG VIEN " + (i+1) + " ====");
             GV[i] = new GiangVien();
             GV[i].nhapGV();
             hoiDong.themGV(GV[i]);
        }
        System.out.println("=> Them giang vien thanh cong !!!");
    }
    
    public static void themHoiDong() throws ParseException {
        System.out.println("=== THEM HOI DONG ===");
        System.out.print("Nhap so giang vien muon them: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.printf("=== Nhap giang vien thu %d ===\n", i + 1);
            GiangVien s = new GiangVien();
            s.nhapGV();
            hoiDong.themGV(s);
        }
        System.out.println("=> Them hoi dong thanh cong !!!");
    }
     
    public static void QuanLyHoiDong() throws ParseException, ClassNotFoundException {
        int choose;
        do {
        System.out.println("======== Quan Ly Giang Vien Va Hoi Dong ========");
        System.out.println("1.Them Giang Vien");
        System.out.println("2.Xem Danh Sach Giang Vien");
        System.out.println("3.Them Hoi Dong");
        System.out.println("4.Gan Hoi Dong Cho Bao Cao");
        System.out.println("5.Thoat");
        System.out.print("Moi ban chon: ");
        choose = sc.nextInt();
        switch(choose) {
            case 1:{
                themGiangVien();
                break;
            }
            case 2: {
                hoiDong.xuatHoiDong();
                break;
            }
            case 3: {
                themHoiDong();
                break;
            }
            case 4: {
                xoaBaoCao();
                break;
            }
        }
    }while(choose < 5);
}
    /**
     * @return the q1BaoCao
     */
    public QuanLyBaoCao getQ1BaoCao() {
        return qLBaoCao;
    }

    /**
     * @param qLBaoCao the q1BaoCao to set
     */
    public void setQLBaoCao(QuanLyBaoCao qLBaoCao) {
        QuanLyBaoCaoKhoaCNTT.qLBaoCao = qLBaoCao;
    }

    /**
     * @return the nSinhVien
     */
    public static NhomSinhVien getnSinhVien() {
        return nSinhVien;
    }

    /**
     * @param anSinhVien the nSinhVien to set
     */
    public static void setnSinhVien(NhomSinhVien anSinhVien) {
        nSinhVien = anSinhVien;
    }

    /**
     * @return the hoiDong
     */
    public static HoiDong getHoiDong() {
        return hoiDong;
    }

    /**
     * @param aHoiDong the hoiDong to set
     */
    public static void setHoiDong(HoiDong aHoiDong) {
        hoiDong = aHoiDong;
    }
}
