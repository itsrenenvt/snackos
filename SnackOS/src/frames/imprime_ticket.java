/*Esta clase pertenece al paquete frames*/
package frames;

/*Bibliotecas importadas, para la utilización 
* de sus recursos en la clase
*/
import java.awt.*; 
import java.awt.print.*; 
import java.util.StringTokenizer;


public class imprime_ticket extends javax.swing.JFrame {

    /**
     * Constructor
     */
    public imprime_ticket() {
        initComponents();
        //this.setLocationRelativeTo(null);
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
        scroll_ticket = new javax.swing.JScrollPane();
        txt_ticket = new javax.swing.JTextArea();
        btn_volver_inicio = new javax.swing.JButton();
        btn_minimizar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        btn_imprimir = new javax.swing.JButton();
        img_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(328, 100));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(300, 553));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_principal.setMinimumSize(new java.awt.Dimension(330, 630));
        pnl_principal.setPreferredSize(new java.awt.Dimension(330, 630));
        pnl_principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_ticket.setColumns(20);
        txt_ticket.setRows(5);
        txt_ticket.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        scroll_ticket.setViewportView(txt_ticket);

        pnl_principal.add(scroll_ticket, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 330, 460));

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
        pnl_principal.add(btn_volver_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 30, 30));

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
        pnl_principal.add(btn_minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 30, 30));

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
        pnl_principal.add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 30, 30));

        btn_imprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/btn_imprimir.png"))); // NOI18N
        btn_imprimir.setMnemonic('I');
        btn_imprimir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 13, 45), 3));
        btn_imprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_imprimir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/design/btn_imprimir_sec.png"))); // NOI18N
        btn_imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_imprimir(evt);
            }
        });
        pnl_principal.add(btn_imprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 500, 130, 40));

        img_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/pnl_ticket.png"))); // NOI18N
        pnl_principal.add(img_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, -1));

        getContentPane().add(pnl_principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_imprimir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_imprimir
        /**Método del boton imprimir, actividades:
        *-Crea un objeto de tipo PaginationExample.
        *-Desencadena uno de los métodos del objeto.
        */
        PaginationExample pagination = new PaginationExample();
        pagination.imprimirticket();
    }//GEN-LAST:event_btn_imprimir

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
        cv.iniciar_sesion();
        this.dispose();
    }//GEN-LAST:event_btn_volver_inicio

    /**Método agrega texto, actividades:
     * Coloca en una variable global, los valores del parametro recibido.
     */
    public void agrega_texto(String txt){
        txt_ticket.setText(txt);
    }

    /**
     * @param args the command line arguments
     */
    
    public class PaginationExample implements Printable{
       //Se obtienen las lineas de texto del JTextArea, la linea de texto finaliza cuando se encuentra el caracter de nueva linea \n
       StringTokenizer lineasdetexto = new StringTokenizer(txt_ticket.getText(), "\n", true);
       //Se obtiene el total de lineas de texto
       int totallineas = lineasdetexto.countTokens();

    int[] paginas;  // Arreglo de número de paginas que se necesitaran para imprimir todo el texto 

    String[] textoLineas; //Lineas de texto que se imprimiran en cada hoja

    //Metodo que se crea por default cuando una clase implementa a Printable
    public int print(Graphics g, PageFormat pf, int pageIndex)
             throws PrinterException {
        //Se establece la fuente, el tipo, el tamaño, la metrica según la fuente asignada, 
        //obtiene la altura de cada linea de texto para que todas queden iguales
        Font font = new Font("Arial", Font.PLAIN, 8);
        FontMetrics metrics = g.getFontMetrics(font);
        int altodelinea = metrics.getHeight();
        //Calcula el número de lineas por pagina y el total de paginas
        if (paginas == null) {
            TextoLineas();
            //Calcula las lineas que le caben a cada página dividiendo la altura imprimible entre la altura de la linea de texto
            int lineasPorPagina = (int)(pf.getImageableHeight()/altodelinea);
            //Calcula el numero de páginas dividiendo el total de lineas entre el numero de lineas por página
            int numeroPaginas = (textoLineas.length-1)/lineasPorPagina;
            paginas = new int[numeroPaginas];
            for (int b=0; b<numeroPaginas; b++) {
                paginas[b] = (b+1)*lineasPorPagina; 
            }
        }
        //Si se recibe un indice de página mayor que el total de páginas calculadas entonces 
        //retorna NO_SUCH_PAGE para indicar que tal pagina no existe 
        if (pageIndex > paginas.length) {
            return NO_SUCH_PAGE;
        }
        /*Por lo regular cuando dibujamos algun objeto lo coloca en la coordenada (0,0), esta coordenada 
         * se encuentra fuera del área imprimible, por tal motivo se debe trasladar la posicion de las lineas de texto
         * según el área imprimible del eje X y el eje Y 
         */
        
        Graphics2D g2d = (Graphics2D)g;
        g2d.translate(pf.getImageableX(), pf.getImageableY());
        /*Dibujamos cada línea de texto en cada página,
         * se aumenta a la posición 'y' la altura de la línea a cada línea de texto para evitar la saturación de texto 
         */

        int y = 0; 
        int start = (pageIndex == 0) ? 0 : paginas[pageIndex-1];
        int end   = (pageIndex == paginas.length) ? textoLineas.length : paginas[pageIndex];
        for (int line=start; line<end; line++) {
            y += altodelinea;
            g.drawString(textoLineas[line], 0, y);
        }
        /* Retorna PAGE_EXISTS para indicar al invocador que esta página es parte del documento impreso
         */
        return PAGE_EXISTS;
    }
    
     /* Agrega las lineas de texto al arreglo */
    public void TextoLineas() {
        if (textoLineas == null) {
            int numLineas=totallineas;
            textoLineas = new String[numLineas];
            //Se llena el arreglo que contiene todas las lineas de texto
            while(lineasdetexto.hasMoreTokens()){
            for (int i=0;i<numLineas;i++) {
                textoLineas[i] = lineasdetexto.nextToken();
            }
            }
        }
    }
    
    //Este metodo crea un objeto Printerjob el cual es inicializado y asociado con la impresora por default
    public void imprimirticket() {
         PrinterJob job = PrinterJob.getPrinterJob();
         job.setPrintable(this);
         //Si el usuario presiona imprimir en el dialogo de impresión, 
         //entonces intenta imprimir todas las lineas de texto
         boolean ok = job.printDialog();
         if (ok) {
             try {
                  job.print();
             } catch (PrinterException ex) {
              /* The job did not successfully complete */
             }
         }
    }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_imprimir;
    private javax.swing.JButton btn_minimizar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JButton btn_volver_inicio;
    private javax.swing.JLabel img_fondo;
    private javax.swing.JPanel pnl_principal;
    private javax.swing.JScrollPane scroll_ticket;
    private javax.swing.JTextArea txt_ticket;
    // End of variables declaration//GEN-END:variables
}
