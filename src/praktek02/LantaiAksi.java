package praktek02;

public class LantaiAksi {
   public static void main(String[] args) {
       Lantai L1 = new Lantai();
       L1.panjang = 5;
       L1.lebar = 4;
       
       L1.cetakInfo();
       System.out.println("Luas lantai = "+L1.hitungLuas());
       L1.cetakLuas();
       
       Lantai L2 = new Lantai();
       L2.cetakInfo();
       
       Lantai L3 = new Lantai(20,15);
       L3.cetakInfo();
   } 
}
