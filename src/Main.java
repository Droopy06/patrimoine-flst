import javafx.scene.control.Tab;

import java.io.Console;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        List<List<String>> collection = new ArrayList<List<String>>();
        ArrayList<String> l=new ArrayList<>();
        l.add("nom");
        l.add("age");
        l.add("localité");
        collection.add(0, l);
        ArrayList<String> l1=new ArrayList<>();
        l1.add("loup");
        l1.add("5");
        l1.add("France");
        collection.add(1,l1);
        ArrayList<String> l2=new ArrayList<>();
        l2.add("chat");
        l2.add("10");
        l2.add("Angleterre");
        collection.add(2,l2);
        ArrayList<String> l3=new ArrayList<>();
        l3.add("");
        l3.add("15");
        l3.add("");
        collection.add(3, l3);
        String continu = "";
        Console br = System.console();
        Scanner sc = new Scanner(System.in);
        Table maTable = new Table();
        maTable.remplirTable(collection);
        while (!Objects.equals(continu, "n")) {
            System.out.println("Appuyez sur:\n 1 pour rechercher une ligne et 2 pour rechercher une case.");
            String choix = sc.nextLine();
            switch (choix){
                case "1":
                    try {
                        System.out.println("Entrez un numéro de ligne.");
                        int ligne = Integer.parseInt(sc.nextLine());
                        long debut = System.currentTimeMillis();
                        System.out.println(rechercherLigne(ligne,maTable).toString());
                        System.out.println(System.currentTimeMillis()-debut+" ms");
                    }catch (Exception ex){
                        ex.getMessage();
                    }
                    break;
                case "2":
                    try {
                        System.out.println("Entrez un numéro de ligne.");
                        int ligne = Integer.parseInt(sc.nextLine());
                        System.out.println("Entrez un nom de colonne.");
                        String column = sc.nextLine();
                        long debut = System.currentTimeMillis();
                        System.out.println(rechercheCase(ligne, column, maTable).toString());
                        System.out.println(System.currentTimeMillis()-debut+" ms");
                    }catch (Exception ex){
                        ex.getMessage();
                    }
                    break;
                default:
                    System.out.println("Aucun choix possible.");
            }
            System.out.println("Appuyez sur n pour arrêter.");
            continu = sc.nextLine();
        }
    }

    public static List<Case> rechercherLigne(int idLigneCherche,Table table){
        List<Case> ligne = new ArrayList<>();
        List<Case> tableTableau = table.getmListCase();
        for(Case caseCourante : tableTableau){
            if(caseCourante.getLigne() == idLigneCherche)
                ligne.add(caseCourante);
        }
        return  ligne;
    }

    public static Case rechercheCase(int idLigneCherche,String columnCherche,Table table){
        Case maCase = new Case();
        List<Case> tableTableau = table.getmListCase();
        for(Case caseCourante : tableTableau){
            if(caseCourante.getLigne() == idLigneCherche && Objects.equals(caseCourante.getColumn(), columnCherche))
                maCase = caseCourante;
        }
        return maCase;
    }
}
