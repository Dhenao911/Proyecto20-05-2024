package Proyectoreserva;

public class Computador_portatil {
    
    private String Serial;
    private String Marca;
    private float Tamano;
    private float Precio;
    private String Sistema_Operativo;//Puede ser un entero;
    private String Procesador;


    public String getSerial() {
        return Serial;
    }

    public void setSerial(String serial) {
        Serial = serial;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public float getTamano() {
        return Tamano;
    }

    public void setTamano(float tamano) {
        Tamano = tamano;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float precio) {
        Precio = precio;
    }

    public String getSistema_Operativo() {
        return Sistema_Operativo;
    }

    public void setSistema_Operativo(String sistema_Operativo) {
        Sistema_Operativo = sistema_Operativo;
    }

    public String getProcesador() {
        return Procesador;
    }

    public void setProcesador(String procesador) {
        Procesador = procesador;
    }

    
    
}
