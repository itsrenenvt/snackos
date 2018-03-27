/*Esta clase pertenece al paquete frames*/
package frames;

/*Bibliotecas importadas, para la utilización 
* de sus recursos en la clase
*/
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**Inicio de la clase administrador
 *-Hereda de la libreria javax*/
public class cliente extends javax.swing.JFrame {
    
    /*DECLARACIÓN DE VARIABLES GLOBALES*/
    /*Variable de tipo clase config_ventana*/
    config_ventana op = new config_ventana();
    /*Variable que ayuda a alinnear el contenido dentro de la tabla.*/
    DefaultTableCellRenderer alinear;
    /*Declaración de la tabla*/
    JTable table=null;
    /*Declaración del scroll*/
    JScrollPane scroll = new JScrollPane();
    /*Esta variable ayuda a colocar el icono de la aplicación.*/
    Toolkit Screen = Toolkit.getDefaultToolkit();
    /*Obtiene las dimensiones de la pantalla.*/
    Dimension SizeScreen = Screen.getScreenSize();
    /*Coloca el iconoo de la app.*/
    Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/design/snackOS.png"));
    /*Obtiene el alto de la pantalla.*/
    int HeightScreen = SizeScreen.height;
    /*Obtiene el ancho de la pantalla.*/
    int WidthScreen = SizeScreen.width;
    /*Declara un estado*/
    int estado;
    
    /*Constructor*/
    public cliente() {
        super("SnackOS");
        initComponents();
        
        oculta_componentes();
        this.estado=estado;
        frases();
        pnl_informacion.setVisible(false);
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

        pnl_principal = new javax.swing.JPanel();
        pnl_informacion = new javax.swing.JPanel();
        img_acercade = new javax.swing.JLabel();
        pnl_tabla = new javax.swing.JPanel();
        lbl_frase = new javax.swing.JLabel();
        menu_hamburguesa = new javax.swing.JButton();
        pnl_menu = new javax.swing.JPanel();
        btn_productos = new javax.swing.JButton();
        btn_acercade = new javax.swing.JButton();
        btn_ordenes = new javax.swing.JButton();
        img_fondo_panel_menu = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JLabel();
        img_usuario = new javax.swing.JLabel();
        btn_volver_inicio = new javax.swing.JButton();
        btn_minimizar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        pnl_productos = new javax.swing.JPanel();
        btn_vertodo = new javax.swing.JButton();
        btn_cafe = new javax.swing.JButton();
        btn_jugos = new javax.swing.JButton();
        btn_postres = new javax.swing.JButton();
        btn_desayunos = new javax.swing.JButton();
        btn_sandwich = new javax.swing.JButton();
        btn_pizza = new javax.swing.JButton();
        btn_cereales = new javax.swing.JButton();
        btn_ensalada = new javax.swing.JButton();
        btn_hamburguesa = new javax.swing.JButton();
        img_panel_productos = new javax.swing.JLabel();
        img_fondo_productos = new javax.swing.JLabel();
        box_busqueda = new javax.swing.JComboBox<>();
        txt_busqueda = new javax.swing.JTextField();
        btn_busqueda = new javax.swing.JButton();
        btn_ordenar = new javax.swing.JButton();
        pnl_ordenes = new javax.swing.JPanel();
        btn_vertodo_ordenes = new javax.swing.JButton();
        img_ordenes = new javax.swing.JLabel();
        img_fondo_ordenes = new javax.swing.JLabel();
        btn_entregadas = new javax.swing.JButton();
        btn_pendientes = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        pnl_acercade = new javax.swing.JPanel();
        lblus = new javax.swing.JLabel();
        walldownventas1 = new javax.swing.JLabel();
        img_fondo_ciudad = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnl_principal.setBackground(new java.awt.Color(83, 53, 74));
        pnl_principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_informacion.setBackground(new java.awt.Color(83, 53, 74));
        pnl_informacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 5));
        pnl_informacion.setFocusCycleRoot(true);
        pnl_informacion.setLayout(new java.awt.CardLayout());

        img_acercade.setFont(new java.awt.Font("Montserrat", 1, 48)); // NOI18N
        img_acercade.setForeground(new java.awt.Color(255, 255, 255));
        img_acercade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img_acercade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/pnl_acercade.png"))); // NOI18N
        img_acercade.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnl_informacion.add(img_acercade, "card2");

        pnl_principal.add(pnl_informacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 930, 460));

        pnl_tabla.setBackground(new java.awt.Color(83, 53, 74));
        pnl_tabla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 5));
        pnl_tabla.setFocusCycleRoot(true);
        pnl_tabla.setLayout(new java.awt.CardLayout());

        lbl_frase.setFont(new java.awt.Font("Montserrat", 1, 48)); // NOI18N
        lbl_frase.setForeground(new java.awt.Color(255, 255, 255));
        lbl_frase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_frase.setText("Aquí se hace la magia...");
        pnl_tabla.add(lbl_frase, "card2");

        pnl_principal.add(pnl_tabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 930, 340));

        menu_hamburguesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/toggle.png"))); // NOI18N
        menu_hamburguesa.setBorder(null);
        menu_hamburguesa.setContentAreaFilled(false);
        menu_hamburguesa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_hamburguesa.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/design/toggleblack.png"))); // NOI18N
        menu_hamburguesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_hamburguesa(evt);
            }
        });
        pnl_principal.add(menu_hamburguesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        pnl_menu.setBackground(new java.awt.Color(83, 53, 74));
        pnl_menu.setBorder(new org.jdesktop.swingx.border.DropShadowBorder());

        btn_productos.setBackground(new java.awt.Color(83, 53, 74));
        btn_productos.setFont(new java.awt.Font("Montserrat Light", 1, 18)); // NOI18N
        btn_productos.setForeground(new java.awt.Color(255, 255, 255));
        btn_productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/productos.png"))); // NOI18N
        btn_productos.setBorder(null);
        btn_productos.setContentAreaFilled(false);
        btn_productos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_productos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_productos.setOpaque(true);
        btn_productos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/design/productosblack.png"))); // NOI18N
        btn_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_productos(evt);
            }
        });

        btn_acercade.setBackground(new java.awt.Color(83, 53, 74));
        btn_acercade.setFont(new java.awt.Font("Montserrat Light", 1, 18)); // NOI18N
        btn_acercade.setForeground(new java.awt.Color(255, 255, 255));
        btn_acercade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/nosotros.png"))); // NOI18N
        btn_acercade.setBorder(null);
        btn_acercade.setContentAreaFilled(false);
        btn_acercade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_acercade.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_acercade.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_acercade.setOpaque(true);
        btn_acercade.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/design/nosotrosblack.png"))); // NOI18N
        btn_acercade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_acercade(evt);
            }
        });

        btn_ordenes.setBackground(new java.awt.Color(83, 53, 74));
        btn_ordenes.setFont(new java.awt.Font("Montserrat Light", 1, 18)); // NOI18N
        btn_ordenes.setForeground(new java.awt.Color(255, 255, 255));
        btn_ordenes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/ordenes.png"))); // NOI18N
        btn_ordenes.setBorder(null);
        btn_ordenes.setContentAreaFilled(false);
        btn_ordenes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_ordenes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_ordenes.setOpaque(true);
        btn_ordenes.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/design/ordenesblack.png"))); // NOI18N
        btn_ordenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ordenes(evt);
            }
        });

        img_fondo_panel_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/abajo.png"))); // NOI18N

        txt_usuario.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        txt_usuario.setForeground(new java.awt.Color(255, 255, 255));
        txt_usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        img_usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/lblusuario.png"))); // NOI18N

        javax.swing.GroupLayout pnl_menuLayout = new javax.swing.GroupLayout(pnl_menu);
        pnl_menu.setLayout(pnl_menuLayout);
        pnl_menuLayout.setHorizontalGroup(
            pnl_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(img_usuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(btn_productos, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btn_ordenes, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btn_acercade, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_menuLayout.createSequentialGroup()
                .addGroup(pnl_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(img_fondo_panel_menu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_menuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnl_menuLayout.setVerticalGroup(
            pnl_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_menuLayout.createSequentialGroup()
                .addComponent(img_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btn_productos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_ordenes, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_acercade, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(img_fondo_panel_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl_principal.add(pnl_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 640));

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
        pnl_principal.add(btn_volver_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 0, 30, 30));

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
        pnl_principal.add(btn_minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 0, 30, 30));

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
        pnl_principal.add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 0, 30, 30));

        pnl_productos.setBackground(new java.awt.Color(83, 53, 74));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder1 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder1.setShowBottomShadow(false);
        pnl_productos.setBorder(dropShadowBorder1);

        btn_vertodo.setBackground(new java.awt.Color(83, 53, 74));
        btn_vertodo.setFont(new java.awt.Font("Montserrat Light", 1, 18)); // NOI18N
        btn_vertodo.setForeground(new java.awt.Color(255, 255, 255));
        btn_vertodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/vertodo.png"))); // NOI18N
        btn_vertodo.setBorder(null);
        btn_vertodo.setContentAreaFilled(false);
        btn_vertodo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_vertodo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_vertodo.setOpaque(true);
        btn_vertodo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/design/vertodoblack.png"))); // NOI18N
        btn_vertodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_vertodo(evt);
            }
        });

        btn_cafe.setBackground(new java.awt.Color(83, 53, 74));
        btn_cafe.setFont(new java.awt.Font("Montserrat Light", 1, 18)); // NOI18N
        btn_cafe.setForeground(new java.awt.Color(255, 255, 255));
        btn_cafe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/gridcafe.png"))); // NOI18N
        btn_cafe.setBorder(null);
        btn_cafe.setContentAreaFilled(false);
        btn_cafe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cafe.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_cafe.setOpaque(true);
        btn_cafe.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/design/gridcafeblack.png"))); // NOI18N
        btn_cafe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cafe(evt);
            }
        });

        btn_jugos.setBackground(new java.awt.Color(83, 53, 74));
        btn_jugos.setFont(new java.awt.Font("Montserrat Light", 1, 18)); // NOI18N
        btn_jugos.setForeground(new java.awt.Color(255, 255, 255));
        btn_jugos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/gridjugos.png"))); // NOI18N
        btn_jugos.setBorder(null);
        btn_jugos.setContentAreaFilled(false);
        btn_jugos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_jugos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_jugos.setOpaque(true);
        btn_jugos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/design/gridjugosblack.png"))); // NOI18N
        btn_jugos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Jugos(evt);
            }
        });

        btn_postres.setBackground(new java.awt.Color(83, 53, 74));
        btn_postres.setFont(new java.awt.Font("Montserrat Light", 1, 18)); // NOI18N
        btn_postres.setForeground(new java.awt.Color(255, 255, 255));
        btn_postres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/gridpostre.png"))); // NOI18N
        btn_postres.setBorder(null);
        btn_postres.setContentAreaFilled(false);
        btn_postres.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_postres.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_postres.setOpaque(true);
        btn_postres.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/design/gridpostreblack.png"))); // NOI18N
        btn_postres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_postres(evt);
            }
        });

        btn_desayunos.setBackground(new java.awt.Color(83, 53, 74));
        btn_desayunos.setFont(new java.awt.Font("Montserrat Light", 1, 18)); // NOI18N
        btn_desayunos.setForeground(new java.awt.Color(255, 255, 255));
        btn_desayunos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/griddesayunos.png"))); // NOI18N
        btn_desayunos.setBorder(null);
        btn_desayunos.setContentAreaFilled(false);
        btn_desayunos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_desayunos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_desayunos.setOpaque(true);
        btn_desayunos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/design/griddesayunosblack.png"))); // NOI18N
        btn_desayunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_desayunos(evt);
            }
        });

        btn_sandwich.setBackground(new java.awt.Color(83, 53, 74));
        btn_sandwich.setFont(new java.awt.Font("Montserrat Light", 1, 18)); // NOI18N
        btn_sandwich.setForeground(new java.awt.Color(255, 255, 255));
        btn_sandwich.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/gridsandwich.png"))); // NOI18N
        btn_sandwich.setBorder(null);
        btn_sandwich.setContentAreaFilled(false);
        btn_sandwich.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_sandwich.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_sandwich.setOpaque(true);
        btn_sandwich.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/design/gridsandwichblack.png"))); // NOI18N
        btn_sandwich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sandwich(evt);
            }
        });

        btn_pizza.setBackground(new java.awt.Color(83, 53, 74));
        btn_pizza.setFont(new java.awt.Font("Montserrat Light", 1, 18)); // NOI18N
        btn_pizza.setForeground(new java.awt.Color(255, 255, 255));
        btn_pizza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/gridpizza.png"))); // NOI18N
        btn_pizza.setBorder(null);
        btn_pizza.setContentAreaFilled(false);
        btn_pizza.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_pizza.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_pizza.setOpaque(true);
        btn_pizza.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/design/gridpizzablack.png"))); // NOI18N
        btn_pizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pizza(evt);
            }
        });

        btn_cereales.setBackground(new java.awt.Color(83, 53, 74));
        btn_cereales.setFont(new java.awt.Font("Montserrat Light", 1, 18)); // NOI18N
        btn_cereales.setForeground(new java.awt.Color(255, 255, 255));
        btn_cereales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/gridcereales.png"))); // NOI18N
        btn_cereales.setBorder(null);
        btn_cereales.setContentAreaFilled(false);
        btn_cereales.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cereales.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_cereales.setOpaque(true);
        btn_cereales.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/design/gridcerealesblack.png"))); // NOI18N
        btn_cereales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cereales(evt);
            }
        });

        btn_ensalada.setBackground(new java.awt.Color(83, 53, 74));
        btn_ensalada.setFont(new java.awt.Font("Montserrat Light", 1, 18)); // NOI18N
        btn_ensalada.setForeground(new java.awt.Color(255, 255, 255));
        btn_ensalada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/gridensalada.png"))); // NOI18N
        btn_ensalada.setBorder(null);
        btn_ensalada.setContentAreaFilled(false);
        btn_ensalada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_ensalada.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_ensalada.setOpaque(true);
        btn_ensalada.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/design/gridensaladablack.png"))); // NOI18N
        btn_ensalada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ensalada(evt);
            }
        });

        btn_hamburguesa.setBackground(new java.awt.Color(83, 53, 74));
        btn_hamburguesa.setFont(new java.awt.Font("Montserrat Light", 1, 18)); // NOI18N
        btn_hamburguesa.setForeground(new java.awt.Color(255, 255, 255));
        btn_hamburguesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/gridhamburguesa.png"))); // NOI18N
        btn_hamburguesa.setBorder(null);
        btn_hamburguesa.setContentAreaFilled(false);
        btn_hamburguesa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_hamburguesa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_hamburguesa.setOpaque(true);
        btn_hamburguesa.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/design/gridhambruguesasblack.png"))); // NOI18N
        btn_hamburguesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hamburguesa(evt);
            }
        });

        img_panel_productos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img_panel_productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/lblproductos.png"))); // NOI18N

        img_fondo_productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/abajo.png"))); // NOI18N

        javax.swing.GroupLayout pnl_productosLayout = new javax.swing.GroupLayout(pnl_productos);
        pnl_productos.setLayout(pnl_productosLayout);
        pnl_productosLayout.setHorizontalGroup(
            pnl_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_productosLayout.createSequentialGroup()
                .addComponent(btn_cafe)
                .addGap(0, 0, 0)
                .addComponent(btn_jugos)
                .addGap(0, 0, 0)
                .addComponent(btn_desayunos))
            .addGroup(pnl_productosLayout.createSequentialGroup()
                .addComponent(btn_sandwich)
                .addGap(0, 0, 0)
                .addComponent(btn_postres)
                .addGap(0, 0, 0)
                .addComponent(btn_pizza))
            .addGroup(pnl_productosLayout.createSequentialGroup()
                .addComponent(btn_hamburguesa)
                .addGap(0, 0, 0)
                .addComponent(btn_ensalada)
                .addGap(0, 0, 0)
                .addComponent(btn_cereales))
            .addComponent(img_fondo_productos)
            .addComponent(btn_vertodo)
            .addGroup(pnl_productosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img_panel_productos, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnl_productosLayout.setVerticalGroup(
            pnl_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_productosLayout.createSequentialGroup()
                .addComponent(img_panel_productos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(37, 37, 37)
                .addComponent(btn_vertodo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_cafe)
                    .addComponent(btn_jugos)
                    .addComponent(btn_desayunos))
                .addGroup(pnl_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_sandwich)
                    .addComponent(btn_postres)
                    .addComponent(btn_pizza))
                .addGroup(pnl_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_hamburguesa)
                    .addComponent(btn_ensalada)
                    .addComponent(btn_cereales))
                .addGap(40, 40, 40)
                .addComponent(img_fondo_productos, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnl_principal.add(pnl_productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(-200, 0, -1, 640));

        box_busqueda.setEditable(true);
        box_busqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CATEGORÍA", "Café", "Jugo", "Desayuno", "Sandwich", "Postre", "Pizza", "Hamburguesa", "Ensalada", "Cereal" }));
        box_busqueda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        pnl_principal.add(box_busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 160, 30));

        txt_busqueda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        txt_busqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_busquedabusquedaclic(evt);
            }
        });
        pnl_principal.add(txt_busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 590, 30));

        btn_busqueda.setBackground(new java.awt.Color(255, 255, 255));
        btn_busqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/busqueda.png"))); // NOI18N
        btn_busqueda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        btn_busqueda.setOpaque(false);
        btn_busqueda.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/design/busquedablack.png"))); // NOI18N
        btn_busqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_busqueda(evt);
            }
        });
        pnl_principal.add(btn_busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 110, 160, 30));

        btn_ordenar.setBackground(new java.awt.Color(83, 53, 74));
        btn_ordenar.setFont(new java.awt.Font("Montserrat Light", 1, 18)); // NOI18N
        btn_ordenar.setForeground(new java.awt.Color(255, 255, 255));
        btn_ordenar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/btnordenar.png"))); // NOI18N
        btn_ordenar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        btn_ordenar.setContentAreaFilled(false);
        btn_ordenar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_ordenar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_ordenar.setOpaque(true);
        btn_ordenar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/design/btnordenarblack.png"))); // NOI18N
        btn_ordenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ordenar(evt);
            }
        });
        pnl_principal.add(btn_ordenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 500, -1, -1));

        pnl_ordenes.setBackground(new java.awt.Color(83, 53, 74));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder2 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder2.setShowBottomShadow(false);
        pnl_ordenes.setBorder(dropShadowBorder2);

        btn_vertodo_ordenes.setBackground(new java.awt.Color(83, 53, 74));
        btn_vertodo_ordenes.setFont(new java.awt.Font("Montserrat Light", 1, 18)); // NOI18N
        btn_vertodo_ordenes.setForeground(new java.awt.Color(255, 255, 255));
        btn_vertodo_ordenes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/vertodo.png"))); // NOI18N
        btn_vertodo_ordenes.setBorder(null);
        btn_vertodo_ordenes.setContentAreaFilled(false);
        btn_vertodo_ordenes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_vertodo_ordenes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_vertodo_ordenes.setOpaque(true);
        btn_vertodo_ordenes.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/design/vertodoblack.png"))); // NOI18N
        btn_vertodo_ordenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_vertodo_ordenes(evt);
            }
        });

        img_ordenes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img_ordenes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/lblordenes.png"))); // NOI18N

        img_fondo_ordenes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/abajo.png"))); // NOI18N

        btn_entregadas.setBackground(new java.awt.Color(83, 53, 74));
        btn_entregadas.setFont(new java.awt.Font("Montserrat Light", 1, 18)); // NOI18N
        btn_entregadas.setForeground(new java.awt.Color(255, 255, 255));
        btn_entregadas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/entregado.png"))); // NOI18N
        btn_entregadas.setBorder(null);
        btn_entregadas.setContentAreaFilled(false);
        btn_entregadas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_entregadas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_entregadas.setOpaque(true);
        btn_entregadas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/design/entregadoblack.png"))); // NOI18N
        btn_entregadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_entregadas(evt);
            }
        });

        btn_pendientes.setBackground(new java.awt.Color(83, 53, 74));
        btn_pendientes.setFont(new java.awt.Font("Montserrat Light", 1, 18)); // NOI18N
        btn_pendientes.setForeground(new java.awt.Color(255, 255, 255));
        btn_pendientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/pendiente.png"))); // NOI18N
        btn_pendientes.setBorder(null);
        btn_pendientes.setContentAreaFilled(false);
        btn_pendientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_pendientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_pendientes.setOpaque(true);
        btn_pendientes.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/design/pendienteblack.png"))); // NOI18N
        btn_pendientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pendientes(evt);
            }
        });

        javax.swing.GroupLayout pnl_ordenesLayout = new javax.swing.GroupLayout(pnl_ordenes);
        pnl_ordenes.setLayout(pnl_ordenesLayout);
        pnl_ordenesLayout.setHorizontalGroup(
            pnl_ordenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(img_fondo_ordenes)
            .addComponent(btn_vertodo_ordenes)
            .addGroup(pnl_ordenesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img_ordenes, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(btn_pendientes)
            .addComponent(btn_entregadas)
        );
        pnl_ordenesLayout.setVerticalGroup(
            pnl_ordenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ordenesLayout.createSequentialGroup()
                .addComponent(img_ordenes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_vertodo_ordenes)
                .addGap(60, 60, 60)
                .addComponent(btn_pendientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_entregadas)
                .addGap(118, 118, 118)
                .addComponent(img_fondo_ordenes, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnl_principal.add(pnl_ordenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(-200, 0, -1, 640));

        btn_cancelar.setBackground(new java.awt.Color(83, 53, 74));
        btn_cancelar.setFont(new java.awt.Font("Montserrat Light", 1, 18)); // NOI18N
        btn_cancelar.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/btncancelar.png"))); // NOI18N
        btn_cancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        btn_cancelar.setContentAreaFilled(false);
        btn_cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cancelar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_cancelar.setOpaque(true);
        btn_cancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/design/btncancelarblack.png"))); // NOI18N
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelar(evt);
            }
        });
        pnl_principal.add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 500, -1, -1));

        pnl_acercade.setBackground(new java.awt.Color(83, 53, 74));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder3 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder3.setShowBottomShadow(false);
        pnl_acercade.setBorder(dropShadowBorder3);
        pnl_acercade.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/pnl_nosotros.png"))); // NOI18N
        pnl_acercade.add(lblus, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 180, 530));

        walldownventas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/abajo.png"))); // NOI18N
        pnl_acercade.add(walldownventas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 536, -1, -1));

        pnl_principal.add(pnl_acercade, new org.netbeans.lib.awtextra.AbsoluteConstraints(-200, 0, -1, 640));

        img_fondo_ciudad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/city.png"))); // NOI18N
        pnl_principal.add(img_fondo_ciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, 860, 150));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*Este metodo coloca frases aleatorias*/
    public void frases(){
        /*Vuelve el label de la frase visible*/
        lbl_frase.setVisible(true);
        /*Genera un número pseudoaleatorio del 1 al 10*/
        int aleatorio =  (int) (Math.random() * 10+1);
        /*Inserta la frase de acuerdo al número generado pseudoaleatoriamente*/
        lbl_frase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/frase"+aleatorio+".png")));
    }
    
    /**Este metodo coloca el nombre del usuario en el TextField
     * que se encuentra en e panel menú.
     */
    public void inserta_nombre_cliente(String nombre){
        txt_usuario.setText(nombre);
    }
    
    /**Metodo dinamico, actividades:
     *-Al hacer clic abre el panel correspondiente y lo desliza dependiendo de 
    .* la posicion en la que este.*/
    private void menu_hamburguesa(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_hamburguesa
        
        int posicion = pnl_menu.getX();
        pnl_informacion.setVisible(false);
        pnl_tabla.setVisible(true);
        if(posicion < 0){
            Animacion.Animacion.mover_derecha(-200, 1, 2, 2, pnl_menu);
            pnl_productos.setVisible(false);
            oculta_componentes();
        }

    }//GEN-LAST:event_menu_hamburguesa

    /**Metodo del boton productos, actividades:
     *-Captura la posicion del panel acerca de, en el eje x.
     * Hace visible:
     * -boton ordenar.
     * -box busqueda.
     * -boton buqueda.
     * -caja para escribir la busqueda.
     *-Condición, si la posición es menos a cero, hace visible el panel de productos.
     *-Muestra el menu de productos.
     */
    private void btn_productos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_productos
        btn_ordenar.setVisible(true);
        box_busqueda.setVisible(true);
        btn_busqueda.setVisible(true);
        txt_busqueda.setVisible(true);
        int posicion = pnl_productos.getX();
        if(posicion < 0){
            pnl_productos.setVisible(true);
            Animacion.Animacion.mover_derecha(-200, 1, 2, 2, pnl_productos);
            Animacion.Animacion.mover_izquierda(5, -200, 2, 2, pnl_menu);
        }else{
            Animacion.Animacion.mover_izquierda(5, -200, 2, 2, pnl_productos);
        }
       
    }//GEN-LAST:event_btn_productos

    /**Metodo del boton acerca de, actividades:
     *-Captura la posicion del panel acerca de, en el eje x.
     *-Condición, si la posición es menos a cero, hace visible los paneles con
     * información. Oculta el panel de la tabla.
     *-Muestra el menu informativo de acerca de.
     */
    private void btn_acercade(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_acercade
        // TODO add your handling code here:
        int posicion = pnl_acercade.getX();
        if(posicion < 0){
            pnl_acercade.setVisible(true);
            pnl_informacion.setVisible(true);
            pnl_tabla.setVisible(false);
            Animacion.Animacion.mover_derecha(-200, 1, 2, 2, pnl_acercade);
            Animacion.Animacion.mover_izquierda(5, -200, 2, 2, pnl_menu);
            //2pnlmenu.setVisible(false);
            //Animacion.Animacion.mover_izquierda(5, -200, 2, 2, pnlmenu);
            //Animacion.Animacion.mover_izquierda(5, -200, 2, 2, pnlaux);
        }else{
            //Animacion.Animacion.mover_derecha(-200, 0, 1, 1, pnlaux);
            //Animacion.Animacion.mover_derecha(-200, 2, 2, 2, pnlmenu);
            Animacion.Animacion.mover_izquierda(5, -200, 2, 2, pnl_acercade);
        }
    }//GEN-LAST:event_btn_acercade

    /**Metodo del boton ordenes, actividades:
     *-Captura la posicion del panel acerca de, en el eje x.
     *-Hace visible el boton atender.
     *-Condición, si la posición es menos a cero, hace visible el panel de ordenes.
     *-Muestra el menu de ordenes.
     *-Oculta el menu principal
     */
    private void btn_ordenes(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ordenes
        // TODO add your handling code here:
        btn_cancelar.setVisible(true);
        int posicion = pnl_ordenes.getX();
        if(posicion < 0){
            pnl_ordenes.setVisible(true);
            Animacion.Animacion.mover_derecha(-200, 1, 2, 2, pnl_ordenes);
            Animacion.Animacion.mover_izquierda(5, -200, 2, 2, pnl_menu);
        }else{
            Animacion.Animacion.mover_izquierda(5, -200, 2, 2, pnl_ordenes);
        }
        
    }//GEN-LAST:event_btn_ordenes

    /**Método del boton para regresar al inicio de sesión, actividades:
     * -Cierra la actual ventana.
     * -Regresa al incicio de sesión
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
        System.exit(0);
    }//GEN-LAST:event_btn_salir

    /*Metodo de menus, actividades:
     *-Hace la consulta para obtener todos los productos.*/
    private void btn_vertodo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_vertodo
        // TODO add your handling code here:
        String url="SELECT * FROM productos ORDER BY  \"Categoría\"";
        consultatablas(url);
        estado=1;
    }//GEN-LAST:event_btn_vertodo

    /*Metodo de menus, actividades:
     *-Hace la consulta para obtener todos los productos de categoría cáfe.*/
    private void btn_cafe(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cafe
        // TODO add your handling code here:
        String url="SELECT * FROM productos WHERE \"Categoría\" =  'Café'";
        consultatablas(url);
        estado=1;
    }//GEN-LAST:event_btn_cafe

    /*Metodo de menus, actividades:
     *-Hace la consulta para obtener todos los productos de categoría jugos.*/
    private void btn_Jugos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Jugos

        String url="SELECT * FROM productos WHERE \"Categoría\" =  'Jugo'";
        consultatablas(url);
        estado=1;
    }//GEN-LAST:event_btn_Jugos

    /*Metodo de menus, actividades:
     *-Hace la consulta para obtener todos los productos de categoría postres.*/
    private void btn_postres(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_postres
        estado=1;
        String url="SELECT * FROM productos WHERE \"Categoría\" =  'Postre'";
        consultatablas(url);
    }//GEN-LAST:event_btn_postres

    /*Metodo de menus, actividades:
     *-Hace la consulta para obtener todos los productos de categoría desayunos.*/
    private void btn_desayunos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_desayunos
        String url="SELECT * FROM productos WHERE \"Categoría\" =  'Desayuno'";
        consultatablas(url);
        estado=1;
    }//GEN-LAST:event_btn_desayunos

    /*Metodo de menus, actividades:
     *-Hace la consulta para obtener todos los productos de categoría sandwich.*/
    private void btn_sandwich(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sandwich
        estado=1;
        String url="SELECT * FROM productos WHERE \"Categoría\" =  'Sandwich'";
        consultatablas(url);
    }//GEN-LAST:event_btn_sandwich

    /*Metodo de menus, actividades:
     *-Hace la consulta para obtener todos los productos de categoría pizza.*/
    private void btn_pizza(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pizza
        estado=1;
        String url="SELECT * FROM productos WHERE \"Categoría\" =  'Pizza'";
        consultatablas(url);
    }//GEN-LAST:event_btn_pizza

    /*Metodo de menus, actividades:
     *-Hace la consulta para obtener todos los productos de categoría cereales.*/
    private void btn_cereales(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cereales
        estado=1;
        String url="SELECT * FROM productos WHERE \"Categoría\" =  'Cereales'";
        consultatablas(url);
    }//GEN-LAST:event_btn_cereales

    /*Metodo de menus, actividades:
     *-Hace la consulta para obtener todos los productos de categoría ensaladas.*/
    private void btn_ensalada(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ensalada
        estado=1;
        String url="SELECT * FROM productos WHERE \"Categoría\" =  'Ensalada'";
        consultatablas(url);
    }//GEN-LAST:event_btn_ensalada

    /*Metodo de menus, actividades:
     *-Hace la consulta para obtener todos los productos de categoría hamburguesas.*/
    private void btn_hamburguesa(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hamburguesa
        estado=1;
        String url="SELECT * FROM productos WHERE \"Categoría\" =  'Hamburguesa'";
        consultatablas(url);
    }//GEN-LAST:event_btn_hamburguesa

    /**Metodo que sirve como foco para el boton busqueda, actividades:
     *-Sirve como guía para que al presionar la tecla "enter", se ejecute
     * la función del boton busqueda.
     */
    private void txt_busquedabusquedaclic(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_busquedabusquedaclic
        // TODO add your handling code here:
        char TeclaPresionada = evt.getKeyChar();

        if(TeclaPresionada == KeyEvent.VK_ENTER){
            btn_busqueda.doClick();
        }
    }//GEN-LAST:event_txt_busquedabusquedaclic

    /**Metodo busqueda, actividades:
     * -Hace una consulta de busqueda, de acuerdo a los parametros ingresados.
     */
    private void btn_busqueda(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_busqueda
     
        String sql="select * " +
                   "from productos " +
                   "where \"Categoría\" = '"+box_busqueda.getSelectedItem()+"' and upper(\"Nombre\") like upper('"+txt_busqueda.getText()+"%')";
        consultatablas(sql);

    }//GEN-LAST:event_btn_busqueda

    /*Desencadena el metodo vertuplaproductos*/
    private void btn_ordenar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ordenar
        
        try{
            vertuplaproductos(4);
        }catch(Exception e){
            
        }

    }//GEN-LAST:event_btn_ordenar

    /**Metodo de menus, actividades:
     *-Hace la consulta para obtener todas las ordenes.
     *-Pone el estado en 2*/
    private void btn_vertodo_ordenes(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_vertodo_ordenes
        // TODO add your handling code here:
        String sql="select ordenes.\"ID_Orden\" , productos.\"Nombre\" , productos.\"Categoría\" ,productos.\"Presentación\" , productos.\"Precio\" , Productos.\"Descuento\" ,\n" +
                "        ordenes.\"Fecha\" , ordenes.\"Hora\" , ordenes.\"Total\" ,\n" +
                "        ubicacion.\"Edificio\" , ubicacion.\"Aula\" , ordenes.\"Transaccion\" ,\n" +
                "        trabajador.\"ID_Trabajador\" , trabajador.\"Nombre\" , Trabajador.\"Apellido_Paterno\" , ordenes.\"Estado\"\n" +
                "        \n" +
                "from productos inner join orden_producto on productos.\"ID_Producto\" = orden_producto.\"ID_Producto\"\n" +
                "                inner join ordenes on ordenes.\"ID_Orden\" = orden_producto.\"ID_Orden\"\n" +
                "                inner join cliente_orden on cliente_orden.\"ID_Orden\" = orden_producto.\"ID_Orden\"\n" +
                "                inner join clientes on cliente_orden.\"ID_Cliente\" = clientes.\"ID_Cliente\"\n" +
                "                inner join trabajador on ordenes.\"ID_Trabajador\" = trabajador.\"ID_Trabajador\"\n" +
                "                inner join ubicacion on clientes.\"ID_Ubicacion\" = ubicacion.\"ID_Ubicacion\"\n" +
                "where upper(clientes.\"Usuario\") = upper('"+txt_usuario.getText()+"')";
        consultatablas(sql);
        estado=2;
    }//GEN-LAST:event_btn_vertodo_ordenes

    /*Metodo de menu, actividades:
     *-Hace la consulta para obtener todas las ordenes entregadas.*/
    private void btn_entregadas(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_entregadas
        // TODO add your handling code here:
        String sql="select ordenes.\"ID_Orden\" , productos.\"Nombre\" , productos.\"Categoría\" ,productos.\"Presentación\" , productos.\"Precio\" , Productos.\"Descuento\" ,\n" +
                "        ordenes.\"Fecha\" , ordenes.\"Hora\" , ordenes.\"Total\" ,\n" +
                "        ubicacion.\"Edificio\" , ubicacion.\"Aula\" , ordenes.\"Transaccion\" ,\n" +
                "        trabajador.\"ID_Trabajador\" , trabajador.\"Nombre\" , Trabajador.\"Apellido_Paterno\" , ordenes.\"Estado\"\n" +
                "        \n" +
                "from productos inner join orden_producto on productos.\"ID_Producto\" = orden_producto.\"ID_Producto\"\n" +
                "                inner join ordenes on ordenes.\"ID_Orden\" = orden_producto.\"ID_Orden\"\n" +
                "                inner join cliente_orden on cliente_orden.\"ID_Orden\" = orden_producto.\"ID_Orden\"\n" +
                "                inner join clientes on cliente_orden.\"ID_Cliente\" = clientes.\"ID_Cliente\"\n" +
                "                inner join trabajador on ordenes.\"ID_Trabajador\" = trabajador.\"ID_Trabajador\"\n" +
                "                inner join ubicacion on clientes.\"ID_Ubicacion\" = ubicacion.\"ID_Ubicacion\"\n" +
                "where upper(clientes.\"Usuario\") = upper('"+txt_usuario.getText()+"') and ordenes.\"Estado\" = 'Entregado'";
        consultatablas(sql);
        estado=1;
    }//GEN-LAST:event_btn_entregadas

    /*Metodo de menus, actividades:
     *-Hace la consulta para obtener todas las ordenes pendientes.*/
    private void btn_pendientes(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pendientes
        // TODO add your handling code here:
        String sql="select ordenes.\"ID_Orden\" , productos.\"Nombre\" , productos.\"Categoría\" ,productos.\"Presentación\" , productos.\"Precio\" , Productos.\"Descuento\" ,\n" +
                "        ordenes.\"Fecha\" , ordenes.\"Hora\" , ordenes.\"Total\" ,\n" +
                "        ubicacion.\"Edificio\" , ubicacion.\"Aula\" , ordenes.\"Transaccion\" ,\n" +
                "        trabajador.\"ID_Trabajador\" , trabajador.\"Nombre\" , Trabajador.\"Apellido_Paterno\" , ordenes.\"Estado\"\n" +
                "        \n" +
                "from productos inner join orden_producto on productos.\"ID_Producto\" = orden_producto.\"ID_Producto\"\n" +
                "                inner join ordenes on ordenes.\"ID_Orden\" = orden_producto.\"ID_Orden\"\n" +
                "                inner join cliente_orden on cliente_orden.\"ID_Orden\" = orden_producto.\"ID_Orden\"\n" +
                "                inner join clientes on cliente_orden.\"ID_Cliente\" = clientes.\"ID_Cliente\"\n" +
                "                inner join trabajador on ordenes.\"ID_Trabajador\" = trabajador.\"ID_Trabajador\"\n" +
                "                inner join ubicacion on clientes.\"ID_Ubicacion\" = ubicacion.\"ID_Ubicacion\"\n" +
                "where upper(clientes.\"Usuario\") = upper('"+txt_usuario.getText()+"') and ordenes.\"Estado\" = 'Pendiente'";
        consultatablas(sql);
        estado=2;
    }//GEN-LAST:event_btn_pendientes

    /**Metodo boton cancelar, desencadena el metodo vertuplaproductos si el
     * estado es igual a dos.
    */
    private void btn_cancelar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelar
        // TODO add your handling code here:
        try{
            if(estado==2){
               vertuplaproductos(5); 
            }
            
        }catch(Exception e){

        }

    }//GEN-LAST:event_btn_cancelar

    /*Este metodo oculta componentes al inicializar el frame*/
     public void oculta_componentes(){
        btn_ordenar.setVisible(false);
        box_busqueda.setVisible(false);
        btn_busqueda.setVisible(false);
        txt_busqueda.setVisible(false);
        btn_cancelar.setVisible(false);
    }
    
     /**Metodo de consultatablas, actividades:
      *-De acuerdo al boton presionado, del menú envía un url.
      *-Ejecuta la consulta.
      *-Crea la tabla.
      *-Muestra la tabla en el panel tabla.
      *-Alinea los datos de la tabla al centro.
      *-Cierra la conexión con el servidor de la base de datos.*/
     public void consultatablas(String url){
       alinear = new DefaultTableCellRenderer();
       pnl_tabla.removeAll();
        DefaultTableModel modelo = new DefaultTableModel();
        conexion basedatos = new conexion();
        
        basedatos.conectar();
        ResultSet resultset = basedatos.select(url);
        
        alinear.setHorizontalAlignment(SwingConstants.CENTER);
        try{
            ResultSetMetaData metadatos = resultset.getMetaData();
            int numeroColumnas = metadatos.getColumnCount();
            Object[] etiquetas = new Object [numeroColumnas];
            for(int i=0; i<numeroColumnas;i++){
                etiquetas[i] = metadatos.getColumnLabel(i+1);
            }
            
            modelo.setColumnIdentifiers(etiquetas);
            table = new JTable(modelo);
            while(resultset.next()){
                Object [] fila = new Object[numeroColumnas];
                for(int i=0;i<numeroColumnas;i++){
                    fila[i]=resultset.getObject(i+1);
                    table.getColumnModel().getColumn(i).setCellRenderer(alinear);
                    if(numeroColumnas > 15){
                        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
                        table.doLayout();
                    }
                }
                //table.getColumnModel().getColumn(0).setCellRenderer(alinear);
                modelo.addRow(fila);
                scroll.setViewportView(table);
                pnl_tabla.add(scroll,java.awt.BorderLayout.CENTER);
            }
            basedatos.cerrar();
        }catch(Exception e){
            System.out.println(e.toString());
        }
 }
     
     /**Metodo para ver productos, actividades:
     *-Crea una variable de tipo atender.
     *-Declara in indice para capturar la filaseleccionada.
     *-Captura la fila seleccionada.
     *-Consige el modelo de la tabla.
     *-Captura todos los datos de la fila seleccionada, los convierte a variables
     * de tipo string.
     *-Envia los datos al formulario de atender orden.
     *-Posiciona el formulario en el centro de la pantalla.
     *-Hace visible el formulario.
     *-Asigna letrero al formulario.
     *-Asigna estado al formulario.
     */
     public void vertuplaproductos(int i){
        ordenar p = new ordenar();   
        int filaseleccionada;

     try{
     
         filaseleccionada= table.getSelectedRow();
         System.out.println("FILA: "+filaseleccionada);
         if (filaseleccionada==-1){
         
             JOptionPane.showMessageDialog(null, "       PARA CONTINUAR"
                                              +"\nSELECCIONE UNA FILA EN EL MENÚ", " "
                     + "¡ LO SENTIMOS !" ,JOptionPane.ERROR_MESSAGE);
             
              //op.alerta();
         }else{

             DefaultTableModel modelotabla=(DefaultTableModel) table.getModel();
           
             String id=(String)modelotabla.getValueAt(filaseleccionada, 0).toString();
             String nombre=(String) modelotabla.getValueAt(filaseleccionada, 1).toString();
             String tipo=(String)modelotabla.getValueAt(filaseleccionada, 2).toString();
             String precio=(String)modelotabla.getValueAt(filaseleccionada, 3).toString();
             String envase=(String)modelotabla.getValueAt(filaseleccionada, 4).toString();
             String clasificacion=(String)modelotabla.getValueAt(filaseleccionada, 5).toString();
             String descuento=(String)modelotabla.getValueAt(filaseleccionada, 6).toString();
             String existencia=(String) modelotabla.getValueAt(filaseleccionada, 7).toString();
         
             p.modifica(id,nombre,tipo,precio,envase,clasificacion,descuento,existencia);
          
        p.setBounds(WidthScreen/3,HeightScreen/15,400,629);
        p.setVisible(true);
        p.letrero(i);
        p.idcliente(txt_usuario.getText());
        p.agregaestado(i);
        p.generarID();  
        
       }
     }catch (HeadlessException ex){
           /*
             JOptionPane.showMessageDialog(null, "Error: "+ex
                     +"\nInténtelo nuevamente", " "
                     + ".::Error En la Operacion::." ,JOptionPane.ERROR_MESSAGE);
           */
       }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> box_busqueda;
    private javax.swing.JButton btn_acercade;
    private javax.swing.JButton btn_busqueda;
    private javax.swing.JButton btn_cafe;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_cereales;
    private javax.swing.JButton btn_desayunos;
    private javax.swing.JButton btn_ensalada;
    private javax.swing.JButton btn_entregadas;
    private javax.swing.JButton btn_hamburguesa;
    private javax.swing.JButton btn_jugos;
    private javax.swing.JButton btn_minimizar;
    private javax.swing.JButton btn_ordenar;
    private javax.swing.JButton btn_ordenes;
    private javax.swing.JButton btn_pendientes;
    private javax.swing.JButton btn_pizza;
    private javax.swing.JButton btn_postres;
    private javax.swing.JButton btn_productos;
    private javax.swing.JButton btn_salir;
    private javax.swing.JButton btn_sandwich;
    private javax.swing.JButton btn_vertodo;
    private javax.swing.JButton btn_vertodo_ordenes;
    private javax.swing.JButton btn_volver_inicio;
    private javax.swing.JLabel img_acercade;
    private javax.swing.JLabel img_fondo_ciudad;
    private javax.swing.JLabel img_fondo_ordenes;
    private javax.swing.JLabel img_fondo_panel_menu;
    private javax.swing.JLabel img_fondo_productos;
    private javax.swing.JLabel img_ordenes;
    private javax.swing.JLabel img_panel_productos;
    private javax.swing.JLabel img_usuario;
    private javax.swing.JLabel lbl_frase;
    private javax.swing.JLabel lblus;
    private javax.swing.JButton menu_hamburguesa;
    private javax.swing.JPanel pnl_acercade;
    private javax.swing.JPanel pnl_informacion;
    private javax.swing.JPanel pnl_menu;
    private javax.swing.JPanel pnl_ordenes;
    private javax.swing.JPanel pnl_principal;
    private javax.swing.JPanel pnl_productos;
    private javax.swing.JPanel pnl_tabla;
    private javax.swing.JTextField txt_busqueda;
    private javax.swing.JLabel txt_usuario;
    private javax.swing.JLabel walldownventas1;
    // End of variables declaration//GEN-END:variables
}
