/* Pertence al paquete de nombre: frames */
package frames;

/*Bibliotecas importadas, para la utilización 
* de sus recursos en la clase
*/
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/*Inicio del metodo de la clase*/
public class config_ventana extends Thread implements Runnable {

    /*DECLARACIÓN DE VARIABLES GLOBALES*/
    Toolkit Screen = Toolkit.getDefaultToolkit();
    Dimension SizeScreen = Screen.getScreenSize();
    int HeightScreen = SizeScreen.height;
    int WidthScreen = SizeScreen.width;
    Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/design/icono_snackos.png"));

    /**
     *
     */
    @Override
    /*METODO RUN
    Este metodo desencadena el hilo.
    */
    public void run() {
        iniciar_sesion();
    }

    /**METODO ADMINISTRADOR
     * Este metodo realiza las siguientes actividades:
     * -Dibuja las dimensiones de la pantalla de la clase administrador.
     * -Hace visible la pantalla.
     * -Muestra el nombre del administrador.
     * -Inutiliza la redimensión de la pantalla.
     * -Hace que la ventana ce cierre al abrir otra.
     * -Coloca el icono de la aplicación
     */
    public void administrador(String admin) {
        /*Variable de tipo clase administrador*/
        administrador t = new administrador();
        t.setBounds(WidthScreen/16,HeightScreen/15,1200,629);
        t.setVisible(true);
        t.inserta_nombre_usuario(admin);
        t.setResizable(false);
        t.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        t.setIconImage(icon);
    }
    
    /**METODO CLIENTE
     *Este metodo realiza las siguientes actividades:
     * -Dibuja las dimensiones de la pantalla de la clase administrador.
     * -Hace visible la pantalla.
     * -Muestra el nombre del cliente.
     * -Inutiliza la redimensión de la pantalla.
     * -Hace que la ventana ce cierre al abrir otra.
     * -Coloca el icono de la aplicación
     */    
    public void cliente(String nom_cliente) {
        /*Variable de tipo clase cliente */
        cliente t = new cliente();
        t.setBounds(WidthScreen/16,HeightScreen/15,1200,629);
        t.setVisible(true);
        t.inserta_nombre_cliente(nom_cliente);
        t.setResizable(false);
        t.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        t.setIconImage(icon);
    }
    
    /**METODO TRABAJADOR
     * Este metodo realiza las siguientes actividades:
     * -Dibuja las dimensiones de la pantalla de la clase administrador.
     * -Hace visible la pantalla.
     * -Muestra el nombre del administrador.
     * -Inutiliza la redimensión de la pantalla.
     * -Hace que la ventana ce cierre al abrir otra.
     * -Coloca el icono de la aplicación
     */
    public void trabajador(String trabj) {
        /*Variable de tipo clase administrador*/
        trabajador t = new trabajador();
        t.setBounds(WidthScreen/16,HeightScreen/15,1200,629);
        t.setVisible(true);
        t.inserta_nombre_usuario(trabj);
        t.setResizable(false);
        t.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        t.setIconImage(icon);
    }
    
    /**METODO PRODUCTOS
     *Este metodo realiza las siguientes actividades:
     * -Abre el formulario para añadir, modificar o eliminar un producto.
     * -Dibuja las dimensiones de la pantalla de la clase administrador.
     * -Hace visible la pantalla.
     * -Agrega una imagen de titulo de la pantalla.
     * -Agrega un estado que sirve para determinar una situación.
     * -Genera un identificador automaticamente.
     * -Inutiliza la redimensión de la pantalla.
     * -Hace que la ventana ce cierre al abrir otra.
     * -Coloca el icono de la aplicación
     */  
    public void productos() {
        /*Variable de tipo clase productos*/
        productos a = new productos();
        a.setBounds(WidthScreen/3,HeightScreen/15,400,629);
        a.setVisible(true);
        a.letrero(1);
        a.agregaestado(1);
        a.generarID();
        a.setResizable(false);
        a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        a.setIconImage(icon);
    }
    
    /**METODO COBRAR ORDEN
     *Este metodo realiza las siguientes actividades:
     * -Abre el formulario para añadir, modificar o eliminar un producto.
     * -Dibuja las dimensiones de la pantalla de la clase administrador.
     * -Hace visible la pantalla.
     * -Agrega una imagen de titulo de la pantalla.
     * -Agrega un estado que sirve para determinar una situación.
     * -Genera un identificador automaticamente.
     * -Inutiliza la redimensión de la pantalla.
     * -Hace que la ventana ce cierre al abrir otra.
     * -Coloca el icono de la aplicación
     */  
    public void cobrarorden(String total,String id,String nombre) {
        /*Variable de tipo clase productos*/
        cobrar a = new cobrar();
        a.setBounds(WidthScreen/3,HeightScreen/15,400,629);
        a.setVisible(true);
        a.setResizable(false);
        a.añade_total(total,id,nombre);
        a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        a.setIconImage(icon);
    }
    /**METODO INGREDIENTES
     *Este metodo realiza las siguientes actividades:
     * -Abre el formulario para añadir, modificar o eliminar un ingrediente.
     * -Dibuja las dimensiones de la pantalla de la clase administrador.
     * -Hace visible la pantalla.
     * -Agrega una imagen de titulo de la pantalla.
     * -Agrega un estado que sirve para determinar una situación.
     * -Genera un identificador automaticamente.
     * -Inutiliza la redimensión de la pantalla.
     * -Hace que la ventana ce cierre al abrir otra.
     * -Coloca el icono de la aplicación
     */ 
    public void ingredientes() {
        /*Variable de tipo clase ingredientes*/
        ingredientes a = new ingredientes();
        a.setBounds(WidthScreen/3,HeightScreen/15,400,629);
        a.setVisible(true);
        a.letrero(1);
        a.agregaestado(1);
        a.generarID();
        a.setResizable(false);
        a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        a.setIconImage(icon);
    }
    
    /**METODO INICIAR SESIÓN
     *Este metodo realiza las siguientes actividades:
     * -Abre la pantalla de inicio de sesión
     * -Dibuja las dimensiones de la pantalla de la clase administrador.
     * -Hace visible la pantalla.
     * -Inutiliza la redimensión de la pantalla.
     * -Hace que la ventana se cierre al abrir otra.
     * -Coloca el icono de la aplicación
     */ 
    public void iniciar_sesion(){
        /*Variable de tipo clase inicio_sesion*/
        inicio_sesion a = new inicio_sesion();
        a.setBounds(WidthScreen/3,HeightScreen/10,400,570);
        a.setVisible(true);
        a.setResizable(false);
        a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        a.setIconImage(icon);
    }
    
    /**METODO REGISTRO
     *Este metodo realiza las siguientes actividades:
     * -Abre el formulario de registro.
     * -Dibuja las dimensiones de la pantalla de la clase administrador.
     * -Hace visible la pantalla.
     * -Genera un identificador automatico para el usuario que se esta registrando.
     * -Inutiliza la redimensión de la pantalla.
     * -Hace que la ventana se cierre al abrir otra.
     * -Coloca el icono de la aplicación
     */ 
    public void registro_cliente(int i){
        /*Variable local de tipo clase registro.*/
        registro_cliente a = new registro_cliente();
        a.setBounds(WidthScreen/3,HeightScreen/15,400,629);
        a.setVisible(true);
        a.letrero(i);
        a.agregaestado(i);
        a.generarID();
        a.setResizable(false);
        a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        a.setIconImage(icon);
    }
    
    /**METODO REGISTRO TRABAJADOR
     *Este metodo realiza las siguientes actividades:
     * -Abre el formulario de registro.
     * -Dibuja las dimensiones de la pantalla de la clase administrador.
     * -Hace visible la pantalla.
     * -Genera un identificador automatico para el usuario que se esta registrando.
     * -Inutiliza la redimensión de la pantalla.
     * -Hace que la ventana se cierre al abrir otra.
     * -Coloca el icono de la aplicación
     */ 
    public void registro_trabajador(){
        /*Variable local de tipo clase registro.*/
        registro_trabajador a = new registro_trabajador();
        a.setBounds(WidthScreen/3,HeightScreen/15,400,643);
        a.setVisible(true);
        a.letrero(1);
        a.agregaestado(1);
        a.generarID();
        a.setResizable(false);
        a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        a.setIconImage(icon);
    }
    
    public void ticket(String txt){
        imprime_ticket t = new imprime_ticket();
        //t.setLocationRelativeTo(null);
        t.setBounds(WidthScreen/13,HeightScreen/8,330,553);
        t.setVisible(true);
        t.agrega_texto(txt);
        t.setIconImage(icon);
    }
    
}
