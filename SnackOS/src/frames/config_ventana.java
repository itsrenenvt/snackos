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
    /*Esta variable ayuda obj_prod colocar el icono de la aplicación.*/
    Toolkit Screen = Toolkit.getDefaultToolkit();
    /*Obtiene las dimensiones de la pantalla.*/
    Dimension SizeScreen = Screen.getScreenSize();
    /*Obtiene el alto de la pantalla.*/
    int HeightScreen = SizeScreen.height;
    /*Obtiene el ancho de la pantalla.*/
    int WidthScreen = SizeScreen.width;
    /*Coloca el icono de la app.*/
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
        administrador obj_admin = new administrador();
        obj_admin.setBounds(WidthScreen/16,HeightScreen/15,1200,629);
        obj_admin.setVisible(true);
        obj_admin.inserta_nombre_usuario(admin);
        obj_admin.setResizable(false);
        obj_admin.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        obj_admin.setIconImage(icon);
    }
    
    /**METODO CLIENTE
     *Este metodo realiza las siguientes actividades:
     * -Dibuja las dimensiones de la pantalla de la clase administrador.
     * -Hace visible la pantalla.
 -Muestra el nombre del obj_cliente.
 -Inutiliza la redimensión de la pantalla.
 -Hace que la ventana ce cierre al abrir otra.
 -Coloca el icono de la aplicación
     */    
    public void cliente(String nom_cliente) {
        /*Variable de tipo clase obj_cliente */
        cliente obj_cliente = new cliente();
        obj_cliente.setBounds(WidthScreen/16,HeightScreen/15,1200,629);
        obj_cliente.setVisible(true);
        obj_cliente.inserta_nombre_cliente(nom_cliente);
        obj_cliente.setResizable(false);
        obj_cliente.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        obj_cliente.setIconImage(icon);
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
        trabajador obj_trabj = new trabajador();
        obj_trabj.setBounds(WidthScreen/16,HeightScreen/15,1200,629);
        obj_trabj.setVisible(true);
        obj_trabj.inserta_nombre_usuario(trabj);
        obj_trabj.setResizable(false);
        obj_trabj.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        obj_trabj.setIconImage(icon);
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
        productos obj_prod = new productos();
        obj_prod.setBounds(WidthScreen/3,HeightScreen/15,400,629);
        obj_prod.setVisible(true);
        obj_prod.letrero(1);
        obj_prod.agregaestado(1);
        obj_prod.generarID();
        obj_prod.setResizable(false);
        obj_prod.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        obj_prod.setIconImage(icon);
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
        cobrar obj_cobrar = new cobrar();
        obj_cobrar.setBounds(WidthScreen/3,HeightScreen/15,400,629);
        obj_cobrar.setVisible(true);
        obj_cobrar.setResizable(false);
        obj_cobrar.añade_total(total,id,nombre);
        obj_cobrar.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        obj_cobrar.setIconImage(icon);
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
        ingredientes obj_ingred = new ingredientes();
        obj_ingred.setBounds(WidthScreen/3,HeightScreen/15,400,629);
        obj_ingred.setVisible(true);
        obj_ingred.letrero(1);
        obj_ingred.agregaestado(1);
        obj_ingred.generarID();
        obj_ingred.setResizable(false);
        obj_ingred.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        obj_ingred.setIconImage(icon);
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
        inicio_sesion obj_iniciosesion = new inicio_sesion();
        obj_iniciosesion.setBounds(WidthScreen/3,HeightScreen/10,400,570);
        obj_iniciosesion.setVisible(true);
        obj_iniciosesion.setResizable(false);
        obj_iniciosesion.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        obj_iniciosesion.setIconImage(icon);
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
        registro_cliente obj_registro = new registro_cliente();
        obj_registro.setBounds(WidthScreen/3,HeightScreen/15,400,629);
        obj_registro.setVisible(true);
        obj_registro.letrero(i);
        obj_registro.agregaestado(i);
        obj_registro.generarID();
        obj_registro.setResizable(false);
        obj_registro.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        obj_registro.setIconImage(icon);
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
        registro_trabajador obj_trabajador = new registro_trabajador();
        obj_trabajador.setBounds(WidthScreen/3,HeightScreen/15,400,643);
        obj_trabajador.setVisible(true);
        obj_trabajador.letrero(1);
        obj_trabajador.agregaestado(1);
        obj_trabajador.generarID();
        obj_trabajador.setResizable(false);
        obj_trabajador.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        obj_trabajador.setIconImage(icon);
    }
    
    /**METODO TICKET
     *Este metodo realiza las siguientes actividades:
     * -Abre el formulario de imprimir ticket.
     * -Dibuja las dimensiones de la pantalla de la clase administrador.
     * -Hace visible la pantalla.
     * -Genera un identificador automatico para el usuario que se esta registrando.
     * -Inutiliza la redimensión de la pantalla.
     * -Hace que la ventana se cierre al abrir otra.
     * -Coloca el icono de la aplicación
     */
    public void ticket(String txt){
        imprime_ticket obj_ticket = new imprime_ticket();
        obj_ticket.setBounds(WidthScreen/13,HeightScreen/8,330,553);
        obj_ticket.setVisible(true);
        obj_ticket.agrega_texto(txt);
        obj_ticket.setResizable(false);
        obj_ticket.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        obj_ticket.setIconImage(icon);
    }
    
}
