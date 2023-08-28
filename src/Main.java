public class Main {
    public static void main(String[] args) {
        char character = 'A';
        phoneticAlphabet(character);
        character = 'B';
        phoneticAlphabet(character);
        character = 'C';
        phoneticAlphabet(character);
        character = 'D';
        phoneticAlphabet(character);
        character = 'E';
        phoneticAlphabet(character);
        character = 'F';
        phoneticAlphabet(character);
        character = '3';
        phoneticAlphabet(character);
        character = 'a';
        phoneticAlphabet(character);
    }

    public static void phoneticAlphabet(char character){
        switch (character){
            case 'A':
                System.out.println(character + " = Able");
                break;
            case 'B':
                System.out.println(character + " = Baker");
                break;
            case 'C':
                System.out.println(character + " = Charlie");
                break;
            case 'D':
                System.out.println(character + " = Dog");
                break;
            case 'E':
                System.out.println(character + " = Easy");
                break;
            default:
                System.out.println(character + " = Not found");
                break;
        }
    }
}