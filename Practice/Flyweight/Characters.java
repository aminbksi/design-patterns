
public interface Character {
    public void display();
}

public class A implements Character {
    @Override
    public void display() {
        System.out.println("A");
    }
}

public class B implements Character {
    @Override
    public void display() {
        System.out.println("B");
    }
}

public class C implements Character {
    @Override
    public void display() {
        System.out.println("C");
    }
}

public class CharacterFactory {
    private Map<String, Character> characters = new HashMap<>();

    public Character getCharacter(String key) {
        if (characters.containsKey(key)) {
            return characters.get(key);
        } else {
            Character character = null;
            switch (key) {
                case "A":
                    character = new A();
                    break;
                case "B":
                    character = new B();
                    break;
                case "C":
                    character = new C();
                    break;
            }
            characters.put(key, character);
            return character;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        CharacterFactory characterFactory = new CharacterFactory();
        Character characterA = characterFactory.getCharacter("A");
        Character characterB = characterFactory.getCharacter("B");
        Character characterC = characterFactory.getCharacter("C");
        Character characterA2 = characterFactory.getCharacter("A");
        Character characterB2 = characterFactory.getCharacter("B");
        Character characterC2 = characterFactory.getCharacter("C");

        characterA.display();
        characterB.display();
        characterC.display();
        characterA2.display();
        characterB2.display();
        characterC2.display();
    }
}