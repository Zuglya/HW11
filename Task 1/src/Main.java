public class Main {
    public static void main(String[] args) {
        Phone phoneIvan = new Phone(89551994265L, "Nokia 3310", 150.50);
        Phone phoneRuslan = new Phone(89951986584L, "Poco X3", 200.50);
        Phone phoneJohn = new Phone();

        Phone.countryPhone = "China";

        System.out.println(phoneRuslan.modelPhone);

        phoneRuslan.receiveCall("Vasya", 8456745156L);
        phoneIvan.receiveCall("Russel");
        System.out.println(phoneRuslan.countryPhone);
    }
}
