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

/*Inicio de la clase productos*/
public class cobrar extends javax.swing.JFrame {
    /**DECLARACIÓN DE VARIABLES GLOBALES*/
    conexion c= new conexion();
    administrador t = new administrador();
     Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/design/snackOS.png"));
    int estado;
    
    /*Constructor*/
    public cobrar() {
        super("SnackOS");
        initComponents();
        pnl_efectivo.setVisible(false);
        pnl_tarjetas.setVisible(false);
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
        btn_salir = new javax.swing.JButton();
        btn_minimizar = new javax.swing.JButton();
        btn_volver_inicio = new javax.swing.JButton();
        msj_comprobacion = new javax.swing.JLabel();
        img_letrero = new javax.swing.JLabel();
        btn_tarjetas = new javax.swing.JButton();
        btn_efectivo = new javax.swing.JButton();
        img_pnls = new javax.swing.JLabel();
        pnl_efectivo = new javax.swing.JPanel();
        txt_total = new javax.swing.JTextField();
        txt_recibido = new javax.swing.JTextField();
        txt_cambio = new javax.swing.JTextField();
        img_efectivo = new javax.swing.JLabel();
        pnl_tarjetas = new javax.swing.JPanel();
        txt_num_tarjeta = new javax.swing.JTextField();
        txt_total_tarjetas = new javax.swing.JTextField();
        box_mes = new javax.swing.JComboBox<>();
        box_año = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
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
        pnl_agregar.add(btn_listo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 500, 130, 40));

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

        img_letrero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/letrero_cobrar.png"))); // NOI18N
        img_letrero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        pnl_agregar.add(img_letrero, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 190, 30));

        btn_tarjetas.setBackground(new java.awt.Color(83, 53, 74));
        btn_tarjetas.setFont(new java.awt.Font("Montserrat Light", 1, 18)); // NOI18N
        btn_tarjetas.setForeground(new java.awt.Color(255, 255, 255));
        btn_tarjetas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/btn_tarjetas.png"))); // NOI18N
        btn_tarjetas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        btn_tarjetas.setContentAreaFilled(false);
        btn_tarjetas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_tarjetas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_tarjetas.setOpaque(true);
        btn_tarjetas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/design/btn_tarjetas_sec.png"))); // NOI18N
        btn_tarjetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tarjetas(evt);
            }
        });
        pnl_agregar.add(btn_tarjetas, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, -1));

        btn_efectivo.setBackground(new java.awt.Color(83, 53, 74));
        btn_efectivo.setFont(new java.awt.Font("Montserrat Light", 1, 18)); // NOI18N
        btn_efectivo.setForeground(new java.awt.Color(255, 255, 255));
        btn_efectivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/btn_efectivo.png"))); // NOI18N
        btn_efectivo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        btn_efectivo.setContentAreaFilled(false);
        btn_efectivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_efectivo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_efectivo.setOpaque(true);
        btn_efectivo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/design/btn_efectivo_sec.png"))); // NOI18N
        btn_efectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_efectivo(evt);
            }
        });
        pnl_agregar.add(btn_efectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        img_pnls.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/img_pnls.png"))); // NOI18N
        pnl_agregar.add(img_pnls, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 290, 320));

        pnl_efectivo.setBackground(new java.awt.Color(83, 53, 74));

        txt_total.setEditable(false);
        txt_total.setBackground(new java.awt.Color(255, 255, 255));
        txt_total.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        txt_total.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_total.setToolTipText("");
        txt_total.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));

        txt_recibido.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        txt_recibido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_recibido.setToolTipText("");
        txt_recibido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));

        txt_cambio.setEditable(false);
        txt_cambio.setBackground(new java.awt.Color(255, 255, 255));
        txt_cambio.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        txt_cambio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_cambio.setToolTipText("");
        txt_cambio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));

        img_efectivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/pnl_efectivo.png"))); // NOI18N

        javax.swing.GroupLayout pnl_efectivoLayout = new javax.swing.GroupLayout(pnl_efectivo);
        pnl_efectivo.setLayout(pnl_efectivoLayout);
        pnl_efectivoLayout.setHorizontalGroup(
            pnl_efectivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_efectivoLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(pnl_efectivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_recibido, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_cambio, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(pnl_efectivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_efectivoLayout.createSequentialGroup()
                    .addComponent(img_efectivo)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        pnl_efectivoLayout.setVerticalGroup(
            pnl_efectivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_efectivoLayout.createSequentialGroup()
                .addContainerGap(116, Short.MAX_VALUE)
                .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(txt_recibido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(txt_cambio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(pnl_efectivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(img_efectivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl_agregar.add(pnl_efectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 280, 320));

        pnl_tarjetas.setBackground(new java.awt.Color(83, 53, 74));
        pnl_tarjetas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_num_tarjeta.setBackground(new java.awt.Color(255, 255, 255));
        txt_num_tarjeta.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        txt_num_tarjeta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_num_tarjeta.setToolTipText("");
        txt_num_tarjeta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        pnl_tarjetas.add(txt_num_tarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 223, 30));

        txt_total_tarjetas.setBackground(new java.awt.Color(255, 255, 255));
        txt_total_tarjetas.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        txt_total_tarjetas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_total_tarjetas.setToolTipText("");
        txt_total_tarjetas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        pnl_tarjetas.add(txt_total_tarjetas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 160, 30));

        box_mes.setEditable(true);
        box_mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MES", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        box_mes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        pnl_tarjetas.add(box_mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 100, 30));

        box_año.setEditable(true);
        box_año.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AÑO", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050" }));
        box_año.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        pnl_tarjetas.add(box_año, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 100, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/pnl_tarjetas.png"))); // NOI18N
        pnl_tarjetas.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, -1));

        pnl_agregar.add(pnl_tarjetas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 290, 320));

        img_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/frame_cobrar.png"))); // NOI18N
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

    
    private void btn_listo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_listo
       
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
    }//GEN-LAST:event_btn_volver_inicio

    private void btn_tarjetas(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tarjetas
        // TODO add your handling code here:
        try{
            img_pnls.setVisible(false);
            pnl_efectivo.setVisible(false);
            pnl_tarjetas.setVisible(true);
            
        }catch(Exception e){
            
        }
       
    }//GEN-LAST:event_btn_tarjetas

    private void btn_efectivo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_efectivo
        // TODO add your handling code here:
        try{
            img_pnls.setVisible(false);
            pnl_tarjetas.setVisible(false);
            pnl_efectivo.setVisible(true);
            
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_btn_efectivo

       
    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> box_año;
    private javax.swing.JComboBox<String> box_mes;
    private javax.swing.JButton btn_efectivo;
    private javax.swing.JButton btn_listo;
    private javax.swing.JButton btn_minimizar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JButton btn_tarjetas;
    private javax.swing.JButton btn_volver_inicio;
    private javax.swing.JLabel img_efectivo;
    private javax.swing.JLabel img_fondo;
    private javax.swing.JLabel img_letrero;
    private javax.swing.JLabel img_pnls;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel msj_comprobacion;
    private javax.swing.JPanel pnl_agregar;
    private javax.swing.JPanel pnl_efectivo;
    private javax.swing.JPanel pnl_tarjetas;
    private javax.swing.JTextField txt_cambio;
    private javax.swing.JTextField txt_num_tarjeta;
    private javax.swing.JTextField txt_recibido;
    private javax.swing.JTextField txt_total;
    private javax.swing.JTextField txt_total_tarjetas;
    // End of variables declaration//GEN-END:variables
}
