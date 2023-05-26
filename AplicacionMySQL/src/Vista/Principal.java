package Vista;

import Config.Conexion;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public final class Principal extends javax.swing.JFrame {

    int xMouse, yMouse, ID_EST;
    Conexion con = new Conexion();
    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;

    public Principal() {
        initComponents();
        listar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Basico = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CajaID = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        CajaCedula = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        CajaNombre1 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        CajaNombre2 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        CajaApellido1 = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        CajaApellido2 = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        CajaGenero = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        CajaCarrera = new javax.swing.JComboBox<>();
        CajaCampus = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        CajaFecha = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        CajaDireccion = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        BtAgregar = new javax.swing.JButton();
        BtModificar = new javax.swing.JButton();
        BtEliminar = new javax.swing.JButton();
        BtLimpiar = new javax.swing.JButton();
        barra = new javax.swing.JPanel();
        BotonX = new javax.swing.JButton();
        BotonMin = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABLA = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        Basico.setBackground(new java.awt.Color(51, 0, 0));
        Basico.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 0));
        jLabel1.setText("Biblioteca UCC ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jLabel2.setBackground(new java.awt.Color(51, 0, 51));
        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 0));
        jLabel2.setText("Cedula");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 90, -1));

        CajaID.setBackground(new java.awt.Color(255, 255, 255));
        CajaID.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        CajaID.setForeground(new java.awt.Color(204, 204, 204));
        CajaID.setText("ingresar ID...");
        CajaID.setBorder(null);
        CajaID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CajaIDMousePressed(evt);
            }
        });
        CajaID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CajaIDKeyTyped(evt);
            }
        });
        jPanel2.add(CajaID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 160, 30));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 160, 10));

        jLabel3.setBackground(new java.awt.Color(51, 0, 0));
        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 0));
        jLabel3.setText("ID");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        CajaCedula.setBackground(new java.awt.Color(255, 255, 255));
        CajaCedula.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        CajaCedula.setForeground(new java.awt.Color(204, 204, 204));
        CajaCedula.setText("Ingresar Cedula...");
        CajaCedula.setBorder(null);
        CajaCedula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CajaCedulaMousePressed(evt);
            }
        });
        CajaCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CajaCedulaKeyTyped(evt);
            }
        });
        jPanel2.add(CajaCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 160, 30));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 160, 10));

        jLabel4.setBackground(new java.awt.Color(51, 0, 51));
        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 0));
        jLabel4.setText("Genero");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 60, -1));

        CajaNombre1.setBackground(new java.awt.Color(255, 255, 255));
        CajaNombre1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        CajaNombre1.setForeground(new java.awt.Color(204, 204, 204));
        CajaNombre1.setText("Ingresar Nombre...");
        CajaNombre1.setBorder(null);
        CajaNombre1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CajaNombre1MousePressed(evt);
            }
        });
        CajaNombre1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CajaNombre1KeyTyped(evt);
            }
        });
        jPanel2.add(CajaNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 160, 30));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 160, 10));

        jLabel5.setBackground(new java.awt.Color(51, 0, 51));
        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 0));
        jLabel5.setText("Segundo Nombre");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 130, -1));

        CajaNombre2.setBackground(new java.awt.Color(255, 255, 255));
        CajaNombre2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        CajaNombre2.setForeground(new java.awt.Color(204, 204, 204));
        CajaNombre2.setText("Ingresar Nombre...");
        CajaNombre2.setBorder(null);
        CajaNombre2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CajaNombre2MousePressed(evt);
            }
        });
        CajaNombre2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CajaNombre2KeyTyped(evt);
            }
        });
        jPanel2.add(CajaNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 160, 30));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 230, 10));

        jLabel6.setBackground(new java.awt.Color(51, 0, 51));
        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 0));
        jLabel6.setText("Primer Apellido");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 130, -1));

        CajaApellido1.setBackground(new java.awt.Color(255, 255, 255));
        CajaApellido1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        CajaApellido1.setForeground(new java.awt.Color(204, 204, 204));
        CajaApellido1.setText("Ingresar Apellido...");
        CajaApellido1.setBorder(null);
        CajaApellido1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CajaApellido1MousePressed(evt);
            }
        });
        CajaApellido1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CajaApellido1KeyTyped(evt);
            }
        });
        jPanel2.add(CajaApellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 160, 30));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 160, 10));

        jLabel7.setBackground(new java.awt.Color(51, 0, 51));
        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 0));
        jLabel7.setText("Segundo Apellido");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 140, -1));

        CajaApellido2.setBackground(new java.awt.Color(255, 255, 255));
        CajaApellido2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        CajaApellido2.setForeground(new java.awt.Color(204, 204, 204));
        CajaApellido2.setText("Ingresar Apellido...");
        CajaApellido2.setBorder(null);
        CajaApellido2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CajaApellido2MousePressed(evt);
            }
        });
        CajaApellido2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CajaApellido2KeyTyped(evt);
            }
        });
        jPanel2.add(CajaApellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 160, 30));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 160, 10));

        jLabel8.setBackground(new java.awt.Color(51, 0, 51));
        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 0, 0));
        jLabel8.setText("Primer Nombre");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 130, -1));

        CajaGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar...", "Masculino", "Femenino" }));
        CajaGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajaGeneroActionPerformed(evt);
            }
        });
        jPanel2.add(CajaGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 150, -1));

        jLabel9.setBackground(new java.awt.Color(51, 0, 51));
        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 0, 0));
        jLabel9.setText("Carrera");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 60, -1));

        CajaCarrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar...", "Sistemas", "Derecho", "Medicina" }));
        jPanel2.add(CajaCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 150, -1));

        CajaCampus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar...", "Bogotá", "Medellin", "Ibague" }));
        jPanel2.add(CajaCampus, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 150, -1));

        jLabel10.setBackground(new java.awt.Color(51, 0, 51));
        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 0, 0));
        jLabel10.setText("Campus");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 70, -1));

        jLabel11.setBackground(new java.awt.Color(51, 0, 51));
        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 0, 0));
        jLabel11.setText("Fecha de Nacimiento");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 230, -1));

        CajaFecha.setBackground(new java.awt.Color(255, 255, 255));
        CajaFecha.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        CajaFecha.setForeground(new java.awt.Color(204, 204, 204));
        CajaFecha.setText("YYYY-MM-DD");
        CajaFecha.setBorder(null);
        CajaFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CajaFechaMousePressed(evt);
            }
        });
        CajaFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CajaFechaKeyTyped(evt);
            }
        });
        jPanel2.add(CajaFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 230, 30));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 230, 10));

        jLabel12.setBackground(new java.awt.Color(51, 0, 51));
        jLabel12.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 0, 0));
        jLabel12.setText("Dirección");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 230, -1));

        CajaDireccion.setBackground(new java.awt.Color(255, 255, 255));
        CajaDireccion.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        CajaDireccion.setForeground(new java.awt.Color(204, 204, 204));
        CajaDireccion.setText("Av Cra #");
        CajaDireccion.setBorder(null);
        CajaDireccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CajaDireccionMousePressed(evt);
            }
        });
        CajaDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CajaDireccionKeyTyped(evt);
            }
        });
        jPanel2.add(CajaDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 230, 80));
        jPanel2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 160, 10));

        BtAgregar.setBackground(new java.awt.Color(51, 0, 0));
        BtAgregar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        BtAgregar.setForeground(new java.awt.Color(255, 255, 255));
        BtAgregar.setText("AGREGAR");
        BtAgregar.setBorder(null);
        BtAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtAgregarActionPerformed(evt);
            }
        });
        jPanel2.add(BtAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 120, 40));

        BtModificar.setBackground(new java.awt.Color(51, 0, 0));
        BtModificar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        BtModificar.setForeground(new java.awt.Color(255, 255, 255));
        BtModificar.setText("MODIFICAR");
        BtModificar.setBorder(null);
        BtModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtModificarActionPerformed(evt);
            }
        });
        jPanel2.add(BtModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 510, 120, 40));

        BtEliminar.setBackground(new java.awt.Color(51, 0, 0));
        BtEliminar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        BtEliminar.setForeground(new java.awt.Color(255, 255, 255));
        BtEliminar.setText("ELIMINAR");
        BtEliminar.setBorder(null);
        BtEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(BtEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 510, 120, 40));

        BtLimpiar.setBackground(new java.awt.Color(51, 0, 0));
        BtLimpiar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        BtLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        BtLimpiar.setText("Limpiar");
        BtLimpiar.setBorder(null);
        BtLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtLimpiarActionPerformed(evt);
            }
        });
        jPanel2.add(BtLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 600, 80, 30));

        Basico.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 480, 640));

        barra.setBackground(new java.awt.Color(51, 0, 0));
        barra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barraMouseDragged(evt);
            }
        });
        barra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barraMousePressed(evt);
            }
        });
        barra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonX.setBackground(new java.awt.Color(51, 0, 0));
        BotonX.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        BotonX.setForeground(new java.awt.Color(255, 255, 255));
        BotonX.setText("X");
        BotonX.setBorder(null);
        BotonX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BotonXMouseReleased(evt);
            }
        });
        BotonX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonXActionPerformed(evt);
            }
        });
        barra.add(BotonX, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 0, 60, 30));

        BotonMin.setBackground(new java.awt.Color(51, 0, 0));
        BotonMin.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        BotonMin.setForeground(new java.awt.Color(255, 255, 255));
        BotonMin.setText("_");
        BotonMin.setBorder(null);
        BotonMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMinActionPerformed(evt);
            }
        });
        barra.add(BotonMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 0, 60, 30));

        Basico.add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 30));

        TABLA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_EST", "CEDULA", "PRIM_NOMBRE", "SEG_NOMBRE", "PRIM_APELLIDO", "SEG_APELLIDO", "GENERO", "ID_CARRERA", "ID_CAMPUS", "FECHA_NACIMIENTO", "DIRECCION"
            }
        ));
        TABLA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TABLAMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TABLA);

        Basico.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 610, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Basico, javax.swing.GroupLayout.PREFERRED_SIZE, 1182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Basico, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonXActionPerformed
        //comando para salir del programa
        System.exit(0);
    }//GEN-LAST:event_BotonXActionPerformed

    private void BotonMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMinActionPerformed
        //comando para minimizar la interfaz
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_BotonMinActionPerformed

    private void barraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraMousePressed
        //capturamos la posición final del mouse para restarlo con la posición inicial
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_barraMousePressed

    private void barraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraMouseDragged
        //localizamos la posición del mouse en X y Y
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_barraMouseDragged

    private void BotonXMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonXMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonXMouseReleased

    private void BtAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAgregarActionPerformed
        Agregar();
    }//GEN-LAST:event_BtAgregarActionPerformed

    private void TABLAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABLAMouseClicked
        int fila = TABLA.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Usuario no seleccionado");
        } else {
            ID_EST = Integer.parseInt((String) TABLA.getValueAt(fila, 0).toString());
            int CEDULA = Integer.parseInt((String) TABLA.getValueAt(fila, 1).toString());
            String PRIM_NOMBRE = (String) TABLA.getValueAt(fila, 2).toString();
            String SEG_NOMBRE = (String) TABLA.getValueAt(fila, 3).toString();
            String PRIM_APELLIDO = (String) TABLA.getValueAt(fila, 4).toString();
            String SEG_APELLIDO = (String) TABLA.getValueAt(fila, 5).toString();
            String FECHA_NACIMIENTO = (String) TABLA.getValueAt(fila, 9).toString();
            String DIRECCION = (String) TABLA.getValueAt(fila, 10).toString();

            CajaID.setText("" + ID_EST);
            CajaID.setForeground(Color.black);
            CajaCedula.setText("" + CEDULA);
            CajaCedula.setForeground(Color.black);
            CajaNombre1.setText(PRIM_NOMBRE);
            CajaNombre1.setForeground(Color.black);
            CajaNombre2.setText(SEG_NOMBRE);
            CajaNombre2.setForeground(Color.black);
            CajaApellido1.setText(PRIM_APELLIDO);
            CajaApellido1.setForeground(Color.black);
            CajaApellido2.setText(SEG_APELLIDO);
            CajaApellido2.setForeground(Color.black);
            CajaFecha.setText(FECHA_NACIMIENTO);
            CajaFecha.setForeground(Color.black);
            CajaDireccion.setText(DIRECCION);
            CajaDireccion.setForeground(Color.black);
        }
    }//GEN-LAST:event_TABLAMouseClicked

    private void BtModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtModificarActionPerformed
        Modificar();
    }//GEN-LAST:event_BtModificarActionPerformed

    private void BtEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtEliminarActionPerformed
        eliminar();
    }//GEN-LAST:event_BtEliminarActionPerformed

    private void CajaCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CajaCedulaKeyTyped
        if (CajaCedula.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_CajaCedulaKeyTyped

    private void CajaIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CajaIDKeyTyped
        if (CajaID.getText().length() >= 5) {
            evt.consume();
        }
    }//GEN-LAST:event_CajaIDKeyTyped

    private void CajaNombre1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CajaNombre1KeyTyped
        if (CajaNombre1.getText().length() >= 250) {
            evt.consume();
        }
    }//GEN-LAST:event_CajaNombre1KeyTyped

    private void CajaNombre2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CajaNombre2KeyTyped
        if (CajaNombre2.getText().length() >= 250) {
            evt.consume();
        }
    }//GEN-LAST:event_CajaNombre2KeyTyped

    private void CajaApellido1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CajaApellido1KeyTyped
        if (CajaApellido1.getText().length() >= 250) {
            evt.consume();
        }
    }//GEN-LAST:event_CajaApellido1KeyTyped

    private void CajaApellido2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CajaApellido2KeyTyped
        if (CajaApellido2.getText().length() >= 250) {
            evt.consume();
        }
    }//GEN-LAST:event_CajaApellido2KeyTyped

    private void CajaFechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CajaFechaKeyTyped
        if (CajaFecha.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_CajaFechaKeyTyped

    private void CajaDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CajaDireccionKeyTyped
        if (CajaDireccion.getText().length() >= 250) {
            evt.consume();
        }
    }//GEN-LAST:event_CajaDireccionKeyTyped

    private void CajaIDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CajaIDMousePressed
        CajaID.setText("");
        CajaID.setForeground(Color.black);
    }//GEN-LAST:event_CajaIDMousePressed

    private void CajaCedulaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CajaCedulaMousePressed
        CajaCedula.setText("");
        CajaCedula.setForeground(Color.black);
    }//GEN-LAST:event_CajaCedulaMousePressed

    private void CajaNombre1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CajaNombre1MousePressed
        CajaNombre1.setText("");
        CajaNombre1.setForeground(Color.black);
    }//GEN-LAST:event_CajaNombre1MousePressed

    private void CajaNombre2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CajaNombre2MousePressed
        CajaNombre2.setText("");
        CajaNombre2.setForeground(Color.black);
    }//GEN-LAST:event_CajaNombre2MousePressed

    private void CajaApellido1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CajaApellido1MousePressed
        CajaApellido1.setText("");
        CajaApellido1.setForeground(Color.black);
    }//GEN-LAST:event_CajaApellido1MousePressed

    private void CajaApellido2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CajaApellido2MousePressed
        CajaApellido2.setText("");
        CajaApellido2.setForeground(Color.black);
    }//GEN-LAST:event_CajaApellido2MousePressed

    private void CajaFechaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CajaFechaMousePressed
        CajaFecha.setText("");
        CajaFecha.setForeground(Color.black);
    }//GEN-LAST:event_CajaFechaMousePressed

    private void BtLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_BtLimpiarActionPerformed

    private void CajaDireccionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CajaDireccionMousePressed
        CajaDireccion.setText("");
        CajaDireccion.setForeground(Color.black);
    }//GEN-LAST:event_CajaDireccionMousePressed

    private void CajaGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajaGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CajaGeneroActionPerformed

    void listar() {
        String sql = "select * from estudiante";
        try {
            cn = con.getConnection();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            Object[] estudiante = new Object[11];
            modelo = (DefaultTableModel) TABLA.getModel();
            while (rs.next()) {
                estudiante[0] = rs.getInt("ID_EST");
                estudiante[1] = rs.getInt("CEDULA");
                estudiante[2] = rs.getString("PRIM_NOMBRE");
                estudiante[3] = rs.getString("SEG_NOMBRE");
                estudiante[4] = rs.getString("PRIM_APELLIDO");
                estudiante[5] = rs.getString("SEG_APELLIDO");
                estudiante[6] = rs.getString("GENERO");
                estudiante[7] = rs.getInt("ID_CARRERA");
                estudiante[8] = rs.getInt("ID_CAMPUS");
                estudiante[9] = rs.getDate("FECHA_NACIMIENTO");
                estudiante[10] = rs.getString("DIRECCION");
                modelo.addRow(estudiante);
            }
            TABLA.setModel(modelo);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "¡ERROR!\nLa tabla no pudo conectarse\n" + e, "¡ERROR!", 2);
        }
    }

    void Agregar() {
        try {
            ID_EST = Integer.parseInt(CajaID.getText());
            int CEDULA = Integer.parseInt(CajaCedula.getText());
            String PRIM_NOMBRE = CajaNombre1.getText();
            String SEG_NOMBRE = CajaNombre2.getText();
            String PRIM_APELLIDO = CajaApellido1.getText();
            String SEG_APELLIDO = CajaApellido2.getText();
            String GENERO = (String) CajaGenero.getSelectedItem();
            String ID_CARRERA = (String) CajaCarrera.getSelectedItem();
            String ID_CAMPUS = (String) CajaCampus.getSelectedItem();
            String FECHA_NACIMIENTO = CajaFecha.getText();
            String DIRECCION = CajaDireccion.getText();

            if ("Ingresar Nombre...".equals(SEG_NOMBRE)) {
                SEG_NOMBRE = "";
            }
            if ("Ingresar Apellido...".equals(SEG_APELLIDO)) {
                SEG_APELLIDO = "";
            }
            if ("Av Cra #".equals(DIRECCION)) {
                DIRECCION = "";
            }
            switch (GENERO) {
                case "Masculino" -> {
                    GENERO = "M";
                }
                case "Femenino" -> {
                    GENERO = "F";
                }
                default -> {
                    JOptionPane.showMessageDialog(null, "¡ERROR!\nGenero Invalido", "¡ERROR!", 2);
                }
            }
            switch (ID_CARRERA) {
                case "Sistemas" -> {
                    ID_CARRERA = "1";
                }
                case "Medicina" -> {
                    ID_CARRERA = "3";
                }
                case "Derecho" -> {
                    ID_CARRERA = "2";
                }
                default -> {
                    JOptionPane.showMessageDialog(null, "¡ERROR!\nCarrera Invalida", "¡ERROR!", 2);
                }
            }
            switch (ID_CAMPUS) {
                case "Bogotá" -> {
                    ID_CAMPUS = "1";
                }
                case "Medellin" -> {
                    ID_CAMPUS = "2";
                }
                case "Ibague" -> {
                    ID_CAMPUS = "3";
                }
                default -> {
                    JOptionPane.showMessageDialog(null, "¡ERROR!\nCampus Invalido", "¡ERROR!", 2);
                }
            }

            if (ID_EST < 0 || CEDULA < 0 || PRIM_NOMBRE.equals("") || PRIM_NOMBRE.equals("") || PRIM_APELLIDO.equals("") || FECHA_NACIMIENTO.equals("")) {
                JOptionPane.showMessageDialog(null, "¡ERROR!\nDatos invalidos", "¡ERROR!", 2);
            } else {
                String sql = "insert into estudiante values ('" + ID_EST + "', '" + CEDULA + "', '" + PRIM_NOMBRE + "', '" + SEG_NOMBRE + "','" + PRIM_APELLIDO + "' , '" + SEG_APELLIDO + "' , '" + GENERO + "', '" + ID_CARRERA + "', '" + ID_CAMPUS + "', '" + FECHA_NACIMIENTO + "', '" + DIRECCION + "')";
                try {
                    cn = con.getConnection();
                    st = cn.createStatement();
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Usuario ingresado :D");
                    limpiarTabla();
                    listar();
                    limpiar();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "¡ERROR!\nAl ingresar los datos " + e, "¡ERROR!", 2);
                }
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "¡ERROR!\nAl ingresar los datos " + e, "¡ERROR!", 2);
        }
    }

    void limpiarTabla() {
        for (int i = 0; i < TABLA.getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;
        }
    }

    void Modificar() {
        ID_EST = Integer.parseInt(CajaID.getText());
        int CEDULA = Integer.parseInt(CajaCedula.getText());
        String PRIM_NOMBRE = CajaNombre1.getText();
        String SEG_NOMBRE = CajaNombre2.getText();
        String PRIM_APELLIDO = CajaApellido1.getText();
        String SEG_APELLIDO = CajaApellido2.getText();
        String GENERO = (String) CajaGenero.getSelectedItem();
        String ID_CARRERA = (String) CajaCarrera.getSelectedItem();
        String ID_CAMPUS = (String) CajaCampus.getSelectedItem();
        String FECHA_NACIMIENTO = CajaFecha.getText();
        String DIRECCION = CajaDireccion.getText();

        if ("Ingresar Nombre...".equals(SEG_NOMBRE)) {
            SEG_NOMBRE = "";
        }
        if ("Ingresar Apellido...".equals(SEG_APELLIDO)) {
            SEG_APELLIDO = "";
        }
        if ("Av Cra #".equals(DIRECCION)) {
            DIRECCION = "";
        }
        switch (GENERO) {
            case "Masculino" -> {
                GENERO = "M";
            }
            case "Femenino" -> {
                GENERO = "F";
            }
            default -> {
                JOptionPane.showMessageDialog(null, "¡ERROR!\nGenero Invalido", "¡ERROR!", 2);
            }
        }
        switch (ID_CARRERA) {
            case "Sistemas" -> {
                ID_CARRERA = "1";
            }
            case "Medicina" -> {
                ID_CARRERA = "3";
            }
            case "Derecho" -> {
                ID_CARRERA = "2";
            }
            default -> {
                JOptionPane.showMessageDialog(null, "¡ERROR!\nCarrera Invalida", "¡ERROR!", 2);
            }
        }
        switch (ID_CAMPUS) {
            case "Bogotá" -> {
                ID_CAMPUS = "1";
            }
            case "Medellin" -> {
                ID_CAMPUS = "2";
            }
            case "Ibague" -> {
                ID_CAMPUS = "3";
            }
            default -> {
                JOptionPane.showMessageDialog(null, "¡ERROR!\nCampus Invalido", "¡ERROR!", 2);
            }
        }

        if (ID_EST < 0 || CEDULA < 0 || PRIM_NOMBRE.equals("") || PRIM_APELLIDO.equals("") || FECHA_NACIMIENTO.equals("")) {
            JOptionPane.showMessageDialog(null, "¡ERROR!\nDatos invalidos", "¡ERROR!", 2);
        } else {
            String sql = "update estudiante set CEDULA ='" + CEDULA + "',PRIM_NOMBRE ='" + PRIM_NOMBRE + "',SEG_NOMBRE='" + SEG_NOMBRE + "',PRIM_APELLIDO='" + PRIM_APELLIDO + "', SEG_APELLIDO = '" + SEG_APELLIDO + "', GENERO = '" + GENERO + "', ID_CARRERA = '" + ID_CARRERA + "', ID_CAMPUS= '" + ID_CAMPUS + "', FECHA_NACIMIENTO = '" + FECHA_NACIMIENTO + "', DIRECCION = '" + DIRECCION + "' where ID_EST = " + ID_EST;
            try {
                cn = con.getConnection();
                st = cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Usuario Actualizado :D");
                limpiarTabla();
                listar();
                limpiar();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "¡ERROR!\nAl ingresar los datos " + e, "¡ERROR!", 2);
            }
        }
    }

    void eliminar() {
        int seleccionado = TABLA.getSelectedRow();
        if (seleccionado == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione una fila");
        } else {
            String sql = "delete from estudiante where ID_EST =" + ID_EST;
            try {
                cn = con.getConnection();
                st = cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Usuario Eliminado Unu");
                limpiarTabla();
                listar();
                limpiar();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "¡ERROR!\nAl eliminar el dato " + e, "¡ERROR!", 2);
            }
        }
    }

    void limpiar() {
        CajaID.setText("ingresar ID...");
        CajaID.setForeground(new Color(204, 204, 204));
        CajaCedula.setText("Ingresar Cedula...");
        CajaCedula.setForeground(new Color(204, 204, 204));
        CajaNombre1.setText("Ingresar Nombre...");
        CajaNombre1.setForeground(new Color(204, 204, 204));
        CajaNombre2.setText("Ingresar Nombre...");
        CajaNombre2.setForeground(new Color(204, 204, 204));
        CajaApellido1.setText("Ingresar Apellido...");
        CajaApellido1.setForeground(new Color(204, 204, 204));
        CajaApellido2.setText("Ingresar Apellido...");
        CajaApellido2.setForeground(new Color(204, 204, 204));
        CajaFecha.setText("YYYY-MM-DD");
        CajaFecha.setForeground(new Color(204, 204, 204));
        CajaDireccion.setText("Av Cra #");
        CajaDireccion.setForeground(new Color(204, 204, 204));
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //Esto es para que TODO se vea con la interfaz de Windows (Larga historia)
                try {
                    for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                        if ("Windows".equals(info.getName())) {
                            UIManager.setLookAndFeel(info.getClassName());
                            break;
                        }
                    }
                } catch (Exception e) {
                    // If Nimbus is not available, you can set the GUI to another look and feel.
                }
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Basico;
    private javax.swing.JButton BotonMin;
    private javax.swing.JButton BotonX;
    private javax.swing.JButton BtAgregar;
    private javax.swing.JButton BtEliminar;
    private javax.swing.JButton BtLimpiar;
    private javax.swing.JButton BtModificar;
    private javax.swing.JTextField CajaApellido1;
    private javax.swing.JTextField CajaApellido2;
    private javax.swing.JComboBox<String> CajaCampus;
    private javax.swing.JComboBox<String> CajaCarrera;
    private javax.swing.JTextField CajaCedula;
    private javax.swing.JTextField CajaDireccion;
    private javax.swing.JTextField CajaFecha;
    private javax.swing.JComboBox<String> CajaGenero;
    private javax.swing.JTextField CajaID;
    private javax.swing.JTextField CajaNombre1;
    private javax.swing.JTextField CajaNombre2;
    private javax.swing.JTable TABLA;
    private javax.swing.JPanel barra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    // End of variables declaration//GEN-END:variables
}
