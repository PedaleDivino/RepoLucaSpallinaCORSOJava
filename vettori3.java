package vettori;
import java.util.ArrayList;
import java.util.Scanner;

public class vettori3 {
    
    public static void main(String[] args){

        //ArrayList vettoreNumeri = new ArrayList<Integer>();
        ArrayList<String> vettoreStringhe = new ArrayList<String>();
        Scanner scelta = new Scanner(System.in);
        System.out.println("Array numeri o array parole? array/parole");
        String sceltaUtente = scelta.nextLine();
        if (sceltaUtente.equals("parole")){
            System.out.println("quante volte vuoi inserire? ");
            Integer ripetitoreS = scelta.nextInt();
            Integer contatoreS = 0;
            while (contatoreS < ripetitoreS){
                System.out.println("inserisci una parola...");
                System.out.println("");

                Scanner parolaOBJ = new Scanner(System.in);
                String parola = parolaOBJ.nextLine();

                vettoreStringhe.add(parola);
                contatoreS++;
            }

        }
        else if(sceltaUtente.equals("numeri")){
            System.out.println("quante volte vuoi inserire? ");
            Integer ripetitoreN = scelta.nextInt();
            Integer contatoreN = 0;
            while (contatoreN < ripetitoreN){
                System.out.println("inserisci un numero...");
                System.out.println("");

                Scanner numeroOBJ = new Scanner(System.in);
                String numero = numeroOBJ.nextLine();

                vettoreStringhe.add(numero);
                contatoreN++;
            }
            
        }

    }

}



/* CREARE UN SISTEMA DI INSERIMENTO IN CICLO CHE RIEMPA DUE ARRAY UNO DI NUMERI E UNO DI STRINGHE
 * 
 *  
 */