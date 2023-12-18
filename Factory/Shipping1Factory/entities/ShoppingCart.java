import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> products;
    private ShippingMethodFactory shippingFactory;

    public ShoppingCart() {
        this.products = new ArrayList<>();
        this.shippingFactory = null;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void setShippingFactory(ShippingMethodFactory factory) {
        this.shippingFactory = factory;
    }

    public double calculateTotalShippingCost() {
        if (this.shippingFactory == null) {
            throw new IllegalStateException("Shipping factory not set!");
        }

        double totalWeight = this.products.stream().mapToDouble(Product::getWeight).sum();
        double totalDistance = this.products.stream().mapToDouble(Product::getDistance).sum();

        ShippingMethod shippingMethod = this.shippingFactory.createShippingMethod();
        return shippingMethod.calculateShippingCost(totalWeight, totalDistance);
    }
}
