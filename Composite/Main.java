public class Main {
    public static void main(String[] args) {
        Soldier warrior = new Soldier();
        Soldier warrior2 = new Soldier();
        Squad army = new Squad();
        army.add(warrior);
        army.add(warrior2);
        army.move();  // This will move the entire group
    }
}
