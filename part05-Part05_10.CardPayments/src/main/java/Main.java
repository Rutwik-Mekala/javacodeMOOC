
public class Main {

    public static void main(String[] args) {
        // write experimental main programs here
        PaymentCard card = new PaymentCard(10);
        PaymentTerminal term = new PaymentTerminal();

        term.eatAffordably(card);
        term.eatAffordably(10);
        term.addMoneyToCard(card, 30);
        System.out.println(term);
        System.out.println(card.balance());
    }
}

