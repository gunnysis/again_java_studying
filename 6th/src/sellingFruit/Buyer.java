package sellingFruit;

public class Buyer {
    int budget;

    Buyer(int budget) {
        this.budget = budget;
    }

    // seller에게 사고 싶은 사과 개수와 바나나 개수를 전달하면 seller에게 사고 싶은 것들의 구매 금액을 전달 받고 그 금액을 giveMoney 메소드를 통해서 seller에게 전달한다.
    public void order(Seller seller, int appleCount, int bananaCount) {
            int purchaseAmount = seller.sell(appleCount, bananaCount);
            if (budget >= purchaseAmount) {
                giveMoney(seller, purchaseAmount);
            } else {
                System.out.println("보유 금액이 부족합니다.");
            }

    }

    public void giveMoney(Seller seller, int total) {
        seller.takeMoney(total);
        budget -= total;
    }
}
