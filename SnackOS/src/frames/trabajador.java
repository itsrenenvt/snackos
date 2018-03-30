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
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**Inicio de la clase administrador
 *-Hereda de la libreria javax*/
public class trabajador extends javax.swing.JFrame {
    
    /**DECLARACIÓN DE VARIABLES GLOBALES*/
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
    public trabajador() {
        super("SnackOS");
        initComponents();
        oculta_componentes();
        this.estado=estado;
        frases();
        pnl_acercade_.setVisible(false);
        this.setIconImage(icon);
    }

    /*Este metodo oculta componentes al inicializar el frame*/
    public void oculta_componentes(){
        btn_agregar.setVisible(false);
        btn_eliminar.setVisible(false);
        btn_modificar.setVisible(false);
        box_busqueda.setVisible(false);
        btn_busqueda.setVisible(false);
        txt_busqueda.setVisible(false);
        btn_atender.setVisible(false);
        btn_total_usuarios.setVisible(false);
    }
    
    /**Este metodo coloca el nombre del usuario en el TextField
     * que se encuentra en e panel menú.
     */
    public void inserta_nombre_usuario(String nombre){
        txt_nombre.setText(nombre);
    }
    
    /*Este metodo coloca frases aleatorias*/
    public void frases(){
        /*Vuelve el label de la frase visible*/
        lbl_frase.setVisible(true);
        /*Genera un número pseudoaleatorio del 1 al 10*/
        int aleatorio =  (int) (Math.random() * 10+1);
        /*Inserta la frase de acuerdo al número generado pseudoaleatoriamente*/
        lbl_frase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/frase"+aleatorio+".png"))); 
    }
    
    /**
     * Este metodo es llamado desde el constructor para inicializar el formulario.
     * PELIGRO: No modificar este código. El contenido de este mettodo es siempre
     * regenerado por el editor del formulario.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlwallpaper = new javax.swing.JPanel();
        pnl_acercade_ = new javax.swing.JPanel();
        lbl_acercade = new javax.swing.JLabel();
        pnl_tabla = new javax.swing.JPanel();
        lbl_frase = new javax.swing.JLabel();
        menu_hamburguesa = new javax.swing.JButton();
        pnl_menu = new javax.swing.JPanel();
        btn_productos = new javax.swing.JButton();
        btn_acercade = new javax.swing.JButton();
        btn_ordenes = new javax.swing.JButton();
        txt_nombre = new javax.swing.JLabel();
        img_fondo_panel = new javax.swing.JLabel();
        lbl_usuario = new javax.swing.JLabel();
        pnl_gridproductos = new javax.swing.JPanel();
        btn_vertodo = new javax.swing.JButton();
        btn_cafes = new javax.swing.JButton();
        btn_jugos = new javax.swing.JButton();
        btn_postres = new javax.swing.JButton();
        btn_desayunos = new javax.swing.JButton();
        btn_sandwich = new javax.swing.JButton();
        btn_pizza = new javax.swing.JButton();
        btn_cereales = new javax.swing.JButton();
        btn_ensaladas = new javax.swing.JButton();
        btn_hamburguesas = new javax.swing.JButton();
        btn_ingredientes = new javax.swing.JButton();
        img_panel = new javax.swing.JLabel();
        img_fondo_panel_productos = new javax.swing.JLabel();
        pnl_ordenes = new javax.swing.JPanel();
        btn_todasordenes = new javax.swing.JButton();
        img_panel_ordenes = new javax.swing.JLabel();
        img_fondo_panel_ordenes = new javax.swing.JLabel();
        btn_entregadas = new javax.swing.JButton();
        btn_pendientes = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        btn_minimizar = new javax.swing.JButton();
        btn_volver_inicio = new javax.swing.JButton();
        btn_agregar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        img_fondo_admin = new javax.swing.JLabel();
        box_busqueda = new javax.swing.JComboBox<>();
        txt_busqueda = new javax.swing.JTextField();
        btn_busqueda = new javax.swing.JButton();
        btn_atender = new javax.swing.JButton();
        btn_total_usuarios = new javax.swing.JButton();
        pnl_acercade = new javax.swing.JPanel();
        img_acercade = new javax.swing.JLabel();
        img_abajo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnlwallpaper.setBackground(new java.awt.Color(83, 53, 74));
        pnlwallpaper.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_acercade_.setBackground(new java.awt.Color(83, 53, 74));
        pnl_acercade_.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 5));
        pnl_acercade_.setFocusCycleRoot(true);
        pnl_acercade_.setLayout(new java.awt.CardLayout());

        lbl_acercade.setFont(new java.awt.Font("Montserrat", 1, 48)); // NOI18N
        lbl_acercade.setForeground(new java.awt.Color(255, 255, 255));
        lbl_acercade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_acercade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/pnl_acercade.png"))); // NOI18N
        lbl_acercade.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnl_acercade_.add(lbl_acercade, "card2");

        pnlwallpaper.add(pnl_acercade_, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 930, 460));

        pnl_tabla.setBackground(new java.awt.Color(83, 53, 74));
        pnl_tabla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 5));
        pnl_tabla.setFocusCycleRoot(true);
        pnl_tabla.setLayout(new java.awt.CardLayout());

        lbl_frase.setFont(new java.awt.Font("Montserrat", 1, 48)); // NOI18N
        lbl_frase.setForeground(new java.awt.Color(255, 255, 255));
        lbl_frase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_frase.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnl_tabla.add(lbl_frase, "card2");

        pnlwallpaper.add(pnl_tabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 930, 340));

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
        pnlwallpaper.add(menu_hamburguesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

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

        txt_nombre.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(255, 255, 255));
        txt_nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        img_fondo_panel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/abajo.png"))); // NOI18N

        lbl_usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/lblusuario.png"))); // NOI18N

        javax.swing.GroupLayout pnl_menuLayout = new javax.swing.GroupLayout(pnl_menu);
        pnl_menu.setLayout(pnl_menuLayout);
        pnl_menuLayout.setHorizontalGroup(
            pnl_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_menuLayout.createSequentialGroup()
                .addComponent(img_fondo_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnl_menuLayout.createSequentialGroup()
                .addGroup(pnl_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_productos, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ordenes, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_acercade, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(lbl_usuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnl_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_menuLayout.setVerticalGroup(
            pnl_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_menuLayout.createSequentialGroup()
                .addComponent(lbl_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_productos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_ordenes, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_acercade, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addComponent(img_fondo_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlwallpaper.add(pnl_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 640));

        pnl_gridproductos.setBackground(new java.awt.Color(83, 53, 74));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder1 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder1.setShowBottomShadow(false);
        pnl_gridproductos.setBorder(dropShadowBorder1);

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

        btn_cafes.setBackground(new java.awt.Color(83, 53, 74));
        btn_cafes.setFont(new java.awt.Font("Montserrat Light", 1, 18)); // NOI18N
        btn_cafes.setForeground(new java.awt.Color(255, 255, 255));
        btn_cafes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/gridcafe.png"))); // NOI18N
        btn_cafes.setBorder(null);
        btn_cafes.setContentAreaFilled(false);
        btn_cafes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cafes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_cafes.setOpaque(true);
        btn_cafes.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/design/gridcafeblack.png"))); // NOI18N
        btn_cafes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cafes(evt);
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
                btnJugos(evt);
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

        btn_ensaladas.setBackground(new java.awt.Color(83, 53, 74));
        btn_ensaladas.setFont(new java.awt.Font("Montserrat Light", 1, 18)); // NOI18N
        btn_ensaladas.setForeground(new java.awt.Color(255, 255, 255));
        btn_ensaladas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/gridensalada.png"))); // NOI18N
        btn_ensaladas.setBorder(null);
        btn_ensaladas.setContentAreaFilled(false);
        btn_ensaladas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_ensaladas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_ensaladas.setOpaque(true);
        btn_ensaladas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/design/gridensaladablack.png"))); // NOI18N
        btn_ensaladas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ensaladas(evt);
            }
        });

        btn_hamburguesas.setBackground(new java.awt.Color(83, 53, 74));
        btn_hamburguesas.setFont(new java.awt.Font("Montserrat Light", 1, 18)); // NOI18N
        btn_hamburguesas.setForeground(new java.awt.Color(255, 255, 255));
        btn_hamburguesas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/gridhamburguesa.png"))); // NOI18N
        btn_hamburguesas.setBorder(null);
        btn_hamburguesas.setContentAreaFilled(false);
        btn_hamburguesas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_hamburguesas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_hamburguesas.setOpaque(true);
        btn_hamburguesas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/design/gridhambruguesasblack.png"))); // NOI18N
        btn_hamburguesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hamburguesas(evt);
            }
        });

        btn_ingredientes.setBackground(new java.awt.Color(83, 53, 74));
        btn_ingredientes.setFont(new java.awt.Font("Montserrat Light", 1, 18)); // NOI18N
        btn_ingredientes.setForeground(new java.awt.Color(255, 255, 255));
        btn_ingredientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/ingredientes.png"))); // NOI18N
        btn_ingredientes.setBorder(null);
        btn_ingredientes.setContentAreaFilled(false);
        btn_ingredientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_ingredientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_ingredientes.setOpaque(true);
        btn_ingredientes.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/design/ingredientesblack.png"))); // NOI18N
        btn_ingredientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingredientes(evt);
            }
        });

        img_panel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img_panel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/lblproductos.png"))); // NOI18N

        img_fondo_panel_productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/abajo.png"))); // NOI18N

        javax.swing.GroupLayout pnl_gridproductosLayout = new javax.swing.GroupLayout(pnl_gridproductos);
        pnl_gridproductos.setLayout(pnl_gridproductosLayout);
        pnl_gridproductosLayout.setHorizontalGroup(
            pnl_gridproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_gridproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addGroup(pnl_gridproductosLayout.createSequentialGroup()
                    .addComponent(btn_cafes)
                    .addGap(0, 0, 0)
                    .addComponent(btn_jugos)
                    .addGap(0, 0, 0)
                    .addComponent(btn_desayunos))
                .addGroup(pnl_gridproductosLayout.createSequentialGroup()
                    .addComponent(btn_sandwich)
                    .addGap(0, 0, 0)
                    .addComponent(btn_postres)
                    .addGap(0, 0, 0)
                    .addComponent(btn_pizza))
                .addGroup(pnl_gridproductosLayout.createSequentialGroup()
                    .addComponent(btn_hamburguesas)
                    .addGap(0, 0, 0)
                    .addComponent(btn_ensaladas)
                    .addGap(0, 0, 0)
                    .addComponent(btn_cereales))
                .addComponent(btn_ingredientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(img_fondo_panel_productos)
            .addComponent(btn_vertodo)
            .addGroup(pnl_gridproductosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnl_gridproductosLayout.setVerticalGroup(
            pnl_gridproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_gridproductosLayout.createSequentialGroup()
                .addComponent(img_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_vertodo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_gridproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_cafes)
                    .addComponent(btn_jugos)
                    .addComponent(btn_desayunos))
                .addGroup(pnl_gridproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_sandwich)
                    .addComponent(btn_postres)
                    .addComponent(btn_pizza))
                .addGroup(pnl_gridproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_hamburguesas)
                    .addComponent(btn_ensaladas)
                    .addComponent(btn_cereales))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_ingredientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(img_fondo_panel_productos, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlwallpaper.add(pnl_gridproductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(-200, 0, -1, 640));

        pnl_ordenes.setBackground(new java.awt.Color(83, 53, 74));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder2 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder2.setShowBottomShadow(false);
        pnl_ordenes.setBorder(dropShadowBorder2);

        btn_todasordenes.setBackground(new java.awt.Color(83, 53, 74));
        btn_todasordenes.setFont(new java.awt.Font("Montserrat Light", 1, 18)); // NOI18N
        btn_todasordenes.setForeground(new java.awt.Color(255, 255, 255));
        btn_todasordenes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/vertodo.png"))); // NOI18N
        btn_todasordenes.setBorder(null);
        btn_todasordenes.setContentAreaFilled(false);
        btn_todasordenes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_todasordenes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_todasordenes.setOpaque(true);
        btn_todasordenes.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/design/vertodoblack.png"))); // NOI18N
        btn_todasordenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_todasordenes(evt);
            }
        });

        img_panel_ordenes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img_panel_ordenes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/lblordenes.png"))); // NOI18N

        img_fondo_panel_ordenes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/abajo.png"))); // NOI18N

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
            .addComponent(img_fondo_panel_ordenes)
            .addComponent(btn_todasordenes)
            .addGroup(pnl_ordenesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img_panel_ordenes, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(btn_pendientes)
            .addComponent(btn_entregadas)
        );
        pnl_ordenesLayout.setVerticalGroup(
            pnl_ordenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ordenesLayout.createSequentialGroup()
                .addComponent(img_panel_ordenes, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                .addGap(48, 48, 48)
                .addComponent(btn_todasordenes)
                .addGap(18, 18, 18)
                .addComponent(btn_pendientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_entregadas)
                .addGap(118, 118, 118)
                .addComponent(img_fondo_panel_ordenes, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlwallpaper.add(pnl_ordenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(-200, 0, -1, 640));

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
        pnlwallpaper.add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 0, 30, 30));

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
        pnlwallpaper.add(btn_minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 0, 30, 30));

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
        pnlwallpaper.add(btn_volver_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 0, 30, 30));

        btn_agregar.setBackground(new java.awt.Color(83, 53, 74));
        btn_agregar.setFont(new java.awt.Font("Montserrat Light", 1, 18)); // NOI18N
        btn_agregar.setForeground(new java.awt.Color(255, 255, 255));
        btn_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/btnadd.png"))); // NOI18N
        btn_agregar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        btn_agregar.setContentAreaFilled(false);
        btn_agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_agregar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_agregar.setOpaque(true);
        btn_agregar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/design/btnaddblack.png"))); // NOI18N
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregar(evt);
            }
        });
        pnlwallpaper.add(btn_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 500, -1, -1));

        btn_eliminar.setBackground(new java.awt.Color(83, 53, 74));
        btn_eliminar.setFont(new java.awt.Font("Montserrat Light", 1, 18)); // NOI18N
        btn_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/btndelete.png"))); // NOI18N
        btn_eliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        btn_eliminar.setContentAreaFilled(false);
        btn_eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_eliminar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_eliminar.setOpaque(true);
        btn_eliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/design/btndeleteblack.png"))); // NOI18N
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminar(evt);
            }
        });
        pnlwallpaper.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 500, -1, -1));

        btn_modificar.setBackground(new java.awt.Color(83, 53, 74));
        btn_modificar.setFont(new java.awt.Font("Montserrat Light", 1, 18)); // NOI18N
        btn_modificar.setForeground(new java.awt.Color(255, 255, 255));
        btn_modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/btnmodify.png"))); // NOI18N
        btn_modificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        btn_modificar.setContentAreaFilled(false);
        btn_modificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_modificar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_modificar.setOpaque(true);
        btn_modificar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/design/btnmodifyblack.png"))); // NOI18N
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificar(evt);
            }
        });
        pnlwallpaper.add(btn_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 500, -1, -1));

        img_fondo_admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/city.png"))); // NOI18N
        pnlwallpaper.add(img_fondo_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, 860, 150));

        box_busqueda.setEditable(true);
        box_busqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BUSCAR", "producto", "ingrediente" }));
        box_busqueda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        pnlwallpaper.add(box_busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 160, 30));

        txt_busqueda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        txt_busqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                busquedaclic(evt);
            }
        });
        pnlwallpaper.add(txt_busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 590, 30));

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
        pnlwallpaper.add(btn_busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 110, 160, 30));

        btn_atender.setBackground(new java.awt.Color(83, 53, 74));
        btn_atender.setFont(new java.awt.Font("Montserrat Light", 1, 18)); // NOI18N
        btn_atender.setForeground(new java.awt.Color(255, 255, 255));
        btn_atender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/atender.png"))); // NOI18N
        btn_atender.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        btn_atender.setContentAreaFilled(false);
        btn_atender.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_atender.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_atender.setOpaque(true);
        btn_atender.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/design/atenderblack.png"))); // NOI18N
        btn_atender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atender(evt);
            }
        });
        pnlwallpaper.add(btn_atender, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 500, -1, -1));

        btn_total_usuarios.setBackground(new java.awt.Color(83, 53, 74));
        btn_total_usuarios.setFont(new java.awt.Font("Montserrat Light", 1, 18)); // NOI18N
        btn_total_usuarios.setForeground(new java.awt.Color(255, 255, 255));
        btn_total_usuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/contabilizar.png"))); // NOI18N
        btn_total_usuarios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        btn_total_usuarios.setContentAreaFilled(false);
        btn_total_usuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_total_usuarios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_total_usuarios.setOpaque(true);
        btn_total_usuarios.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/design/contabilizarblack.png"))); // NOI18N
        btn_total_usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_total_usuarios(evt);
            }
        });
        pnlwallpaper.add(btn_total_usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 500, -1, -1));

        pnl_acercade.setBackground(new java.awt.Color(83, 53, 74));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder3 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder3.setShowBottomShadow(false);
        pnl_acercade.setBorder(dropShadowBorder3);
        pnl_acercade.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        img_acercade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img_acercade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/pnl_nosotros.png"))); // NOI18N
        pnl_acercade.add(img_acercade, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 180, 530));

        img_abajo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/abajo.png"))); // NOI18N
        pnl_acercade.add(img_abajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 536, -1, -1));

        pnlwallpaper.add(pnl_acercade, new org.netbeans.lib.awtextra.AbsoluteConstraints(-200, 0, -1, 640));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlwallpaper, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlwallpaper, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    /**Metodo del boton salir, actividades:
     *-Cierra la ventana y termina el proceso de ejcución de la aplicación.
     */
    private void btn_salir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salir
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_salir

    /**Método del boton minimizar, actividades:
     *-Minimiza la pantalla.
     */
    private void btn_minimizar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_minimizar
        // TODO add your handling code here:
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btn_minimizar
    
    /**Método del boton para regresar al inicio de sesión, actividades:
     * -Cierra la actual ventana.
     * -Regresa al incicio de sesión
     */
    private void btn_volver_inicio(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volver_inicio
        // TODO add your handling code here:
       op.start();
       this.dispose();
    }//GEN-LAST:event_btn_volver_inicio

    /*Metodo de menus, actividades:
     *-Hace la consulta para obtener todos los productos de categoría cáfe.*/
    private void btn_cafes(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cafes
        // TODO add your handling code here:
        String url="SELECT * FROM productos WHERE \"Categoría\" =  'Café'";
        consultatablas(url);
        estado=1;
    }//GEN-LAST:event_btn_cafes

     /*Metodo de menus, actividades:
     *-Hace la consulta para obtener todos los productos de categoría postres.*/
    private void btn_postres(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_postres
        estado=1;
        String url="SELECT * FROM productos WHERE \"Categoría\" =  'Postre'";
        
        consultatablas(url);    }//GEN-LAST:event_btn_postres

     /*Metodo de menus, actividades:
     *-Hace la consulta para obtener todos los productos de categoría sandwich.*/
    private void btn_sandwich(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sandwich
        estado=1;
        String url="SELECT * FROM productos WHERE \"Categoría\" =  'Sandwich'";
        consultatablas(url);    }//GEN-LAST:event_btn_sandwich

     /*Metodo de menus, actividades:
     *-Hace la consulta para obtener todos los productos de categoría pizza.*/
    private void btn_pizza(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pizza
        estado=1;
        String url="SELECT * FROM productos WHERE \"Categoría\" =  'Pizza'";
        consultatablas(url);    }//GEN-LAST:event_btn_pizza

     /*Metodo de menus, actividades:
     *-Hace la consulta para obtener todos los productos de categoría cereales.*/
    private void btn_cereales(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cereales
        estado=1;
        String url="SELECT * FROM productos WHERE \"Categoría\" =  'Cereales'";
        consultatablas(url);
    }//GEN-LAST:event_btn_cereales

     /*Metodo de menus, actividades:
     *-Hace la consulta para obtener todos los productos de categoría ensaladas.*/
    private void btn_ensaladas(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ensaladas
        estado=1;
        String url="SELECT * FROM productos WHERE \"Categoría\" =  'Ensalada'";
        consultatablas(url);
    }//GEN-LAST:event_btn_ensaladas
     
     /*Metodo de agregar, actividades:
     *-Hace la conexión con la clase conexión.
     *-Realiza la consulta para agregar los datos creados en un formulario.*/
    public void agregar(String url){
        conexion basedatos = new conexion();
        
        basedatos.conectar();
        basedatos.select(url);
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
                modelo.addRow(fila);
                scroll.setViewportView(table);
                pnl_tabla.add(scroll,java.awt.BorderLayout.CENTER);
            }
            basedatos.cerrar();
        }catch(Exception e){
            System.out.println(e.toString());
        }
 }
 
    /*Metodo de menus, actividades:
     *-Hace la consulta para obtener todos los productos.*/
    private void btn_vertodo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_vertodo
        // TODO add your handling code here:
        String url="SELECT * FROM productos ORDER BY  \"ID_Producto\"";
        consultatablas(url);
        estado=1;
    }//GEN-LAST:event_btn_vertodo

    /*Metodo de menus, actividades:
     *-Hace la consulta para obtener todos los productos de categoría ingredientes.*/
    private void btn_ingredientes(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingredientes
        // TODO add your handling code here:
        String url="SELECT * FROM ingredientes ORDER BY  \"ID_Ingrediente\"";
        consultatablas(url);
        estado=2;
    }//GEN-LAST:event_btn_ingredientes

    /**Metodo dinamico, actividades:
     *-Al hacer clic abre el panel correspondiente y lo desliza dependiendo de 
    .* la posicion en la que este.*/
    private void menu_hamburguesa(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_hamburguesa
        // TODO add your handling code here:
        int posicion = pnl_menu.getX();
        pnl_acercade_.setVisible(false);
        pnl_tabla.setVisible(true);
        if(posicion < 0){
            Animacion.Animacion.mover_derecha(-200, 1, 2, 2, pnl_menu);
            pnl_gridproductos.setVisible(false);
            pnl_ordenes.setVisible(false);
            pnl_acercade.setVisible(false);
            frases();
            oculta_componentes();
        }
        
    }//GEN-LAST:event_menu_hamburguesa

    /*Metodo de menus, actividades:
     *-Hace la consulta para obtener todos los productos de categoría jugos.*/
    private void btnJugos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugos

        String url="SELECT * FROM productos WHERE \"Categoría\" =  'Jugo'";
        consultatablas(url);
        estado=1;
    }//GEN-LAST:event_btnJugos

    /*Metodo de menus, actividades:
     *-Hace la consulta para obtener todos los productos de categoría desayunos.*/
    private void btn_desayunos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_desayunos
        String url="SELECT * FROM productos WHERE \"Categoría\" =  'Desayuno'";
        consultatablas(url);
        estado=1;
    }//GEN-LAST:event_btn_desayunos

    /*Metodo de menus, actividades:
     *-Hace la consulta para obtener todos los productos de categoría hamburguesas.*/
    private void btn_hamburguesas(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hamburguesas
        estado=1;
        String url="SELECT * FROM productos WHERE \"Categoría\" =  'Hamburguesa'";
        consultatablas(url);    }//GEN-LAST:event_btn_hamburguesas

    /**Metodo para agregar, actividades:
     *-Checa en que estado se encuentra la aplicación en la sección de productos.
     *-Si esta en estado 1, agrega productos.
     *-Si esta en estado 2, agrega ingredientes.*/
    private void btn_agregar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregar
       if(estado == 1){
           op.productos();
       }if(estado == 2){
           op.ingredientes();
       }
    }//GEN-LAST:event_btn_agregar

    /**Metodo para eliminar, actividades:
     *-Checa en que estado se encuentra la aplicación en la sección de productos.
     *-Si esta en estado 1, elimina productos.
     *-Si esta en estado 2, elimina ingredientes.*/
    private void btn_eliminar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminar
        try{
            if(estado==1){
                vertuplaproductos(3);
            }if(estado==2){
                vertuplaingredientes(3);
            }
        }catch (Exception e){
            
        }
    }//GEN-LAST:event_btn_eliminar

    /**Metodo para ver ordenes, actividades:
     *-Crea una variable de tipo atender.
     *-Declara in indice para capturar la filaseleccionada.
     *-Captura la fila seleccionada.
     *-Consige el modelo de la tabla.
     *-Captura todos los datos de la fila seleccionada, los convierte a variables
     * de tipo string.
     *-Envia los datos al formulario de atender orden.
     *-Posiciona el formulario en el centro de la pantalla.
     *-Hace visible el formulario.
     */
    public void vertuplaorden(){
        atender a = new atender();   
        int filaseleccionada;

     try{
     
         filaseleccionada= table.getSelectedRow();
         System.out.println("FILA: "+filaseleccionada);
         if (filaseleccionada==-1){
         
             JOptionPane.showMessageDialog(null, "       PARA CONTINUAR"
                                              +"\nSELECCIONE UNA FILA EN EL MENÚ", " "
                     + "¡ LO SENTIMOS !" ,JOptionPane.ERROR_MESSAGE);

         }else{

             DefaultTableModel modelotabla=(DefaultTableModel) table.getModel();
           
             String idorden=(String)modelotabla.getValueAt(filaseleccionada, 0).toString();
             String nombreorden=(String) modelotabla.getValueAt(filaseleccionada, 1).toString();
             String categoria=(String)modelotabla.getValueAt(filaseleccionada, 2).toString();
             String presentacion =(String)modelotabla.getValueAt(filaseleccionada, 3).toString();
             String precio=(String)modelotabla.getValueAt(filaseleccionada, 4).toString();
             String descuento  = (String)modelotabla.getValueAt(filaseleccionada, 5).toString();
             String fecha=(String)modelotabla.getValueAt(filaseleccionada, 6).toString();
             String hora=(String)modelotabla.getValueAt(filaseleccionada, 7).toString();
             String total=(String) modelotabla.getValueAt(filaseleccionada, 8).toString();
             String idcliente=(String)modelotabla.getValueAt(filaseleccionada, 9).toString();
             String usuario=(String)modelotabla.getValueAt(filaseleccionada, 10).toString();
             String nombrecliente=(String)modelotabla.getValueAt(filaseleccionada, 11).toString();
             String apellidocliente=(String)modelotabla.getValueAt(filaseleccionada, 12).toString();
             String edificio=(String)modelotabla.getValueAt(filaseleccionada, 13).toString();
             String aula=(String)modelotabla.getValueAt(filaseleccionada, 14).toString();
             String transaccion=(String)modelotabla.getValueAt(filaseleccionada, 15).toString();
             String idtrabajador =(String)modelotabla.getValueAt(filaseleccionada, 16).toString();
             String nombretrabajador=(String)modelotabla.getValueAt(filaseleccionada, 17).toString();
             String apellidotrabajador=(String)modelotabla.getValueAt(filaseleccionada, 18).toString();
             String estadoorden=(String)modelotabla.getValueAt(filaseleccionada, 19).toString();
             
             
         
             a.atiende(idorden, nombreorden, categoria, precio, presentacion, descuento, fecha, hora, 
                     total, idcliente, usuario, nombrecliente, apellidocliente, edificio, aula, transaccion, 
                     idtrabajador,nombretrabajador, apellidotrabajador, estadoorden);
          
        a.setBounds(WidthScreen/5,HeightScreen/15,820,629);
        a.setVisible(true); 
       }
     }catch (HeadlessException ex){
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
        productos p = new productos();   
        int filaseleccionada;

     try{
     
         filaseleccionada= table.getSelectedRow();
         System.out.println("FILA: "+filaseleccionada);
         if (filaseleccionada==-1){
         
             JOptionPane.showMessageDialog(null, "       PARA CONTINUAR"
                                              +"\nSELECCIONE UNA FILA EN EL MENÚ", " "
                     + "¡ LO SENTIMOS !" ,JOptionPane.ERROR_MESSAGE);
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
        p.agregaestado(i);
       }
     }catch (HeadlessException ex){

    }
    }
    
    /**Metodo para ver ingredientes, actividades:
     *-Crea una variable de tipo atender.
     *-Declara in indice para capturar la filaseleccionada.
     *-Captura la fila seleccionada.
     *-Consige el modelo de la tabla.
     *-Captura todos los datos de la fila seleccionada, los convierte a variables
     * de tipo string.
     *-Envia los datos al formulario de atender orden.
     *-Posiciona el formulario en el centro de la pantalla.
     *-Hace visible el formulario.
     */
    public void vertuplaingredientes(int i){
        ingredientes p = new ingredientes();   
        int filaseleccionada;

     try{
     
         filaseleccionada= table.getSelectedRow();
         System.out.println("FILA: "+filaseleccionada);
         if (filaseleccionada==-1){
         
             JOptionPane.showMessageDialog(null, "       PARA CONTINUAR"
                                              +"\nSELECCIONE UNA FILA EN EL MENÚ", " "
                     + "¡ LO SENTIMOS !" ,JOptionPane.ERROR_MESSAGE);
         }else{

             DefaultTableModel modelotabla=(DefaultTableModel) table.getModel();
           
             String id=(String)modelotabla.getValueAt(filaseleccionada, 0).toString();
             String nombre=(String) modelotabla.getValueAt(filaseleccionada, 1).toString();
             String presentacion=(String)modelotabla.getValueAt(filaseleccionada, 2).toString();
             String precio=(String)modelotabla.getValueAt(filaseleccionada, 3).toString();
             String tipo=(String)modelotabla.getValueAt(filaseleccionada, 4).toString();
             String enfriamento=(String)modelotabla.getValueAt(filaseleccionada, 5).toString();
             String existencia=(String)modelotabla.getValueAt(filaseleccionada, 6).toString();
         
             p.modifica(id,nombre,presentacion,precio,tipo,enfriamento,existencia);
          
        
        p.setBounds(WidthScreen/3,HeightScreen/15,400,629);
        p.setVisible(true); 
        p.letrero(i);
        p.agregaestado(i);
       }
     }catch (HeadlessException ex){
            }
    }
    
    /**Metodo del boton modificar, actividades.
     *-Verifica en que estado se encuentra la variable.
     *-Si es estado 1, modifica producto.
     * -Si estado dos, modifica ingredientes.
     */
    private void btn_modificar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificar
       try{
            if(estado==1){
                vertuplaproductos(2);
            }if(estado==2){
                vertuplaingredientes(2);
            }
        }catch (Exception e){
            
        }
        
    }//GEN-LAST:event_btn_modificar

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
            pnl_acercade_.setVisible(true);
            pnl_tabla.setVisible(false);
            Animacion.Animacion.mover_derecha(-200, 1, 2, 2, pnl_acercade);
            Animacion.Animacion.mover_izquierda(5, -200, 2, 2, pnl_menu);
        }else{
            Animacion.Animacion.mover_izquierda(5, -200, 2, 2, pnl_acercade);
        }
    }//GEN-LAST:event_btn_acercade

    /**Metodo del boton productos, actividades:
     *-Captura la posicion del panel acerca de, en el eje x.
     * Hace visible:
     * -boton agregar.
     * -boton eliminar.
     * -boton modificar.
     * -box busqueda.
     * -boton buqueda.
     * -caja para escribir la busqueda.
     *-Condición, si la posición es menos a cero, hace visible el panel de productos.
     *-Muestra el menu de productos.
     */
    private void btn_productos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_productos
        // TODO add your handling code here:
        btn_agregar.setVisible(true);
        btn_eliminar.setVisible(true);
        btn_modificar.setVisible(true);
        box_busqueda.setVisible(true);
        btn_busqueda.setVisible(true);
        txt_busqueda.setVisible(true);
        int posicion = pnl_gridproductos.getX();
        if(posicion < 0){
            pnl_gridproductos.setVisible(true);
            Animacion.Animacion.mover_derecha(-200, 1, 2, 2, pnl_gridproductos);
            Animacion.Animacion.mover_izquierda(5, -200, 2, 2, pnl_menu);
        }else{
            Animacion.Animacion.mover_izquierda(5, -200, 2, 2, pnl_gridproductos);
        }
    }//GEN-LAST:event_btn_productos

    /**Metodo busqueda, actividades:
     * -Captura el número del indice del combobox.
     * -Hace una consulta de busqueda, de acuerdo al indice obtenido.
     */
    private void btn_busqueda(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_busqueda
        // TODO add your handling code here:
        if(box_busqueda.getSelectedIndex()==1){
           estado = 1; 
        }else{
            estado = 2;
        }
        String sql="select * "
                + "from " +box_busqueda.getSelectedItem()+"s "
                + "where upper (\"Nombre\") like upper ('"+txt_busqueda.getText()+"%')";
        consultatablas(sql);
        
    }//GEN-LAST:event_btn_busqueda

    /**Metodo que sirve como foco para el boton busqueda, actividades:
     *-Sirve como guía para que al presionar la tecla "enter", se ejecute
     * la función del boton busqueda.
     */
    private void busquedaclic(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_busquedaclic
        // TODO add your handling code here:
        char TeclaPresionada = evt.getKeyChar();
        
        if(TeclaPresionada == KeyEvent.VK_ENTER){
            btn_busqueda.doClick();
          }
    }//GEN-LAST:event_busquedaclic

    /**Metodo mostrar todas las ordenes, actividades:
     *-Declarara una variable sql de tipo string.
     *-Envia la consulta al metodo consulta tablas.
     */
    private void btn_todasordenes(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_todasordenes
        // TODO add your handling code here:
        String sql="select ordenes.\"ID_Orden\" , productos.\"Nombre\" , productos.\"Categoría\" ,productos.\"Presentación\" , productos.\"Precio\" , Productos.\"Descuento\" ,\n" +
"        ordenes.\"Fecha\" , ordenes.\"Hora\" , ordenes.\"Total\" ,  clientes.\"ID_Cliente\" , clientes.\"Usuario\" , clientes.\"Nombre\" ,\n" +
"        clientes.\"Apellido_Paterno\" , ubicacion.\"Edificio\" , ubicacion.\"Aula\" , ordenes.\"Transaccion\" ,\n" +
"        trabajador.\"ID_Trabajador\" , trabajador.\"Nombre\" , Trabajador.\"Apellido_Paterno\" , ordenes.\"Estado\"\n" +
"        \n" +
"from productos inner join orden_producto on productos.\"ID_Producto\" = orden_producto.\"ID_Producto\"\n" +
"                inner join ordenes on ordenes.\"ID_Orden\" = orden_producto.\"ID_Orden\"\n" +
"                inner join cliente_orden on cliente_orden.\"ID_Orden\" = orden_producto.\"ID_Orden\"\n" +
"                inner join clientes on cliente_orden.\"ID_Cliente\" = clientes.\"ID_Cliente\"\n" +
"                inner join trabajador on ordenes.\"ID_Trabajador\" = trabajador.\"ID_Trabajador\"\n" +
"                inner join ubicacion on clientes.\"ID_Ubicacion\" = ubicacion.\"ID_Ubicacion\"";
        consultatablas(sql);
    }//GEN-LAST:event_btn_todasordenes

    /**Metodo del boton ordenes, actividades:
     *-Captura la posicion del panel acerca de, en el eje x.
     *-Hace visible el boton atender.
     *-Condición, si la posición es menos a cero, hace visible el panel de ordenes.
     *-Muestra el menu de ordenes.
     *-Oculta el menu principal
     */
    private void btn_ordenes(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ordenes
        // TODO add your handling code here:
        btn_atender.setVisible(true);
        int posicion = pnl_ordenes.getX();
        if(posicion < 0){
            pnl_ordenes.setVisible(true);
            Animacion.Animacion.mover_derecha(-200, 1, 2, 2, pnl_ordenes);
            Animacion.Animacion.mover_izquierda(5, -200, 2, 2, pnl_menu);
            }else{
            Animacion.Animacion.mover_izquierda(5, -200, 2, 2, pnl_ordenes);
        }
    }//GEN-LAST:event_btn_ordenes

    /**Metodo mostrar todas las ordenes, actividades:
     *-Declarara una variable sql de tipo string.
     *-Muestra todas las ordenes con estado entregado.
     *-Envia la consulta al metodo consulta tablas.
     */
    private void btn_entregadas(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_entregadas
        // TODO add your handling code here:
        String sql="select ordenes.\"ID_Orden\" , productos.\"Nombre\" , productos.\"Categoría\" ,productos.\"Presentación\" , productos.\"Precio\" , Productos.\"Descuento\" ,\n" +
"        ordenes.\"Fecha\" , ordenes.\"Hora\" , ordenes.\"Total\" ,  clientes.\"ID_Cliente\" , clientes.\"Usuario\" , clientes.\"Nombre\" ,\n" +
"        clientes.\"Apellido_Paterno\" , ubicacion.\"Edificio\" , ubicacion.\"Aula\" , ordenes.\"Transaccion\" ,\n" +
"        trabajador.\"ID_Trabajador\" , trabajador.\"Nombre\" , Trabajador.\"Apellido_Paterno\" , ordenes.\"Estado\"\n" +
"        \n" +
"from productos inner join orden_producto on productos.\"ID_Producto\" = orden_producto.\"ID_Producto\"\n" +
"                inner join ordenes on ordenes.\"ID_Orden\" = orden_producto.\"ID_Orden\"\n" +
"                inner join cliente_orden on cliente_orden.\"ID_Orden\" = orden_producto.\"ID_Orden\"\n" +
"                inner join clientes on cliente_orden.\"ID_Cliente\" = clientes.\"ID_Cliente\"\n" +
"                inner join trabajador on ordenes.\"ID_Trabajador\" = trabajador.\"ID_Trabajador\"\n" +
"                inner join ubicacion on clientes.\"ID_Ubicacion\" = ubicacion.\"ID_Ubicacion\"\n" +
"                \n" +
"where ordenes.\"Estado\" = 'Entregado'";
        consultatablas(sql);
    }//GEN-LAST:event_btn_entregadas

    /**Metodo mostrar todas las ordenes, actividades:
     *-Declarara una variable sql de tipo string.
     *-Muestra todas las ordenes con estado pendiente.
     *-Envia la consulta al metodo consulta tablas.
     */
    private void btn_pendientes(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pendientes
        // TODO add your handling code here:
        String sql="select ordenes.\"ID_Orden\" , productos.\"Nombre\" , productos.\"Categoría\" ,productos.\"Presentación\" , productos.\"Precio\" , Productos.\"Descuento\" ,\n" +
"        ordenes.\"Fecha\" , ordenes.\"Hora\" , ordenes.\"Total\" ,  clientes.\"ID_Cliente\" , clientes.\"Usuario\" , clientes.\"Nombre\" ,\n" +
"        clientes.\"Apellido_Paterno\" , ubicacion.\"Edificio\" , ubicacion.\"Aula\" , ordenes.\"Transaccion\" ,\n" +
"        trabajador.\"ID_Trabajador\" , trabajador.\"Nombre\" , Trabajador.\"Apellido_Paterno\" , ordenes.\"Estado\"\n" +
"        \n" +
"from productos inner join orden_producto on productos.\"ID_Producto\" = orden_producto.\"ID_Producto\"\n" +
"                inner join ordenes on ordenes.\"ID_Orden\" = orden_producto.\"ID_Orden\"\n" +
"                inner join cliente_orden on cliente_orden.\"ID_Orden\" = orden_producto.\"ID_Orden\"\n" +
"                inner join clientes on cliente_orden.\"ID_Cliente\" = clientes.\"ID_Cliente\"\n" +
"                inner join trabajador on ordenes.\"ID_Trabajador\" = trabajador.\"ID_Trabajador\"\n" +
"                inner join ubicacion on clientes.\"ID_Ubicacion\" = ubicacion.\"ID_Ubicacion\"\n" +
"                \n" +
"where ordenes.\"Estado\" = 'Pendiente'";
        consultatablas(sql);
    }//GEN-LAST:event_btn_pendientes

    /**Metodo atender, actividades
     *-Declara una variable de tipo clase atender.
     *-Posiciona el formulario a la mitad de la pantalla.
     *-Hace visible el formulario
     */
    public void atender(){
        atender a= new atender();
        a.setBounds(WidthScreen/5,HeightScreen/15,820,629);
        a.setVisible(true); 
        } 
    
    /*Desencadena el metodo atender*/
    private void btn_atender(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atender
        // TODO add your handling code here:
        try{
           vertuplaorden(); 
        }catch(Exception e){
            
        }
        
    }//GEN-LAST:event_btn_atender

    /**Metodo cuenta usuarios, actividades.
     *-Declara una variable de tipo clase conexión.
     *-Conecta con la el servidor de la base de datos.
     *-Declara variable tipo string, que almacena consulta.
     *-Guardo lo obtenido en una variable resulset.
     *-Transforma el valor obtenido a una variable integer.
     *-Coloca el valor en el textfield total usuarios.
     */
    public void cuentausuarios(){
        conexion basedatos = new conexion();
        basedatos.conectar();
        
        String url ="select count(\"ID_Cliente\") from clientes";
        
        ResultSet dato = basedatos.select(url);
        try{
        while(dato.next()){
            int totalusuario = Integer.parseInt(dato.getString(1));
            //txt_total_usuarios.setText(""+totalusuario);
        }
        }catch (SQLException ex){
            Logger.getLogger(productos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /*Desencadena el metodo cuenta usuarios*/
    private void btn_total_usuarios(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_total_usuarios
        // TODO add your handling code here:
        cuentausuarios();
    }//GEN-LAST:event_btn_total_usuarios


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> box_busqueda;
    private javax.swing.JButton btn_acercade;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_atender;
    private javax.swing.JButton btn_busqueda;
    private javax.swing.JButton btn_cafes;
    private javax.swing.JButton btn_cereales;
    private javax.swing.JButton btn_desayunos;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_ensaladas;
    private javax.swing.JButton btn_entregadas;
    private javax.swing.JButton btn_hamburguesas;
    private javax.swing.JButton btn_ingredientes;
    private javax.swing.JButton btn_jugos;
    private javax.swing.JButton btn_minimizar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_ordenes;
    private javax.swing.JButton btn_pendientes;
    private javax.swing.JButton btn_pizza;
    private javax.swing.JButton btn_postres;
    private javax.swing.JButton btn_productos;
    private javax.swing.JButton btn_salir;
    private javax.swing.JButton btn_sandwich;
    private javax.swing.JButton btn_todasordenes;
    private javax.swing.JButton btn_total_usuarios;
    private javax.swing.JButton btn_vertodo;
    private javax.swing.JButton btn_volver_inicio;
    private javax.swing.JLabel img_abajo;
    private javax.swing.JLabel img_acercade;
    private javax.swing.JLabel img_fondo_admin;
    private javax.swing.JLabel img_fondo_panel;
    private javax.swing.JLabel img_fondo_panel_ordenes;
    private javax.swing.JLabel img_fondo_panel_productos;
    private javax.swing.JLabel img_panel;
    private javax.swing.JLabel img_panel_ordenes;
    private javax.swing.JLabel lbl_acercade;
    private javax.swing.JLabel lbl_frase;
    private javax.swing.JLabel lbl_usuario;
    private javax.swing.JButton menu_hamburguesa;
    private javax.swing.JPanel pnl_acercade;
    private javax.swing.JPanel pnl_acercade_;
    private javax.swing.JPanel pnl_gridproductos;
    private javax.swing.JPanel pnl_menu;
    private javax.swing.JPanel pnl_ordenes;
    private javax.swing.JPanel pnl_tabla;
    private javax.swing.JPanel pnlwallpaper;
    private javax.swing.JTextField txt_busqueda;
    private javax.swing.JLabel txt_nombre;
    // End of variables declaration//GEN-END:variables
}
