import java.util.*;

public class esercizioComplesso2 {
    
    public static void main(String[] args){

        ArrayList<String> vettoreStringhe = new ArrayList<String>();        // Inizializzo vettore per STRINGHE
        ArrayList<String> vettoreNumeri = new ArrayList<String>();          // Inizializzo vettore per NUMERI
        ArrayList<String> vettoreVuoto = new ArrayList<String>();           // Inizializzo vettore per CONTROLLO r.87 per STAMPA

        boolean uscita = true;

        System.out.println("inserisci nome...");                        // inserimento nome
        Scanner nomeOBJ = new Scanner(System.in);
        String nome = nomeOBJ.nextLine();                               
        String nomeControllo = nome;                                    // fine inserimento nome
        System.out.println("inserisci password...");                    // inserimento psw
        Scanner pswOBJ = new Scanner(System.in);
        String psw = pswOBJ.nextLine();
        String pswControllo = psw;                                      // fine inserimento psw


        if (nome.equals(nomeControllo) && psw.equals(pswControllo)){    // APERTURA PRIMO IF DI CONTROLLO (RIDONDANZA) di uguaglianza per poter effettuare il controllo dopo
            
            System.out.println("conferma nome e password");
            String nomeConferma = nomeOBJ.nextLine();                       // inserimento nome per controllo
            String pswConferma = pswOBJ.nextLine();                         // inserimento psw per controllo
            while (!(nomeConferma.equals(nome) && pswConferma.equals(psw))){            // se diverso hai infiniti tentativi fino a quando non sono corretti
                for (int i = 0; i < 3; i++){
                System.out.println("nome e psw non corretti :( ");
                String nomeTentativo = nomeOBJ.nextLine();
                String pswTentativo = pswOBJ.nextLine();
                }
                System.exit(0);
                break;
            };
            

//__________________________________________________________________________________Conferma NOME e PSW con CONTROLLO + ACCESSO AL MENU___________________________________________________________________________
                                                   // CONDIZIONE IF dove si conferma NOME E PSW. 
            while (uscita = true){
                System.out.println("Benvenuto hai 4 opzioni:");
                System.out.println("1) Aggiungi ad ArrayConstringhe (  Nome casuale )");
                System.out.println("2) Aggiungi ad ArrayConNumeri  (  Nome casuale )");
                System.out.println("3) Stampa");
                System.out.println("4) Esci");

                Scanner sceltaOBJ = new Scanner(System.in);                            //  SCELTA OPERAZIONE
                String sceltaNumero = sceltaOBJ.nextLine();
                String uno = ("1");
                String due = ("2");
                String tre = ("3");
                String quattro = ("4");

                if (sceltaNumero.equals(uno)){                                            // IF AGGIUNGI ARRAY DI STRINGHE
                        //ArrayList<String> vettoreStringhe = new ArrayList<String>();
                        System.out.println("quante parole vuoi inserire? ");
                        Integer ripetitoreS = sceltaOBJ.nextInt();
                        Integer contatoreS = 0;
                        while (contatoreS < ripetitoreS){
                            System.out.println("");
                            System.out.println("inserisci una parola...");
                            System.out.println("");

                        Scanner parolaOBJ = new Scanner(System.in);
                        String parola = parolaOBJ.nextLine();

                        vettoreStringhe.add(parola);
                        contatoreS++;
                        }
                        
                        uscita = false;
                        
                }                                                               // CHIUSURA IF "ARRAY DI STRINGHE"

//________________________________________________________________________________________________________________________________________________________________________________________________________________

                else if (sceltaNumero.equals(due)){        
                        //ArrayList<String> vettoreNumeri = new ArrayList<String>();                               // IF AGGIUNGI "ARRAY DI NUMERI"
                        System.out.println("quante volte vuoi inserire? ");
                        Integer ripetitoreN = sceltaOBJ.nextInt();
                        Integer contatoreN = 0;
                        while (contatoreN < ripetitoreN){
                            System.out.println("inserisci un numero...");
                            System.out.println("");
    
                        Scanner numeroOBJ = new Scanner(System.in);
                        String numero = numeroOBJ.nextLine();
    
                        vettoreNumeri.add(numero);
                        contatoreN++;
                    }

                        uscita = false;
                }                                                                   // CHIUSURA IF "ARRAY DI NUMERI"

//________________________________________________________________________________________________________________________________________________________________________________________________________________


                else if (sceltaNumero.equals(tre)){                                       // IF "STAMPA"

                    System.out.println("quale vettore vuoi stampare bro? ");
                    System.out.println("1) parole");
                    System.out.println("2) numeri");
                    String sceltaStampa = sceltaOBJ.nextLine();

                    if (vettoreNumeri.equals(vettoreVuoto) && vettoreStringhe.equals(vettoreVuoto)) {         // CONTROLLO VETTORI SE VUOTI ESCE (UTENTE RITENTA APRENDO IL PROGRAMMA)
                        System.out.println("non hai inizializzato gli Array. :(");
                        System.exit(0);
                    }
                    else if (sceltaStampa.equals("1") && vettoreStringhe != vettoreVuoto){          // SE SCRVIAMO "1" E LA STRINGA NON è VUOTA (CONFRONTO CON STRINGA VUOTA)
                        System.out.println("");
                        System.out.println(vettoreStringhe);                                        // PRINTA IL VETTORE

                    } else if (sceltaStampa.equals("2") && vettoreNumeri != vettoreVuoto){          // SE SCRVIAMO "1" E LA STRINGA NON è VUOTA (CONFRONTO CON STRINGA VUOTA)
                        System.out.println("");
                        System.out.println(vettoreNumeri);                                          // PRINTA IL VETTORE

                    }

                        uscita = !true;
                }                                                                   // CHIUSURA IF "STAMPA"

//________________________________________________________________________________________________________________________________________________________________________________________________________________


                else if (sceltaNumero.equals(quattro)){                                       // IF ESCI
                    

                    if (vettoreNumeri.equals(vettoreVuoto) && vettoreStringhe.equals(vettoreVuoto)) {         // CONTROLLO VETTORI SE VUOTI ESCE (UTENTE RITENTA APRENDO IL PROGRAMMA)
                        System.out.println("non hai inizializzato gli Array. :(");
                        System.exit(0);
                    }
                    else if (vettoreStringhe != vettoreVuoto){          // SE SCRVIAMO "1" E LA STRINGA NON è VUOTA (CONFRONTO CON STRINGA VUOTA)

                    //Array.get(Object []array, int index)
                        for (int iteratore = 0; iteratore < vettoreStringhe.size(); iteratore++){
                            System.out.println(vettoreStringhe.get(iteratore));
                            System.out.println("");
                            System.out.println("continuare? Y/N");
                            Scanner sceltaynOBJ = new Scanner(System.in);
                            String sceltayn = sceltaOBJ.nextLine();
                            
                            if (sceltayn.equals("y")){
                                String pswCC = ("");
                                do{
                                System.out.println("inserisci password: ");
                                Scanner pswCCOBJ = new Scanner(System.in);

                                pswCC = pswCCOBJ.nextLine();         
                                System.out.println("");

                                } while(!(pswCC.equals(pswControllo)));
                                    
                            }
                            else if (sceltayn.equals("n")){
                                break;
                            }
                        }
                                                                // PRINTA IL VETTORE

                    } else if (vettoreNumeri != vettoreVuoto){          // SE SCRVIAMO "1" E LA STRINGA NON è VUOTA (CONFRONTO CON STRINGA VUOTA)
                        System.out.println("");
                        System.out.println(vettoreNumeri);                                          // PRINTA IL VETTORE

                    }
                
                    System.exit(0);
                }                                                                   // CHIUSURA IF "ESCI"

//________________________________________________________________________________________________________________________________________________________________________________________________________________                
            }           // CHIUSURA WHILE DEL MEMU

            } else {                                                    // ELSE DEL PRIMO IF DI CONTROLLO DI RIDONDANZA, SE TUTTO ERRATO PRINTA OK.
                System.out.println("ok");
            }
            

        }

}


/*

Creiamo un sistema che ti permetta di inserire username e password

Solo dopo questo inserimento il sistema deve proseguire e chiederti di confermare entrambi gli elementi

Dopo averli confermati potremmo accedere a Quattro opzioni

Aggiungi ad ArrayConstringhe (  Nome casuale )

Aggiungi ad ArrayConNumeri  (  Nome casuale )

Stampa
Esci

All'uscita dovrà stampare uno alla volta ogni elemento dell'array e chiederti la password per confermare le modifiche. 

Difficile:  Far anche rimuovere e modificare gli elementi. Aggiungendo al menu due sotto funzioni per ogni scelta di aggiunta possibile

*/


/*

String[] auto = {"Mazda", "Toyota", "Nissan", "Honda"};
        
        for (int i = 0; i < auto.length; i++){
            System.out.println(auto[i]);
        }

*/