public class Ventas {
    public static void main(String[] args) {
        //creo la matriz de ventas 
        int [][] ventas = {
            {500,100,0},
            {0,80,800},
            {50,150,400}
        };

        //cuantas veces se vendio mas de 500
        int ventasAltas =contarVentasAltas(ventas);
        System.out.println("La cantidad de veces que se vendio más de 500.000 es :"+ventasAltas);
        //promedio delas notas bajas menores a 100
        double promedio = promedioVentasBajas(ventas);
        System.out.println("El promedio de las ventas por debajo de los 100.000 es : "+promedio);
        //imprimir ventas sin actividad
        imprimirVentasSinActividad(ventas);
    }

    //metodos

    public static int contarVentasAltas(int[][] matriz){
        int numVentasAltas = 0;
        for (int[] tienda : matriz) {
            for (int venta: tienda) {
                if(venta > 500){
                    numVentasAltas++;
                }
            }
        }
        return numVentasAltas;
    }

    public static double promedioVentasBajas(int[][] matriz){
        double suma = 0;
        int numVentasBajas = 0;
        for (int[] tienda : matriz) {
            for (int venta: tienda) {
                if(venta < 100){
                    numVentasBajas++;
                    suma += venta;
                }
            }
        }
        return suma/numVentasBajas ;
    }

    public static void imprimirVentasSinActividad(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j] == 0){
                    System.out.println("Ventas iguales a 0 en la posicion "+i+" en i y "+j+" en j ");
                }
            }
        }
    }

}
