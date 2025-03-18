public class HouseMain {
    public static void main(String[] args) {
        House house1 = new House("Belediye Evleri mh, Çukurova");
        house1.addRoom("Living Room", 25.7);
        house1.addRoom("Bedroom", 27.9);
        house1.addRoom("Bathroom", 30.4);
        house1.addRoom("Kitchen", 25.3);

        House house2 = new House("Yüzüncüyıl mh, Çukurova");
        house2.addRoom("Living Room", 27.1);
        house2.addRoom("Bedroom", 25.2);
        house2.addRoom("Bathroom", 24.8);
        house2.addRoom("Kitchen", 25.4);



        System.out.println(house1.address);
        house1.showRooms();
        System.out.println(house2.address);
        house2.showRooms();

        house1.removeRoom("Bedroom");

        System.out.println(house1.address);
        house1.showRooms();
        System.out.println(house2.address);
        house2.showRooms();
    }
}
