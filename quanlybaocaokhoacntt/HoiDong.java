/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vtn.quanlybaocaokhoacntt;

import static com.vtn.quanlybaocaokhoacntt.QuanLyBaoCaoKhoaCNTT.sc;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author TuanNhat
 */
public class HoiDong {
    protected List<GiangVien> gv = new ArrayList<>();
    
    public void themGV(GiangVien...a) {
        this.gv.addAll(Arrays.asList(a));
    }
    
    public void xoaGV(GiangVien s) {
        this.gv.remove(s);
    }
    
    public void nhapHoiDong(int n) throws ParseException {
//        System.out.println("=== NHAP HOI DONG ===");
//        System.out.print("Nhap so thanh vien muon them: ");
//        int n = sc.nextInt();
//        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.printf("=== Nhap thanh vien thu %d ===\n", i + 1);
            GiangVien s = new GiangVien();
            s.nhapGV();
            this.gv.add(s);
        }
    }
    
    public void xuatHoiDong() {
       for(GiangVien h: this.gv)
           h.xuatGV();
   }

    /**
     * @return the gv
     */
    public List<GiangVien> getGv() {
        return gv;
    }

    /**
     * @param gv the gv to set
     */
    public void setGv(List<GiangVien> gv) {
        this.gv = gv;
    }
}
