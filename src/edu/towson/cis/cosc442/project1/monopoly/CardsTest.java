package edu.towson.cis.cosc442.project1.monopoly;

import junit.framework.TestCase;

public class CardsTest extends TestCase {
    Card ccCard, chanceCard;
    
    GameMaster gameMaster;

    /**
     * Initializes the game environment and creates sample Community Chest and Chance cards for testing.
     */
    /**
     * Initializes the game environment and creates sample Community Chest and Chance cards for testing.
     */
    protected void setUp() {
        gameMaster = GameMaster.instance();
        gameMaster.setGameBoard(new GameBoardCCGainMoney());
        gameMaster.setNumberOfPlayers(1);
        gameMaster.reset();
        gameMaster.setGUI(new MockGUI());
        ccCard = new MoneyCard("Get 50 dollars", 50, Card.TYPE_CC);
        chanceCard = new MoneyCard("Lose 50 dollars", -50, Card.TYPE_CHANCE);
        gameMaster.getGameBoard().addCard(ccCard);
    }
    
    /**
     * Tests that the Community Chest and Chance cards have the correct card types assigned.
     */
    /**
     * Tests that the Community Chest and Chance cards have the correct card types assigned.
     */
    public void testCardType() {
        gameMaster.drawCCCard();
        assertEquals(Card.TYPE_CC, ccCard.getCardType());
        gameMaster.drawChanceCard();
        assertEquals(Card.TYPE_CHANCE, chanceCard.getCardType());
    }
}
