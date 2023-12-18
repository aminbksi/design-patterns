
public class ExpressShipping extends ShippingMethod {
    @Override
    public double calculateShippingCost(double weight, double distance) {
        return weight * 0.7 + distance * 0.5;
    }

    @Override
    public String getMethodName() {
        return "Express Shipping";
    }
}
