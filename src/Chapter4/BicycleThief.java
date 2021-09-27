package Chapter4;

import Chapter4.Classes.Bicycle;

class BicycleThief {
    public static void main(String[] args) {
        Bicycle bicycle1, bicycle2;
        bicycle1 = new Bicycle();
        bicycle2 = new Bicycle();

        bicycle1.setModel("Model 1");

        System.out.println(bicycle1.getModel());
        System.out.println(bicycle2.getModel());
    }
}
