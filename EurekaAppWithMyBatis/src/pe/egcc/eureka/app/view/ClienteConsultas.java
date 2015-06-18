package pe.egcc.eureka.app.view;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import pe.egcc.eureka.app.listener.PanelCriterioListener;
import pe.egcc.eureka.app.model.ClienteBean;

/**
 * Debe implementar el listener PanelCriterioListener.
 * 
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.com
 */
public class ClienteConsultas extends javax.swing.JInternalFrame implements PanelCriterioListener {

  private List<ClienteBean> listaClientes;

  public ClienteConsultas() {
    initComponents();
    panelCriterio.addPanelCriterioListener(this);
    panelCriterio.setBtnNuevoEnabled(false);
    panelCriterio.setBtnEditarEnabled(false);
    panelCriterio.setBtnEliminarEnabled(false);
  }

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jScrollPane1 = new javax.swing.JScrollPane();
    tblData = new javax.swing.JTable();
    panelCriterio = new pe.egcc.eureka.app.view.PanelCriterioClientes();

    setClosable(true);
    setIconifiable(true);
    setMaximizable(true);
    setResizable(true);
    setTitle("CONSULTAR CLIENTES");
    addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
      public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
      }
      public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
      }
      public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
      }
      public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
      }
      public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
      }
      public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
      }
      public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
        formInternalFrameOpened(evt);
      }
    });

    tblData.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "CODIGO", "PATERNO", "MATERNO", "NOMBRE", "DNI", "CIUDAD", "DIRECCION", "TELEFONO", "EMAIL"
      }
    ) {
      Class[] types = new Class [] {
        java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
      };
      boolean[] canEdit = new boolean [] {
        false, false, false, false, false, false, false, true, false
      };

      public Class getColumnClass(int columnIndex) {
        return types [columnIndex];
      }

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    jScrollPane1.setViewportView(tblData);

    panelCriterio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jScrollPane1)
      .addComponent(panelCriterio, javax.swing.GroupLayout.DEFAULT_SIZE, 1029, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addComponent(panelCriterio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
    try {
      this.setMaximum(true);
    } catch (Exception e) {
    }
  }//GEN-LAST:event_formInternalFrameOpened


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JScrollPane jScrollPane1;
  private pe.egcc.eureka.app.view.PanelCriterioClientes panelCriterio;
  private javax.swing.JTable tblData;
  // End of variables declaration//GEN-END:variables

  @Override
  public void onNuevaConsulta(List lista) {
    // Obtenemos la lista de clientes
    listaClientes = lista;
    // Cargar datos en la tabla
    DefaultTableModel tabla;
    tabla = (DefaultTableModel) tblData.getModel();
    tabla.setRowCount(0);
    for (ClienteBean o : listaClientes) {
      Object[] rowData = {o.getCodigo(), o.getPaterno(),
        o.getMaterno(), o.getNombre(), o.getDni(), o.getCiudad(),
        o.getDireccion(), o.getTelefono(), o.getEmail()};
      tabla.addRow(rowData);
    }
  }

  @Override
  public void onExportarExcel() {
  }

  @Override
  public void onExportarCSV() {
  }

  @Override
  public void onNuevo() {
  }

  @Override
  public void onEditar() {
  }

  @Override
  public void onEliminar() {
  }

  @Override
  public void onSalir() {
    this.dispose();
  }
}
