package com.mycompany.jobsheet6;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

package Percabangan_IF;

/**
 *
 * @author Fairuz Tsani Habibi
 */
public class Percabangan_IF {
    
    public static void main(String[] args) {
        double total_pembelian, diskon = 0;

        Scanner dataMasuk = new Scanner(System.in);
        System.out.println("Masukkan Total Pembelian : Rp ");
        total_pembelian = dataMasuk.nextDouble();

        if (total_pembelian >= 50000)
            diskon = 0.1 * total_pembelian;

        System.out.println("Besarnya diskon : Rp " + diskon);
    }
}