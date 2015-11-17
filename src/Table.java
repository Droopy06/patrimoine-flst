import java.util.ArrayList;
import java.util.List;

/**
 * Created by LAMOOT Alexandre on 17/11/15.
 */
public class Table{

    private List<Case> mListCase;
    private List<String> mColumn;

    public Table(){
        this.mListCase = new ArrayList<>();
        this.mColumn = new ArrayList<>();
    }

    public void remplirTable(List<List<String>> result){
        this.mColumn = result.get(0);
        for(int i=1;i<result.size();i++){
            for(int j=0;j<result.get(0).size();j++){
                if(result.get(i).get(j) != ""){
                    Case maCase = new Case();
                    maCase.setLigne(i);
                    maCase.setColumn(this.mColumn.get(j));
                    maCase.setData(result.get(i).get(j));
                    this.mListCase.add(maCase);
                }
            }
        }
    }

    public Table(List<Case> mListCase, List<String> mColumn) {
        this.mListCase = mListCase;
        this.mColumn = mColumn;
    }

    public List<Case> getmListCase() {
        return mListCase;
    }

    public void setmListCase(List<Case> mListCase) {
        this.mListCase = mListCase;
    }

    public List<String> getmColumn() {
        return mColumn;
    }

    public void setmColumn(List<String> mColumn) {
        this.mColumn = mColumn;
    }
}
