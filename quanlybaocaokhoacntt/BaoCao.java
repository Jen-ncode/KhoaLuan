/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vtn.quanlybaocaokhoacntt;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author TuanNhat
 */
public class BaoCao {
    public static final Scanner sc = new Scanner(System.in);
    public static final SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
    protected String maBaoCao;
    protected String tenBaoCao;
    private String ngayBaoCao;
    protected String tenGVHD;
    protected NhomSinhVien ds;
    private List<SinhVien> sV;
    protected List<GiangVien> gv = new ArrayList<>();
    
    public BaoCao() {
    }

    public BaoCao(String maBaoCao, String tenBaoCao, String ngayBaoCao, String tenGVHD, NhomSinhVien ds) {
        this.maBaoCao = maBaoCao;
        this.tenBaoCao = tenBaoCao;
        this.ngayBaoCao = ngayBaoCao;
        this.tenGVHD = tenGVHD;
        this.ds = ds;
    }
    
    public void nhapBaoCao() throws ParseException {
        System.out.print("Ma bao cao: ");
        maBaoCao = sc.nextLine();
        System.out.print("Ten bao cao: ");
        tenBaoCao = sc.nextLine();
        System.out.print("Ngay bao cao: ");
        ngayBaoCao = sc.nextLine();
        System.out.print("Giang vien huong dan: ");
        tenGVHD = sc.nextLine();
    }
    
    public void xuatBaoCao() {
        System.out.println("Ma bao cao: " + this.maBaoCao);
        System.out.println("Ten bao cao: " + this.tenBaoCao);
        System.out.println("Ngay bao cao: " + this.ngayBaoCao);
    }
    
    

    /**
     * @return the maBaoCao
     */
    public String getMaBaoCao() {
        return maBaoCao;
    }

    /**
     * @param maBaoCao the maBaoCao to set
     */
    public void setMaBaoCao(String maBaoCao) {
        this.maBaoCao = maBaoCao;
    }

    /**
     * @return the tenBaoCao
     */
    public String getTenBaoCao() {
        return tenBaoCao;
    }

    /**
     * @param tenBaoCao the tenBaoCao to set
     */
    public void setTenBaoCao(String tenBaoCao) {
        this.tenBaoCao = tenBaoCao;
    }

    /**
     * @return the ngayBaoCao
     */
    public String getNgayBaoCao() {
        return ngayBaoCao;
    }

    /**
     * @param ngayBaoCao the ngayBaoCao to set
     */
    public void setNgayBaoCao(String ngayBaoCao) {
        this.ngayBaoCao = ngayBaoCao;
    }

    /**
     * @return the sV
     */
    public List<SinhVien> getsV() {
        return sV;
    }

    /**
     * @param sV the sV to set
     */
    public void setsV(List<SinhVien> sV) {
        this.sV = sV;
    }

    /**
     * @return the tenGVHD
     */
    public String getTenGVHD() {
        return tenGVHD;
    }

    /**
     * @param tenGVHD the tenGVHD to set
     */
    public void setTenGVHD(String tenGVHD) {
        this.tenGVHD = tenGVHD;
    }

    /**
     * @return the ds
     */
    public NhomSinhVien getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(NhomSinhVien ds) {
        this.ds = ds;
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
