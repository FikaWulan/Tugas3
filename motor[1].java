package tugas3;

public class motor {
    String pabrikan, nama, tahun;

    //Konstruktor
 motor(String pabrikan, String nama, String tahun){
     this.pabrikan = pabrikan;
     this.nama = nama;
     this.tahun = tahun;
 }
 
   //mutator
 void show() {
     System.out.println("Pabrikan :"+this.pabrikan);
     System.out.println("nama :"+this.nama);
     System.out.println("tahun :"+this.tahun);
 }
   //acsessor
 String getPabrikan() {
     return this.pabrikan;
 }
 String getnama() {
     return this.nama;
 }
 String gettahun() {
     return this.tahun;
 
     
        
    }
    
}