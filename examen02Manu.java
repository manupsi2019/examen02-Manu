/**
 * examen02-Manu
 */
public class examen02Manu {

    public static void main(String[] args) {
        
        // ESTACIÓN NÚMERO 1

        //Array con 12 meses de temperaturas mínimas 

        double[] TempMin1 = {-5,-1,-10,0,-3,2,-1,4,5,-5,2,3};
      
        //Bucle que recorre el array y saca por pantalla las temperaturas mínimas

        double suma1 = 0;
     
        //Bucle que calcula la media1 de las temperaturas mínimas 
      
        double media1 = 0;

        for (int i=0; i < TempMin1.length; i++) {

            suma1 = suma1 + TempMin1[i];

           }

        media1 = (double) suma1 / TempMin1.length;

        System.out.println("ESTACIÓN 1: La media de temperaturas mínimas anual es de: " + media1+ " ºC.");

// ESTACIÓN NÚMERO 2

        //Array con 12 meses de temperaturas mínimas 

        double[] TempMin2 = {-1,-2,-3,4,-3,8,-9,4,0,-1,2,6};
      
        //Bucle que recorre el array y saca por pantalla las temperaturas mínimas

        double suma2 = 0;
     
        //Bucle que calcula la media1 de las temperaturas mínimas 
      
        double media2 = 0;

        for (int i=0; i < TempMin2.length; i++) {

            suma2 = suma2 + TempMin2[i];

           }

        media2 = (double) suma2 / TempMin2.length;

        System.out.println("ESTACIÓN 2: La media de temperaturas mínimas anual es de: " + media2+" ºC.");


// ESTACIÓN NÚMERO 3

        //Array con 12 meses de temperaturas mínimas 

        double[] TempMin3 = {1,2,3,6,3,1,9,4,0,-1,2,-6};
      
        //Bucle que recorre el array y saca por pantalla las temperaturas mínimas

        double suma3 = 0;
     
        //Bucle que calcula la media1 de las temperaturas mínimas 
      
        double media3 = 0;

        for (int i=0; i < TempMin3.length; i++) {

            suma3 = suma3 + TempMin3[i];

           }

        media3 = (double) suma3 / TempMin3.length;

        System.out.println("ESTACIÓN 3: La media de temperaturas mínimas anual es de: " + media3+" ºC.");

// ESTACIÓN NÚMERO 4

        //Array con 12 meses de temperaturas mínimas 

        double[] TempMin4 = {5,4,3,6,-3,1,-9,4,1,-3,3,4};
      
        //Bucle que recorre el array y saca por pantalla las temperaturas mínimas

        double suma4 = 0;
     
        //Bucle que calcula la media1 de las temperaturas mínimas 
      
        double media4 = 0;

        for (int i=0; i < TempMin4.length; i++) {

            suma4 = suma4 + TempMin4[i];

           }

        media4 = (double) suma4 / TempMin4.length;

        System.out.println("ESTACIÓN 4: La media de temperaturas mínimas anual es de: " + media4+" ºC.");

// ESTACIÓN NÚMERO 5

        //Array con 12 meses de temperaturas mínimas 

        double[] TempMin5 = {-5,-4,-3,-6,8,10,9,6,1,3,9,4};
      
        //Bucle que recorre el array y saca por pantalla las temperaturas mínimas

        double suma5 = 0;
     
        //Bucle que calcula la media1 de las temperaturas mínimas 
      
        double media5 = 0;

        for (int i=0; i < TempMin5.length; i++) {

            suma5 = suma5 + TempMin5[i];

           }

        media5 = (double) suma5 / TempMin5.length;

        System.out.println("ESTACIÓN 5: La media de temperaturas mínimas anual es de: " + media5+" ºC.");

        // MEDIA TOTAL

        double mediatotal = 0;

        mediatotal = (media1+media2+media3+media4+media5)/5;

        System.out.println("La media TOTAL de temperaturas mínimas anual es de: " + mediatotal+" ºC.");

}
}