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
public class registro_trabajador extends javax.swing.JFrame {
    /**DECLARACIÓN DE VARIABLES GLOBALES*/
 config_ventana op = new config_ventana();
 conexion c= new conexion();
 int estado;
    
    /*Constructor*/
    public registro_trabajador() {
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
        txt_nombre = new javax.swing.JTextField();
        txt_ID = new javax.swing.JTextField();
        txt_paterno = new javax.swing.JTextField();
        txt_materno = new javax.swing.JTextField();
        txt_usuario = new javax.swing.JTextField();
        txt_sueldo = new javax.swing.JTextField();
        txt_rfc_establecimiento = new javax.swing.JTextField();
        btn_listo = new javax.swing.JButton();
        msj_comprobacion = new javax.swing.JLabel();
        btn_volver_inicio = new javax.swing.JButton();
        btn_minimizar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        box_inicio_turno = new javax.swing.JComboBox<>();
        box_fin_turno = new javax.swing.JComboBox<>();
        img_letrero = new javax.swing.JLabel();
        img_titulo = new javax.swing.JLabel();
        img_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnl_registro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        txt_sueldo.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        txt_sueldo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_sueldo.setToolTipText("");
        txt_sueldo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        pnl_registro.add(txt_sueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 160, 30));

        txt_rfc_establecimiento.setEditable(false);
        txt_rfc_establecimiento.setBackground(new java.awt.Color(255, 255, 255));
        txt_rfc_establecimiento.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        txt_rfc_establecimiento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_rfc_establecimiento.setText("VECJ880326");
        txt_rfc_establecimiento.setToolTipText("");
        txt_rfc_establecimiento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        pnl_registro.add(txt_rfc_establecimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 160, 30));

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

        box_inicio_turno.setEditable(true);
        box_inicio_turno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "INICIO TURNO", "08:00:00", "08:15:00", "08:30:00", "08:45:00", "09:00:00", "09:15:00", "09:30:00", "09:45:00", "10:00:00", "10:15:00", "10:30:00", "10:45:00", "11:00:00", "11:15:00", "11:30:00", "11:45:00", "12:00:00", "12:15:00", "12:30:00", "12:45:00", "13:00:00", "13:15:00", "13:30:00", "13:45:00", "14:00:00", "14:15:00", "14:30:00", "14:45:00", "15:00:00", "15:15:00", "15:30:00", "15:45:00", "16:00:00", "16:15:00", "16:30:00", "16:45:00", "17:00:00", "17:15:00", "17:30:00", "17:45:00", "18:00:00", "18:15:00", "18:30:00", "18:45:00", "19:00:00", "19:15:00", "19:30:00", "19:45:00", "20:00:00" }));
        box_inicio_turno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        pnl_registro.add(box_inicio_turno, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, 160, 30));

        box_fin_turno.setEditable(true);
        box_fin_turno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FIN TURNO", "08:00:00", "08:15:00", "08:30:00", "08:45:00", "09:00:00", "09:15:00", "09:30:00", "09:45:00", "10:00:00", "10:15:00", "10:30:00", "10:45:00", "11:00:00", "11:15:00", "11:30:00", "11:45:00", "12:00:00", "12:15:00", "12:30:00", "12:45:00", "13:00:00", "13:15:00", "13:30:00", "13:45:00", "14:00:00", "14:15:00", "14:30:00", "14:45:00", "15:00:00", "15:15:00", "15:30:00", "15:45:00", "16:00:00", "16:15:00", "16:30:00", "16:45:00", "17:00:00", "17:15:00", "17:30:00", "17:45:00", "18:00:00", "18:15:00", "18:30:00", "18:45:00", "19:00:00", "19:15:00", "19:30:00", "19:45:00", "20:00:00" }));
        box_fin_turno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        pnl_registro.add(box_fin_turno, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 480, 160, 30));

        img_letrero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        pnl_registro.add(img_letrero, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 190, 30));

        img_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img_titulo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        pnl_registro.add(img_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 280, 60));

        img_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/form_empleado.png"))); // NOI18N
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

    /*Asigna una imagen de letrero y de cabera al formulario*/
    public void letrero(int i){
        String ltr = String.valueOf(i);
            img_letrero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/letrero_e"+ltr+".png")));
             img_titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/ecabecera"+ltr+".png")));
    }
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
       }if(txt_sueldo.getText().equalsIgnoreCase("")){
           msj_comprobacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/ingsueldo.png")));
           return false;
       }if(txt_rfc_establecimiento.getText().equalsIgnoreCase("")){
           msj_comprobacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/ingestablecimiento.png")));
           return false;
       }if(box_inicio_turno.getSelectedIndex()==0){
           msj_comprobacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/inginicioturno.png")));
           return false;
       }if(box_fin_turno.getSelectedIndex()==0){
           msj_comprobacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/ingfinturno.png")));
           return false;
       }
       return true;
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
    
    /*BORRAR*/
    /**Metodo registra cliente, actividades:
     * -Agrega en la base de datos, el usuario que lleno el formulario y los
     * datos en el.
    */
    public void registracliente(){
         c.conectar();
          c.select("insert into trabajador "
              + "values ('"+txt_ID.getText()+"','"
                           +txt_sueldo.getText()+"','"
                           +txt_nombre.getText()+"','"
                           +txt_paterno.getText()+"','"
                           +txt_materno.getText()+"','"
                           +txt_rfc_establecimiento.getText()+"','"
                           +box_inicio_turno.getSelectedItem()+"','"
                           +box_fin_turno.getSelectedItem()+"','"
                           +txt_usuario.getText()+"')");
       msj_comprobacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/registro.png")));
     }
    
    /**Este metodo reinicia las variables a su estado original despues de 
     * ocupar el formulario
     */
   public void reset(){
       generarID();
       msj_comprobacion.setText("");
        txt_sueldo.setText("");
        txt_nombre.setText("");
        txt_paterno.setText("");
        txt_materno.setText("");
        txt_rfc_establecimiento.setText("");
        box_inicio_turno.setSelectedIndex(0);
        box_fin_turno.setSelectedIndex(0);
        txt_usuario.setText("");
   }
    
   /*Este metodo agrega el estado que recibe por parametro*/
   public void agregaestado(int i){
       estado=i;
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
           //System.out.println("AGREGAR");
       c.select("insert into trabajador "
              + "values ('"+txt_ID.getText()+"','"
                           +txt_sueldo.getText()+"','"
                           +txt_nombre.getText()+"','"
                           +txt_paterno.getText()+"','"
                           +txt_materno.getText()+"','"
                           +txt_rfc_establecimiento.getText()+"','"
                           +box_inicio_turno.getSelectedItem()+"','"
                           +box_fin_turno.getSelectedItem()+"','"
                           +txt_usuario.getText()+"')");
       msj_comprobacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/registro.png")));
       reset();
       
       }if(estado == 2){
           System.out.println("MODIFICAR");
           c.select("update trabajador "
                   + "set \"Sueldo\" = '"+txt_sueldo.getText()+"',"
                   + "    \"Nombre\" = '"+txt_nombre.getText()+"',"
                   + "    \"Apellido_Paterno\" = '"+txt_paterno.getText()+"',"
                   + "    \"Apellido_Materno\" = '"+txt_materno.getText()+"',"
                   + "    \"RFC_Establecimiento\" = '"+txt_rfc_establecimiento.getText()+"',"
                   + "    \"Inicio_Turno\" = '"+box_inicio_turno.getSelectedItem()+"',"
                   + "    \"Final_Turno\" = '"+box_fin_turno.getSelectedItem()+"',"
                   + "    \"Usuario\" = '"+txt_usuario.getText()+"'"
                           
                   + " where \"ID_Trabajador\" = '"+txt_ID.getText()+"';");
           msj_comprobacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/modificado.png")));
       }if(estado == 3){
           //System.out.println("DELETE FROM productos WHERE \"ID_Producto\"='2050'");
           c.select("delete from trabajador"
                  + " where \"ID_Trabajador\" = '"+txt_ID.getText()+"'");
           msj_comprobacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/eliminado.png")));
       }
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

    public void modifica(String ID,
                         String sueldo,
                         String name,
                         String ap_pat,
                         String ap_mat, 
                         String establecimiento, 
                         String inicio_turno, 
                         String fin_turno, 
                         String usuario){
        
        txt_ID.setText(ID);
        txt_sueldo.setText(sueldo);
        txt_nombre.setText(String.valueOf(name));
        txt_paterno.setText(ap_pat);
        txt_materno.setText(ap_mat);
        txt_rfc_establecimiento.setText(establecimiento);
        box_inicio_turno.setSelectedItem(inicio_turno);
        box_fin_turno.setSelectedItem(fin_turno);
        txt_usuario.setText(usuario);
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
        
        String url ="select max(\"ID_Trabajador\") from trabajador";
        
        ResultSet dato = basedatos.select(url);
        try{
        while(dato.next()){
            int idnext = Integer.parseInt(dato.getString(1));
            txt_ID.setText(""+(idnext+5));
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
    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> box_fin_turno;
    private javax.swing.JComboBox<String> box_inicio_turno;
    private javax.swing.JButton btn_listo;
    private javax.swing.JButton btn_minimizar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JButton btn_volver_inicio;
    private javax.swing.JLabel img_fondo;
    private javax.swing.JLabel img_letrero;
    private javax.swing.JLabel img_titulo;
    private javax.swing.JLabel msj_comprobacion;
    private javax.swing.JPanel pnl_registro;
    private javax.swing.JTextField txt_ID;
    private javax.swing.JTextField txt_materno;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_paterno;
    private javax.swing.JTextField txt_rfc_establecimiento;
    private javax.swing.JTextField txt_sueldo;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
