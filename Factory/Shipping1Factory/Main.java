public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addProduct(new Product("Laptop", 2, 100));
        cart.addProduct(new Product("Phone", 1, 50));

        cart.setShippingFactory(new StandardShippingFactory());

        // Output will be based on StandardShipping calculation
        System.out.println(cart.calculateTotalShippingCost());

        cart.setShippingFactory(new ExpressShippingFactory());

        // Output will be based on ExpressShipping calculation
        System.out.println(cart.calculateTotalShippingCost());
    }
}
