/**
 * Tabungan.java
 * Tugas Praktikum Pengenalan OOP - 12 Oktober 2024
 * 231232028 Falmesino Abdul Hamid
 */

public class Tabungan {
  private int saldo;
  private boolean tampilLog;

  public Tabungan(int initsaldo) {
    this.saldo = initsaldo;
    this.tampilLog = false;
  }

  public Tabungan(int initsaldo, boolean tampilLog) {
    this.saldo = initsaldo;
    this.tampilLog = tampilLog;
    if (tampilLog) System.out.println("Saldo awal: " + saldo);
  }

  public int getSaldo() {
    if (tampilLog) System.out.println("Saldo sekarang: " + saldo);
    return saldo;
  }

  public void simpanUang(int jumlah) {
    saldo += jumlah;
    if (tampilLog) System.out.println("Jumlah uang yang disimpan:" + jumlah);
  }

  public boolean ambilUang(int jumlah) {
    if (tampilLog) System.out.println("jumlah uang yang diambil:" + jumlah);
    if (saldo >= jumlah) {
      saldo -= jumlah;
      if (tampilLog) System.out.println("OK");
      return true;
    }

    if (tampilLog) System.out.println("Gagal");
    return false;
  }
}
