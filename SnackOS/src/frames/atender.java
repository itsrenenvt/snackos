/*Esta clase pertenece al paquete frames*/
package frames;

/*Bibliotecas importadas, para la utilización 
* de sus recursos en la clase
*/
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class atender extends javax.swing.JFrame {

    conexion c = new conexion();
    
    Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/design/snackOS.png"));
    String total_cobrar,id_orden;
    /**
     * Creates new form atender
     */
    public atender() {
        super("SnackOS");
        initComponents();
        this.setIconImage(icon);
    }

    /**
     * Este metodo es llamado desde el constructor para inicializar el formulario.
     * PELIGRO: No modificar este código. El contenido de este mettodo es siempre
     * regenerado por el editor del formulario.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_atender = new javax.swing.JPanel();
        btn_salir = new javax.swing.JButton();
        btn_minimizar = new javax.swing.JButton();
        btn_volver_inicio = new javax.swing.JButton();
        txt_nombreproducto = new javax.swing.JTextField();
        txt_categoria = new javax.swing.JTextField();
        txt_presentación = new javax.swing.JTextField();
        txt_precio = new javax.swing.JTextField();
        txt_descuento = new javax.swing.JTextField();
        txt_fecha = new javax.swing.JTextField();
        txt_total = new javax.swing.JTextField();
        txt_idcliente = new javax.swing.JTextField();
        txt_usuario = new javax.swing.JTextField();
        txt_nombre_cliente = new javax.swing.JTextField();
        txt_app_cliente = new javax.swing.JTextField();
        txt_edificio = new javax.swing.JTextField();
        tx_taula = new javax.swing.JTextField();
        txt_transaccion = new javax.swing.JTextField();
        txt_idorden = new javax.swing.JTextField();
        txt_hora = new javax.swing.JTextField();
        box_idempleado = new javax.swing.JComboBox<>();
        box_estado = new javax.swing.JComboBox<>();
        btn_listo = new javax.swing.JButton();
        btn_cobrar = new javax.swing.JButton();
        txt_nombretrabajador = new javax.swing.JTextField();
        txt_app_trabajador = new javax.swing.JTextField();
        msj_estado = new javax.swing.JLabel();
        msj_atendiendo = new javax.swing.JLabel();
        img_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        pnl_atender.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        pnl_atender.add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, 30, 30));

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
        pnl_atender.add(btn_minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 30, 30));

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
        pnl_atender.add(btn_volver_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 30, 30));

        txt_nombreproducto.setEditable(false);
        txt_nombreproducto.setBackground(new java.awt.Color(255, 255, 255));
        txt_nombreproducto.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        txt_nombreproducto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_nombreproducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        pnl_atender.add(txt_nombreproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 150, 30));

        txt_categoria.setEditable(false);
        txt_categoria.setBackground(new java.awt.Color(255, 255, 255));
        txt_categoria.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        txt_categoria.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_categoria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        pnl_atender.add(txt_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 150, 30));

        txt_presentación.setEditable(false);
        txt_presentación.setBackground(new java.awt.Color(255, 255, 255));
        txt_presentación.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        txt_presentación.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_presentación.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        pnl_atender.add(txt_presentación, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, 150, 30));

        txt_precio.setEditable(false);
        txt_precio.setBackground(new java.awt.Color(255, 255, 255));
        txt_precio.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        txt_precio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_precio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        pnl_atender.add(txt_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 150, 30));

        txt_descuento.setEditable(false);
        txt_descuento.setBackground(new java.awt.Color(255, 255, 255));
        txt_descuento.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        txt_descuento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_descuento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        pnl_atender.add(txt_descuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 150, 30));

        txt_fecha.setEditable(false);
        txt_fecha.setBackground(new java.awt.Color(255, 255, 255));
        txt_fecha.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        txt_fecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_fecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        pnl_atender.add(txt_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 150, 30));

        txt_total.setEditable(false);
        txt_total.setBackground(new java.awt.Color(255, 255, 255));
        txt_total.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        txt_total.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_total.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        pnl_atender.add(txt_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 150, 30));

        txt_idcliente.setEditable(false);
        txt_idcliente.setBackground(new java.awt.Color(255, 255, 255));
        txt_idcliente.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        txt_idcliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_idcliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        pnl_atender.add(txt_idcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 150, 30));

        txt_usuario.setEditable(false);
        txt_usuario.setBackground(new java.awt.Color(255, 255, 255));
        txt_usuario.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        txt_usuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_usuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        pnl_atender.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 150, 30));

        txt_nombre_cliente.setEditable(false);
        txt_nombre_cliente.setBackground(new java.awt.Color(255, 255, 255));
        txt_nombre_cliente.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        txt_nombre_cliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_nombre_cliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        pnl_atender.add(txt_nombre_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, 150, 30));

        txt_app_cliente.setEditable(false);
        txt_app_cliente.setBackground(new java.awt.Color(255, 255, 255));
        txt_app_cliente.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        txt_app_cliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_app_cliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        pnl_atender.add(txt_app_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 350, 150, 30));

        txt_edificio.setEditable(false);
        txt_edificio.setBackground(new java.awt.Color(255, 255, 255));
        txt_edificio.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        txt_edificio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_edificio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        pnl_atender.add(txt_edificio, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 150, 30));

        tx_taula.setEditable(false);
        tx_taula.setBackground(new java.awt.Color(255, 255, 255));
        tx_taula.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        tx_taula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tx_taula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        pnl_atender.add(tx_taula, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, 150, 30));

        txt_transaccion.setEditable(false);
        txt_transaccion.setBackground(new java.awt.Color(255, 255, 255));
        txt_transaccion.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        txt_transaccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_transaccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        pnl_atender.add(txt_transaccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, 150, 30));

        txt_idorden.setEditable(false);
        txt_idorden.setBackground(new java.awt.Color(255, 255, 255));
        txt_idorden.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        txt_idorden.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_idorden.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        pnl_atender.add(txt_idorden, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 150, 30));

        txt_hora.setEditable(false);
        txt_hora.setBackground(new java.awt.Color(255, 255, 255));
        txt_hora.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        txt_hora.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_hora.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        pnl_atender.add(txt_hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 190, 150, 30));

        box_idempleado.setEditable(true);
        box_idempleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID EMPLEADO", "15011000", "15012000", "15013000", "15014000", "15015000" }));
        box_idempleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        box_idempleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        box_idempleado.setFocusable(false);
        pnl_atender.add(box_idempleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, 150, 30));

        box_estado.setEditable(true);
        box_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SIN ESPECIFICAR", "Entregado", "Pendiente" }));
        box_estado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        box_estado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        box_estado.setFocusable(false);
        pnl_atender.add(box_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 510, 150, 30));

        btn_listo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/listo.png"))); // NOI18N
        btn_listo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        btn_listo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_listo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/design/listoblack.png"))); // NOI18N
        btn_listo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_listo(evt);
            }
        });
        pnl_atender.add(btn_listo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 550, 130, 40));

        btn_cobrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/btn_cobrar.png"))); // NOI18N
        btn_cobrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        btn_cobrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_cobrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/design/btn_cobrar_sec.png"))); // NOI18N
        btn_cobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cobrar(evt);
            }
        });
        pnl_atender.add(btn_cobrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 130, 40));

        txt_nombretrabajador.setEditable(false);
        txt_nombretrabajador.setBackground(new java.awt.Color(255, 255, 255));
        txt_nombretrabajador.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        txt_nombretrabajador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_nombretrabajador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        pnl_atender.add(txt_nombretrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 510, 150, 30));

        txt_app_trabajador.setEditable(false);
        txt_app_trabajador.setBackground(new java.awt.Color(255, 255, 255));
        txt_app_trabajador.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        txt_app_trabajador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_app_trabajador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        pnl_atender.add(txt_app_trabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 510, 150, 30));

        msj_estado.setFont(new java.awt.Font("Quicksand", 1, 12)); // NOI18N
        msj_estado.setForeground(new java.awt.Color(255, 255, 255));
        msj_estado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnl_atender.add(msj_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 550, 290, 40));

        msj_atendiendo.setFont(new java.awt.Font("Quicksand", 1, 12)); // NOI18N
        msj_atendiendo.setForeground(new java.awt.Color(255, 255, 255));
        msj_atendiendo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnl_atender.add(msj_atendiendo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 550, 290, 40));

        img_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/frameatender.png"))); // NOI18N
        pnl_atender.add(img_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_atender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_atender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**Método del boton para volver a menú inicio, actividades:
     * -Cierra la actual ventana.
     * -Regresa al inicio de sesión
     */
    private void btn_volver_inicio(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volver_inicio
        // TODO add your handling code here:
        config_ventana cv = new config_ventana();
        cv.start();
        this.dispose();

    }//GEN-LAST:event_btn_volver_inicio

    /**Método del boton minimizar, actividades:
     *-Minimiza la pantalla.
     */
    private void btn_minimizar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_minimizar
        // TODO add your handling code here:
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btn_minimizar

    /**Metodo del boton salir, actividades:
     *-Cierra la ventana y termina el proceso de ejcución de la aplicación.
     */
    private void btn_salir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salir
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btn_salir

    /**Metodo atender orden
     *-Conecta con el servidor de la base de datos.
     *-Realiza la consulta para actualizar el estado de las ordenes.
     *-Crea una condición, selecciona el indice del box estado, si esta es 1
     * llama al metodo reduce existencia.
     */
    public void atenderorden(){
        c.conectar();
        c.select("update ordenes "
                   + "set \"ID_Trabajador\" = '"+box_idempleado.getSelectedItem()+"',"
                   + "    \"Estado\" = '"+box_estado.getSelectedItem()+"'"
                   
                   + " where \"ID_Orden\" = '"+txt_idorden.getText()+"';");
            msj_atendiendo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/ordenatendida.png")));
        
        if(box_estado.getSelectedIndex()==1){
               reduceexistencia();
        }
    }
    
    /**Metodo reduce existencia, actividades:
     *-Sirve para reducir la existencia de un producto.
     *-Crea una variable de tipo conexion.
     *-conecta con la base de datos.
     *-Declara una variable de tipo string que contiene la consulta para 
     * actualizar la base de datos.
     *-Almacena el resultado en una variable resultset.
     *-Declara variable exitencia que convierte a entero el primer dato.
     *-Declara variable idproducto que convierte a entero el segundo dato.
     *-Declara variable de tipo integer.
     *-Reduce la existencia.
     *-Hace la consulta para actualizar la base de datos.
     *-Coloca la imagen de orden entregada.
    */
    public void reduceexistencia(){
        conexion basedatos = new conexion();
        basedatos.conectar();
        
        String url ="select productos.\"Existencia\" , productos.\"ID_Producto\"\n" +
"from productos inner join orden_producto on productos.\"ID_Producto\" = orden_producto.\"ID_Producto\"\n" +
"               inner join ordenes on ordenes.\"ID_Orden\" = orden_producto.\"ID_Orden\"\n" +
"               \n" +
"               where ordenes.\"ID_Orden\" = '"+txt_idorden.getText()+"'";
        
        ResultSet dato = basedatos.select(url);
        try{
        while(dato.next()){
            int existencia = Integer.parseInt(dato.getString(1));
            int idproducto = Integer.parseInt(dato.getString(2));
            int actual=existencia-1;
            c.select("update productos"
                     +" set \"Existencia\" = '"+actual+"'"
            + " where \"ID_Producto\" = '"+idproducto+"';");
            msj_estado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/ordenentregada.png")));
        }
        }catch (SQLException ex){
            Logger.getLogger(productos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    /**Metodo del boton listo, actividades:
     *-Realiza una condición.
     *-Si es verdadera, llama al metodo atender orden.
     */
    private void btn_listo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_listo
 
        try{
                if(verifica()== true){
                    atenderorden();
                }
            }catch (Exception e){
                System.out.println(e.toString());
            } 

    }//GEN-LAST:event_btn_listo

    /*FALTA AQUI AGREGAR FUNCIONES*/
    private void btn_cobrar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cobrar
        // TODO add your handling code here:
        config_ventana c= new config_ventana();
        cobrar cb= new cobrar();
        try{
            c.cobrarorden(total_cobrar,id_orden);
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_btn_cobrar

    /**Metodo bandera verificar, actividades:
     *-Si el indice del box empleado es igual a 0, retorna falso.
     *-Si el indice del box estado es igual a 0, retorna falso.
     *-Si ninguno de los dos se cumple, retorna verdadero.
     */
    public boolean verifica(){
        if(box_idempleado.getSelectedIndex()==0){
            return false;
        }if(box_estado.getSelectedIndex()==0){
            return false;
        }
        return true;
    }
    
    /**Metodo atiende,actividades:
     *-Resive, todos los parametros de la clase ordenes.
     *-Coloca los parametros en sus textfield correspondientes.
     */
    public void atiende(String idorden , String nombreorden , String categoria , String precio , String presentacion,
                        String descuento,String fecha,String hora,String total,
                        String idcliente,String usuario,String nombrecliente,String apellidocliente,
                        String edificio,String aula,String transaccion,String idtrabajador,String nombretrabajador,
                        String apellidotrabajador,String estadoorden){
        txt_idorden.setText(idorden);
        txt_nombreproducto.setText(nombreorden);
        txt_categoria.setText(categoria);
        txt_presentación.setText(presentacion);
        txt_precio.setText("$ "+precio+".00 MXN");
        txt_descuento.setText("$ "+descuento+".00 MXN");
        txt_fecha.setText(fecha);
        txt_hora.setText(hora);
        txt_total.setText("$ "+total+".00 MXN");
        txt_idcliente.setText(idcliente);
        txt_usuario.setText(usuario);
        txt_nombre_cliente.setText(nombrecliente);
        txt_app_cliente.setText(apellidocliente);
        txt_edificio.setText(edificio);
        tx_taula.setText(usuario);
        txt_transaccion.setText(transaccion);
        box_idempleado.setSelectedItem(idtrabajador);
        txt_nombretrabajador.setText(nombretrabajador);
        txt_app_trabajador.setText(apellidotrabajador);
        box_estado.setSelectedItem(estadoorden);
        total_cobrar=total;
        id_orden=idorden;
    }
    
    
    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> box_estado;
    private javax.swing.JComboBox<String> box_idempleado;
    private javax.swing.JButton btn_cobrar;
    private javax.swing.JButton btn_listo;
    private javax.swing.JButton btn_minimizar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JButton btn_volver_inicio;
    private javax.swing.JLabel img_fondo;
    private javax.swing.JLabel msj_atendiendo;
    private javax.swing.JLabel msj_estado;
    private javax.swing.JPanel pnl_atender;
    private javax.swing.JTextField tx_taula;
    private javax.swing.JTextField txt_app_cliente;
    private javax.swing.JTextField txt_app_trabajador;
    private javax.swing.JTextField txt_categoria;
    private javax.swing.JTextField txt_descuento;
    private javax.swing.JTextField txt_edificio;
    private javax.swing.JTextField txt_fecha;
    private javax.swing.JTextField txt_hora;
    private javax.swing.JTextField txt_idcliente;
    private javax.swing.JTextField txt_idorden;
    private javax.swing.JTextField txt_nombre_cliente;
    private javax.swing.JTextField txt_nombreproducto;
    private javax.swing.JTextField txt_nombretrabajador;
    private javax.swing.JTextField txt_precio;
    private javax.swing.JTextField txt_presentación;
    private javax.swing.JTextField txt_total;
    private javax.swing.JTextField txt_transaccion;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
