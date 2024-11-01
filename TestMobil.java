public class TestMobil {
  public static void main (String srt[]) {
    Mobil mobil1 = new Mobil("Toyota", "Biru", "Minibus", 2000, 7);
    Mobil mobil2 = new Mobil("Daihatsu", "Hitam", "Pick Up", 1500, 2);
    Mobil mobil3 = new Mobil("Suzuki", "Silver", "SUV", 1800, 5);
    Mobil mobil4 = new Mobil("Honda", "Merah", "Sedan", 1300, 5);

    System.out.println("Info Mobil 1");
    mobil1.infoMobil();

    System.out.println("Info Mobil 2");
    mobil2.infoMobil();

    System.out.println("Info Mobil 3");
    mobil3.infoMobil();

    System.out.println("Info Mobil 4");
    mobil4.infoMobil();
  }
}
