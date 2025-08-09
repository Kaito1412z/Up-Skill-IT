public class VIPBonusDiscountPolicy implements DiscountPolicy{
    private int basePercent;
    private int bonusPercent;
    private double bonusTheshold;

    public VIPBonusDiscountPolicy(int basePercent, int bonusPercent, double bonusTheshold){
        if(basePercent < 0 || basePercent > 100){
            throw new IllegalArgumentException("Base percentage must be between 0 and 100");
        }

        this.basePercent = basePercent;
        this.bonusPercent = bonusPercent;
        this.bonusTheshold = bonusTheshold;
    }

    @Override
    public double applyDiscount(double amount){
        if(amount < 0){
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        int totalPercent = basePercent;
        if(amount > bonusTheshold){
            totalPercent = bonusPercent;
        }
        if(totalPercent > 100){
            totalPercent = 100;
        }
        return amount * (1 - totalPercent/100.0);
    }

    @Override
    public String toString(){
        return String.format("%d base + %d bonus over %.2f", basePercent, bonusPercent, bonusTheshold);
    }
}
