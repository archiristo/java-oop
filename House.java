import java.util.*;

public class House {
    String address;
    ArrayList<Room> rooms;

    public House(String address) {
        this.address = address;
        rooms = new ArrayList<Room>();
    }

    public void addRoom(String name, double size){
        rooms.add(new Room(name, size));
    }

    public void removeRoom(String name){
        rooms.removeIf(r -> r.name.equals(name));
    }

    public void showRooms(){
        if(rooms.isEmpty()){
            System.out.println("No rooms found");
        }
        else{
            for(Room room : rooms){
                System.out.println(room.getName() + room.getSize() + "m2");
            }
            System.out.println();
        }
    }

}
