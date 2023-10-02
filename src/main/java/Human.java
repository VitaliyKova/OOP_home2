public class Human extends Actor {
    public Human(String name) {
        this.name = name;

    }

    @Override
    public void setMakeOrder() {
        isMakeOrder = true;

    }

    @Override
    public void setTakeOrder() {
        isTakeOrder = true;

    }

    @Override
    public String toString() {
        return String.format(name);
    }
}
