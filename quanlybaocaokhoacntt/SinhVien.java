/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vtn.quanlybaocaokhoacntt;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 *
 * @author TuanNhat
 */
public class SinhVien {
   public static final Scanner sc = new Scanner(System.in);
   protected String maSV;
   protected String hoTen;
   protected String gioiTinh;
   protected String namSinh;
   protected String chuyenNganh;
   protected String khoaHoc;
   protected String maBaoCao;
   
   public SinhVien() {
    }

   public SinhVien(String maSV, String hoTen, String gioiTinh, String namSinh, String chuyenNganh, String khoaHoc, String maBaoCao) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.namSinh = namSinh;
        this.chuyenNganh = chuyenNganh;
        this.khoaHoc = khoaHoc;
        this.maBaoCao = maBaoCao;
    }
   
   public void nhapSV() throws ParseException {
       System.out.print("Ma SV: ");
       maSV = sc.nextLine();
       System.out.print("Ho ten: ");
       hoTen = sc.nextLine();
       System.out.print("Gioi tinh: ");
       gioiTinh = sc.nextLine();
       System.out.print("Nam sinh: ");
       namSinh = sc.nextLine();
       System.out.print("Chuyen nganh: ");
       chuyenNganh = sc.nextLine();
       System.out.print("Khoa hoc: ");
       khoaHoc = sc.nextLine(); 
   }
   public void xuatSV() {
       System.out.println("Ma SV: " + this.maSV);
       System.out.println("Ho ten: " + this.hoTen);
       System.out.println("Gioi tinh: " + this.gioiTinh);
       System.out.println("Nam sinh: " + this.namSinh);
       System.out.println("Chuyen nganh: " + this.chuyenNganh);
       System.out.println("Khoa hoc: " + this.khoaHoc);
   }

    /**
     * @return the maSV
     */
    public String getMaSV() {
        return maSV;
    }

    /**
     * @param maSV the maSV to set
     */
    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    /**
     * @return the hoTen
     */
    public String getHoTen() {
        return hoTen;
    }

    /**
     * @param hoTen the hoTen to set
     */
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    /**
     * @return the gioiTinh
     */
    public String getGioiTinh() {
        return gioiTinh;
    }

    /**
     * @param gioiTinh the gioiTinh to set
     */
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    /**
     * @return the namSinh
     */
    public String getNamSinh() {
        return namSinh;
    }

    /**
     * @param namSinh the namSinh to set
     */
    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    /**
     * @return the chuyenNganh
     */
    public String getChuyenNganh() {
        return chuyenNganh;
    }

    /**
     * @param chuyenNganh the chuyenNganh to set
     */
    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    /**
     * @return the khoaHoc
     */
    public String getKhoaHoc() {
        return khoaHoc;
    }

    /**
     * @param khoaHoc the khoaHoc to set
     */
    public void setKhoaHoc(String khoaHoc) {
        this.khoaHoc = khoaHoc;
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

    private void hoTen(String nextLine) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void maSV(String nextLine) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void gioiTinh(String nextLine) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void namSinh(String nextLine) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void chuyenNganh(String nextLine) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void khoaHoc(String nextLine) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void maBaoCao(String nextLine) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
