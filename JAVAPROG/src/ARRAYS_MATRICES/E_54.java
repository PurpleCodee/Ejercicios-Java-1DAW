
package ARRAYS_MATRICES;
/*54.- Haz un programa que dado el array valores que posee los números
            2,4,6,8,1,3,5,7 genere otro array con los mismos valores pero con el valor 200 en
            la posición 4 y el valor 300 en la posición 7 (y el resto de valores afectados desplazados
            una posición).
Valores: 2 4 6 8 1 3 5 7
Otra: 2 4 6 200 8 1 300 3 5 7
*/
public class E_54 {
    public static void main(String[] args) {
        int lista_1[] = {  2,4,6,8,1,3,5,7};
        int copia_lista1[] = new int[lista_1.length+2];
        int contador=0;
        
        for (int i = 0; i < lista_1.length; i++) {
            System.out.print(lista_1[i]+" ");
            
        }
        System.out.println("");
        for (int i = 0; i < copia_lista1.length; i++) {
            
            if (i == 3) {
                copia_lista1[i] = 200; 
                contador++;
            }
            else if (i==6) {
                copia_lista1[i] = 300;
                contador++;
                
            }
            else{
                copia_lista1[i] = lista_1[i-contador];
            }
            System.out.print( copia_lista1[i] + " "  );  //muestro la los valores copiados en el array
        }
        System.out.println("");
        
    }  
}
