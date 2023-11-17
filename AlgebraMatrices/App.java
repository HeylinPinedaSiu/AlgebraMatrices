import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    Scanner lector = new Scanner(System.in);
        int intentos = 3;

        /*Declaramos las variables a utilizar en el programa  */
        int opc;
        int i;
        int j;
        int fila1;
        int fila2;
        int columna1;
        int columna2;
        int filas;
        int columnas;
        int filaA;
        int filaB;
        int columnaA;
        int columnasB;
        float factor;
         int det;
         int divisor;
         int k;
         int max;
         float diviso;

      
        /*Mostramos el menu de opciones 
         * con las diferentes matrices 
         */
        System.out.println("**********Menu de Opciones***********");
        System.out.println("1) Verificar si dos Matrices son iguales o no.");
        System.out.println("2) Sumar 2 Matrices.");
        System.out.println("3)  Generar una Matriz 0 de n x m.");
        System.out.println("4)  Obtener el Inverso Aditivo de una Matriz de n x m.");
        System.out.println("5) Restar 2 Matrices." );
        System.out.println("6) Multiplicar un escalar por una Matriz de n x m.");
        System.out.println("7) Multiplicar 2 Matrices Compatibles.");
        System.out.println("8) Obtener una Matriz Identidad de tamaño n.");
        System.out.println("9) Obtener la Inversa de una Matriz de tamaño n.");
        System.out.println("10) Obtener el Determinante de una Matriz de tamaño n.");
        System.out.println("11) Salir");


        do {
            //pedimos los datos al usuario
            System.out.print("Ingresa una opción: ");
            opc = lector.nextInt();
            
            if (opc <= 0 || opc > 11) {
                intentos--;
                System.out.println("Opción inválida. Por favor intenta nuevamente.");
            }
            
            if (intentos <= 0) {
                System.out.println("Usted alcanzo el límite de intentos ****Saliendo del programa***.");
                return;
            }

           } while (opc <= 0 || opc > 11);

           switch(opc){

            case 1:
            do{
                //pedimos los datos para la primera matriz 
            System.out.print("Ingrese el número de filas de la matriz A:");
            fila1 = lector.nextInt();

            if(fila1 <= 0){
                System.out.println("El valor debe ser mayor a cero.");
                intentos--;

            }else{
                break;
            }   

            }while(intentos > 0);
            if(intentos == 0){
                System.out.println("***Usted supero el numero maximo de intentos.***");
                break;
            }
            do{
                /*pedimos la cantidad de columnas para la 
                 * matriz a 
                 */
                 System.out.print("Ingresa el número de columnas de la matriz A:");
                 columna1 = lector.nextInt();
           
            if(columna1 <= 0){
                System.out.println("El valor debe ser mayor a cero.");
                intentos--;

            }else{
                break;
            }   

            }
            while(intentos > 0);
            if(intentos == 0){
                System.out.println("***Usted supero el numero maximo de intentos***.");
                break;
            }
           

             int[][] matriz1 = new int[fila1][columna1];
           
             //pedimos los datos al usuario
           System.out.println("Ingrese los elementos de la matriz A:");
           //usamos un for para ir recorriendo las filas 
           for (i = 0; i < fila1; i++) {

            //recorremos las columnas 
           for (j = 0; j < columna1; j++) {
        System.out.print("Matriz 1[" + i + "][" + j + "]: ");
        matriz1[i][j] = lector.nextInt();
        }
     }
        //mostramos los resultados 
     System.out.println("La matriz 1 que ingresó es:");
     //recorremos las filas 
     for (i = 0; i < fila1; i++) {
        //recorremos las columnas 
     for ( j = 0; j < columna1; j++) {
        System.out.print(matriz1[i][j] + " "); 
    }
    System.out.println(); 
     }
     do{
                //pedimos el numero que tendria de filas  la segunda matriz 
            System.out.print("Ingrese el número de filas de la matriz B:");
            fila2  = lector.nextInt();

            if(fila2 <= 0){
                System.out.println("El valor debe ser mayor a cero.");
                intentos--;
                
            }else{
                break;
            }   

            }
            while(intentos > 0);
            if(intentos == 0){
                System.out.println("***Usted supero el numero maximo de intentos***.");
                break;
            }
            do{
                //pedimos la cantidad de columnas que tendra la matriz b
            System.out.print("Ingrese el número de columnas de la matriz B:");
            columna2  = lector.nextInt();

            if(columna2 <= 0){
                System.out.println("El valor debe ser mayor a cero.");
                intentos--;
                
            }else{
                break;
            }   

            }
            while(intentos > 0);
            if(intentos == 0){
                System.out.println("***Usted supero el numero maximo de intentos***.");
                break;
            }
    
               int[][] matriz2 = new int[fila2][columna2];

        System.out.println("Ingrese los elementos de la matriz B:");
        //recorremos las filas 
     for (i = 0; i < fila2; i++) {
        //recorremos las columnas 
     for (j = 0; j < columna2; j++) {
        System.out.print("Matriz B[" + i + "][" + j + "]: ");
        matriz2[i][j] = lector.nextInt();
    }
}
      //mostramos lso resultados 
    System.out.println("La matriz B que ingresó es:");
    for ( i = 0; i < fila2; i++) {
    for (j = 0; j < columna2; j++) {
        System.out.print(matriz2[i][j] + " "); 
    }
    System.out.println(); 
    }

    if (fila1 == fila2 && columna1 == columna2) {
        //recorremos las filas 
    for ( i = 0; i < fila1; i++) {
        //recorremos las columnas
        for (j = 0; j < columna1; j++) {
            if (matriz1[i][j] != matriz2[i][j]) {
                System.out.println("Las matrices son diferentes.");
                return;
            }
        }
    }
    
    System.out.println("Las matrices son iguales.");
    } else {
    System.out.println("Las matrices son diferentes.");
           break;
           
         }
         case 2:
         do{
            //pedimo datos al usuario
            System.out.print("Ingrese el número de filas de la matriz A:");
            fila1  = lector.nextInt();

            if(fila1 <= 0){
                System.out.println("El valor debe ser mayor a cero.");
                intentos--;

            }else{
                break;
            }   

            }
            while(intentos > 0);
            if(intentos == 0){
                System.out.println("***Usted supero el numero maximo de intentos***..");
                break;
            }
         do{
                 System.out.print("Ingrese el número de columnas de la matriz A:");
                 columna1 = lector.nextInt();
           
            if(columna1 <= 0){
                System.out.println("El valor debe ser mayor a cero.");
                intentos--;
            }else{
                break;
            }   
            }
            while(intentos > 0);
            if(intentos == 0){
                System.out.println("***Usted supero el numero maximo de intentos***.");
                break;
            }
     do{
            System.out.print("Ingrese el número de filas de la matriz B:");
            fila2  = lector.nextInt();
            if(fila2 <= 0){
                System.out.println("El valor debe ser mayor a cero.");
                intentos--;
            }else{
                break;
            }   
            }while(intentos > 0);
            if(intentos == 0){
                System.out.println("***Usted supero el numero maximo de intentos***.");
                break;
            }
            do{
            System.out.print("Ingrese el número de columnas de la matriz B:");
            columna2  = lector.nextInt();
            if(columna2 <= 0){
                System.out.println("El valor debe ser mayor a cero.");
                intentos--;
            }else{
                break;
            }   
            }
            while(intentos > 0);
            if(intentos == 0){
                System.out.println("***Usted supero el numero maximo de intentos***.");
                break;
            }
    int[][] mariz1 = new int[fila1][columna1];
    int[][] mariz2 = new int[fila2][columna2];


    System.out.println("Ingrese los elementos de la primera matriz: ");
    for (i = 0; i < fila1; i++) {
      for ( j = 0; j < columna1; j++) {
        System.out.print(" [" + i + "][" + j + "]:");
        mariz1[i][j] = lector.nextInt();
      }
    }

    System.out.println("Ingrese los elementos de la segunda matriz: ");
    for ( i = 0; i < fila2; i++) {
      for ( j = 0; j < columna2; j++) {
        System.out.print("[" + i + "][" + j + "]:");
        mariz2[i][j] = lector.nextInt();
      }
    }

    if (fila1 != fila2 || columna1 != columna2) {
      System.out.println("***No se pueden sumar las matrices porque no tienen el mismo tamaño.*****");
      return;
    }

    int[][] matrizC = new int[fila1][columna1];

    for (i = 0 ; i < fila1; i++) {
      for (j = 0; j < columna1; j++) {
        matrizC[i][j] = mariz1[i][j] + mariz2[i][j];
      }
    }

    System.out.println("La suma de las matrices es:");
    for (i = 0; i < fila1; i++) {
      for ( j = 0; j < columna1; j++) {
        System.out.print("["+matrizC[i][j] + "]");
      }
      System.out.println();
    }
         break;
         
        case 3:
        do{
        System.out.print("Ingrese el número de filas: ");
        fila1 = lector.nextInt();
        if(fila1 <=0){
          System.out.println("El valor debe ser mayor a cero.");
          intentos--;
        }else{
          break;
        }
      }
      while(intentos > 0);
        if (intentos == 0){
          System.out.println("***Usted supero el numero maximo de intentos***.");
        }

        do{
        System.out.print("Ingrese el número de columnas: ");
        columnas = lector.nextInt();
        if(columnas <=0){
          System.out.println("El valor debe ser mayor a cero.");
          intentos--;
        }else{
          break;
        }
      }
      while(intentos > 0);
        if (intentos == 0){
          System.out.println("***Usted supero el numero maximo de intentos***.");
        }

        int[][] matriz = new int[fila1][columnas];

        System.out.println("Matriz de ceros:");
        for ( i = 0; i < fila1; i++) {
            for (j = 0; j < columnas; j++) {
                System.out.print("["+matriz[i] [j] +"]");
            }
            System.out.println();
        }
        break;

        case 4:
         do{
        System.out.print("Ingrese el número de filas: ");
        filas = lector.nextInt();
        if(filas <=0){
          System.out.println("El valor debe ser mayor a cero.");
          intentos--;

        }else{
          break;
        }

      }
      while(intentos > 0);
        if (intentos == 0){
          System.out.println("***Usted supero el numero maximo de intentos***.");
        }
        do{
        System.out.print("Ingrese el número de columnas: ");
        columnas = lector.nextInt();
        if(columnas <=0){
          System.out.println("El valor debe ser mayor a cero.");
          intentos--;
        }else{
          break;
        }
      }while(intentos > 0);
        if (intentos == 0){
          System.out.println("***Usted supero el numero maximo de intentos***.");
        }

        int[][] matrz = new int[filas][columnas];

        System.out.println("Ingrese los valores de la matriz:");
        for (i = 0; i < filas; i++) {
            for (j= 0; j < columnas; j++) {
                System.out.print(" [" + i + "][" + j + "]: ");
                matrz[i][j] =  lector.nextInt();
            }
        }

        int[][] inversoAditivo = new int[filas][columnas];

        for (i = 0; i < filas; i++) {
            for (j = 0; j < columnas; j++) {
                inversoAditivo[i][j] = -matrz[i][j];
            }
        }
        System.out.println("Inverso Aditivo:");
        for ( i = 0; i < filas; i++) {
            for ( j = 0; j < columnas; j++) {
                System.out.print("["+inversoAditivo[i][j] + " ]");
            }
            System.out.println();
        }
        break;
        case 5:
         do{
            System.out.print("Ingrese el número de filas de la primera matriz:");
            fila1  = lector.nextInt();
            if(fila1 <= 0){
                System.out.println("El valor debe ser mayor a cero.");
                intentos--;
            }else{
                break;
            }   
            }
            while(intentos > 0);
            if(intentos == 0){
                System.out.println("Usted supero el numero maximo de intentos.");
                break;
            }
            do{
                 System.out.print("Ingrese el número de columnas de la segunda matriz:");
                 columna1 = lector.nextInt();
           
            if(columna1 <= 0){
                System.out.println("El valor debe ser mayor a cero.");
                intentos--;
            }else{
                break;
            }   
            }
            while(intentos > 0);
            if(intentos == 0){
                System.out.println("Usted supero el numero maximo de intentos.");
                break;
            }

            do{
            System.out.print("Ingrese el número de filas de la segunda matriz:");
            fila2  = lector.nextInt();
            if(fila2 <= 0){
                System.out.println("El valor debe ser mayor a cero.");
                intentos--;
            }else{
                break;
            }   
            }while(intentos > 0);
            if(intentos == 0){
                System.out.println("***Usted supero el numero maximo de intentos***.");
                break;
            }
            do{
                 System.out.print("Ingrese el número de columnas de la segunda matriz :");
                 columna2 = lector.nextInt();
           
            if(columna2 <= 0){
                System.out.println("El valor debe ser mayor a cero.");
                intentos--;
            }else{
                break;
            }   
            }while(intentos > 0);
            if(intentos == 0){
                System.out.println("***Usted supero el numero maximo de intentos***.");
                break;
            }
           
    
        int[][] matr1 = new int[fila1][columna1];
        int[][] matr2 = new int[fila2][columna2];
    
        System.out.println("Ingrese los elementos de la primera matriz:"); 
        for (i = 0; i < fila1; i++) {
          for ( j = 0; j < columna1; j++) {
            System.out.print("[" + i + "][" + j + "]:");
            matr1[i][j] = lector.nextInt();
          }
        }
        System.out.println("Ingrese los elementos de la segunda matriz:");
        for (i = 0; i < fila2; i++) {
          for ( j = 0; j < columna2; j++) {
            System.out.print("[" + i + "][" + j + "]:");
            matr2[i][j] = lector.nextInt();
          }
        }
        if (fila1 != fila2 || columna1 != columna2) {
          System.out.println("****No se pueden restar las matrices porque no tienen el mismo tamaño.******");
          return;
        }
  
        int[][] matrizc = new int[fila1][columna1];
    
        for ( i = 0; i < fila1; i++) {
          for ( j = 0; j < columna1; j++) {
            matrizc[i][j] = matr1[i][j] - matr2[i][j];
          }
        }
        System.out.println("La resta de las matrices es:");
        for ( i = 0; i < fila1; i++) {
          for ( j = 0; j < columna1; j++) {
            System.out.print("["+matrizc [i][j] + "]"); 
          }
          System.out.println();
        }
        break;
        
        case 6:
        do{
            System.out.print("Ingrese el número de filas de la matriz:");
            filas  = lector.nextInt();
            if(filas <= 0){
                System.out.println("El valor debe ser mayor a cero.");
                intentos--;
            }else{
                break;
            }   
            }while(intentos > 0);
            if(intentos == 0){
                System.out.println("***Usted supero el numero maximo de intentos***.");
                break;
            }

         do{
                 System.out.print("Ingrese el número de columnas de la matriz:");
                 columnas = lector.nextInt();
           
            if(columnas <= 0){
                System.out.println("El valor debe ser mayor a cero.");
                intentos--;
            }else{
                break;
            }   
            }while(intentos > 0);
            if(intentos == 0){
                System.out.println("***Usted supero el numero maximo de intentos***.");
                break;
            }
        
        int[][] matrizOriginal = new int[filas][columnas];
        System.out.println("Ingrese los valores de la matriz:");
        for (i = 0; i < filas; i++) {
            for (j = 0; j < columnas; j++) {
                System.out.print("[" + (i+1) + "," + (j+1) + "]: ");
                matrizOriginal[i][j] = lector.nextInt();
            }
        }
        
        System.out.print("Ingrese el valor del escalar: ");
        int escalar = lector.nextInt();

        int[][] matrizResultado = new int[filas][columnas];
        for (i = 0; i < filas; i++) {
            for (j = 0; j < columnas; j++) {
                matrizResultado[i][j] = matrizOriginal[i][j] * escalar;
            }
        }
        System.out.println("Matriz resultado:");
        for (i = 0; i < filas; i++) {

            for ( j = 0; j < columnas; j++) {
                System.out.print("["+matrizResultado[i][j] + "]");
            }
            System.out.println();
        }
        break;

        case 7:
         do{
            System.out.print("Ingrese el número de filas de la matriz A:");
            filaA = lector.nextInt();

            if(filaA <= 0){
                System.out.println("El valor debe ser mayor a cero.");
                intentos--;

            }else{
                break;
            }   

            }while(intentos > 0);
            if(intentos == 0){
                System.out.println("***Usted supero el numero maximo de intentos***.");
                break;
            }

            do{
                 System.out.print("Ingrese el número de columnas de la matriz A:");
                 columnaA = lector.nextInt();
           
            if(columnaA <= 0){
                System.out.println("El valor debe ser mayor a cero.");
                intentos--;
            }else{
                break;
            }  

            }
            while(intentos > 0);
            if(intentos == 0){
                System.out.println("***Usted supero el numero maximo de intentos***.");
                break;
            }

         do{
            System.out.print("Ingrese el número de filas de la matriz A:");
            filaB  = lector.nextInt();

            if(filaB <= 0){
                System.out.println("El valor debe ser mayor a cero.");
                intentos--;

            }else{
                break;
            }   

            }
            while(intentos > 0);
            if(intentos == 0){
                System.out.println("***Usted supero el numero maximo de intentos***.");
                break;
            }
            do{
                 System.out.print("Ingrese el número de columnas de la matriz A:");
                 columnasB = lector.nextInt();
           
            if(columnasB <= 0){
                System.out.println("El valor debe ser mayor a cero.");
                intentos--;
            }else{
                break;
            }   
            }
            
            while(intentos > 0);
            if(intentos == 0){
                System.out.println("***Usted supero el numero maximo de intentos***");
                break;
            }

        if (columnaA != columnasB) {
            System.out.println("Error!!! ****Las matrices no son compatibles para la multiplicación.****");
            return;
        }

        int[][] matrizA = new int[filaA][columnaA];
        int[][] matrizB = new int[columnaA][columnasB];

        System.out.println("Ingrese los elementos de la matriz A:");
        for ( i = 0; i < filaA; i++) {
            for (j = 0; j < columnaA; j++) {
              System.out.print("[" +(i+1) + "][" + (j+1) + "]:");
                matrizA[i][j] = lector.nextInt();
            }
        }

        System.out.println("Ingrese los elementos de la matriz B:");
        for ( i = 0; i < columnaA; i++) {
            for ( j = 0; j < columnasB; j++) {
              System.out.print("[" + (i+1) + "][" + (j+1) + "]:");
                matrizB[i][j] = lector.nextInt();
            }
        }

        int[][] MatrizResultado = new int[filaA][columnasB];

        for ( i = 0; i < filaA; i++) {
            for (j = 0; j < columnasB; j++) {
                for ( k = 0; k < columnaA; k++) {
                    MatrizResultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        System.out.println("El resultado de la multiplicación de matrices es:");
        for (i = 0; i < filaA; i++) {
            for ( j = 0; j < columnasB; j++) {
                System.out.print("["+MatrizResultado[i][j] + "]");
            }
            System.out.println();
        }
        break;

        case 8:
        do{
        System.out.print("Ingrese el número de filas: ");
        filas = lector.nextInt();

        if(filas <= 0){
            System.out.println("El valor debe ser mayor a cero.");
            intentos--;

        }else{
            break;
        }

       }
       while(intentos > 0);
       if(intentos == 0){
        System.out.println("***Usted supero el numero maximo de intentos***.");
        break;
       }

        do{
        System.out.print("Ingrese el número de columnas: ");
        columnas = lector.nextInt();
        if(columnas <=0){
          System.out.println("El valor debe ser mayor a cero.");
          intentos--;
        }else{
          break;
        }
      }while(intentos > 0);
        if (intentos == 0){
          System.out.println("***Usted supero el numero maximo de intentos***.");
        }
        
        int[][] mtriz = new int[filas][columnas];

        for ( i = 0; i < filas; i++) {
            for ( j = 0; j < columnas; j++) {
                if (i == j) {
                    mtriz[i][j] = 1;
                } else {
                    mtriz[i][j] = 0;
                }
            }
        }
        for (i = 0; i < filas; i++) {
            for (j = 0; j < columnas; j++) {
                System.out.print("["+mtriz[i][j] + "]");
            }
            System.out.println();
        }
        
        break;
        case 9:
        do{
        System.out.print("Ingrese el número de filas: ");
        filas = lector.nextInt();
        if(filas <= 0){
            System.out.println("El valor debe ser mayor a cero.");
            intentos--;
        }else{
            break;
        }
         }while(intentos>0);
         if(intentos == 0){
            System.out.println("***Usted supero el numero maximmo de intentos***");
            break;
         }
         do{
        System.out.print("Ingrese el número de columnas: ");
        columnas = lector.nextInt();
        if(columnas <= 0){
            System.out.println("El valor debe ser mayor a cero.");
            intentos--;
        }else{
            break;
        }
         }while(intentos>0);
         if(intentos == 0){
            System.out.println("***Usted supero el numero maximmo de intentos***");
            break;
         }

        if (filas != columnas) {
            System.out.println("La matriz debe ser cuadrada para tener inversa.");
            return;
        }

        float [][] matriza = new float [filas][columnas];

        System.out.println("Ingrese los elementos de la matriz:");
        for (i = 0; i < filas; i++) {
            for ( j = 0; j < columnas; j++) {
              System.out.print(" [" + (i+1) + "][" + (j+1)+ "]:");
           matriza[i][j] = lector.nextFloat();
            }
        }
        float [][] identidad = new float [filas][filas];

        for ( i = 0; i < filas; i++) {
            identidad[i][i] = 1;
        }

        for ( i = 0; i < filas; i++) {
            max = i;
            for ( j = i + 1; j < filas; j++) {
                if (Math.abs(matriza[j][i]) > Math.abs(matriza[max][i])) {
                    max = j;
                }
            }

            float [] temp = matriza[i];
            matriza[i] = matriza[max];
            matriza[max] = temp;

            temp = identidad[i];
            identidad[i] = identidad[max];
            identidad[max] = temp;

            if (matriza[i][i] == 0) {
                System.out.println("***La matriz no tiene inversa****.");
                return;
            }
             diviso = matriza[i][i];
            for (j = 0; j < columnas; j++) {
                matriza[i][j] /= diviso;
                identidad[i][j] /= diviso;
            }
            for (j = i + 1; j < filas; j++) {
                  factor = matriza[j][i];
                for ( k = 0; k < columnas; k++) {
                    matriza[j][k] -= factor * matriza[i][k];
                    identidad[j][k] -= factor * identidad[i][k];
                }
            }
        }
        for ( i = filas - 1; i > 0; i--) {

            for ( j = i - 1; j >= 0; j--) {

                 factor = matriza[j][i];
                for (k = 0; k < columnas; k++) {
                    matriza[j][k] -= factor * matriza[i][k];
                    identidad[j][k] -= factor * identidad[i][k];
                }
            }
        }

        System.out.println("La inversa de la matriza es:");
        for ( i = 0; i < filas; i++) {
            for ( j = 0; j < columnas; j++) {
                System.out.print("["+identidad[i][j] + "] ");
            }
            System.out.println();
        }                                          
        break;

        case 10:
       
         do{
        System.out.print("Ingrese el número de filas: ");
        filas = lector.nextInt();
        if(filas <= 0){
            System.out.println("El valor debe ser mayor a cero.");
            intentos--;
        }else{
            break;
        }
         }
         while(intentos>0);

         if(intentos == 0){
            System.out.println("***Usted supero el numero maximmo de intentos***");
            break;
         }
         do{

        System.out.print("Ingrese el número de columnas: ");
        columnas = lector.nextInt();

        if(columnas <= 0){
            System.out.println("El valor debe ser mayor a cero.");
            intentos--;
        }else{
            break;
        }
         }
         while(intentos>0);
         if(intentos == 0){
            System.out.println("****Usted supero el numero maximmo de intentos***");
            break;
         }
         
        if (filas != columnas) {
            System.out.println("La matriz debe ser cuadrada para tener inversa.");
            return;
        }
        
        if (filas != columnas) {
            System.out.println("+***La matriz debe ser cuadrada para calcular el determinante****.");
            return;
        }
        int [][] mariz = new int [filas][columnas];

        System.out.println("Ingrese los elementos de la matriz:");

        for ( i = 0; i < filas; i++) {

            for ( j = 0; j < columnas; j++) {

                 System.out.print(" [" + (i+1) + "][" + (j+1)+ "]:");
                mariz[i][j] = lector.nextInt();
            }
        }
         det = 1;
        for ( i = 0; i < filas; i++) {

            max = i;

            for ( j = i + 1; j < filas; j++) {

                if (Math.abs(mariz[j][i]) > Math.abs(mariz[max][i])) {
                    max = j;
                }
            }

            int [] temp = mariz[i];

            mariz[i] = mariz[max];

            mariz[max] = temp;

            if (mariz[i][i] == 0) {
                System.out.println("******La martiz es singular y no tiene determinante.******");
                return;
            }

            det *= mariz[i][i];

             divisor = mariz[i][i];
            for ( j = 0; j < columnas; j++) {
                mariz[i][j] /= divisor;
            }

            for (j = i + 1; j < filas; j++) {
                factor = mariz[j][i];

                for ( k = 0; k < columnas; k++) {
                    mariz[j][k] -= factor * mariz[i][k];
                }
            }
        }
        System.out.println("El determinante de la matriz es: " + det);

        break;

        case 11:

        System.out.println("********* Ha decidido salir de el programa.*********");
        break;

       }
       lector.close();       
    }
}
