package Data;
import Data.Card.Card;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class Player {
    private List<Card> table;
    private List<Card> hand;
    private int mc;
    private int heat;
    private int plant;
    private int acier;
    private int titane;
    private int  prod_mc;
    private int prod_card;
    private int prod_heat;
    private int prod_plant;
}
