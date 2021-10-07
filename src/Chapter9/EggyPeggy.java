package Chapter9;

public class EggyPeggy {
    public static void main(String[] args) {
        String string = "I Love Java";
        String newString = "";
        for (int i = 0; i < string.length(); i++) {
            char letter = string.charAt(i);
            if (letter == 'a' || letter == 'A' ||
                    letter == 'e' || letter == 'E' ||
                    letter == 'i' || letter == 'I' ||
                    letter == 'o' || letter == 'O' ||
                    letter == 'u' || letter == 'U') {
                newString += "egg" + letter;
            } else {
                newString += letter;
            }
        }
        System.out.println(newString);
    }
}
