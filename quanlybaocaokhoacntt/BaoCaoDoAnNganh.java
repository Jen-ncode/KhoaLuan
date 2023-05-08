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
public class BaoCaoDoAnNganh extends BaoCao{
    private double tiLeDaoVan;
    private SinhVien sv;

    public BaoCaoDoAnNganh() {
        super();
    }

    public BaoCaoDoAnNganh(double tiLeDaoVan) {
        super();
        this.tiLeDaoVan = tiLeDaoVan;
    }

    @Override
    public void nhapBaoCao() throws ParseException {
        super.nhapBaoCao(); 
        SinhVien s = new SinhVien();
        sv = s;
        sv.nhapSV();
        System.out.print("Ti le dao van: ");
        tiLeDaoVan = sc.nextDouble();
        sc.nextLine();
    }
    
    @Override
    public void xuatBaoCao() {
        System.out.println("=== BAO CAO DO AN NGANH ===");
        this.sv.xuatSV();
        super.xuatBaoCao(); 
        System.out.println("Ti le dao van: " + tiLeDaoVan);
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

    /**
     * @return the sv
     */
    public SinhVien getSv() {
        return sv;
    }

    /**
     * @param sv the sv to set
     */
    public void setSv(SinhVien sv) {
        this.sv = sv;
    }
}
