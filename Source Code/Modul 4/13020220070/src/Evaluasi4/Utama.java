/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Evaluasi4;

import java.util.Scanner;

import javax.swing.JOptionPane;

import Evaluasi4.HitungNilai.HitungNilaiAkhir;
import Evaluasi4.Mahasiswa.Nilai;
import Evaluasi4.Mahasiswa.Identitas;

/**
 * ;
 *
 * @author
 *         Nama : Muh. Reza
 *         Nim : 13020220070
 *         Kelas : A2
 *         Modul : 4
 */
public class Utama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Identitas identitas = new Identitas();
        Nilai nilai = new Nilai();
        HitungNilaiAkhir hitungNilai = new HitungNilaiAkhir();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nama         : ");
        identitas.setNama(scanner.nextLine());
        System.out.print("Masukkan Stambuk      : ");
        identitas.setStambuk(scanner.nextLine());

        System.out.print("Masukkan Nilai Tugas 1: ");
        nilai.setTugas1(scanner.nextInt());
        System.out.print("Masukkan Nilai Tugas 2: ");
        nilai.setTugas2(scanner.nextInt());
        System.out.print("Masukkan Nilai MID    : ");
        nilai.setMid(scanner.nextInt());
        System.out.print("Masukkan Nilai UAS    : ");
        nilai.setUas(scanner.nextInt());

        double tugas = hitungNilai.NilaiTugas(nilai.getTugas1(), nilai.getTugas2());
        double na = hitungNilai.nilaiAkhir(tugas, nilai.getMid(), nilai.getUas());

        JOptionPane.showMessageDialog(null, "Nama: " + identitas.getNama() + "\nStambuk: " + identitas.getStambuk());
        JOptionPane.showMessageDialog(null, "Nilai Tugas: " + tugas + "\nNilai MID: " + nilai.getMid() + "\nNilai UAS: "
                + nilai.getUas() + "\nNilai Akhir: " + na);
        scanner.close();
    }
}
