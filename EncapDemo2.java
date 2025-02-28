class Encapsulate {
 // private variables declared these can only be accessed by public methods of class
 private String name;
 private int roll;
 private int age;
 public int getAge() { return age; }
 public String getName() { return name; }
 public int getRoll() { return roll; }
 public void setAge(int newAge) { age = newAge; }
 public void setName(String newName) { name = newName; }
 public void setRoll(int newRoll) { roll = newRoll; }
}
 
 
 
 
public class EncapDemo2 {
 public static void main(String[] args)
 {
 Encapsulate obj = new Encapsulate();
 // setting values of the variables
 obj.setName("Malik Rehan");
 obj.setAge(18);
 obj.setRoll(26);
 // Displaying values of the variables
 System.out.println("name: " + obj.getName());
 System.out.println("age: " + obj.getAge());
 System.out.println("roll: " + obj.getRoll());
 // Direct access of name is not possible due to encapsulation
 // System.out.println("Geek's roll: " + obj.name);
 }
}