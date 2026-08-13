package day10;
class CreditCard{
    private long cardNo;
    private int cvv;
    private String cardholder;
    private int cardPin;
    private int cardLimit;
    public void  setCardPin(int cardPin){this.cardPin=cardPin;}
    public int getCardPin(){return cardPin;}
    public void setCardNo(long cardNo){this.cardNo=cardNo;}
     public void setCvv(int cvv){this.cvv=cvv;}
     public void setCardHolder(String cardholder){this.cardHolder=cardholder;}
     public void setCardLimit(int cardLimit){this.cardLimit=cardLimit;}
     public long getCardNo(){return cardNo;}
     public int getCvv(){return cvv;}
     public String getCardHolder(){return cardholder;}
    public int getCardLimit(){return cardLimit;}
}
public class Prime{
 public static void main(String[] arr){
CreditCard card1=new Cr