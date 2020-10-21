package guru.springframework.springrestclientexamples.api.domain;

import java.io.Serializable;

public class Billing implements Serializable {
    private Card card;

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}
