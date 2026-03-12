// importamos el menu de ui
import ui.Menu;

public class Main {
    /**
     * main es el punto de partida. Al ejecutar el programa, Java busca esta función para iniciar.
     */
    public static void main(String[] args) {
        //instancia de nuestro menu
        Menu interfaz = new Menu();

        // Esto mantendrá el programa corriendo hasta que el usuario salga
        interfaz.mostrarMenuPrincipal();
    }
}