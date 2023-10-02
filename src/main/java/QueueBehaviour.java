import java.util.List;

public interface QueueBehaviour {
    void takeInQueue(Actor actor);
    void takeOrders(String order);
    void giveOrders();
    void releaseFromQueue();


}
