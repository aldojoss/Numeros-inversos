import java.util.Scanner;
import java.util.InputMismatchException;

public class App {
int numeros [];
int tamano=0;

    //declaramos las variables globales

    public static void main(String[] args) throws Exception {
     App ap =new App();   
ap.pedirtamano();
ap.pedirvalores(); //solo invocamos los metodos
ap.inversa();
    }

    public void pedirtamano(){
Scanner leer =new Scanner(System.in);

//hacemos un bucle para que el usuario ingrese los datos correctos
    do{
        
try { //agregmaos un try catch para que el programa no se cierre de una cuando el usuario 
//cometa un error
    
    System.out.println("ingrese la cantidad de numeros a ingresar");
    tamano=leer.nextInt();
    numeros= new int [tamano];
   //le pedimos los datos al usuario
break;// si el try logra ejecutar esa funcion sin exepciones le damos break osea detenemos el bucle infinito

} catch (Exception e) { //catch
    System.out.println("valor invalido");
    leer.nextLine();
}//si no le volvemo a pedir los datos poniendo un leenextline para que vuelva a pedile el dato

}while(true);

}

    public void pedirvalores (){
        Scanner leer = new Scanner (System.in);
//hacemos un do while 
do {
        try {   // hacemos un try para que el usuario ingrese los valores correctos 

            
                for (int i=0;i<tamano;i++){
                    System.out.println("Ingrese el valor numero "+(1+i));
                    numeros[i]=leer.nextInt();
                }
                
            break; // le damos break cuando el try logra ejecutar ese bloque de codigo
            
    }catch (Exception e) {
        System.out.println("valor no valido ingrese de nuevo");
        leer.nextLine(); // si no ps volvemos a pedir al usuario los datos
    }

}while(true);
    
    }

public void  inversa (){
    // aqui simplemente imprimimos los datos que nos dio el usuario con un for
    //inicializando en i como el tamano que dio el usuario pero menos 1
    //porque por ejemplo si el dio tamano 3 en el vector son 2 pq comienza en 0
    //luego imprimimos los datos de los vectores recorriendo i hasta que i sea mayoro igual a 0
System.out.println("_____________________________________");
   System.out.println("la inversa es");
   System.out.println("_____________________________________");
   
 for (int i=tamano-1;i>=0;i--){
        System.out.println(" * "+numeros[i]);
        
    }

}


}


