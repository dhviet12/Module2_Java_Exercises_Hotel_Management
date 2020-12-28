import java.util.Scanner;

public class Main {
    static HotelManager manager = new HotelManager();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("MENU");
            System.out.println("1.Add client");
            System.out.println("2.Show list client");
            System.out.println("3.Count bill");
            System.out.println("0.Exit");
            System.out.println("Enter your choice:");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Enter number of client you want to add");
                    int number = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < number; i++) {
                        addNewClient();
                    }
                    break;
                case 2:
                    manager.displayAll();
                    break;
                case 3:
                    System.out.println("Enter client ID");
                    int clientID = Integer.parseInt(scanner.nextLine());
                    manager.countBillByPersonID(clientID);
                    break;
                case 0:
                    System.exit(0);
            }
        }while (choice != 0);

    }
    public static void addNewClient(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter name of client");
        String name = scanner.nextLine();
        System.out.println("Enter peopleID");
        int peopleID = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter client's birthday");
        String birthday = scanner.nextLine();
        System.out.println("Enter numbers of day renting");
        int rentDays = Integer.parseInt(scanner.nextLine());
        String kindOfRoom;
        do{
            System.out.println("Enter kind of room small/normal/luxury");
            kindOfRoom = scanner.nextLine();
        } while (!validKindRoom(kindOfRoom));
        Person client = new Person(peopleID,name,birthday);
        Hotel hotel = new Hotel(rentDays,kindOfRoom,client);
        manager.addNewClient(hotel);
        System.err.println("Successfully added");
    }
    public static boolean validKindRoom(String kindOfRoom){
        boolean validKind= false;
        switch (kindOfRoom){
            case "small":
            case "normal":
            case "luxury":
                validKind = true;
        }
        return validKind;
    }
}
