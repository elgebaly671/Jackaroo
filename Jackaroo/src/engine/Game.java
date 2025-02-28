package engine;

import model.player.Player;
import model.card.Card;
import model.card.Deck;
import engine.board.Board;
import engine.board.BoardManager;
import model.Colour;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Game implements GameManager {
	private final Board board;
	private final ArrayList<Player> players;
	private final ArrayList<Card> firePit;
	private int currentPlayerIndex;
    private int turn;

public Game(String playerName) throws IOException {
//shuffle
	Colour[] colours = {Colour.RED, Colour.GREEN, Colour.BLUE, Colour.YELLOW};-
	for (int i = 0; i < colours.length; i++) {
        int randomIndex = (int) (Math.random() * colours.length);
        Colour temp = colours[i];
        colours[i] = colours[randomIndex];
        colours[randomIndex] = temp;
    }
//initialising board
	this.board = new Board(new ArrayList<>(ArrayList(colours)), this);

//loadong card pool
    Deck.loadCardPool(board, this);

//initialize players
    this.players = new ArrayList<>();
    players.add(new Player(playerName, colourOrder.get(0)));
//initialise cpu
    for (int i = 1; i < colourOrder.size(); i++) {
        players.add(new CPU("CPU " + i, colourOrder.get(i), board));
    }

//dealing the cards
    for (int j = 0; j < 4; j++) {
        for (int i = 0; i < players.size(); i++) {
            Card drawnCard = Deck.drawCards().get(0);
            players.get(i).getHand().add(drawnCard);
        }
    }

//setting up game
    this.firePit = new ArrayList<>();
    this.currentPlayerIndex = 0;
    this.turn = 0;
}
}