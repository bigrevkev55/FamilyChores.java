public class FamilyMember{
  private String firstName;
  private String lastName;
  private boolean isParent;
  //public static int numberOfFamilyMembers;

  //Constructor
  public FamilyMember(
    String firstName,
    String lastName,
    boolean isParent)
    {
     setFirstName(firstName);
     setLastName(lastName);
     setIsParent(isParent);
     //numberOfFamilyMembers++; 
    }

  //setters
  private void setFirstName(String firstName)
  {
     this.firstName = firstName;
  }

  private void setLastName(String lastName)
  {
     this.lastName = lastName;
  }

  private void setIsParent(boolean isParent)
  {
    this.isParent = isParent;
  }

  //getters
  public String getFirstName()
  {
    return firstName;
  }

  public String getLastName()
  {
    return lastName;
  }

  public boolean getIsParent()
  {
    return isParent;
  }

  //public functions
  public static boolean isParent(FamilyMember familyMember)
  {
    if (familyMember.getIsParent()==true)
      {
        return true;
      }
    else
      {
        return false;
      }
  }
  
}