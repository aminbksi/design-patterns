public class StandardShipping extends ShippingMethod {
    @Override
    public double calculateShippingCost(double weight, double distance) {
        return weight * 0.5 + distance * 0.3;
    }

    @Override
    public String getMethodName() {
        return "Standard Shipping";
    }
}
