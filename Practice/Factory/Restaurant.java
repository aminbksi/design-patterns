package Practice.Factory;

public interface Resturant{
    public void displayMenu();
}

public class ItalianResturant implements Resturant{
    public void displayMenu(){
        System.out.println("Italian Resturant Menu");
    }
}

public class JapaneseResturant implements Resturant{
    public void displayMenu(){
        System.out.println("Chinese Resturant Menu");
    }
}

public interface ResturantFactory{
    public Resturant createResturant();
}

public class ItalianResturantFactory implements ResturantFactory{
    public Resturant createResturant(){
        return new ItalianResturant();
    }
}

public class JapaneseResturantFactory implements ResturantFactory{
    public Resturant createResturant(){
        return new JapaneseResturant();
    }
}

public class Main {
    public static void main(String[] args) {
        ResturantFactory factory = new ItalianResturantFactory();
        Resturant resturant = factory.createResturant();
        resturant.displayMenu();
    }
}