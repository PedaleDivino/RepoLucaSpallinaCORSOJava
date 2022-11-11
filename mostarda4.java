public class mostarda4 {
    public static void main(String[] args){

        int carattere = 'b';                       // inizializzo variabili
        double nVirgola = 123.34f;                  
        int intero = 1;                             // fine inizializzazione variabili

        System.out.println("le variabili sono: b" + "\n il quale n in ASCII e': " + carattere + " \n " + nVirgola + " \n " + intero );
        System.out.println();

        double somma = (carattere+nVirgola+intero)/3;   // formula
        
        
        boolean stBool = true;                      // inizializzo boolean
        boolean ndBool = false;

        if(ndBool != stBool){                       // mio metodo uffcondizione per la quale rendo ndBoo da FALSE a TRUE e stampa EVVIVA
        ndBool = true;
        System.out.println(somma + " Evviva");
        }
        else                                        // se non funziona stampa "hai sbagliato"
        System.out.println("hai sbagliato bruh ");

        /*
        System.out.println(ndBool != stBool);       // soluzione Mirko
        System.out.println(somma + " Evviva");
        */
    }


}
