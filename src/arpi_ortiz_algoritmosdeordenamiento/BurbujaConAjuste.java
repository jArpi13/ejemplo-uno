package arpi_ortiz_algoritmosdeordenamiento;

import java.util.ArrayList;

public class BurbujaConAjuste {
    public void ordenamientoBurbujaConAjuste(ArrayList<Integer> vector){
        int ord;
        do{
            ord = 0;
            for(int i=0; i<vector.size()-1; i++){
                //Escritura del vector
                for(int j=0; j<vector.size(); j++){
                    System.out.print(vector.get(j)+"\t");
                }
                System.out.println("valor a = "+ vector.get(i) + "\tvalor b = " + vector.get(i+1));
                //Comparacion e intercambio
                if(vector.get(i)>vector.get(i+1)){
                    int aux=vector.get(i);
                    vector.set(i, vector.get(i+1));
                    vector.set(i+1, aux);
                }
            }
            //Lectura de vector
            for(int i=0; i<vector.size()-1; i++){
                if(vector.get(i)>vector.get(i+1)){
                    ord++;
                }
            }
        }while(ord!=0);
        System.out.println("RESPUESTA");
        for(int i=0; i<vector.size(); i++){
            System.out.print(vector.get(i)+"\t");
        }
    }
}
