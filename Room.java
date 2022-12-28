

public class Room
 {
  private String roomName;
  private boolean hasCarpet;
  private boolean isCleaned;
  

  //Constructor
  public Room(
    String roomName,
    boolean hasCarpet,
    boolean isCleaned)
    
    {
     setRoomName(roomName);
     setHasCarpet(hasCarpet);
     setIsCleaned(isCleaned);
    }

  //setters
  private void setRoomName(String roomName)
  {
     this.roomName = roomName;
  }

  private void setHasCarpet(boolean hasCarpet)
  {
     this.hasCarpet = hasCarpet;
  }

  private void setIsCleaned(boolean isCleaned)
  {
    this.isCleaned = isCleaned;
  }

  //getters
  public String getRoomName()
  {
    return roomName;
  }

  public boolean getHasCarpet()
  {
    return hasCarpet;
  }

  public boolean getIsCleaned()
  {
    return isCleaned;
  }

  //private functions
  

  //public functions
  public static boolean isCleaned(Room room)
  {
    if (room.getIsCleaned()==true)
      {
        return true;
      }
    else
      {
        return false;
      }
  }
  
}