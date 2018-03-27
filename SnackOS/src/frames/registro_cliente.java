/* Pertence al paquete de nombre: frames */
package frames;

/*Bibliotecas importadas, para la utilización 
* de sus recursos en la clase
*/
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*Inicio de la clase registro*/
public class registro_cliente extends javax.swing.JFrame {
    /**DECLARACIÓN DE VARIABLES GLOBALES*/
 config_ventana op = new config_ventana();
 conexion c= new conexion();
 int estado;
    
    /*Constructor*/
    public registro_cliente() {
        super("SnackOS");
        initComponents();
        this.estado=estado;
    }

    /**
     * Este metodo es llamado desde el constructor para inicializar el formulario.
     * PELIGRO: No modificar este código. El contenido de este mettodo es siempre
     * regenerado por el editor del formulario.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_registro = new javax.swing.JPanel();
        txt_email = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_ID = new javax.swing.JTextField();
        txt_paterno = new javax.swing.JTextField();
        txt_materno = new javax.swing.JTextField();
        txt_usuario = new javax.swing.JTextField();
        btn_listo = new javax.swing.JButton();
        txt_contraseña = new javax.swing.JPasswordField();
        txt_confirma_contraseña = new javax.swing.JPasswordField();
        msj_comprobacion = new javax.swing.JLabel();
        btn_volver_inicio = new javax.swing.JButton();
        btn_minimizar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        box_ubicacion = new javax.swing.JComboBox<>();
        msj_inicio_sesion = new javax.swing.JLabel();
        img_titulo = new javax.swing.JLabel();
        img_letrero = new javax.swing.JLabel();
        img_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnl_registro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_email.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        txt_email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_email.setToolTipText("");
        txt_email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        pnl_registro.add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, 160, 30));

        txt_nombre.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        txt_nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_nombre.setToolTipText("");
        txt_nombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        pnl_registro.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 160, 30));

        txt_ID.setEditable(false);
        txt_ID.setBackground(new java.awt.Color(255, 255, 255));
        txt_ID.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        txt_ID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_ID.setToolTipText("");
        txt_ID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        pnl_registro.add(txt_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 160, 30));

        txt_paterno.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        txt_paterno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_paterno.setToolTipText("");
        txt_paterno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        pnl_registro.add(txt_paterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 160, 30));

        txt_materno.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        txt_materno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_materno.setToolTipText("");
        txt_materno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        pnl_registro.add(txt_materno, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 160, 30));

        txt_usuario.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        txt_usuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_usuario.setToolTipText("");
        txt_usuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        pnl_registro.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 160, 30));

        btn_listo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/listo.png"))); // NOI18N
        btn_listo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        btn_listo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_listo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/design/listoblack.png"))); // NOI18N
        btn_listo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_listo(evt);
            }
        });
        pnl_registro.add(btn_listo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 520, 130, 40));

        txt_contraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_contraseña.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        txt_contraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_contraseñaclicpassword(evt);
            }
        });
        pnl_registro.add(txt_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 160, 30));

        txt_confirma_contraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_confirma_contraseña.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        pnl_registro.add(txt_confirma_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 160, 30));

        msj_comprobacion.setFont(new java.awt.Font("Quicksand", 1, 12)); // NOI18N
        msj_comprobacion.setForeground(new java.awt.Color(255, 255, 255));
        msj_comprobacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnl_registro.add(msj_comprobacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 550, 290, 40));

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
        pnl_registro.add(btn_volver_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 30, 30));

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
        pnl_registro.add(btn_minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 30, 30));

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
        pnl_registro.add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 30, 30));

        box_ubicacion.setEditable(true);
        box_ubicacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UBICACIÓN", "12785411", "12785412", "12785413", "12785414", "12785415" }));
        box_ubicacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        pnl_registro.add(box_ubicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 480, 160, 30));

        msj_inicio_sesion.setFont(new java.awt.Font("Quicksand", 1, 12)); // NOI18N
        msj_inicio_sesion.setForeground(new java.awt.Color(255, 255, 255));
        msj_inicio_sesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnl_registro.add(msj_inicio_sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 590, 290, 40));

        img_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img_titulo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        pnl_registro.add(img_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 280, 70));

        img_letrero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        pnl_registro.add(img_letrero, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 190, 30));

        img_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/form_registro_cliente.png"))); // NOI18N
        pnl_registro.add(img_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**Este metodo verifica, que al dar clic en listo, los campos no se 
     * encuentren vacios, de ser así regresa un valor booleano falso, si no
     * retorna un true.
    */
    public boolean verifica(){
       if(txt_ID.getText().equalsIgnoreCase("")){
           //lblmsj.setText("Agrege ID");
           return false;
       }if(txt_nombre.getText().equalsIgnoreCase("")){
           msj_comprobacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/ingnombre.png")));
           return false;
       }if(txt_paterno.getText().equalsIgnoreCase("")){
           msj_comprobacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/ingpaterno.png")));
           return false;
       }if(txt_materno.getText().equalsIgnoreCase("")){
           msj_comprobacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/ingmaterno.png")));
           return false;
       }if(txt_usuario.getText().equalsIgnoreCase("")){
           msj_comprobacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/ingusuario.png")));
           return false;
       }if(txt_contraseña.getText().equalsIgnoreCase("")){
           msj_comprobacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/ingpassword.png")));
           return false;
       }if(txt_confirma_contraseña.getText().equalsIgnoreCase("")){
           msj_comprobacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/ingconfirme.png")));
           return false;
       }if(txt_email.getText().equalsIgnoreCase("")){
           msj_comprobacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/ingemail.png")));
           return false;
       }if(box_ubicacion.getSelectedIndex()==0){
           msj_comprobacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/ingubicacion.png")));
           return false;
       }
       
       if(txt_contraseña.getText().equals(txt_confirma_contraseña.getText())){
           return true;
       }else{
           msj_comprobacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/ingcoinciden.png")));
           return false;
       }
       //return true;
   }
   
    /**Metodo valida usuario, actividades:
     * -Verifica que el usuario ingresado en el registro no exista
     * en la base datos.
     * -Si ya existe arroja un mensaje de que este ya se encuentra ocupado.
    */
    public boolean validausuario() throws SQLException{
       conexion basedatos = new conexion();
        basedatos.conectar();
        
        String url ="select \"ID_Cliente\" from clientes where upper(\"Usuario\") = upper('" + txt_usuario.getText() +"')";
        
        ResultSet dato = basedatos.select(url);
        ///System.out.println("CUANDO NO EXISTE MANDA: "+dato);
        
        
        try{
        while(dato.next()){
            String id = String.valueOf(dato.getString(1));
            //System.out.println("CUANDO NO EXISTE MANDA: "+id);
            //System.out.println("ID_::: "+id );
            if(id != null){
                msj_comprobacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/yaexiste.png")));
                
                return false;
            }
        }
        }catch (SQLException ex){
            Logger.getLogger(productos.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       return true;
       
   }
    
    /**Metodo registra cliente, actividades:
     * -Agrega en la base de datos, el usuario que lleno el formulario y los
     * datos en el.
    */
    public void registracliente(){
         c.conectar();
          c.select("insert into clientes "
              + "values ('"+txt_ID.getText()+"','"
                           +txt_usuario.getText()+"','"
                           +txt_contraseña.getText()+"','"
                           +txt_nombre.getText()+"','"
                           +txt_paterno.getText()+"','"
                           +txt_materno.getText()+"','"
                           //+txtclasificacion.getText()+"','"
                           +box_ubicacion.getSelectedItem()+"','"
                           +"VECJ880326','"
                           +txt_email.getText()+"')");
       msj_comprobacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/registro.png")));
       msj_inicio_sesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/iniciarsesion.png")));
       
     }
    
    /**Este metodo reinicia las variables a su estado original despues de 
     * ocupar el formulario
     */
   public void reset(){
       //txtID.setText("");
       generarID();
       msj_comprobacion.setText("");
        txt_usuario.setText("");
        txt_nombre.setText("");
        txt_paterno.setText("");
        txt_materno.setText("");
        txt_contraseña.setText("");
        txt_confirma_contraseña.setText("");
        box_ubicacion.setSelectedIndex(0);
        txt_email.setText("");
   }
   /*Asigna una imagen de letrero y de cabera al formulario*/
    public void letrero(int i){
        String ltr = String.valueOf(i);
             img_letrero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/letrero_c"+ltr+".png")));
             img_titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/ccabecera"+ltr+".png")));
    }
    
    /**Metodo accion botones, actividades:
     * -Conecta con la base de datos.
     * -Establece condición.
     * -Si el estado es igual a 1, agrega ingrediente.
     * -Si es igual a 2, actualiza, modifica ingrediente.
     */
   public void accionbotones(){
       
       c.conectar();
       if(estado == 1){
           System.out.println("AGREGAR");
       c.select("insert into clientes "
              + "values ('"+txt_ID.getText()+"','"
                           +txt_usuario.getText()+"','"
                           +txt_contraseña.getText()+"','"
                           +txt_nombre.getText()+"','"
                           +txt_paterno.getText()+"','"
                           +txt_materno.getText()+"','"
                           +box_ubicacion.getSelectedItem()+"','"
                           +"VECJ880326','"
                           +txt_email.getText()+"')");
       msj_comprobacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/registro.png")));
       
       reset();
       }if(estado == 2){
           System.out.println("MODIFICAR");
           c.select("update clientes "
                   + "set \"Usuario\" = '"+txt_usuario.getText()+"',"
                   + "    \"Contraseña\" = '"+txt_contraseña.getText()+"',"
                   + "    \"Nombre\" = '"+txt_nombre.getText()+"',"
                   + "    \"Apellido_Paterno\" = '"+txt_paterno.getText()+"',"
                   + "    \"Apellido_Materno\" = '"+txt_materno.getText()+"',"
                   + "    \"ID_Ubicacion\" = '"+box_ubicacion.getSelectedItem()+"',"
                   + "    \"E-mail\" = '"+txt_usuario.getText()+"'"
                           
                   + " where \"ID_Cliente\" = '"+txt_ID.getText()+"';");
           msj_comprobacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/modificado.png")));
       }if(estado == 3){
           //System.out.println("DELETE FROM productos WHERE \"ID_Producto\"='2050'");
           c.select("delete from clientes"
                  + " where \"ID_Cliente\" = '"+txt_ID.getText()+"'");
           msj_comprobacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/eliminado.png")));
       }
   }
   
    /*Este metodo desencadena el metodo accion botones*/
    private void btn_listo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_listo

        try{
            if(estado==20){
            if(verifica()== true && validausuario() == true){
                    registracliente();
            }
            }else{
                accionbotones();
            }
        }catch (Exception e){
            System.out.println(e.toString());
        }

    }//GEN-LAST:event_btn_listo

    public void modifica(String ID,
                         String usuario,
                         String contraseña,
                         String nombre,
                         String ap_pat,
                         String ap_mat, 
                         String ubicacion, 
                         String establecimiento, 
                         String email){
        
        txt_ID.setText(ID);
        txt_nombre.setText(String.valueOf(nombre));
        txt_paterno.setText(ap_pat);
        txt_materno.setText(ap_mat);
        txt_usuario.setText(usuario);
        txt_contraseña.setText(contraseña);
        txt_confirma_contraseña.setText(contraseña);
        txt_email.setText(email);
        box_ubicacion.setSelectedItem(ubicacion);
    }
    
    /**Método del foco contraseña, actividades:
     *-Sirve como guía para que al presionar la tecla "enter", se ejecute
     * la función del boton ingreso.
     */
    private void txt_contraseñaclicpassword(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_contraseñaclicpassword
        // TODO add your handling code here:
        char TeclaPresionada = evt.getKeyChar();

        if(TeclaPresionada == KeyEvent.VK_ENTER){
            btn_listo.doClick();
            //btnbusqueda.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/design/busquedablack.png")));
        }
    }//GEN-LAST:event_txt_contraseñaclicpassword


    /**Método del boton volver inicio, actividades:
     * -Al preionar, lleva al inicio de sesión.
     * -Cierra la actual ventana.
     */    
    private void btn_volver_inicio(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volver_inicio
        // TODO add your handling code here:
        op.start();
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
        
        String url ="select max(\"ID_Cliente\") from clientes";
        
        ResultSet dato = basedatos.select(url);
        try{
        while(dato.next()){
            int idnext = Integer.parseInt(dato.getString(1));
            txt_ID.setText(""+(idnext+1));
        }
        }catch (SQLException ex){
            Logger.getLogger(productos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**Metodo genera id, desencadena el metodo coloca id*/
    public void generarID(){
        try {
            colocaID();
        } catch (SQLException ex) {
            Logger.getLogger(productos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   public void agregaestado(int i){
       estado=i;
   }
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> box_ubicacion;
    private javax.swing.JButton btn_listo;
    private javax.swing.JButton btn_minimizar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JButton btn_volver_inicio;
    private javax.swing.JLabel img_fondo;
    private javax.swing.JLabel img_letrero;
    private javax.swing.JLabel img_titulo;
    private javax.swing.JLabel msj_comprobacion;
    private javax.swing.JLabel msj_inicio_sesion;
    private javax.swing.JPanel pnl_registro;
    private javax.swing.JTextField txt_ID;
    private javax.swing.JPasswordField txt_confirma_contraseña;
    private javax.swing.JPasswordField txt_contraseña;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_materno;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_paterno;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
