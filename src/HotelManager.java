import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HotelManager {
    Map<Integer, Hotel> listClients = new TreeMap<>();

    public void addNewClient(Hotel hotel) {
        int key = hotel.getClientID();
        listClients.put(key, hotel);
    }

    public void displayAll() {
        System.out.println(listClients);
    }

    public void countBillByPersonID(int clientID) {
        Set<Integer> listClientID = listClients.keySet();
        for (int id : listClientID
        ) {
            Hotel hotel = listClients.get(id);
            if (hotel.getClientID() == clientID) {
                int totalMoney = hotel.getTotalMoney();
                String nameOfClient = hotel.getClient().getName();
                System.out.println("Bill of client " + nameOfClient + " =" + totalMoney);
            }
        }
    }
}
