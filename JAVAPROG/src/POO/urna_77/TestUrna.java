
package POO.urna_77;


public class TestUrna {
/*A continuación, hay que crear el archivo TestUrna.java e implementar el test de la
siguiente forma:
• Debe crear una urna con un número de bolas blancas y negras aleatorias (entre 1
y 10).
• Mientras quede más de una bola en la urna, se sacan dos bolas:
◦ Si ambas son del mismo color, se mete una bola blanca en la urna.
◦ Si son de diferente color, metemos una bola negra.
• Por último, cuando quede una sola bola, se saca y se indica su color,
Hay que analizar si, partiendo del número de bolas iniciales, la última bola que indica el
test es correcta. Para ello recomiendo implementar un modo verbose, es decir, un modo
que vaya indicando qué va pasando*/
    
    public static void main(String[] args) {
        
        //crear la urna es crear el objeto con numeros de bolas aleatoruias entre 1 y 10
        
        int max = 10;
        int min = 1;
        
        int bolitasBlancas_aleatorias = (int)(Math.random() * (max - min + 1) + min);
        int bolitasNegras_aleatorias = (int)(Math.random() * (max - min + 1) + min);     
        char ultimaBola = 'b';
        Urna bolitas = new Urna(bolitasBlancas_aleatorias,bolitasNegras_aleatorias);
        int totalBolas = bolitas.getBolas_blancas() + bolitas.getBolas_negras();
        
        //mientras que el contenido de la urna sea mayor que 1 
        while(totalBolas > 1){
            //se extrae una bola negra o blanca depende de el metodo
            char bola1 = bolitas.extraerBolas();
            System.out.println(bolitas.toString());//muestro las bolas que hay en la urna cuantas blancas y cuantas negras
            System.out.println("Se a extraido una bola " + bola1);
            totalBolas = bolitas.getBolas_blancas() + bolitas.getBolas_negras();//sumo las bolsa que quedan en sla urna despues de extraer la bola1
            
            //si el total es igual que 1 retiro la ultima bola que quede en la urna
            if (totalBolas == 1){
                ultimaBola = bolitas.extraerBolas();
                System.out.println(bolitas.toString());//lo muestro
                System.out.println("Se a extraido una bola " + ultimaBola);
                //si el total de bolas es menor que 1
            }else{
                //extraigo una bola, sumo las que queden y muesatro cuantas bolas quedan en la urna
                char bola2 = bolitas.extraerBolas();
                totalBolas = bolitas.getBolas_blancas() + bolitas.getBolas_negras();
                System.out.println("Se a extraido una bola " + bola2);
                   //si el total es igual que 1 retiro la ultima bola que quede en la urna
                if (totalBolas == 1){
                    ultimaBola = bolitas.extraerBolas();
                    System.out.println("Se a extraido una bola " + ultimaBola);                
                }else{
                    //comparo que las bolas sean del mismo color si lo son introduzco una bola blanca y lo muestro
                    if(bola1 == bola2){
                        bolitas.introducirBolaBlanca();
                        System.out.println( "Se ha metido una bola BLANCA");
                       
                    }else{
                        //si no son del mismo color introduzco una bola negra y lo muestro
                        bolitas.introducirBolaNegra();
                        System.out.println("Se ha metido una bola NEGRA");
                    }    
                }
                
            }
            
            //muestro el total de bolas con el get ya que son privadas
            totalBolas = bolitas.getBolas_blancas() + bolitas.getBolas_negras();
            
        }
        
    }   
}
