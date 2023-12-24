

public interface OrderState {
    OrderState next();
}

public class NewState implements OrderState {
    @Override
    public OrderState next() {
        return new PaidState();
    }

    @Override
    public String toString() {
        return "NEW";
    }
}

public class PaidState implements OrderState {
    @Override
    public OrderState next() {
        return new ShippedState();
    }

    @Override
    public String toString() {
        return "PAID";
    }
}

public class ShippedState implements OrderState {
    @Override
    public OrderState next() {
        return new DeliveredState();
    }

    @Override
    public String toString() {
        return "SHIPPED";
    }
}

public class DeliveredState implements OrderState {
    @Override
    public OrderState next() {
        return this;
    }

    @Override
    public String toString() {
        return "DELIVERED";
    }
}

public class Order {
    private OrderState state;

    public Order(){
        state = new NewState();
    }

    public void nextState(){
        state = state.next();
    }

    public OrderState getState(){
        return state;
    }
}

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        System.out.println(order.getState());  

        order.nextState();
        System.out.println(order.getState());  

        order.nextState();
        System.out.println(order.getState());  

        order.nextState();
        System.out.println(order.getState());  
    }
}