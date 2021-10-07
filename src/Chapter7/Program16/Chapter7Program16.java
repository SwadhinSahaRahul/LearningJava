package Chapter7.Program16;

import Chapter7.myutil.MealCard;

public class Chapter7Program16 {

    public static void main(String[] args) {

        MealCard mc1 = new MealCard();
        MealCard mc2 = new MealCard();
        MealCard mc3 = new MealCard();

        System.out.println("Meal Card 1 point is: " + mc1.getNoOfPoint());
        System.out.println("Meal Card 2 point is: " + mc2.getNoOfPoint());
        System.out.println("Meal Card 3 point is: " + mc3.getNoOfPoint());

        mc1.buyFood();

        mc2.purchasePoints(200);
        mc2.buyFood();

        mc3.purchasePoints(500);

        System.out.println("Meal Card 1 point is: " + mc1.getNoOfPoint());
        System.out.println("Meal Card 2 point is: " + mc2.getNoOfPoint());
        System.out.println("Meal Card 3 point is: " + mc3.getNoOfPoint());
    }
}

