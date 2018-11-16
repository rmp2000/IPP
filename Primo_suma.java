package ;
import java.util.*;

public class Primo_suma
{
    static Scanner t=new Scanner(System.in);
    static int h;
    static int p;
    public static boolean es_primo(int n){
       int i=2;
       while(n%i!=0){
           i++;
       }
       if(i==n)return true;
       else return false;
    }
    
    public static void main(String args[]){
        do {System.out.println("Introduce el numero PAR");
                h=t.nextInt();}
            while (h%2!=0);
           int l=1;
           p=h;
        while (l<p){
            if(es_primo(p)){
                int z=p;
                while(l<z){
                    if(es_primo(z)){
                        int res=z+p;
                        if(res==h){
                            System.out.println("La suma de los numeros primos "+z+" y "+p+" es iguala a: " + h);
                        }
                    }
                    z--;
                }
            }    
            p--;
        }    
    }
}
