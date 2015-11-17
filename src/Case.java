/**
 * Created by Alexandre LAMOOT on 13/11/15.
 */
public class Case {
    private int ligne;
    private String column;
    private String data;

    public Case() {
        this.ligne = 0;
        this.column = "";
        this.data = "";
    }
    public Case(int ligne, String column, String data) {
        this.ligne = ligne;
        this.column = column;
        this.data = data;
    }

    public String toString(){
        return "ligne : "+this.ligne+" colonne: "+this.column+" data: "+this.data+"";
    }
    public int getLigne() {
        return ligne;
    }

    public void setLigne(int ligne) {
        this.ligne = ligne;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
