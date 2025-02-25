package model.card;

import java.io.IOException;
import java.util.ArrayList;

import engine.GameManager;
import engine.board.BoardManager;

public class Deck {
    private final static String CARDS_FILE ="Cards.csv";
    private static ArrayList<Card> cardspool;


    //reads the csv file and instantiates the right card based on the code
    public static void loadCardPool(BoardManager boardManager, GameManager gameManager)
    throws IOException{}

    /*Shuffles the cardsPool, then removes and re
turns the first four cards from it*/
    public static ArrayList<Card> drawCards(){
        return cardspool;
    }

}
