package sellingfruit;

public class Seller {
    int holdAppleQuantity;
    int holdBananaQuantity;
    int income;

    Seller(int holdAppleQuantity, int holdBananaQuantity) {
        this.holdAppleQuantity = holdAppleQuantity;
        this.holdBananaQuantity = holdBananaQuantity;
        income = 0;
    }

    // 주문 개수만큼 과일을 파는 메소드 구현
    //과일 총 판매금액 반환
    public int sell(int appleCount, int bananaCount) {
        if (holdAppleQuantity > 0 && holdBananaQuantity > 0) {
            holdAppleQuantity -= appleCount;
            holdBananaQuantity -= bananaCount;
        }else {
            System.out.println("소유하고 있는 과일 개수가 부족하여 판매중지합니다.");
            System.out.println("=====================================");
            return 0;
        }
        return  (appleCount*Apple.unitPrice)+(bananaCount*Banana.unitPrice);
    }

    public void takeMoney(int total) {
        income += total;
    }
}
