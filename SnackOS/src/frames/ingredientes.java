/* Pertence al paquete de nombre: frames */
package frames;

/*Bibliotecas importadas, para la utilización 
* de sus recursos en la clase
*/
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*Inicio de la clase ingredientes*/
public class ingredientes extends javax.swing.JFrame {
    
    /**DECLARACIÓN DE VARIABLES GLOBALES*/
    conexion c= new conexion();
    administrador t = new administrador();
    Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/design/snackOS.png"));
    int estado;
    
    
    public ingredientes() {
        super("SnackOS");
        initComponents();
        this.estado=estado;
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

        pnl_agregar = new javax.swing.JPanel();
        btn_listo = new javax.swing.JButton();
        txt_precio = new javax.swing.JTextField();
        txt_ID = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_existencia = new javax.swing.JTextField();
        btn_salir = new javax.swing.JButton();
        btn_minimizar = new javax.swing.JButton();
        btn_volver_inicio = new javax.swing.JButton();
        msj_comprobacion = new javax.swing.JLabel();
        img_letrero = new javax.swing.JLabel();
        box_tipo = new javax.swing.JComboBox<>();
        box_presentación = new javax.swing.JComboBox<>();
        box_enfriamento = new javax.swing.JComboBox<>();
        img_titulo = new javax.swing.JLabel();
        img_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnl_agregar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_listo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/listo.png"))); // NOI18N
        btn_listo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
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
        pnl_agregar.add(txt_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 160, 30));

        txt_ID.setEditable(false);
        txt_ID.setBackground(new java.awt.Color(255, 255, 255));
        txt_ID.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        txt_ID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_ID.setToolTipText("");
        txt_ID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        pnl_agregar.add(txt_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 160, 30));

        txt_nombre.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        txt_nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_nombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        pnl_agregar.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 160, 30));

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

        box_tipo.setEditable(true);
        box_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ELEGIR TIPO", "Lacteo", "Fruta", "Verduras", "Componentes", "Panes" }));
        box_tipo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        box_tipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        box_tipo.setFocusable(false);
        pnl_agregar.add(box_tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 160, 30));

        box_presentación.setEditable(true);
        box_presentación.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ELEGIR PRESENTACIÓN", "Paquete", "Reja", "Cono", "Caja", "Kilogramo", "Litro" }));
        box_presentación.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        box_presentación.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        box_presentación.setFocusable(false);
        pnl_agregar.add(box_presentación, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 160, 30));

        box_enfriamento.setEditable(true);
        box_enfriamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ELEGIR ENFRIAMENTO", "Si", "No" }));
        box_enfriamento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        box_enfriamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        box_enfriamento.setFocusable(false);
        pnl_agregar.add(box_enfriamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 160, 30));

        img_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnl_agregar.add(img_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 280, 80));

        img_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/frameingredientes.png"))); // NOI18N
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
        
        String url ="select max(\"ID_Ingrediente\") from ingredientes";
        
        ResultSet dato = basedatos.select(url);
        try{
        while(dato.next()){
            int idnext = Integer.parseInt(dato.getString(1));
            txt_ID.setText(""+(idnext+1));
        }
        }catch (SQLException ex){
            Logger.getLogger(ingredientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**Metodo genera id, desencadena el metodo coloca id*/
    public void generarID(){
        try {
            colocaID();
        } catch (SQLException ex) {
            Logger.getLogger(ingredientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**Metodo modifica, recibe parametros para almaenarlos en textfields
     * correspondientes.
     */
    public void modifica(String ID, 
                         String name,
                         String tipo,
                         String precio,  
                         String presentacion, 
                         String enfriamento, 
                         String existencia){
        
        txt_ID.setText(ID);
        txt_nombre.setText(String.valueOf(name));
        //boxcategoria.setSelectedItem(tipo);
        txt_precio.setText(precio);
        //txtenvase.setText(envase);
        box_tipo.setSelectedItem(tipo);
        //txtclasificacion.setText(clasificacion);
        box_presentación.setSelectedItem(presentacion);
        box_enfriamento.setSelectedItem(enfriamento);
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

    /**Metodo accion botones, actividades:
     * -Conecta con la base de datos.
     * -Establece condición.
     * -Si el estado es igual a 1, agrega ingrediente.
     * -Si es igual a 2, actualiza, modifica ingrediente.
     */
    public void accionbotones(){
       
       c.conectar();
       if(estado == 1){
       c.select("insert into ingredientes "
              + "values ('"+txt_ID.getText()+"','"
                           +txt_nombre.getText()+"','"
                           +box_presentación.getSelectedItem()+"','"
                           +txt_precio.getText()+"','"
                           +box_tipo.getSelectedItem()+"','"
                           +box_enfriamento.getSelectedItem()+"','"
                           +txt_existencia.getText()+"')");
       msj_comprobacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/agregado.png")));
       
       reset();
       }if(estado == 2){
           c.select("update ingredientes "
                   + "set \"Nombre\" = '"+txt_nombre.getText()+"',"
                   //+ "    \"Categoría\" = '"+boxcategoria.getSelectedItem()+"',"
                   + "    \"Presentacion\" = '"+box_presentación.getSelectedItem()+"',"
                   + "    \"Precio\" = '"+txt_precio.getText()+"',"
                   + "    \"Tipo\" = '"+box_tipo.getSelectedItem()+"',"
                   + "    \"Enfriamento\" = '"+box_enfriamento.getSelectedItem()+"',"
                   + "    \"Existencia\" = '"+txt_existencia.getText()+"'"
                   
                   + " where \"ID_Ingrediente\" = '"+txt_ID.getText()+"';");
           msj_comprobacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/modificado.png")));
       }if(estado == 3){
           c.select("delete from ingredientes"
                  + " where \"ID_Ingrediente\" = '"+txt_ID.getText()+"'");
           msj_comprobacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/eliminado.png")));
       }
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
           msj_comprobacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/ingname.png")));
           return false;
       }if(txt_precio.getText().equalsIgnoreCase("")){
           msj_comprobacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/ingprecio.png")));
           return false;
       }if(box_tipo.getSelectedIndex()==0){
           msj_comprobacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/ingtipo.png")));
           return false;
       }if(box_presentación.getSelectedIndex()==0){
          msj_comprobacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/ingpresentacion.png")));
           return false;
       }if(box_enfriamento.getSelectedIndex()==0){
           msj_comprobacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/ingenfriamiento.png")));
           return false;
       }if(txt_existencia.getText().equalsIgnoreCase("")){
           msj_comprobacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/ingexistencia.png")));
           return false;
       }
       return true;
   }
   
    /**Este metodo reinicia las variables a su estado original despues de 
     * ocupar el formulario
     */
    public void reset(){
       txt_ID.setText("");
       txt_nombre.setText("");
       box_tipo.setSelectedIndex(0);
       box_presentación.setSelectedIndex(0);
       txt_precio.setText("");
       box_enfriamento.setSelectedIndex(0);
       txt_existencia.setText("");
   }
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> box_enfriamento;
    private javax.swing.JComboBox<String> box_presentación;
    private javax.swing.JComboBox<String> box_tipo;
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
    private javax.swing.JTextField txt_existencia;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_precio;
    // End of variables declaration//GEN-END:variables
}
