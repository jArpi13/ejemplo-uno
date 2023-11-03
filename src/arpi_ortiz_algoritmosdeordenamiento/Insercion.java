package arpi_ortiz_algoritmosdeordenamiento;

import java.util.ArrayList;

public class Insercion {
    public void ordenamientoInsercion(ArrayList<Integer> vector){
        for(int a=0; a<(vector.size()-1); a++){
            //PRIMERA LINEA
            for(int j=0; j<vector.size(); j++){
                System.out.print(vector.get(j)+"\t");
            }
            System.out.print("valor a = "+ vector.get(a) + "\tvalor b = " + vector.get(a+1));
            System.out.println();
            //Variables
            int stop = 0; //Inicializar break
            int ret = 0; //Inicializar el retorceso
            int i=0; //Iniciar la variable de iteracion
            int k=0; //Contador de espacios iniciales
            do{
                if(vector.get(a-ret)>vector.get(a+1-ret)){
                    //Intercambio de Valores
                    int aux = vector.get(a+1-ret);
                    vector.set(a+1-ret, vector.get(a-ret));
                    vector.set(a-ret, aux);
                    //Mostrar Escalera
                    if((a-ret)>=1){
                        //Espacios principales
                        for(i=0; i<(a-1-ret); i++){
                            System.out.print("\t");
                        }
                        k = i;
                        // Valores
                        System.out.print(vector.get(a-ret-1)+"\t"+vector.get(a-ret)+"\t"+vector.get(a-ret+1));
                        // Espacios finales
                        for(i=0; i<(vector.size()-3-k); i++){
                            System.out.print("\t");
                        }
                        //Variables a y b
                        System.out.println("\tvalor a = "+ vector.get(a-ret-1) + "\tvalor b = " + vector.get(a-ret));
                    }
                    //Incremento del retroceso
                    ret++;
                    //Compara si llega al principio y detiene el bucle (break)
                    if((a-ret)<0){
                        stop++;
                        System.out.println("-----------------------------------------");
                    }
                }else{
                    stop++;
                    System.out.println("-----------------------------------------");
                }
            }while(stop==0);
        }
        System.out.println("RESPUESTA");
        for(int i=0; i<vector.size(); i++){
            System.out.print(vector.get(i)+"\t");
        }
    }
}
