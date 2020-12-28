public class Hotel {
    private int rentDay;
    private String kindOfRoom;
    private Person client;


    public Hotel(int rentDay, String kindOfRoom, Person client) {
        this.rentDay = rentDay;
        this.kindOfRoom = kindOfRoom;
        this.client = client;
    }

    public int getClientID() {
        return this.client.getPeopleID();
    }

    public Person getClient() {
        return client;
    }

    public int getPriceByKindOfRoom() {
        int price=0;
        switch (this.kindOfRoom) {
            case "small":
                price = 2000;
                break;
            case "normal":
                price = 3000;
                break;
            case "luxury":
                price = 5000;
                break;
        }
        return price;
    }
    public int getTotalMoney(){
        return rentDay* getPriceByKindOfRoom();
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "rentDay=" + rentDay +
                ", kindOfRoom='" + kindOfRoom + '\'' +
                ", client=" + client +
                '}'+ "\n";
    }
}
