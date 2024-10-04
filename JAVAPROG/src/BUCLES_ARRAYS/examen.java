
package BUCLES_ARRAYS;


public class examen {

    
    public static void main(String[] args) {
        int res = 0;
        for (int i = 0; i <=3; i++) {
            for (int j = 0; j < 4; j++) {
                if (i% 2 == 0) {
                    res = res + j;  
                }
                
            }
            
        }
        System.out.println(res);
    }
    
}
