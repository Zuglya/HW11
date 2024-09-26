public class Phone {
    static String countryPhone;
    long numberPhone;
    String modelPhone;
    double weightPhone;

    public Phone() {}

    public Phone (long numberPhone, String modelPhone, double weightPhone) {
        this.numberPhone = numberPhone;
        this.modelPhone = modelPhone;
        this.weightPhone = weightPhone;
    }



    public void receiveCall(String nameCaller){
        receiveCall(nameCaller, 0);
    }

    public void receiveCall(String nameCaller, long numberCaller) {
        System.out.println("Звонит абонент по имени " + nameCaller + (numberCaller == 0 ? " номер не определён" : " номер " + numberCaller));
    }
}
