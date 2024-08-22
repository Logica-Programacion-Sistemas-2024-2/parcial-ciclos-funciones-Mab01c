package parcial;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
        
    

    try{
        
        System.out.println("¿Cuantos vehiculos participaron?");
        
        float kmRecorrido= 0;
        float ConsumoGasolina = 0;
        int metrosRecorridos =0;
        int VParticipacion = sc.nextInt();
        float ConsumoTotal = 0;

        for(int i=VParticipacion; i > 0; i= i-1){
           
            System.out.println("¿Cuantos metros recorrio el carro " + i + "?"); 

             metrosRecorridos = sc.nextInt();
             kmRecorrido= metrosRecorridos/1000;

             ConsumoGasolina = calcularConsumoGasolina(kmRecorrido);

            System.out.println("Vehiculo: "+ i +" ----- "+kmRecorrido+"Km"+" --> "+ ConsumoGasolina + " Litros de gasolina");

            ConsumoTotal += ConsumoGasolina;

        }

        System.out.println("Consumo total de gasolina por los "+VParticipacion+" Vehiculos es " + ConsumoTotal);
 
        

    }
    catch(Exception e){
        System.out.print("Error " + e.getMessage());
    }

    
    }
        
    public static float calcularConsumoGasolina(float kmRecorrido){
        return ((kmRecorrido * 55) / 750);
    }
    

}
