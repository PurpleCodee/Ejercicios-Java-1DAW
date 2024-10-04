
package Ejercicios_Bucles;
import java.util.Scanner;

public class Ejercicio_PARKING {
/*Se pide realizar un programa para controlar la plazas de un aparcamiento. El aparcamiento dispone de 24 plazas de dos tamaños diferentes: 14 plazas pequeñas y 10
plazas grandes.
La asignación de cada vehículo se hace automáticamente según su tamaño, teniendo
en cuenta además lo siguiente:
• Cada vehículo sólo puedo ocupar una plaza.
• Un vehículo pequeño siempre ocupará primero una plaza pequeña, salvo que
estén todas ocupadas. En ese caso podrá aparcar en una grande.
• Un vehículo grande sólo puede ocupar una plaza grande. Si están todas ocupadas no podrá aparcar (aunque estén libres todas las pequeñas).
• De todas las plazas libres que haya, siempre se ocupará primero la de menor
número.
(2 puntos) Crea las estructuras que necesites e inicializalas a VACIO (el valor que represente ‘vacío’ lo eliges tú)
Además, el programa debe generar un menú con 4 opciones (0.5 puntos) :
1. (2 puntos) Aparcar vehículo: se indica el tamaño del vehículo y se devuelve la
plaza ocupada si se ha podido aparcar. En caso contrario se indica que no ha
sido posible. Finalmente se preguntará si se quiere aparcar otro vehículo.
Mientras el usuario quiera seguir y haya aparcamientos libres, se repetirá todo
lo explicado en esta opción.
2. (2 puntos) Sacar vehículo: se debe indicar la plaza que se quiere dejar libre y
se libera esa plaza. Si esa plaza ya está libre, se indicará. Una vez hecho se le
preguntará al usuario si quiere sacar otro vehículo. Mientras el usuario quiera
seguir y haya coches en el aparcamiento, se repetirá todo lo explicado en esta
opción.
3. (2 puntos) Mostrar aparcamiento: muestra todas las plazas del aparcamiento
indicando si están libres u ocupadas. Usa el ejemplo siguiente para ver cómo
debes mostrar las plazas.
4. (1 punto) Salir del programa. Se valorará la correcta gestión de esta opción.*/
    
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      char[] plazas_big = new char[10]; //ARRAY con las plazas 10 plazas grandes
      char[] plazas_petit = new char[14]; //ARRAY con las plazas 14 plazas pequeñas
      int opcion = 0;//esta variable me permite que el usuario elija una opcion y compararla
      String tamaño = "";//declaro la varible tamaño para que el usuario me diga si es G  o P GRANDE O PEQUEÑO
      int cont = 0;//declaro el contador que accede a la posicion del array de la celda
      boolean aparcado = false;//declaro un tipo boolean para utilizar mas adelante
      String repetir = "S";
      
      for (int i = 0; i < plazas_big.length; i++){//mientras que el tamaño de i sea menor que el tamaño del array me inttroduce L en cada celda
          plazas_big[i] = 'L';//introduce el caracter L en cada celda
      }
      
      for (int i = 0; i < plazas_petit.length; i++){//hago lo mismo que arriba pero introduciendo el caracter L en las celdas del array petit
          plazas_petit[i] = 'L';
      }
      
      
        do {//dentro del do se va a ejecutar al menos una vez las opciones que tiene el usuario
            
            System.out.println("APARCAMIENTOS MEDAC NOVA");//muetro por pantalla las opciones que se podran escoger
            System.out.println("-------------------------");
            System.out.println("1) Aparcar el vehiculo");
            System.out.println("2) Sacar vehiculo");
            System.out.println("3) Mostrar aparcamiento");
            System.out.println("4) Salir");
            System.out.print("Elige una opcion: ");
            opcion = teclado.nextInt();//pido al usuario que elija una opcion
            
            if (opcion <= 0 || opcion > 4) {//si el usuario a introducido un numero que no enta entre 0 y 4 
                System.out.println("Error no es correcto"); //aparece error ya que el numero no es valido
            }else{//si la opcion que ha introducido el usuario es valida porque eta entre 1 y 4 se ejecutara el codigo
                switch (opcion) {//segun que opcion haya introducido el usuario se ejecutara un case o otro del switch
                    case 1:
                        repetir = "S";//inicializo la variable S que es (SI) DE AFIRMACION fuera del do para utilizarla al final 
                        do{
                            cont = 0;//inicio el contador para saber en que posicion del array esta
                            aparcado = false;//digo que no hay ningun coche aparcado en el garaje
                            System.out.print("Tamaño del vehiculo (G/P)?: ");//muestro por pantalla el mensaje para que el usuario diga di es grande o pequeño
                            tamaño = teclado.next();
                            if(tamaño.equals("G")){//Si el dato que me a dado el usuario es igual que G 
                                while(cont < plazas_big.length && !aparcado){ // Mientras la posición sea menor que el tamaño del array y no se haya aparcado
                                    if (plazas_big[cont] == 'L'){// Si el valor de la posición del array es igual a 'L', significa que la plaza está libre
                                        plazas_big[cont] = 'O';// Cambio el valor de la plaza a 'O' para indicar que está ocupada por un vehículo grande
                                        aparcado = true;// Indico que el coche ha sido aparcado con éxito
            
                                    }
                                    
                                    cont++;// Incremento el contador para verificar la siguiente plaza en el siguiente ciclo despues le resto 1
                                }

                                if (aparcado){ // Si 'aparcado' es verdadero, significa que el vehículo se ha aparcado con éxito.
                                    System.out.println("Vehiculo aparcado en G" + (cont-1));//restandole 1 a contador obtengo la plaza correcta,por
                                }else{// Si 'aparcado' es falso, significa que no se ha podido aparcar el vehículo en ninguna plaza
                                    System.out.println("No se ha podido aparcar");
                                }
                            }

                            if (tamaño.equals("P")){//repito lo anterior pero con el parjing pequeño si el tamaño del usuario es igual que P de 
                                while (cont < plazas_petit.length && !aparcado){// Mientras la posición sea menor que el tamaño del array y no se haya aparcado
                                    if (plazas_petit[cont] == 'L'){// Si el valor de la posición del array es igual a 'L', significa que la plaza está libre
                                        plazas_petit[cont] = 'O';// Cambio el valor de la plaza a 'O' para indicar que está ocupada por un vehículo grande
                                        aparcado = true;//Indico que el coche ha sido aparcado con éxito
                                    }
                                    cont++; //Incremento el contador para verificar la siguiente plaza en el siguiente ciclo despues le resto 1
                                }
                                if (aparcado){// Si 'aparcado' es verdadero, significa que el vehículo se ha aparcado con éxito
                                    System.out.println("Vehiculo aparcado en P" + (cont-1));//restandole 1 a contador obtengo la plaza correcta
                                }else{// Si 'aparcado' es falso, significa que no se ha podido aparcar el vehículo en ninguna plaza
                                   cont = 0;//le doy a contador valor de 0
                                   while(cont < plazas_big.length && !aparcado){// Mientras la posición sea menor que el tamaño del array y no se haya aparcado
                                        if (plazas_big[cont] == 'L'){// Si el valor de la posición del array es igual a 'L', significa que la plaza está libre
                                            plazas_big[cont] = 'O';// Cambio el valor de la plaza a 'O' para indicar que está ocupada por un vehículo pequeño
                                            aparcado = true;// Indico que el coche ha sido aparcado con éxito
                                        }
                                        cont++;//Incremento el contador para verificar la siguiente plaza en el siguiente ciclo despues le resto 1
                                    }
                                    if (aparcado){ //Si 'aparcado' es verdadero, significa que el vehículo se ha aparcado con éxito.
                                        System.out.println("Vehiculo aparcado en G" + (cont-1));
                                    }else{//Si 'aparcado' es falso, significa que no se ha podido aparcar el vehículo en ninguna plaza
                                        System.out.println("No se ha podido aparcar");
                                    }
                                }
                            }
                            System.out.print("Aparcar otro (S/N)?: ");//Le pido al usurio que diga SI para introducir otro coche o No Para volver a solicitar otra opcion
                            repetir = teclado.next();
                            
                        }while(repetir.equals("S"));//mientras repetir sea igual que es la opcion del usuari sea S si no es S sale del bucle

                        break;
                    case 2:
                        repetir = "S";//repetir es S
                        do{
                            int plaza = 0;//la variable plaza tiene valor de 0
                            System.out.print("Tamaño del vehiculo (G/P)?: ");//le digo al usuario que me diga cual es el tamaño del vehiculo
                            tamaño = teclado.next();
                            System.out.print("Numero de plaza?: ");//tambien le pregunto el numero de plaza en la que esta
                            plaza = teclado.nextInt();
                            
                            if(tamaño.equals("G")){//digo que el tamaño es G 
                                if (plaza >= 0 && plaza < plazas_big.length){//si el numero del ususario es mayor o igual que 0  y el numero del usuario es menor que el tamaño del array grande
                                    if(plazas_big[plaza] == 'O'){ // Si el valor de la posición del array 'plazas_big' en la plaza indicada por 'plaza' es igual a 'O',
                                                                 // esto significa que hay un vehículo grande aparcado en esa plaza
                                        plazas_big[plaza] = 'L';// Luego, se cambia el valor de esa plaza a 'L' para indicar que la plaza queda disponible.
                                        System.out.println("La plaza queda disponible");
                                    }else{//si no hay ningun vehiculo
                                        System.out.println("IMPOSIBLE: en esa plaza no hay ningun vehiculo grande");
                                    }
                                }
                            }

                            if (tamaño.equals("P")){// Si el tamaño del vehículo es "P" (pequeño), se ejecuta esta sección de código.
                                                    // Se verifica si la 'plaza' está dentro del rango válido (entre 0 y la longitud de 'plazas_petit')
                                if (plaza >= 0 && plaza < plazas_petit.length){
                                    if(plazas_petit[plaza] == 'O'){
                                        plazas_petit[plaza] = 'L';
                                        System.out.println("La plaza queda disponible");  // Si la plaza está ocupada (marcada con 'O'), se libera marcándola con 'L'.
                                    }else{// Si la plaza no está ocupada (no marcada con 'O'), se muestra un mensaje de error.
                                        System.out.println("IMPOSIBLE: en esa plaza no hay ningun vehiculo pequeño"); 
                                    }
                                }
                            }
                            System.out.print("Sacar otro (S/N)?: ");
                            repetir = teclado.next();//le digo al usuario que me  diga si quiere sacar o no un coche
                            
                        }while(repetir.equals("S"));// El bucle 'do-while' se repite mientras 'repetir' sea igual a "S".
                                                    // Esto permite al usuario sacar múltiples vehículos pequeños en sucesión.
                        break;
                    case 3:
                        System.out.println("Situacion del aparcamiento");
                        System.out.print("Plaza G = [");
                        for (int i = 0; i < plazas_big.length; i++) {// Utiliza un bucle 'for' para recorrer el array 'plazas_big' y mostrar el estado de cada plaza grande.
                            if (i == plazas_big.length - 1){// Si es la última plaza grande, muestra el estado y cierra el corchete.
                                System.out.print(plazas_big[i] + "]");
                                System.out.print(plazas_big[i] + "]");
                            }else{
                                System.out.print(plazas_big[i] +", "); // Si no es la última plaza grande, muestra el estado seguido de una coma y un espacio.                               
                            }
                        }
                        System.out.println(" ");// Imprime una línea en blanco para separar la información de las plazas grandes de las plazas pequeñas.


                        System.out.print("Plaza P = [");
                        for (int i = 0; i < plazas_petit.length; i++) {// Utiliza un bucle 'for' similar para recorrer el array 'plazas_petit' y mostrar el estado de cada plaza pequeña.
                            if (i == plazas_petit.length - 1){// Si es la última plaza pequeña, muestra el estado y cierra el corchete.
                                System.out.print(plazas_petit[i] + "]");
                                System.out.print(plazas_petit[i] + "]");
                            }else{
                                System.out.print(plazas_petit[i] +", "); // Si no es la última plaza pequeña, muestra el estado seguido de una coma y un espacio.                               
                            }
                        }

                        System.out.println(" ");// Imprime una línea en blanco para finalizar la visualización de la situación del aparcamiento.

                        break;
                    case 4:
                        System.out.println("El coche sale del parking");
                        break;
                    default:

                }
            }
            
        } while (opcion != 4);

    }
    
}
