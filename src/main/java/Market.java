import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Market implements QueueBehaviour, MarketBehaviour{
    Queue orders = new LinkedList();
    Queue que = new LinkedList();

    List toMarket = new ArrayList<>();



    @Override
    public void takeInQueue(Actor actor) {
        que.add(actor);
    }

    @Override
    public void takeOrders(String order) {
        orders.add(order);
    }

    @Override
    public void giveOrders() {
        orders.remove();
    }

    @Override
    public void releaseFromQueue() {
        que.remove();
    }

    @Override
    public void acceptToMarket(Actor actor) {
        toMarket.add(actor);
    }

    @Override
    public void releaseFromMarket(Actor actor) {
        toMarket.remove(actor);
    }

    @Override
    public void update() {
        if(!orders.isEmpty()){
            System.out.println("Заказ " + orders.element() + " для " + que.element() + " Обработан");
            giveOrders();
            releaseFromQueue();
            System.out.println("Всего заказов осталось -> " + que.size());
            System.out.println("Всего людей в магазине -> " + toMarket.size());
            System.out.println("-".repeat(30));

        }
        else {
            System.out.println("Заказов нет!");
            System.out.println("Всего людей в магазине -> " + toMarket.size());
            System.out.println();
        }


    }
}
