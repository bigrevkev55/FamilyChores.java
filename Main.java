import java.util.Scanner;
import javax.swing.JOptionPane;

  
class Main {
  public static void main(String[] args) {
    String welcomeMessage = "Hello, welcome  to the Thomas Family Chores App!";
    
    String exitMessage = "Goodbye";

  JOptionPane.showMessageDialog(null, welcomeMessage);

  Scanner scanner = new Scanner(System.in);

  System.out.println("How many people are in your family: ");

  int familyMembers=scanner.nextInt();

  System.out.print("There are " + familyMembers +" family members in your family.  ");

 while(familyMembers> 0)
    {
     System.out.println("Enter the first name: ");
     String firstName=scanner.next();
     System.out.println("Enter the last name: ");
     String lastName=scanner.next();
     System.out.println("Is this person a parent (true or false): "); 
     Boolean isParent = scanner.nextBoolean();
     var familyMember = new FamilyMember(firstName, lastName, isParent);
     familyMembers --;
    }
  
  
  /*var dad = new FamilyMember(
    "Kevin", "Thomas", true);

  var mom = new FamilyMember(
    "Rose", "Thomas", true);

  var child1 = new FamilyMember(
    "Zeb", "Thomas", false);

  var child2 = new FamilyMember(
    "Zanna", "Thomas", false);

  var child3= new FamilyMember(
    "Zack", "Thomas", false); */

  System.out.println("The family has been entered into the program.");

  /* var masterBedroom = new Room(
    "Master Bedroom", true, false);

  System.out.println(masterBedroom.getRoomName());

System.out.println( masterBedroom.getIsCleaned()); */

JOptionPane.showMessageDialog(null, exitMessage);
    
  }
}