/**
 * TestMobil.java
 * Tugas Praktikum Pengenalan OOP - 12 Oktober 2024
 * 231232028 Falmesino Abdul Hamid
 */

/**
 * UML Class Diagram Mobil
 * A: merek
 * B: warna
 * C: jenis
 * D: cc
 * E: penumpang
 * 
 * Mobil
 * - merek: string
 * - warna: string
 * - jenis: string
 * - cc: int
 * - penumpang: int
 * + infoMobil(merek: string, warna: string, jenis: string, cc: int, penumpang: int): void
 */

public class Mobil {
  private String merek;
  private String warna;
  private String jenis;
  private int cc;
  private int penumpang;

  public Mobil (String merek, String warna, String jenis, int cc, int penumpang) {
    this.merek = merek;
    this.warna = warna;
    this.jenis = jenis;
    this.cc = cc;
    this.penumpang = penumpang;
  }

  public void infoMobil() {
    System.out.println("Merek: " + merek);
    System.out.println("Warna: " + warna);
    System.out.println("Jenis: " + jenis);
    System.out.println("CC: " + cc);
    System.out.println("Penumpang: " + penumpang + "\n");
  }
}
