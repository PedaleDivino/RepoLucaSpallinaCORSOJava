public class mostarda7 {
    
    /**
     * @param args
     */
    public static void main(String[] args){

        int a = 3;                      // inizializzo variabili
        int b = 13;
        int c = 13;
        boolean answer = false;         // fine inizializzazione variabili


        if(a == b){                             // inizio primo if_________________________________

            System.out.println("confronto a con c if1");

            if(a == c){

                System.out.println("confronto b con c if1");

                if(b == c){

                    System.out.println("confronto b con c if1");

                }
            }
            System.out.println(answer);
            System.out.println("if2 ");
                                                // fine primo if___________________________________
        } else if (a == c){                     // inizio secondo if_______________________________

            System.out.println("confronto a con c if2");

            if(b == c){

                System.out.println("confronto b con c if2");

                if (a == b){

                    System.out.println("confronto a con b if2");

                }
                
            }
            System.out.println(answer);
            System.out.println("if2 ");         // fine secondo if________________________________
        
        } else if (b == c){                     // inzio terzo if_________________________________

            System.out.println("confronto b con c if3");

                if (a == b){

                    System.out.println("confronto a con b if3");

                    if (a == c){

                        System.out.println("confronto a con c if3");

                    }

                }
                System.out.println(!answer);

        }                                       // fine terzo if___________________________________


    }

}
