/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.HitungNilaiAkhir to edit this template
 */
package Evaluasi4.HitungNilai;

/**
 *
 * @author
 *         Nama : Muh. Reza
 *         Nim : 13020220070
 *         Kelas : A2
 *         Modul : 4
 */
public class HitungNilaiAkhir {
    public double NilaiTugas(int tugas1, int tugas2) {
        return (tugas1 + tugas2) * 2.0;
    }

    public double nilaiAkhir(double tugas, int mid, int uas) {
        return (tugas * 0.4) + (mid * 0.3) + (uas * 0.3);
    }
}
