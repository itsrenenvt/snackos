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
import javax.swing.JOptionPane;

/* Inicio del metodo de la clase */
public class inicio_sesion extends javax.swing.JFrame {

    /* Declaración de varibles globales */
    
    /* Variable de tipo clase config_ventana */
    config_ventana cv = new config_ventana();
    
    
    
    /* Constructor */
    public inicio_sesion() {
        super("SnackOS");
        initComponents();
    }

    /**
     * Este metodo es llamado desde el constructor para inicializar el formulario.
     * PELIGRO: No modificar este código. El contenido de este mettodo es siempre
     * regenerado por el editor del formulario.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iniciar_sesion = new javax.swing.JPanel();
        btn_usuario = new javax.swing.JButton();
        btn_minimizar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        btn_ingreso = new javax.swing.JButton();
        txt_usuario = new javax.swing.JTextField();
        txt_contraseña = new javax.swing.JPasswordField();
        msj_registrate = new javax.swing.JLabel();
        img_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        iniciar_sesion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/registrarse_iniciosesion.png"))); // NOI18N
        btn_usuario.setBorder(null);
        btn_usuario.setContentAreaFilled(false);
        btn_usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_usuario.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/design/registrarse_iniciosesion_sec.png"))); // NOI18N
        btn_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_usuarioregistro(evt);
            }
        });
        iniciar_sesion.add(btn_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 9, 30, -1));

        btn_minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/minimizar_iniciosesion.png"))); // NOI18N
        btn_minimizar.setBorder(null);
        btn_minimizar.setContentAreaFilled(false);
        btn_minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_minimizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/design/minimizar_iniciosesion_sec.png"))); // NOI18N
        btn_minimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_minimizar(evt);
            }
        });
        iniciar_sesion.add(btn_minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 9, 30, -1));

        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/cerrar_iniciosesion.png"))); // NOI18N
        btn_salir.setBorder(null);
        btn_salir.setContentAreaFilled(false);
        btn_salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_salir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/design/cerrar_iniciosesion_sec.png"))); // NOI18N
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salir(evt);
            }
        });
        iniciar_sesion.add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 9, 30, -1));

        btn_ingreso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/btn_ingresar.png"))); // NOI18N
        btn_ingreso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(59, 23, 18), 3));
        btn_ingreso.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_ingreso.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/design/btn_ingresar_sec.png"))); // NOI18N
        btn_ingreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingreso(evt);
            }
        });
        iniciar_sesion.add(btn_ingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 480, 130, 40));

        txt_usuario.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        txt_usuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_usuario.setText("SnackOS");
        txt_usuario.setToolTipText("");
        txt_usuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(59, 23, 18), 3));
        txt_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                foco_usuario(evt);
            }
        });
        iniciar_sesion.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 200, 30));

        txt_contraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_contraseña.setText("SnackOS");
        txt_contraseña.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(59, 23, 18), 3));
        txt_contraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                foco_contraseña(evt);
            }
        });
        iniciar_sesion.add(txt_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 200, 30));

        msj_registrate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/lbl_registrate.png"))); // NOI18N
        iniciar_sesion.add(msj_registrate, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 340, 30));

        img_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/img_iniciosesion.png"))); // NOI18N
        iniciar_sesion.add(img_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iniciar_sesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iniciar_sesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

       
     /**Metodo iniciar_sesion
      * Este metodo define si el usuario que va ingresar es: 
      * administrador, empleado o usuario.
      */
    public void iniciar_sesion(){
        /*Variable local basedatos de tipo clase conexión*/
        /** Variable de tipo clase conexión
     *conecta con la clase conexión para hacer 
     *una consulta directa con la base de datos
     */
        conexion basedatos = new conexion();
        /*Esta declaración accede a un metodo:
         * -Dentro de la clase, declarado en la variable basedatos*/
        basedatos.conectar();
        
        /*Variable de tipo string incializada*/
        String ID="";
        /*Esta condición decide si los datos ingresados 
        * en el formulario de iniciar sesión corresponde a:
        * - Administrador
        */
        if(txt_usuario.getText().equalsIgnoreCase("SnackOS") && txt_contraseña.getText().equals("SnackOS")){
            /*Si es SI, entonces:
            * - Abre pantalla de administrador
            */
            cv.administrador(txt_usuario.getText());
            /*Cierra la ventena actualmente abierta*/
            this.dispose();
            /* SI NO */
        }else{
            /*Realiza un consulta para ver si el usuario qe esta entrando es un trabajador*/
            String urltrabajador ="select \"ID_Trabajador\" from trabajador where upper(\"Usuario\") = upper('"+txt_usuario.getText()+"')";
            /*Almacena el resultado en un resultset*/    
            ResultSet datotrabajador = basedatos.select(urltrabajador);
                try{
                    /*El ciclo while añade todos los resultados resultset a una variable de tipo string*/
                while(datotrabajador.next()){
                    ID =String.valueOf(datotrabajador.getString(1));
                    /**Inicia una condición para ver si el ID obtenido de la base de datos
                     * corresponde al ingresado como contraseña.
                    */
                }if(ID.equals(txt_contraseña.getText())){
                    /*Si si, entonces abre el menu del trabajador*/
                        cv.trabajador(txt_usuario.getText());
                        /*Cierra la actual ventana*/
                        this.dispose();
                    }else{
                    /*SI NO, Entonces:
                     *-Entra al metodo verifica_contraseña*/
                    verifica_cliente(txt_usuario.getText());
                }
                /*Atrapa un error, en casa de que se origine.*/
                }catch (SQLException ex){
                    Logger.getLogger(productos.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
            
    }
    
   
    /**Metodo verifica_contrasela
    * Este metodo es llamado despues de que se comprueba 
    * que el usuario ingresado no es:
    * -Administrador
    * Se encarga de deducir si el usuario ingresado es:
    * -Trabajador
    * -Cliente
    */
    public void verifica_cliente(String usuario){
        
        /*Variable local basedatos de tipo clase conexión*/
        conexion basedatos = new conexion();
        /*Esta declaración accede a un metodo:
         * -Dentro de la clase, declarado en la variable basedatos*/
        basedatos.conectar();
        
        /*Variable local de tipo string
         * Esta variable almacena la consulta que busca dentro
         * de la base de datos si es el usuario se encuentra y 
         * si por lo tanto tiene una contraseña
         */
        String url ="select \"Contraseña\" from clientes where upper(\"Usuario\") = upper('"+usuario+"')";
        
        /**Variable local de tipo resultset (base de datos)
         * Esta variable almacena el resultado arrojado por la consulta.*/
        ResultSet dato = basedatos.select(url);
        
        /*Excepción*/
        try{ 
            /*Ciclo while*/
        while(dato.next()){
            /**Variable interna local de tipo string
             * Almacena la contraseña en valor string la cual es
             * obtenida en valor resultset y convertida a valor string
             */
            String contraseña = String.valueOf(dato.getString(1));
            
            /**Esta condición determina en caso de que se haya encontrado 
             * una contraseña con el usuario ingresado si ambas son iguales
             */
            
            if(contraseña.equals(txt_contraseña.getText())){
                /*Si el resultado es SI entonces:
                * -Abre la pantalla de usuario*/
                cv.cliente(usuario);
                /*Cierra la ventana actualmente abierta*/
                this.dispose();
            }
        } /**Si ocurre un error en el proceso de la conexión este apartado
           * -Atrapa el error en un SQLException*/
        }catch (SQLException ex){
            Logger.getLogger(productos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    /**Método del boton ingreso, actividades:
     *-Al presionar verifica si el método verifica_campos devolvio un valor true
     *-Si si, desencadena el metodo iniciar_sesión.
     *-Si ocurre un error, imprime en consola el error.*/
    private void btn_ingreso(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingreso
        try{
            if(verifica_campos() == true){
                iniciar_sesion();
            }
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btn_ingreso

    /**Metodo verifica_campos, actividades:
    * -Verifica que los campos en inciar sesión no esten vacios.
    * -Si lo estan, manda un mensaje de error.
    * -Si hace falta la contraseña, manda mensaje indicandolo.
    * -Si hace falta el usuario, manda mensaje indicandolo.
    * -Si no hace falta nada, devuelce un valor true.
    */
    public boolean verifica_campos(){
        if(txt_usuario.getText().equalsIgnoreCase("") && txt_contraseña.getText().equalsIgnoreCase("") ){
                JOptionPane.showMessageDialog(null, "ALGO SALIO MAL:"
                                              +"\nINICIE SESIÓN CON SUS CREDENCIALES"
                                              +"\nO REGISTRATE, ¡ES GRATIS!", " "
                     + "¡ LO SENTIMOS !" ,JOptionPane.ERROR_MESSAGE);
                return false;
            }if(txt_usuario.getText().equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "ALGO SALIO MAL:"
                                              +"\nINICIE SESIÓN CON SU USUARIO ", " "
                     + "¡ LO SENTIMOS !" ,JOptionPane.ERROR_MESSAGE);
                return false;
            }if(txt_contraseña.getText().equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "ALGO SALIO MAL:"
                                              +"\nCONTRASEÑA REQUERIDA", " "
                     + "¡ LO SENTIMOS !" ,JOptionPane.ERROR_MESSAGE);
                return false;
            }
        return true;
    }

    /**Método del boton para registrarse como usuario, actividades:
     * -Al preionar, lleva al formulario de registro.
     * -Cierra la actual ventana.
     */
    private void btn_usuarioregistro(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usuarioregistro
        // TODO add your handling code here:
        cv.registro_cliente(20);
        this.dispose();
    }//GEN-LAST:event_btn_usuarioregistro

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

    /**Método del foco usuario, actividades:
     *-Sirve como guía para que al presionar la tecla "enter", se ejecute
     * la función del boton ingreso.
     */
    private void foco_usuario(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_foco_usuario
        // TODO add your handling code here:
        char TeclaPresionada = evt.getKeyChar();
        
        if(TeclaPresionada == KeyEvent.VK_ENTER){
            btn_ingreso.doClick();
            }
    }//GEN-LAST:event_foco_usuario

    /**Método del foco contraseña, actividades:
     *-Sirve como guía para que al presionar la tecla "enter", se ejecute
     * la función del boton ingreso.
     */
    private void foco_contraseña(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_foco_contraseña
        // TODO add your handling code here:
        char TeclaPresionada = evt.getKeyChar();
        
        if(TeclaPresionada == KeyEvent.VK_ENTER){
            btn_ingreso.doClick();
           }
    }//GEN-LAST:event_foco_contraseña

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ingreso;
    private javax.swing.JButton btn_minimizar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JButton btn_usuario;
    private javax.swing.JLabel img_fondo;
    private javax.swing.JPanel iniciar_sesion;
    private javax.swing.JLabel msj_registrate;
    private javax.swing.JPasswordField txt_contraseña;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
