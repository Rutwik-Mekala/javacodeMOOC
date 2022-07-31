public class PaymentCard {
    private double balance;

    public PaymentCard(double initialBalance){
        this.balance = initialBalance;
    }
    public String toString(){
        return "The card has a balance of "+this.balance+" euros";
    }
    public void eatHeartily(){
        if(this.balance>=4.60){
        this.balance = this.balance - 4.60;
    }
    }
    public void eatAffordably(){
        if(this.balance>=2.60){
        this.balance = this.balance - 2.60;
    }
    }
    public void addMoney(double amount){
        if(this.balance+amount<=150&& amount>0){
        this.balance = this.balance + amount;
        } else if(this.balance+amount>150){
            this.balance = 150;
        }
    }


}
