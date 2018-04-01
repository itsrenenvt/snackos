/* Pertence al paquete de nombre: frames */
package frames;

/*Bibliotecas importadas, para la utilización 
* de sus recursos en la clase
*/
import java.sql.*;

/* Inicio de la clase conexión */
public class conexion {
    
    /* Variables globales de tipo privado. */
    private Connection connection;
    private Statement statement;
    private ResultSet resultset;
    
    /**METODO CONECTAR, ACTIVIDADES: 
     *Este metodo establece la conexión con el servidor y la basde de datos
     */
    public void conectar(){
    /*Variable de local de tipo string inicializada.*/
    String url="";
    
    /*Excepción*/
    try{
        /*Parametro que conectan con la base de datos*/
        Class.forName("org.postgresql.Driver");
        /**Datos de la base de datos:
         *-Dirección IP
         *-Nombre
         *-Usuario
         *-Contraseña
         */
        url="jdbc:postgresql://127.0.0.1:5432/toris?user=postgres&password=LaRanaRene";
        /*Driver*/
        connection = DriverManager.getConnection(url);
    } /*Atrapa el error en una excepcion*/
    catch (Exception e){
        /*Imprime el tipo de error que origina*/
        System.out.println(e.toString());
        System.out.println(url);
    }
    }
    
    /**METODO SELECCIONAR, ACTIVIDADES: 
     *Este metodo nos permite hacer consultas en la base de datos a traves del IDE*/
    public ResultSet select (String sql){
        try{
            statement = connection.createStatement();
            resultset = statement.executeQuery(sql);
        }catch(Exception e){
            /*Imprime el tipo de error que origina*/
            System.out.println(e.toString());
        }
        /*Regresa el valor obtenido de la consulta*/
        return resultset;
    }
    
    /**METODO CERRAR, ACTIVIDADES: 
     * Permite cerrar una conexion con el servidor y la base de datos.*/
    public void cerrar(){
        try{
            statement.close();
            connection.close();
        }catch(Exception e){
            /*Imprime el tipo de error que origina*/
            System.out.println(e.toString());
        }
    }
}


