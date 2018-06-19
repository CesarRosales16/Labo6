package modelo;

/**
 *
 * @author UCA
 */
public class Filtro {
    private int id;
    private String codigo;
    private String marca;
    private int stock;
    private boolean existencia;

    public Filtro() {
    }

    public Filtro(int id, String codigo, String marca, int stock, boolean exitencia) {
        this.id = id;
        this.codigo = codigo;
        this.marca = marca;
        this.stock = stock;
        this.existencia = exitencia;
    }

    public Filtro(int id, String codigo, String marca, int stock) {
        this.id = id;
        this.codigo = codigo;
        this.marca = marca;
        this.stock = stock;
    }
    
    

    public Filtro(String codigo, String marca, int stock, boolean exitencia) {
        this.codigo = codigo;
        this.marca = marca;
        this.stock = stock;
        this.existencia = exitencia;
    }

    public Filtro(String marca, int stock, boolean exitencia) {
        this.marca = marca;
        this.stock = stock;
        this.existencia = exitencia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean getExistencia() {
        return existencia;
    }

    @Override
    public String toString() {
        return "Filtro{" + "id=" + id + ", codigo=" + codigo + ", marca=" + marca + ", stock=" + stock + ", exitencia=" + existencia + '}';
    }

    public void setExistencia(boolean existencia) {
        this.existencia = existencia;
    }


    
}
