/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vtn.quanlybaocaokhoacntt;

import java.text.ParseException;

/**
 *
 * @author TuanNhat
 */
public class BaoCaoThucTap extends BaoCao{
    protected String danhGiaCuaDoanhNghiep;
    protected SinhVien sv;

    public BaoCaoThucTap() {
        super();
    }

    public BaoCaoThucTap(String danhGiaCuaDoanhNghiep, SinhVien sv) {
        super();
        this.danhGiaCuaDoanhNghiep = danhGiaCuaDoanhNghiep;
        this.sv = sv;
    }

    @Override
    public void nhapBaoCao() throws ParseException {
        super.nhapBaoCao(); 
        SinhVien s = new SinhVien();
        sv = s;
        sv.nhapSV();
        System.out.print("Danh gia cua doanh nghiep: ");
        danhGiaCuaDoanhNghiep = sc.nextLine();
    }
    
    @Override
    public void xuatBaoCao() {
        System.out.println("=== BAO CAO THUC TAP ===");
        this.sv.xuatSV();
        super.xuatBaoCao(); 
        System.out.println("Danh gia cua doanh nghiep: " + danhGiaCuaDoanhNghiep);
    }

    /**
     * @return the danhGiaCuaDoanhNghiep
     */
    public String getDanhGiaCuaDoanhNghiep() {
        return danhGiaCuaDoanhNghiep;
    }

    /**
     * @param danhGiaCuaDoanhNghiep the danhGiaCuaDoanhNghiep to set
     */
    public void setDanhGiaCuaDoanhNghiep(String danhGiaCuaDoanhNghiep) {
        this.danhGiaCuaDoanhNghiep = danhGiaCuaDoanhNghiep;
    }
}
