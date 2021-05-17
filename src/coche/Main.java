package coche;

/**
 *
 * @author
 */
public class Main {
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Coche mycar;
        int stockActual;
        
        mycar = new Coche("Opel",12000,500);
        vende_car(mycar);
        
        compra_car(mycar);
        stockActual = mycar.obtenerStock();
        System.out.println("El stock actual es "+ stockActual );
    }

    private static void compra_car(Coche mycar) {
        try
        {
            System.out.println("Compra de Coches");
            mycar.comprar(500);
        } catch (Exception e)
        {
            System.out.print("Fallo al ingresar " + e);
        }
    }

    private static void vende_car(Coche mycar) {
        try
        {
            System.out.println("Venta de Coches");
            mycar.vender(300, 100);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender " + e);
        }
    }

}