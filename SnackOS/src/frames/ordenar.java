/* Pertence al paquete de nombre: frames */
package frames;

/*Bibliotecas importadas, para la utilización 
* de sus recursos en la clase
*/
import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*Inicio de la clase ordenar*/
public class ordenar extends javax.swing.JFrame {
    /**DECLARACIÓN DE VARIABLES GLOBALES*/
    /*Declara conexion con la base de datos*/
    conexion c= new conexion();
    /*Variable de tipo clase administrador*/
    administrador t = new administrador();
    /*Declara objeto calendario*/
    Calendar calendario = new GregorianCalendar();
    /*Declara enteros para hora, minutos, segundos.*/
    int hora, minutos, segundos;
    /*Declara enteros para dia , mes ,año*/
    int dia,mes,annio;
    /*Declara entero para estado*/
    int estado;
    /*Declara entero para transacción*/
    int transaccion;
    /*Declara String para el id del producto*/
    String idproducto_orden;
    /*Declara String para el id del cliente*/
    String idcliente;
    
    /*Constructor*/
    public ordenar() {
        super("SnackOS");
        initComponents();
        this.estado=estado;
        this.transaccion=transaccion;
        this.idproducto_orden=idproducto_orden;
        this.idcliente=idcliente;
        
        hora =calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND);
        dia = calendario.get(Calendar.DATE);
        mes = calendario.get(Calendar.MONTH)+1;
        annio = calendario.get(Calendar.YEAR);

       //palbtnmodificar();
    }

    /**
     * Este metodo es llamado desde el constructor para inicializar el formulario.
     * PELIGRO: No modificar este código. El contenido de este mettodo es siempre
     * regenerado por el editor del formulario.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_agregar = new javax.swing.JPanel();
        btn_listo = new javax.swing.JButton();
        txt_precio = new javax.swing.JTextField();
        txt_categoria = new javax.swing.JTextField();
        txt_recipiente = new javax.swing.JTextField();
        txt_presentacion = new javax.swing.JTextField();
        txt_ID = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_descuento = new javax.swing.JTextField();
        txt_existencia = new javax.swing.JTextField();
        btn_salir = new javax.swing.JButton();
        btn_minimizar = new javax.swing.JButton();
        btn_volver_inicio = new javax.swing.JButton();
        msj_comprobacion = new javax.swing.JLabel();
        img_letrero = new javax.swing.JLabel();
        img_titulo = new javax.swing.JLabel();
        img_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnl_agregar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_listo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/listo.png"))); // NOI18N
        btn_listo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 12, 45), 3));
        btn_listo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_listo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/design/listoblack.png"))); // NOI18N
        btn_listo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_listo(evt);
            }
        });
        pnl_agregar.add(btn_listo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 510, 130, 40));

        txt_precio.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        txt_precio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_precio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        pnl_agregar.add(txt_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 160, 30));

        txt_categoria.setEditable(false);
        txt_categoria.setBackground(new java.awt.Color(255, 255, 255));
        txt_categoria.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        txt_categoria.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_categoria.setToolTipText("");
        txt_categoria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        pnl_agregar.add(txt_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 160, 30));

        txt_recipiente.setEditable(false);
        txt_recipiente.setBackground(new java.awt.Color(255, 255, 255));
        txt_recipiente.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        txt_recipiente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_recipiente.setToolTipText("");
        txt_recipiente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        pnl_agregar.add(txt_recipiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 160, 30));

        txt_presentacion.setEditable(false);
        txt_presentacion.setBackground(new java.awt.Color(255, 255, 255));
        txt_presentacion.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        txt_presentacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_presentacion.setToolTipText("");
        txt_presentacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        pnl_agregar.add(txt_presentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 160, 30));

        txt_ID.setEditable(false);
        txt_ID.setBackground(new java.awt.Color(255, 255, 255));
        txt_ID.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        txt_ID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_ID.setToolTipText("");
        txt_ID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        pnl_agregar.add(txt_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 160, 30));

        txt_nombre.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        txt_nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_nombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        pnl_agregar.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 160, 30));

        txt_descuento.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        txt_descuento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_descuento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        pnl_agregar.add(txt_descuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 160, 30));

        txt_existencia.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        txt_existencia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_existencia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        pnl_agregar.add(txt_existencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, 160, 30));

        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/exitapple.png"))); // NOI18N
        btn_salir.setBorder(null);
        btn_salir.setContentAreaFilled(false);
        btn_salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_salir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/design/exitwo.png"))); // NOI18N
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salir(evt);
            }
        });
        pnl_agregar.add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 30, 30));

        btn_minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/minapple.png"))); // NOI18N
        btn_minimizar.setBorder(null);
        btn_minimizar.setContentAreaFilled(false);
        btn_minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_minimizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/design/mintwo.png"))); // NOI18N
        btn_minimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_minimizar(evt);
            }
        });
        pnl_agregar.add(btn_minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 30, 30));

        btn_volver_inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/userapple.png"))); // NOI18N
        btn_volver_inicio.setBorder(null);
        btn_volver_inicio.setContentAreaFilled(false);
        btn_volver_inicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_volver_inicio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/design/usertwo.png"))); // NOI18N
        btn_volver_inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volver_inicio(evt);
            }
        });
        pnl_agregar.add(btn_volver_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 30, 30));

        msj_comprobacion.setFont(new java.awt.Font("Quicksand", 1, 12)); // NOI18N
        msj_comprobacion.setForeground(new java.awt.Color(255, 255, 255));
        msj_comprobacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnl_agregar.add(msj_comprobacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 550, 290, 40));

        img_letrero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        pnl_agregar.add(img_letrero, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 190, 30));

        img_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img_titulo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        pnl_agregar.add(img_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 280, 60));

        img_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/frameagregar.png"))); // NOI18N
        pnl_agregar.add(img_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**Metodo letrero, este metodo recibe un parametro de tipo int, el cual
     * forma parte del nombre del asset.
     */
    public void letrero(int i){
        String ltr = String.valueOf(i);
            img_letrero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/letrero"+ltr+".png")));
            img_titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/cabecera"+ltr+".png")));
    }
    
    /**Metodo coloca id, actividades:
     * -Declara una variable de tipo base de datos.
     * -Se conecta con la base de datos.
     * -Declara variable de tipo string que almacena la consulta.
     * -Almacena el resultado de la consulta en una variable de tipo int.
     * -Coloca el resultado en el textfield txt_ID
     */
    public void colocaID() throws SQLException{
        conexion basedatos = new conexion();
        basedatos.conectar();
        
        String url ="select max(\"ID_Orden\") from ordenes";
        
        ResultSet dato = basedatos.select(url);
        try{
        while(dato.next()){
            int idnext = Integer.parseInt(dato.getString(1));
               //System.out.println("ESTADO: "+estado);
               if(estado==4){
                   txt_ID.setText(""+(idnext+1));
               }if(estado==5){
                    txt_ID.setText(idproducto_orden);
               }
        }
        }catch (SQLException ex){
            Logger.getLogger(ordenar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**Metodo genera id, desencadena el metodo coloca id*/
    public void generarID(){
        try {
            colocaID();
            transaccion();
        } catch (SQLException ex) {
            Logger.getLogger(ordenar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**Metodo modifica, recibe parametros para almaenarlos en textfields
     * correspondientes.
     */
    public void modifica(String ID, String name, String tipo, String precio, String recipiente, String presentacion, String descuento, String existencia){
        
        idproducto_orden=ID;//System.out.println("ID_ORDEN_PRODUCTO: " + idproducto);
        txt_nombre.setText(String.valueOf(name));
        txt_categoria.setText(tipo);
        txt_precio.setText(precio);
        txt_recipiente.setText(recipiente);
        txt_presentacion.setText(presentacion);
        txt_descuento.setText(descuento);
        txt_existencia.setText(existencia);
    }
    
    /*Este metodo agrega el estado que recibe por parametro*/
    public void agregaestado(int i){
       estado=i;
   }
    
    /*Este metodo desencadena el metodo accion botones*/
    private void btn_listo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_listo
                  
            try{
                if(verifica()== true){
                    accionbotones();
                }
            }catch (Exception e){
                System.out.println(e.toString());
            } 
        
    }//GEN-LAST:event_btn_listo

    /**Metodo del boton salir, actividades:
     *-Cierra la ventana y termina el proceso de ejcución de la aplicación.
     */
    private void btn_salir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salir
        // TODO add your handling code here:
        /**Método del boton salir, actividades:
         *-Cierra la pantalla.
         *-Finaliza la ejecución del programa.
         */
        this.dispose();
    }//GEN-LAST:event_btn_salir
    private void btn_minimizar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_minimizar
        // TODO add your handling code here:
        /**Método del boton minimizar, actividades:
         *-Minimiza la pantalla.
         */
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btn_minimizar
    private void btn_volver_inicio(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volver_inicio
        // TODO add your handling code here:
                    /**Método del boton para regresar al inicio de sesión, actividades:
     * -Cierra la actual ventana.
     * -Regresa al incicio de sesión
     */ 
     config_ventana cv = new config_ventana();
        cv.start();
        this.dispose();
    }//GEN-LAST:event_btn_volver_inicio

    /*Este metodo obtiene la transacción maxima de la tabla ordenes*/
   public void transaccion(){
       conexion basedatos = new conexion();
        basedatos.conectar();
        
        String url ="select max(\"Transaccion\") from ordenes";
        
        ResultSet dato = basedatos.select(url);
        try{
        while(dato.next()){
            int idnext = Integer.parseInt(dato.getString(1));
            //System.out.println("Transacción: "+idnext);
            transaccion = (idnext+1);
            //txtID.setText(""+(idnext+1));
        }
        }catch (SQLException ex){
            Logger.getLogger(ordenar.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
   
   /**Metodo que obtiene el id del cliente, que inicio sesión y esta realizando
    * la orden
   */
   public void idcliente(String usuario){
        conexion basedatos = new conexion();
        basedatos.conectar();
        
        String url ="select \"ID_Cliente\" from clientes where upper(\"Usuario\") = upper('"+usuario+"')";
        
        ResultSet dato = basedatos.select(url);
        try{
        while(dato.next()){
            //int idnext = Integer.parseInt(dato.getString(1));
            //System.out.println("Transacción: "+idnext);
            idcliente = dato.getString(1);
            //txtID.setText(""+(idnext+1));
        }
        }catch (SQLException ex){
            Logger.getLogger(ordenar.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
   
   /**Metodo accion botones, actividades:
     * -Conecta con la base de datos.
     * -Establece condición.
     * -Si el estado es igual a 1, agrega ingrediente.
     * -Si es igual a 2, actualiza, modifica ingrediente.
     */
   public void accionbotones(){
       
       c.conectar();
       if(estado == 4){
           //System.out.println("AGREGAR");
       c.select("insert into ordenes "
              + "values ('"+txt_ID.getText()+"','"
                           +txt_categoria.getText()+"','"
                           +txt_precio.getText()+"','"
                           +transaccion+"','"
                           +annio+"-"+ mes +"-"+dia+"','"
                           +hora +":"+ minutos +":"+ segundos+"','"
                           +"15000000" +"','"
                           +"Pendiente')");
       
       c.select("insert into orden_producto "
                + "values ('"+idproducto_orden+"','"
                          +txt_ID.getText()+"')");
       
       c.select("insert into cliente_orden "
                + "values ('"+idcliente+"','"
                          +txt_ID.getText()+"')");
       msj_comprobacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/ordenrealizada.png")));
       
       
       //reset();
       }if(estado==5){
           c.select("delete from ordenes where \"ID_Orden\" = '"+txt_ID.getText()+"'");
           c.select("delete from orden_producto where \"ID_Orden\" = '"+txt_ID.getText()+"'");
           c.select("delete from cliente_orden where \"ID_Orden\" = '"+txt_ID.getText()+"'");
           msj_comprobacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/ordencancelada.png")));
       }
   }
   
   /**Este metodo verifica, que al dar clic en listo, los campos no se 
     * encuentren vacios, de ser así regresa un valor booleano falso, si no
     * retorna un true.
    */
   public boolean verifica(){
       /*if(boxpresentación.getSelectedIndex()==0){
           lblmsj.setText("Agrege Presentación");
           return false;
       }else{*/
          return true; 
      // }
       
      
   }
   
   /**Este metodo reinicia las variables a su estado original despues de 
     * ocupar el formulario
     */
   public void reset(){
       txt_ID.setText("");
       txt_nombre.setText("");
       txt_precio.setText("");
       txt_descuento.setText("");
       txt_existencia.setText("");
   }
           
    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_listo;
    private javax.swing.JButton btn_minimizar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JButton btn_volver_inicio;
    private javax.swing.JLabel img_fondo;
    private javax.swing.JLabel img_letrero;
    private javax.swing.JLabel img_titulo;
    private javax.swing.JLabel msj_comprobacion;
    private javax.swing.JPanel pnl_agregar;
    private javax.swing.JTextField txt_ID;
    private javax.swing.JTextField txt_categoria;
    private javax.swing.JTextField txt_descuento;
    private javax.swing.JTextField txt_existencia;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_precio;
    private javax.swing.JTextField txt_presentacion;
    private javax.swing.JTextField txt_recipiente;
    // End of variables declaration//GEN-END:variables
}
