package Chapter4.L2P12;

public class Height {
    public Height() {

    }

    public Double calculateRecommendedWeight(Double height, int age) {
        return (height - 100 + age / 10) * 0.90;
    }
}