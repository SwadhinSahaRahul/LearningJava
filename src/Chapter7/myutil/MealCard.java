package Chapter7.myutil;


public class MealCard {

    private int noOfPoint;
    private boolean isBuySuccessfull;


    public MealCard() {
        this.noOfPoint = 100;
    }

    public MealCard(int noOfPoint, boolean isBuySuccessfull) {
        this.noOfPoint = noOfPoint;
        this.isBuySuccessfull = isBuySuccessfull;
    }

    public int getNoOfPoint() {
        return noOfPoint;
    }

    public void setNoOfPoint(int noOfPoint) {
        this.noOfPoint = noOfPoint;
    }

    public boolean isBuySuccessfull() {
        return isBuySuccessfull;
    }

    public void setBuySuccessfull(boolean isBuySuccessfull) {
        this.isBuySuccessfull = isBuySuccessfull;
    }

    public void buyFood() {
        if (this.getNoOfPoint() > 0) {
            this.setBuySuccessfull(true);
            this.setNoOfPoint(this.noOfPoint -= 100);
            System.out.println("Buy food successful");
        } else {
            this.setBuySuccessfull(false);

            System.out.println("Not enough credit. Please recharge");
        }
    }

    public void purchasePoints(int point) {
        this.setNoOfPoint(this.noOfPoint += point);
        System.out.println("Credit successfully added");
    }
}



