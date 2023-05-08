/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vtn.quanlybaocaokhoacntt;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author TuanNhat
 */
public class QuanLyBaoCao {
    
    private List<BaoCao> qlBaoCao = new ArrayList<>();
    
    public  void themBaoCao(BaoCao s) {
        this.qlBaoCao.add(s);
    }
    
    public void xoaBaoCao(BaoCao s) {
        this.qlBaoCao.remove(s);
    }
    
    public void xoaBaoCao(String ma) {
            BaoCao xoaBaoCao = null;
            for(BaoCao bc : qlBaoCao) {
                if(ma.equalsIgnoreCase(bc.getMaBaoCao())) {
                    xoaBaoCao = bc;
                    break;
                }
                    
            }
            if(xoaBaoCao != null) {
                qlBaoCao.remove(xoaBaoCao);
                System.out.println("-> Da xoa");
                
            }else
                System.out.println("-> Khong Tim Thay");
    }
    
    public void suaBaoCao(int maBC, BaoCao h) {
        this.qlBaoCao.set(maBC,h);
    } 
    
    public void xuatDsBaoCao() {
       System.out.println("=== DANH SACH BAO CAO ===");
       for(BaoCao h: this.qlBaoCao)
           h.xuatBaoCao();
    }
    
    public List<BaoCao> traCuuBaoCaoTheoTen(String tuKhoa) {
         return this.qlBaoCao.stream().filter(s -> s.getTenBaoCao().contains(tuKhoa)).collect(Collectors.toList());
    }
    
    public List<BaoCao> traCuuBaoCaoTheoNgay(String ngay) {
         return this.qlBaoCao.stream().filter(s -> s.getNgayBaoCao().contains(ngay)).collect(Collectors.toList());
    }
    
     public List<BaoCao> traCuuTheoLoai(String duongDan) throws ClassNotFoundException {
        Class c = Class.forName(duongDan);
        return this.qlBaoCao.stream().filter(h -> c.isInstance(h)).collect(Collectors.toList());
    }
    /**
     * @return the qlBaoCao
     */
    public List<BaoCao> getQlBaoCao() {
        return qlBaoCao;
    }

    /**
     * @param qlBaoCao the qlBaoCao to set
     */
    public void setQlBaoCao(List<BaoCao> qlBaoCao) {
        this.qlBaoCao = qlBaoCao;
    }

}
