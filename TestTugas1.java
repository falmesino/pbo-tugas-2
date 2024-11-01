/**
 * TestTugas1.java
 * Tugas Praktikum Pengenalan OOP - 12 Oktober 2024
 * 231232028 Falmesino Abdul Hamid
 */

public class TestTugas1 {
  public static void main (String srt[]) {
    Tabungan tabungan = new Tabungan(5000, true);

    tabungan.simpanUang(3000);

    tabungan.ambilUang(6000);
    
    tabungan.simpanUang(3500);

    tabungan.ambilUang(4000);

    tabungan.ambilUang(1600);

    tabungan.simpanUang(2000);

    tabungan.getSaldo();
  }
}