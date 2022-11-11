import java.util.*;     //importazione libreria java.util

public class mostarda6 {

    public static void main(String[] args){

        Scanner ilMioOggetto = new Scanner(System.in);      //creazione oggetto ilMioOggetto di tipo Scanner (classe)
        System.out.println("metti il tuo nome: ");
        String name = ilMioOggetto.nextLine();              // prende il valore di tipo STRINGA e lo mette nell'oggetto "ilMioOggetto"
        System.out.println();
        System.out.println("il tuo nome e' " + name);

    }
    
}
