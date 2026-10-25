package javaapplication67;


public abstract class Person { 
    private String name;
public Person(String name) 
{
    this.name = name;
}

public String getName() {
    return name;
}

public abstract void work();
}
class Manager extends Person { 
    public Manager(String name) {
    super(name); 
}
@Override
public void work() {
    System.out.println(getName() + " -  يدير العمل: مدير.");
}
}

 class Developer extends Person { 
 public Developer(String name) { 
     super(name); 
 }
@Override
public void work() {
    System.out.println(getName() + " - يكتب الكود:مطور.");
}
}


