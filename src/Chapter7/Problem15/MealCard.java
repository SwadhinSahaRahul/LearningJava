package Chapter7.Problem15;

public class MealCard {
    private int noOfPoint;
    private boolean isBuySuccessful;

    public MealCard() {
        this.noOfPoint = 100;
    }

    public MealCard(int noOfPoint, boolean isBuySuccessful) {
        this.noOfPoint = noOfPoint;
        this.isBuySuccessful = isBuySuccessful;
    }

    public int getNoOfPoint() {
        return noOfPoint;
    }

    public void setNoOfPoint(int noOfPoint) {
        this.noOfPoint = noOfPoint;
    }

    public void setBuySuccessful(boolean isBuySuccessful) {
        this.isBuySuccessful = isBuySuccessful;
    }

    public void buyFood() {
        if (this.getNoOfPoint() > 0) {
            this.setBuySuccessful(true);
            this.setNoOfPoint(this.noOfPoint -= 100);
            System.out.println("Buy food successful");
        } else {
            this.setBuySuccessful(false);

            System.out.println("Not enough credit. Please recharge");
        }
    }

    public void purchasePoints(int point) {
        this.setNoOfPoint(this.noOfPoint += point);
        System.out.println("Credit successfully added");
    }
}