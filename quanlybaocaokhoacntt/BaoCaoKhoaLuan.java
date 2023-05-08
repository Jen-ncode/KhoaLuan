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
public class BaoCaoKhoaLuan extends BaoCao{
    private String danhGiaCuaGVPhanBien;
    private double tiLeDaoVan;
    private HoiDong dsThanhVien;
    public BaoCaoKhoaLuan() {
        super();
    }

    public BaoCaoKhoaLuan(String danhGiaCuaGVPhanBien, double tiLeDaoVan) {
        super();
        this.danhGiaCuaGVPhanBien = danhGiaCuaGVPhanBien;
        this.tiLeDaoVan = tiLeDaoVan;
    }

    @Override
    public void nhapBaoCao() throws ParseException {
        super.nhapBaoCao(); 
        NhomSinhVien sv = new NhomSinhVien();
        ds = sv;
        ds.nhapNhomSinhVien();
        System.out.print("Danh gia cua giang vien phan bien: ");
        this.danhGiaCuaGVPhanBien = sc.nextLine();
        System.out.print("Ti le dao van: ");
        this.tiLeDaoVan = sc.nextDouble();
        sc.nextLine();
    }
    

    @Override
    public void xuatBaoCao() {
        System.out.println("=== BAO CAO KHOA LUAN ===");
        this.ds.xuatNhomSinhVien();
        super.xuatBaoCao(); 
        System.out.println("Danh gia cua giang vien phan bien: " + this.danhGiaCuaGVPhanBien);
        System.out.println("Ti le dao van: " + this.tiLeDaoVan);
    }
    
    

    /**
     * @return the danhGiaCuaGVPhanBien
     */
    public String getDanhGiaCuaGVPhanBien() {
        return danhGiaCuaGVPhanBien;
    }

    /**
     * @param danhGiaCuaGVPhanBien the danhGiaCuaGVPhanBien to set
     */
    public void setDanhGiaCuaGVPhanBien(String danhGiaCuaGVPhanBien) {
        this.danhGiaCuaGVPhanBien = danhGiaCuaGVPhanBien;
    }

    /**
     * @return the dsThanhVien
     */
    public HoiDong getDsThanhVien() {
        return dsThanhVien;
    }

    /**
     * @param dsThanhVien the dsThanhVien to set
     */
    public void setDsThanhVien(HoiDong dsThanhVien) {
        this.dsThanhVien = dsThanhVien;
    }

    /**
     * @return the tiLeDaoVan
     */
    public double getTiLeDaoVan() {
        return tiLeDaoVan;
    }

    /**
     * @param tiLeDaoVan the tiLeDaoVan to set
     */
    public void setTiLeDaoVan(double tiLeDaoVan) {
        this.tiLeDaoVan = tiLeDaoVan;
    }
    
}
