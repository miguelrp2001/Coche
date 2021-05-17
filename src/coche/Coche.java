package coche;

/**
 *
 * @author Profesor
 */
public class Coche {

    private String nombre;
    private double precio;
    private double precioIVA;
    private int stock;

    /* Constructor sin argumentos */

    /**
     * Coche
     */

    public Coche ()
    {
    }
    
    // Constructor con parámetro para iniciar todas las propiedades de la clase
    // Coche

    /**
     *
     * @param nom
     * @param precio
     * @param stock
     */
    
    public Coche (String nom, double precio, int stock)
    {
        this.nombre =nom;
        this.precio=precio;
        this.stock=stock;
    }

    /**
     *  Método para asignar el nombre del Coche
     * @param nom
     */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }


    /**
     * Método que me devuelve el nombre del Coche
     * @return nombre
     */
    public String obtenerNombre()
    {
        return getNombre();
    }

    /**
     *  Método que me devuelve el stock de coches disponible en cada momento
     * @return
     */
     public int obtenerStock ()
    {
        return getStock();
    }

    /** Método para comprar coches. Modifica el stock.
     * Este método va a ser probado con Junit
     *
     * @param cantidad
     * @throws java.lang.Exception
     */
    public void comprar(int cantidad) throws Exception
    {
        if (cantidad<0) {
            throw new Exception("No se puede comprar un nº negativo de coches");
        }
        setStock(getStock() + cantidad);
    }

    
    /**
    * 
    * @param cantidad
    * @param rapel
    * 
    * @throws java.lang.Exception
    */

    public void vender (int cantidad, int rapel) throws Exception
    {
        if (cantidad <= 0) {
            throw new Exception ("No se puede vender una cantidad negativa de coches");
        }
        if (obtenerStock()< cantidad) {
            throw new Exception ("No  hay suficientes coches para vender");
        }
        setStock(getStock() - cantidad);
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the precioIVA
     */
    public double getPrecioIVA() {
        return precioIVA;
    }

    /**
     * @param precioIVA the precioIVA to set
     */
    public void setPrecioIVA(double precioIVA) {
        this.precioIVA = precioIVA;
    }

    /**
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }
    
}  
   
    

