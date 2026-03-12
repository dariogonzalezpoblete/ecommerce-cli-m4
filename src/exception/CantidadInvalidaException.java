package exception;

// esto nos permite que el programa no arroje error al colocar una cantidad invalida
public class CantidadInvalidaException extends Exception {
    public CantidadInvalidaException(String mensaje) {
        super(mensaje);
    }
}