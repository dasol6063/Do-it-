package mogakso;

public class mogakso_week2 {
    public static void main(String[] args){

        long money=150000L;
        float discountRate=0.15f;

        float discountedPrice=money*(1-discountRate);

        String result=(money>=100000&&discountRate>0)
                ? "할인 적용! 결제 금액:" + discountedPrice
                : "할인 불가";

        System.out.println(result);
    }
}
