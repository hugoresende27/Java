/*
calculo das medias
(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). 
 */
package calculos;

/**
 *
 * @author Hugo
 */
public class Medias {
    
    public static double med(double med[]){
         return (med[0]*0.2+med[1]*0.2+med[2]*0.3+med[3]*0.3);
    }
    
    public static double medGeral(double med[]){
        double soma = 0,media=0;
        for (int i=0; i<4; i++){
            soma += med[i];
        }
        media = soma/4;
        return media;
    }
    
    
}
