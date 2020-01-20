package Funciones;

import sun.security.util.Length;

public class FuncionesMatematicas {

    /* esCapicua: Devuelve verdadero si el número que se pasa como parámetro es capicúa y falso en caso contrario*/
    public static boolean esCapicua(int x) {
        boolean capicua = false;
        if (x >= 10 && x < 100) {
            if (x / 10 == x % 10) {
                capicua = true;
            }
        }
        if (x >= 100 && x < 1000) {
            if (x / 100 == x % 10) {
                capicua = true;
            }
        }
        if (x >= 1000 && x < 10000) {
            if ((x / 1000 == x % 10) && ((x / 100 % 10) == (x / 10 % 10))) {
                capicua = true;
            }
        }
        if (x >= 10000 && x < 100000) {
            if ((x / 10000 == x % 10) && ((x / 1000 % 10) == (x / 10 % 10))) {
                capicua = true;
            }
        }
        return capicua;

    }

    /*esPrimo: Devuelve verdadero si el número que se pasa como parámetro
    es primo y falso en caso contrario.*/
    public static boolean esPrimo(int x) {
        boolean esPrimo = true;
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                esPrimo = false;
            }
        }
        return esPrimo;
    }

    /* siguientePrimo: Devuelve el menor primo que es mayor al número que
       se pasa como parámetro.*/
    public static int siguientePrimo(int x) {
        int n = (x + 1);
        boolean esPrimo;
        do {
            esPrimo = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    esPrimo = false;
                }
            }
            if (esPrimo==false){
                n++;
            }
        } while (esPrimo == false);
           return n;
    }

    /* potencia: Dada una base y un exponente devuelve la potencia.*/
    public static int potencia(int x, int y){
        int potencia = x;
        if (y!=0){
        for (int i = 1; i<y; i++){
            potencia = potencia * x;
        }
        }else {
            potencia = 1;
        }
        return potencia;
}
   
    /*digitos: Cuenta el número de dígitos de un número entero.*/
    
    public static int digitos(int x){
        int digitos = 0;
        
        do {
            x = x/10;
            digitos++;
        }while(x>0);
        
        return digitos;
    }
    
    //voltea: Voltea una serie de numeros
    public static int voltear(int x){
        int numReves = 0;
    
        while (x > 0) {
            numReves = (numReves * 10) + (x % 10);
            x = x / 10;
        }
        
        return numReves;
    }
    
    //voltea: Voltea una serie de numeros
    public static long voltear(long x){
        long numReves = 0;
    
        while (x > 0) {
            numReves = (numReves * 10) + (x % 10);
            x = x / 10;
        }
        
        return numReves;
    }
    
    
    /*digitoN: Devuelve el dígito que está en la posición n de un número
    entero. Se empieza contando por el 0 y de izquierda a derecha.*/
    public static long digitoN(long x, int n){
        
        int div=1;
        int cifras=1;
        long y = x;
        
        do {
            y = y /10;
            cifras++;
        } while (y>10);
        
        for (int i = 1; i<cifras; i++){
            div*=10;
        }
       
        for (int i = 0; i<n; i++){
            x = x*10;
        }
        
        x = x/div;
        x = x%10;
         
        return x;
        
    }
    
    /*posicionDeDigito: Da la posición de la primera ocurrencia de un dígito
      dentro de un número entero. Si no se encuentra, devuelve -1.*/
    public static int posicionDigito(int x, int n){
        boolean encontrado = false;
        int posicion = 0;
        int y = x;
        int cifras = 1;
        int div;
        int buscando;
        
        do {
            y = y /10;
            cifras++;
        }while(y>10);
        
        div = (int)Math.pow(10, (cifras-1));
        
        do {
           buscando = x;
           buscando/=div;
           
           if (buscando>9){
               buscando%=10;
           }
    
           if (buscando==n){
               encontrado=true;
           } else {
               div/=10;
               posicion++;
           }
           
           if (posicion>(cifras-1)){
               posicion=-1;
               encontrado=true;
           }
           
        }while(encontrado==false);
        
        return posicion;
    }
    
    //quitaPorDetras: Le quita a un número n dígitos por detrás (por la derecha).
    public static int quitaDetras(int x, int n){
        int div = 10;
        int numFinal;
        
        for (int i = 1; i<n; i++){
            div*=10;
        }
        
        numFinal = x/div;
        
        return numFinal;
    }
    
    
    //quitaPorDelante: Le quita a un número n dígitos por delante (por la izquierda).
    public static int quitaDelante(int x, int n){
        int y = x;
        int cifras = 1;
        int div;
        
        do {
            y = y /10;
            cifras++;
        }while(y>10);
        
        div = (int)Math.pow(10, (cifras-1));
        
        for (int i = 0; i<(n-1); i++){
            div/=10;
        }
        
        x %= div;
        
        return x;
    }
    
    //. pegaPorDetras: Añade un dígito a un número por detrás.
    public static int pegaDetras(int x, int n){
        x*=10;
        x+=n;
        return x;
    }
    
    //pegaPorDelante: Añade un dígito a un número por delante.
    public static int pegaDelante(int x, int n){
        int y = x;
        int cifras = 1;
        
        do {
            y = y /10;
            cifras++;
        }while(y>10);
        
        int mult = (int)Math.pow(10, cifras);
        
        n *= mult;
        x+=n;

        return x;
    }
    
    //juntaNumeros: Pega dos números para formar uno.
    public static int juntaNumeros(int x, int y){
        int z = y;
        int cifras = 1;
        
        do {
            z = z /10;
            cifras++;
        }while(z>10);
        
        int mult = (int)Math.pow(10, cifras);
        
        x*=mult;
        x+=y;
        
        return x;
    }
    
    //trozoDeNumero: Toma como parámetros las posiciones inicial y final 
    //dentro de un número y devuelve el trozo correspondiente.
    public static int trozoNumero(int x, int n1, int n2){
        
        int div1;
        int div2;
        
        int z = x;
        int cifras = 1;
        
        do {
            z = z /10;
            cifras++;
        }while(z>10);
        
        
        x = quitaDetras(x, ((cifras-1)-n2));
        
        x = quitaDelante(x, (n1));
        

        
        return x;
    }
    
    
    public static long binarioDecimal(long x){
        long dig;
        long decimal = 0;
        int exp = 0;

        while (x != 0) {
            dig = x % 10;
            decimal = decimal + (dig * (int)Math.pow(2, exp));
            exp++;
            x = x / 10;
        }
        
        return decimal;
    }
    
  
    
    public static int decimalBinario(int decimal) {
        if (decimal == 0) {
            return 0;
        }

        int binario = 1;

        while (decimal > 1) {
            binario = pegaDetras(binario, decimal % 2);
            decimal = decimal / 2;
        }
        binario = pegaDetras(binario, 1);
        binario = voltear(binario);
        binario = quitaDetras(binario, 1);

        return binario;
    }
    
    //Genera un array de tamaño n con números aleatorios cuyo intervalo (mínimo y máximo) se indica como parámetro.
    public static int[] generarArray(int n, int min, int max){
         int [] array = new int[n];
         
         int dif = max - min;
         for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*(dif+1))+min;
        }
        
        return array;
    }
    
    //. minimoArrayInt: Devuelve el mínimo del array que se pasa como parámetro.
    public static int minimoArray(int array[]){
        int minimo = Integer.MAX_VALUE;
         
        for (int i = 0; i<array.length; i++){
            if (array[i]<minimo){
                minimo=array[i];
            }
        }
        return minimo;
    }
    
    //. maximoArrayInt: Devuelve el máximo del array que se pasa como parámetro.
    public static int maximoArray(int array[]){
        int maximo = Integer.MIN_VALUE;
         
        for (int i = 0; i<array.length; i++){
            if (array[i]>maximo){
                maximo=array[i];
            }
        }
        return maximo;
    }
    
    // mediaArrayInt: Devuelve la media del array que se pasa como parámetro
    public static int mediaArray(int array[]){
        int suma = 0;
        int media;
         
        for (int i = 0; i<array.length; i++){
            suma+=array[i];
        }
        media = suma/array.length;
        return media;
    }
    
    //estaEnArrayInt: Dice si un número está o no dentro de un array.
    public static boolean estaArray(int array[], int num){
        boolean dentro = false;
        
        for (int i = 0; i<array.length; i++){
            if (array[i]==num){
                dentro=true;
            }
        }
        
        return dentro;
    }
    
    //posicionEnArray: Busca un número en un array y devuelve la posición (el índice) en la que se encuentra.
    public static int posicionArray(int array[], int num){
        int posicionNum = 0;
        
        for (int i = 0; i<array.length; i++){
            if (array[i]==num){
                posicionNum=i;
            }
        }
        
        return posicionNum;
    }
    
    //volteaArrayInt: Le da la vuelta a un array.
    public static int[] volteaArray(int array[]){
        int array2[] = new int[array.length];
        
        for (int i = 0; i<array.length; i++){
            array2[(9-i)]=array[i];
        }
        
        return array2;
    }
    
    //. rotaDerechaArrayInt: Rota n posiciones a la derecha los números de un array.
    public static int[] rotaDerechaArray(int array[]){
        int array2[] = new int [array.length];
        
        for (int i = 0; i<array2.length; i++){
            if (i==0){
            array2[i]=array[(array.length-1)];
            } else {
                array2[i]=array[i-1];
            }
        }
        
        return array2;
    }
    
    //rotaIzquierdaArrayInt: Rota n posiciones a la izquierda los números de un array.
    public static int[] rotaIzquierdaArray(int array[]){
        int array2[] = new int [array.length];
        
        for (int i = 0; i<array2.length; i++){
            if (i==(array2.length-1)){
            array2[i]=array[0];
            } else {
                array2[i]=array[i+1];
            }
        }
        
        return array2;
    }
}

