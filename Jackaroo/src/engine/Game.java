package engine;

import model.player.Player;
import model.player.CPU;
import model.card.Card;
import model.card.Deck;
import model.Colour;
import engine.board.Board;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Game implements GameManager {
    
    private final Board board;
    private final ArrayList<Player> players;
    private final ArrayList<Card> firePit;
    private int currentPlayerIndex;
    private int turn;

    public Game(String playerName) throws IOException {
        //shuffle
        Colour[] colours = {Colour.RED, Colour.GREEN, Colour.BLUE, Colour.YELLOW};
        for (int i = 0; i < colours.length; i++) {
            int randomIndex = (int) (Math.random() * colours.length);
            Colour temp = colours[i];
            colours[i] = colours[randomIndex];
            colours[randomIndex] = temp;
        }

        //initialize board
        this.board = new Board(new ArrayList<>(Arrays.asList(colours)), this);
// initialise cardpool
        Deck.loadCardPool(board, this);

        //initialise players
        this.players = new ArrayList<>();
        players.add(new Player(playerName, colours[0])); // Human player gets first colour

        for (int i = 1; i < colours.length; i++) {
            players.add(new CPU("CPU " + i, colours[i], board)); // CPU players get the rest
        }

        // Step 6: Manually Deal 4 Cards to Each Player (One by One)
        for (int j = 0; j < 4; j++) { // Each player gets 4 cards
            for (int i = 0; i < players.size(); i++) { // Loop through each player
                Card drawnCard = Deck.drawCards().get(0); // Draw one card at a time
                players.get(i).getHand().add(drawnCard); // Add card to player's hand
            }
        }

        // Step 7: Initialize Other Attributes
        this.firePit = new ArrayList<>();
        this.currentPlayerIndex = 0;
        this.turn = 0;
    }
}
