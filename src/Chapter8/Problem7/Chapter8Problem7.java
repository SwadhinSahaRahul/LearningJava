package Chapter8.Problem7;

import java.util.Scanner;

public class Chapter8Problem7 {

    public static void main(String[] args) throws EmptyInputException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        try {
            if (name.startsWith(" ") || name.equals("")) {
                throw new EmptyInputException("Name cannot start with a space or it can't be blank :(");
            } else {
                System.out.println("Perfect !!!");
            }
        } catch (EmptyInputException e) {
            System.out.println(e.getMessage());
        }
    }
}
