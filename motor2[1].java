package tugas3;

public class motor2 {
    public static void main(String[] agrs) {
    motor motor1 = new motor("Honda", "Beat", "2019");
    motor motor2 = new motor("Suzuki", "GSX", "2020");
    //konstruktor
    System.out.println("Pabrikan \t:" + motor1.pabrikan);
    System.out.println("nama \t:" + motor1.nama);
    System.out.println("tahun \t:" + motor1.tahun);
    System.out.println("");
    System.out.println("Pabrikan \t:" + motor2.pabrikan);
    System.out.println("nama \t:" + motor2.nama);
    System.out.println("tahun \t:" + motor2.tahun);
    System.out.println("");
    
    //mutator
    motor1.show();
    System.out.println("");
    motor2.show();
    System.out.println("");
    
    //accsessor
    System.out.println(motor1.getPabrikan());
    System.out.println(motor1.getnama());
    System.out.println(motor1.gettahun());
    System.out.println("");
    System.out.println(motor2.getPabrikan());
    System.out.println(motor2.getnama());
    System.out.println(motor2.gettahun());
    
    
    
            
}
    
}