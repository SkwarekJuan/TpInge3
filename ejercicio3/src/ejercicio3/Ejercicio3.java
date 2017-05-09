package ejercicio3;

public class Ejercicio3 {

    public static void main(String[] args) {
        double var1,var2,aux;
        var1=Math.random();
        var2=Math.random();
        System.out.println ("Los valores iniciales son: " + var1 + ", " + var2);

        if (var1 > var2) {
            aux=var1;
            var1=var2;
            var2=aux;
        }
        System.out.println ("Los valores ordenados son: " + var1 + ", " + var2);
                
        
    }
    
}
