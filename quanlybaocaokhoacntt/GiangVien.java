/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vtn.quanlybaocaokhoacntt;

import static com.vtn.quanlybaocaokhoacntt.SinhVien.sc;
import java.text.ParseException;

/**
 *
 * @author TuanNhat
 */
public class GiangVien {
    protected String maGV;
    protected String tenGV;
    protected String hocHam;
    protected String hocVi;
    protected String nhiemVu;
    protected double diem;

    public GiangVien() {
    }

    public GiangVien(String maGV, String tenGV, String hocHam, String hocVi, String nhiemVu, double diem) {
        this.maGV = maGV;
        this.tenGV = tenGV;
        this.hocHam = hocHam;
        this.hocVi = hocVi;
        this.nhiemVu = nhiemVu;
        this.diem = diem;
    }
    
    public void nhapGV() throws ParseException {
       System.out.print("Ma GV: ");
       maGV = sc.nextLine();
       System.out.print("Ho ten: ");
       tenGV = sc.nextLine();
       System.out.print("Hoc ham: ");
       hocHam = sc.nextLine();
       System.out.print("Hoc vi: ");
       hocVi = sc.nextLine();
       System.out.print("Nhiem vu: ");
       nhiemVu = sc.nextLine();
   }
    
    public void xuatGV() {
       System.out.println("Ma GV: " + this.maGV);
       System.out.println("Ho ten: " + this.tenGV);
       System.out.println("Hoc ham: " + this.hocHam);
       System.out.println("Hoc vi: " + this.hocVi);
       System.out.println("Chuyen nganh: " + this.nhiemVu);
   }
    
    
    /**
     * @return the maGV
     */
    public String getMaGV() {
        return maGV;
    }

    /**
     * @param maGV the maGV to set
     */
    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    /**
     * @return the tenGV
     */
    public String getTenGV() {
        return tenGV;
    }

    /**
     * @param tenGV the tenGV to set
     */
    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
    }

    /**
     * @return the hocHam
     */
    public String getHocHam() {
        return hocHam;
    }

    /**
     * @param hocHam the hocHam to set
     */
    public void setHocHam(String hocHam) {
        this.hocHam = hocHam;
    }

    /**
     * @return the hocVi
     */
    public String getHocVi() {
        return hocVi;
    }

    /**
     * @param hocVi the hocVi to set
     */
    public void setHocVi(String hocVi) {
        this.hocVi = hocVi;
    }

    /**
     * @return the nhiemVu
     */
    public String getNhiemVu() {
        return nhiemVu;
    }

    /**
     * @param nhiemVu the nhiemVu to set
     */
    public void setNhiemVu(String nhiemVu) {
        this.nhiemVu = nhiemVu;
    }

    /**
     * @return the diem
     */
    public double getDiem() {
        return diem;
    }

    /**
     * @param diem the diem to set
     */
    public void setDiem(double diem) {
        this.diem = diem;
    }
    
}
