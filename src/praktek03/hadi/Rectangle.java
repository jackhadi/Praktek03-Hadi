package praktek03.hadi;


public class Rectangle {
    double panjang;
    double lebar;
    
    
    void cetakInfo(){
            System.out.println("===================");
            System.out.println("Panjang : "+panjang);
            System.out.println("lebar   : "+lebar);
            System.out.println("===================");
}
    double HitungLuas(){
                double luas;
                luas=panjang*lebar;
                return luas;
    }
    
    void cetakLuas(){
        System.out.println("Luasnya adalah :"+HitungLuas());
    }
} 
