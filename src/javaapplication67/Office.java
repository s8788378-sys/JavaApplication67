package javaapplication67;

public class Office<T extends Person> {
    private T occupant;
public void occupy(T occupant) {
    this.occupant = occupant;
    System.out.println("تم إدخال الموظف: " + occupant.getName() + " إلى المكتب.");
}

public void makeOccupantWork() {
    if (occupant != null) {
        occupant.work(); 
    } else {
        System.out.println("المكتب فارغ!");
    }
}

public T getOccupant() {
    return occupant;
}
}

