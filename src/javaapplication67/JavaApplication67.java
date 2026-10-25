package javaapplication67;





public class JavaApplication67 {

 
    public static void main(String[] args) {
   Office<Manager> managerOffice = new Office<>(); 
   managerOffice.occupy(new Manager("علي")); 
   managerOffice.makeOccupantWork();
    System.out.println("-------------------");

   
    Office<Developer> devOffice = new Office<>();
    devOffice.occupy(new Developer("شذى"));
    devOffice.makeOccupantWork();
    }
    
}
