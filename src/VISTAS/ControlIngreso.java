/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package VISTAS;
import BD.ConexionOracle;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;


/**
 *
 * @author leonardo.ormeno
 */
public class ControlIngreso extends javax.swing.JInternalFrame {

    /**
     * Creates new form ControlIngreso
     */
    protected ConexionOracle conex;
    protected Connection con;
    protected String fechaFormateada;
    DefaultTableModel modelo;
    public ControlIngreso() {
        initComponents();
        ConexionOracle cone=new ConexionOracle();
        conex=cone;
        con=conex.conectar();
        LocalDate fechaDia = LocalDate.now();
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd-MM-yy");
        fechaFormateada = fechaDia.format(formatoFecha);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfDni = new javax.swing.JTextField();
        cbTipo = new javax.swing.JComboBox<>();
        jCheckBox1 = new javax.swing.JCheckBox();
        bMarcar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setTitle("CONTROL DE INGRESO");
        setPreferredSize(new java.awt.Dimension(820, 600));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("DNI:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("TIPO:");

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Entrada", "Salida" }));
        cbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoActionPerformed(evt);
            }
        });

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox1.setText("VER MARCACIONES");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        bMarcar.setText("MARCAR");
        bMarcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMarcarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(tfDni))
                    .addComponent(bMarcar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 265, Short.MAX_VALUE)
                .addComponent(jCheckBox1)
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jCheckBox1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfDni, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(bMarcar, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DNI", "Empleado", "Entrada", "Salida", "Día"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        modelo = (DefaultTableModel) jTable1.getModel();
        if(jCheckBox1.isSelected()){
            String sSQL="";
            Object[] empleado=new Object[5];
            try{
                sSQL="SELECT e.dni AS \"DNI\", e.name_concat AS \"Nombre\", TO_CHAR(ae.marca_entrada, 'HH24:MI:SS') AS \"Entrada\", TO_CHAR(ae.marca_salida, 'HH24:MI:SS') AS \"Salida\", ae.dia FROM empleado e JOIN asistencia_empleados ae ON e.id_empleado = ae.id_empleado";
                //Connection con=conex.conectar();
                Statement cn=con.createStatement();
                ResultSet res=cn.executeQuery(sSQL);
                while(res.next()){
                    empleado[0]=res.getString("DNI");
                    empleado[1]=res.getString("Nombre");
                    empleado[2]=res.getString("Entrada");
                    empleado[3]=res.getString("Salida");
                    empleado[4]=res.getString("dia");
                    modelo.addRow(empleado);
                }
            }catch(SQLException e){
                System.out.println(e);
            }
        }else{
            modelo.setRowCount(0);
        }
        /*Empleados e=new Empleados(con);
        modelo = (DefaultTableModel) jTable1.getModel();
        Vector<String> vector = new Vector<>(e.dnis());
        modelo.addRow(vector);*/
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void cbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTipoActionPerformed
    private boolean authEmpleado(String dni){
        String sqlAuth="SELECT id_empleado FROM empleado WHERE dni='"+dni+"'";
        int id_e=0;
        try{
            Statement cn=con.createStatement();
            ResultSet res=cn.executeQuery(sqlAuth);
            while(res.next()){
                id_e=res.getInt("id_empleado");
            }
        }catch(SQLException e){
                System.out.println(e);
        }
        if(id_e==0){
            return false;
        }
        else{
            return true;
        }
    }
    private void marcarIngreso(String dni){
        LocalDate fechaDia = LocalDate.now();
        String dia=fechaDia.toString();
        LocalTime horaActual = LocalTime.now();
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");
        String horaFormateada = horaActual.format(formatoHora);
        String sqlIngreso="INSERT INTO asistencia_empleados (id_asistencia, id_empleado, dia, marca_entrada) VALUES ( SEQ_ASISTENCIA_EMPLEADOS.NEXTVAL, (SELECT id_empleado FROM empleado WHERE dni = '"+dni+"'), TO_DATE('"+fechaFormateada+"', 'dd-MM-yy'), SYSTIMESTAMP)";
        try{
            Statement st=con.createStatement();
            st.executeQuery(sqlIngreso);
            con.commit();
            JOptionPane.showMessageDialog(rootPane,"Se registro su marcación");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(rootPane,e);
            System.out.println(e);
        }
    }
    private void marcarSalida(String dni){
        String sqlSalida="UPDATE asistencia_empleados\n SET marca_salida = COALESCE(marca_salida, SYSTIMESTAMP)\n WHERE id_empleado = (SELECT id_empleado FROM empleado WHERE dni = '"+dni+"')\n AND TO_DATE(dia, 'DD/MM/YY') = TO_DATE('"+fechaFormateada+"', 'dd-MM-yy')";
        //String sqlSalida="UPDATE asistencia_empleados SET marca_salida = SYSTIMESTAMP WHERE id_empleado = (SELECT id_empleado FROM empleado WHERE dni = '"+dni+"') AND TO_DATE(dia, 'DD/MM/YY') = TO_DATE('"+fechaFormateada+"', 'DD/MM/YY')";
        try{
            Statement st=con.createStatement();
            st.executeQuery(sqlSalida);
            con.commit();
            JOptionPane.showMessageDialog(rootPane,"Se registro su marcación");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(rootPane,e);
            System.out.println(e);
        }
    }
    private boolean authIngreso(String dni){
        String sqlAuth="SELECT e.dni, ae.dia FROM asistencia_empleados ae JOIN empleado e ON ae.id_empleado = e.id_empleado WHERE e.dni = '"+dni+"' AND TO_DATE(ae.dia, 'DD/MM/YY') = TO_DATE('"+fechaFormateada+"', 'dd-MM-yy')";
        System.out.println(sqlAuth);
        ArrayList<String> listDni=new ArrayList<>();
        try{
            Statement st=con.createStatement();
            ResultSet res=st.executeQuery(sqlAuth);
            System.out.println(res);
            while(res.next()){
                listDni.add(res.getString("DNI")); //arroja si el ususario existe
                listDni.add(res.getString("dia"));
            }
            if(listDni.isEmpty()){
                System.out.println("proceder con la marcación");
                return true;
            }else{
                System.out.println("USUARIO YA TIENE UNA MARCACIÓN REALIZADA");
                return false;
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(rootPane,e);
            System.out.println(e);
        }
        return false;
    }
    private boolean authSalida(String dni){
        System.out.println(fechaFormateada);
        String sqlAuth="SELECT e.dni, ae.dia, ae.marca_salida FROM asistencia_empleados ae JOIN empleado e ON ae.id_empleado = e.id_empleado WHERE e.dni = '"+dni+"' AND TO_DATE(ae.dia, 'DD/MM/YY') = TO_DATE('"+fechaFormateada+"', 'dd-MM-yy')";
        ArrayList<String> listDni=new ArrayList<>();
        try{
            Statement st=con.createStatement();
            ResultSet res=st.executeQuery(sqlAuth);
            while(res.next()){
                listDni.add(res.getString("DNI")); //arroja si el ususario existe
                listDni.add(res.getString("dia"));
                listDni.add(res.getString("marca_salida"));
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(rootPane,e);
            System.out.println(e);
        }
        //System.out.println(": pipip"+listDni.get(2)+": pipip");
        if(!listDni.isEmpty()){
            if(listDni.get(2)!=null){
                System.out.println("ya ha marcado");
                JOptionPane.showMessageDialog(rootPane,"YA HA MARCADO HOY SU SALIDA");
                return false;
            }else{
                return true;
            }
        }else{
            System.out.println("NO HA MARCADO EL DIA DE HOY");
            JOptionPane.showMessageDialog(rootPane,"NO HA REALIZADO SU MARCACIÓN HOY");
            return false;
        }
    }
    
    private void bMarcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMarcarActionPerformed
        String dni=tfDni.getText();
        String tipo=(String) cbTipo.getSelectedItem();
        if(authEmpleado(dni)){
            if(tipo.equals("Entrada")){
            if(authIngreso(dni)){
             marcarIngreso(dni);
            }else{
                JOptionPane.showMessageDialog(rootPane,"EL USUARIO YA REALIZO UNA MARCACIÓN EL DIA DE HOY. CONTACTE CON EL OPERADOR DEL SISTEMA");
            }
            }else{
                if(authSalida(dni)){
                 marcarSalida(dni);
                }
            }
        }else{
          JOptionPane.showMessageDialog(rootPane,"USUARIO NO EXISTE");
        }
    }//GEN-LAST:event_bMarcarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bMarcar;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField tfDni;
    // End of variables declaration//GEN-END:variables

}