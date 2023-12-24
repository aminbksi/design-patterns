
public enum OrderState {
    NEW {
        @Override
        public OrderState next() {
            return PAYED;
        }
    },
    PAYED {
        @Override
        public OrderState next() {
            return SHIPPED;
        }
    },
    SHIPPED {
        @Override
        public OrderState next() {
            return DELIVERED;
        }
    },
    DELIVERED {
        @Override
        public OrderState next() {
            return this;
        }
    };

    public abstract OrderState next();
}

public class Order {
    private OrderState state;

    public Order() {
        state = OrderState.NEW;
    }

    public void nextState() {
        state = state.next();
    }

    public OrderState getState() {
        return state;
    }
}

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        System.out.println(order.getState());  // Output: NEW

        order.nextState();
        System.out.println(order.getState());  // Output: PAYED

        order.nextState();
        System.out.println(order.getState());  // Output: SHIPPED

        order.nextState();
        System.out.println(order.getState());  // Output: DELIVERED

    }}