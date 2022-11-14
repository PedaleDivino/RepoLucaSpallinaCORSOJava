import java.text.BreakIterator;
import java.util.Scanner;
public class CicliEIteratori2 {
        
        public double newX = 0;
        public double newY = 0;
        public double newZ = 0;
        public double X = 11;                                  // inizializzo variabili principali TESTO
        public double Y = 22;
        public double Z = 12.5;

    public static void main(String[] args){             // APERTURA MAIN
        

        Scanner scelta = new Scanner(System.in);        // inizializzo scanner per la scelta nel menu
        Integer sceltaMenu = scelta.nextInt();          // prende intero

        do {                                            // ciclo do per offrire scelta

            System.out.println("menu : scegli (1,2,3,4)...");
            System.out.println("1) Aggiungi");
            System.out.println("2) Sottrai");
            System.out.println("3) Stampa");
            System.out.println("4) Esci");

        } while ((sceltaMenu != 1) || (sceltaMenu != 2) || (sceltaMenu != 3) || (sceltaMenu != 4)); // ciclo while del DO, finche diverso fa il DO.

        if (sceltaMenu == 1){           // RICHIAMO METODO AGGIUNGI
            Aggiungi();
        } else if (sceltaMenu == 2){    // RICHIAMO METODO SOTTRAI
            Sottrai(); 
        } else if (sceltaMenu == 3){    
            Stampa();
        } else if (sceltaMenu == 4){
            System.out.println("ciao");
            break;
        }
    }                               // CHIUSURA MAIN

//________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________

    public void Aggiungi(){             // APERTURA METODO AGGIUNGI

        System.out.println("quale numero vuoi incrementare?");      // inizio richiesta
        System.out.println(" 1) 11");
        System.out.println(" 2) 22");
        System.out.println(" 3) 12.5");                             // fine richiesta
        Scanner sceltaAggiungi = new Scanner(System.in);            // scanner Aggiungi 
        Integer sceltaNumeroAggiungi = sceltaAggiungi.nextInt();    // sceltaNumeroAggiungi oggetto di tipo scanner prende INTERI per la scelta del menu successivo

        while(sceltaNumeroAggiungi == 1 || sceltaNumeroAggiungi == 2 || sceltaNumeroAggiungi == 3){


            if (sceltaNumeroAggiungi == 1){                             // INZIO IF scelta per '11'
                System.out.println("hai scelto 11");
                System.out.println("di quanto lo vuoi incrementare? ");
                int i1 = 0;                                                         // creo variabile i1 = 0 per poi avere QUANTO INCREMENTARE
                Scanner sceltaIncremento = new Scanner(System.in);                  // Prende da INPUT quanto INCREMENTARE
                i1 = sceltaIncremento.nextInt();                                    // ...
                while (X <= i1){                                                    // FINCHE X è minore di QUANTO INCREMENTARE, INCREMENTA DIAMINE
                    X++;
                    newX = X;                                               // Quando tutto incrementato passo a newX il valore INCREMENTATO.
                }                                                       // chiusura IF

            } else if (sceltaNumeroAggiungi == 2){                        // INZIO ELSE IF scelta per '22'
                System.out.println("hai scelto 22");
                System.out.println("di quanto lo vuoi incrementare? ");
                int i2 = 0;                                                         // creo variabile i2 = 0 per poi avere QUANTO INCREMENTARE
                Scanner sceltaIncremento = new Scanner(System.in);                  // Prende da INPUT quanto INCREMENTARE
                i2 = sceltaIncremento.nextInt();                                    // ...
                while (Y <= i2){                                                    // FINCHE Y è minore di QUANTO INCREMENTARE, INCREMENTA DIAMINE
                    Y++;
                    newY = Y;                                                // Quando tutto incrementato passo a newY il valore INCREMENTATO.
                }                                                       // chiusura ELSE IF
            } else if (sceltaNumeroAggiungi == 3){                        // INZIO ELSE IF scelta per '12.5'
                System.out.println("ha scelto 12.5");
                System.out.println("di quanto lo vuoi incrementare? ");
                int i3 = 0;                                                         // creo variabile i3 = 0 per poi avere QUANTO INCREMENTARE
                Scanner sceltaIncremento = new Scanner(System.in);                  // Prende da INPUT quanto INCREMENTARE
                i3 = sceltaIncremento.nextInt();                                    // ...
                while (Z <= i3){                                                    // FINCHE Z è minore di QUANTO INCREMENTARE, INCREMENTA DIAMINE
                    Z++;
                    newZ = Z;                                                // Quando tutto incrementato passo a newZ il valore INCREMENTATO.
                }                                                                   // chiusura ELSE IF
            } else{         
            
            }

        }
    }                       // CHIUSURA METODO AGGIUNGI


//________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________


    public void Sottrai(double newX, double newY, double newZ){      // APERTURA METODO SOTTRAI

        System.out.println("quale numero vuoi descrementare?");      // inizio richiesta
        System.out.println(" 1) 11");
        System.out.println(" 2) 22");
        System.out.println(" 3) 12.5");                             // fine richiesta
        Scanner sceltaSottrai = new Scanner(System.in);            // scanner Sottrai 
        Integer sceltaNumeroSottrai = sceltaSottrai.nextInt();    // sceltaNumeroSottrai oggetto di tipo scanner prende INTERI per la scelta del menu successivo

        while(sceltaNumeroSottrai == 1 || sceltaNumeroSottrai == 2 || sceltaNumeroSottrai == 3){


            if (sceltaNumeroSottrai == 1){                             // INZIO IF scelta per '11'
                System.out.println("hai scelto 11");
                System.out.println("di quanto lo vuoi incrementare? ");
                int i1 = 0;                                                         // creo variabile i1 = 0 per poi avere QUANTO DESCREMENTARE
                Scanner sceltaIncremento = new Scanner(System.in);                  // Prende da INPUT quanto DESCREMENTARE
                i1 = sceltaIncremento.nextInt();                                    // ...
                while (X > i1){                                                    // FINCHE X è minore di QUANTO DESCREMENTARE, DECREMENTA DIAMINE
                    X--;
                    newX = X;                                               // Quando tutto decrementato passo a newX il valore DECREMENTATO.
                }                                                       // chiusura IF

            } else if (sceltaNumeroSottrai == 2){                        // INZIO ELSE IF scelta per '22'
                System.out.println("hai scelto 22");
                System.out.println("di quanto lo vuoi incrementare? ");
                int i2 = 0;                                                         // creo variabile i2 = 0 per poi avere QUANTO DESCREMENTARE
                Scanner sceltaIncremento = new Scanner(System.in);                  // Prende da INPUT quanto DESCREMENTARE
                i2 = sceltaIncremento.nextInt();                                    // ...
                while (Y > i2){                                                    // FINCHE Y è minore di QUANTO DESCREMENTARE, DECREMENTA DIAMINE
                    Y--;
                    newY = Y;                                                // Quando tutto decrementato passo a newY il valore DECREMENTATO.
                }                                                       // chiusura ELSE IF
            } else if (sceltaNumeroSottrai == 3){                        // INZIO ELSE IF scelta per '12.5'
                System.out.println("ha scelto 12.5");
                System.out.println("di quanto lo vuoi incrementare? ");
                int i3 = 0;                                                         // creo variabile i3 = 0 per poi avere QUANTO DESCREMENTARE
                Scanner sceltaIncremento = new Scanner(System.in);                  // Prende da INPUT quanto DESCREMENTARE
                i3 = sceltaIncremento.nextInt();                                    // ...
                while (Z > i3){                                                    // FINCHE Z è minore di QUANTO DESCREMENTARE, DECREMENTA DIAMINE
                    Z--;
                    newZ = Z;                                                // Quando tutto decrementato passo a newZ il valore DECREMENTATO.
                }                                                                   // chiusura ELSE IF
            }

        }
    }                       // CHIUSURA METODO SOTTRAI


//________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________


    public void Stampa(double newX, double newY, double newZ){     // APERTURA METODO STAMPA

        System.out.println("quale numero vuoi stampare?");      // inizio richiesta
        System.out.println(" 1) 11");
        System.out.println(" 2) 22");
        System.out.println(" 3) 12.5");                             // fine richiesta
        Scanner sceltaStampa = new Scanner(System.in);            // scanner Aggiungi 
        Integer sceltaNumeroStampa = sceltaStampa.nextInt();    // sceltaNumeroAggiungi oggetto di tipo scanner prende INTERI per la scelta del menu successivo

        while(sceltaNumeroStampa == 1 || sceltaNumeroStampa == 2 || sceltaNumeroStampa == 3){       // APERTURA WHILE STAMPA


            if (sceltaNumeroStampa == 1){                             // INZIO IF scelta per OPZIONI '11'
                System.out.println("hai scelto 11");
                System.out.println("1) vuoi stampare 11?");
                System.out.println("2) vuoi stampare l'incremento?");
                System.out.println("3) vuoi stampare il decremento?");

                Scanner sceltaStampa1 = new Scanner(System.in);            // scanner STAMPA1
                Integer sceltaNumeroStampa1 = sceltaStampa1.nextInt();

                while(sceltaNumeroStampa1 == 1 || sceltaNumeroStampa1 == 2 || sceltaNumeroStampa1 == 3){

                    if (sceltaNumeroStampa1 == 1) {                          // APERTURA IF PER stampa 11
                        System.out.println("");
                        System.out.println(X);
                    } else if (sceltaNumeroStampa1 == 2){                            // APERTURA ELSE IF di stampa INCREMENTO 11
                        Aggiungi(newX, newZ, newZ);
                        System.out.println(newX);
                    } else if (sceltaNumeroStampa1 == 3){                        
                        Sottrai(newX, newZ, newZ);
                        System.out.println(newX); 
                    }                                                               // chiusura ELSE IF di stampa DECREMENTO 11
                }       // CHIUSURA WHILE 11
            }   // CHIUSURA IF per OPZIONI 11

                    if (sceltaNumeroStampa == 2){                             // INZIO IF scelta per OPZIONI '22'
                System.out.println("hai scelto 11");
                System.out.println("1) vuoi stampare 11?");
                System.out.println("2) vuoi stampare l'incremento?");
                System.out.println("3) vuoi stampare il decremento?");

                Scanner sceltaStampa2 = new Scanner(System.in);            // scanner STAMPA2
                Integer sceltaNumeroStampa2 = sceltaStampa2.nextInt();

                while(sceltaNumeroStampa2 == 1 || sceltaNumeroStampa2 == 2 || sceltaNumeroStampa2 == 3){

                    if (sceltaNumeroStampa2 == 1) {                                  // APERTURA IF PER stampa 22
                        System.out.println("");
                        System.out.println(Y);                                      // CHIUSURA IF PER stampa 22
                    } else if (sceltaNumeroStampa2 == 2){                            // APERTURA ELSE IF di stampa INCREMENTO 22
                        Aggiungi(newX, newZ, newZ);
                        System.out.println(newY);                                   // CHIUSURA ELSE IF di stampa INCREMENTO 22
                    } else if (sceltaNumeroStampa2 == 3){                            // APERTURA ELSE IF di stampa DECREMENTO 22
                        Sottrai(newX, newZ, newZ);
                        System.out.println(newY); 
            }                                                               // chiusura ELSE IF di stampa DECREMENTO 22

        }           // CHIUSURA WHILE 22
    }           // CHIUSURA IF per OPZIONI 22

                    if (sceltaNumeroStampa == 3){                             // INZIO IF scelta per OPZIONI '12.5'
                System.out.println("hai scelto 12.5");
                System.out.println("1) vuoi stampare 12.5?");
                System.out.println("2) vuoi stampare l'incremento?");
                System.out.println("3) vuoi stampare il decremento?");

                Scanner sceltaStampa3 = new Scanner(System.in);            // scanner STAMPA3
                Integer sceltaNumeroStampa3 = sceltaStampa3.nextInt();

                while(sceltaNumeroStampa3 == 1 || sceltaNumeroStampa3 == 2 || sceltaNumeroStampa3 == 3){

                    if (sceltaNumeroStampa3 == 1) {                          // APERTURA IF PER stampa 12.5
                        System.out.println("");
                        System.out.println(Z);
                    } else if (sceltaNumeroStampa3 == 2){                            // APERTURA ELSE IF di stampa INCREMENTO 12.5
                        Aggiungi(newX, newZ, newZ);
                        System.out.println(newZ);
                    } else if (sceltaNumeroStampa3 == 3){                        
                        Sottrai(newX, newZ, newZ);
                        System.out.println(newZ); 
                    }                                                               // chiusura ELSE IF di stampa DECREMENTO 12.5

                }   // CHIUSURA WHILE 12.5

            }       // CHIUSURA IF OPZIONI 12.5   
    
        }           // CHIUSURA WHILE STAMPA

    }               // CHIUSURA METODO STAMPA

//________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________

            
}           // CHIUSURA CLASSE
