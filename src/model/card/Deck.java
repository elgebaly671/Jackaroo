package model.card;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import engine.GameManager;
import engine.board.BoardManager;
import model.card.standard.Standard;

public class Deck {
    private final static String CARDS_FILE ="Cards.csv";
    private static ArrayList<Card> cardspool;


    //reads the csv file and instantiates the right card based on the code
    public static void loadCardPool()
    throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(CARDS_FILE));
        String line = "";

        while((line = reader.readLine()) != null){
            String[] row = line.split(",");
            
                switch (row[0]) {
                    
                    case "0":
                        //Standard standard = new Standard(row[2], row[3],rank,)
                        System.out.println("Standard card of value " + row[4]);
                        break;
                    case "1":
                        System.out.println("Ace");
                        break;
                    case "13":
                        System.out.println("King");
                        break;
                    case "12":
                        System.out.println("Queen");
                        break;
                    case "11":
                        System.out.println("Jack");
                        break;
                    case "4":
                        System.out.println("Four");
                    case"5":
                        System.out.println("Five");
                        break;
                    case "7":
                        System.out.println("Seven");
                        break;
                    case "10":
                        System.out.println("Ten");
                        break;
                    case "14":
                        System.out.println("Burner");
                        break;
                    case "15":
                        System.out.println("Saver");
                    default:
                        break;
                }
            
        }
        reader.close();
    } 

    /*Shuffles the cardsPool, then removes and re
turns the first four cards from it*/
    public static ArrayList<Card> drawCards(){
        return cardspool;
    }
    public static void main(String[] args) throws IOException{
        loadCardPool();
    }
}
