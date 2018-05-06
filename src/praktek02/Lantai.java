package praktek02;
public class Lantai {
    double panjang;
    double lebar;

    public Lantai() {
        panjang=4;
        lebar=3;
    }

    public Lantai(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    
    
    void cetakInfo(){
        System.out.println("====================");
        System.out.println("Panjang : "+panjang);
        System.out.println("Lebar :   "+lebar);
        System.out.println("====================");
    }
    
    double hitungLuas(){
        double luas;
        luas=panjang*lebar;
        return luas;
    }
    
    void cetakLuas(){
        System.out.println("Luasnya adalah: "+hitungLuas());
    }
}
