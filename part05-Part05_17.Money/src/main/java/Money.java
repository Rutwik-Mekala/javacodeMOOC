
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }
    public Money plus(Money addition){
        int updatedEuros = this.euros + addition.euros;
        int updatedCents;
        if(this.cents + addition.cents>99){
            updatedEuros++;
            updatedCents = this.cents+addition.cents-100;
        }else{
            updatedCents = this.cents + addition.cents;
        }
        Money newMoney = new Money(updatedEuros,updatedCents);
        return newMoney;
    }
    public boolean lessThan(Money compared){
        if(this.euros>compared.euros){
            return false;
        }
        if(this.euros==compared.euros && this.cents>compared.cents){
            return false;
        }
        return true;
    }
    public Money minus(Money decreaser){
        int updatedEuros = this.euros-decreaser.euros;
        int updatedCents;
        if(this.cents-decreaser.cents<0){
            updatedEuros--;
            updatedCents = 100-(decreaser.cents - this.cents);
        }else{
            updatedCents = this.cents - decreaser.cents;
        }
        if(updatedEuros<0){
            updatedCents = 0;
            updatedEuros = 0;
        }
        Money newMoney = new Money(updatedEuros, updatedCents);
        return newMoney;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
