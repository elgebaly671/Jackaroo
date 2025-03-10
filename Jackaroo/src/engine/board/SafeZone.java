package engine.board;
import model.Colour;
import java.util.ArrayList;

public class SafeZone {
private final Colour colour;
private final ArrayList<Cell> Safe;
	
	public 	SafeZone(Colour colour){
		this.colour=colour;
        Safe=new ArrayList<Cell>(4);
		for(int i=0;i<4;i++)
			{Safe.add(new Cell(CellType.SAFE));}
	}
	
public Colour getColour() {
    return colour;}

public void getCells() {
    for(int i=0;i<4;i++)
    {System.out.println(Safe.get(i));}
}
public String toString() {
	return "SafeZone{" +
			"colour=" + colour +
			", Safe=" + Safe +
			'}';}	
}
