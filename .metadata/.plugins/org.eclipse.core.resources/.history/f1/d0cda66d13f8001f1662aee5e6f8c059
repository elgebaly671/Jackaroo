package engine.board;
import model.player.Marble;

public class Cell{
    private Marble marble;
    private CellType celltype;
    private boolean trap;

    public Cell(CellType celltype)
    {
        this.celltype=celltype;
        marble=null;
        trap= false;}

    public Marble getMarble()
    {return this.marble;}
   
    public CellType getCellType()
    {return this.celltype;}
    
    public boolean getTrap()
    {return this.trap;}

    public void setMarble(Marble marble)
    {this.marble=marble;}

    public void setCellType(CellType celltype)
    {this.celltype=celltype;}

    public void setTrap(boolean trap)
    {this.trap=trap;}

    public String toString()
    {
        return "Cell{" +
                "marble=" + marble +
                ", celltype=" + celltype +
                ", trap=" + trap +
                '}';
    }
}
