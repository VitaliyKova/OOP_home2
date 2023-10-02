public class Main {
    public static void main(String[] args) {
        Actor name = new Human("Aleksandr");
        Actor name2 = new Human("Victor");

        Market market = new Market();

        market.acceptToMarket(name);
        market.takeInQueue(name);
        market.takeOrders("Пицца");

        market.acceptToMarket(name2);
        market.takeInQueue(name2);
        market.takeOrders("Бургер");

        market.update();
        market.update();
        market.update();

        market.releaseFromMarket(name);
        market.releaseFromMarket(name2);

        market.update();











    }
}
