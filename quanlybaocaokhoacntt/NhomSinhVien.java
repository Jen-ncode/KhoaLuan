/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vtn.quanlybaocaokhoacntt;

import static com.vtn.quanlybaocaokhoacntt.QuanLyBaoCaoKhoaCNTT.sc;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TuanNhat
 */
public class NhomSinhVien {
   private List<SinhVien> nhomSV = new ArrayList<>();
   
   public void themSV(SinhVien s) {
       this.nhomSV.add(s);
   }
   
   public void xoaSV(SinhVien s) {
       this.nhomSV.remove(s);
   }
  public void xoaSV(String ma) {
            SinhVien xoaSV = null;
            for(SinhVien sv : nhomSV) {
                if(ma.equalsIgnoreCase(sv.getMaSV())) {
                    xoaSV = sv;
                    break;
                }
            }
            if(xoaSV != null) {
                nhomSV.remove(xoaSV);
                System.out.println("-> Da xoa");
                
            }else
                System.out.println("-> Khong Tim Thay");
    }
   
   public void nhapNhomSinhVien() throws ParseException {
        System.out.println("=== NHAP NHOM SINH VIEN ===");
        System.out.print("Nhap so sinh vien muon them: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.printf("=== Nhap sinh vien thu %d ===\n", i + 1);
            SinhVien s = new SinhVien();
            s.nhapSV();
            this.nhomSV.add(s);
        }
    }
   public void xuatNhomSinhVien() {
       for(SinhVien h: this.nhomSV)
           h.xuatSV();
   }
    /**
     * @return the nhomSV
     */
    public List<SinhVien> getNhomSV() {
        return nhomSV;
    }

    /**
     * @param nhomSV the nhomSV to set
     */
    public void setNhomSV(List<SinhVien> nhomSV) {
        this.nhomSV = nhomSV;
    }

    void xoaSinhVien(String s) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
}
