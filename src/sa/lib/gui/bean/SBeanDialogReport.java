/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SBeanDialogReport.java
 *
 * Created on 30/06/2011, 12:00:26 AM
 */

package sa.lib.gui.bean;

import java.awt.event.KeyEvent;
import java.util.HashMap;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import sa.lib.SLibConsts;
import sa.lib.gui.SGuiClient;
import sa.lib.gui.SGuiField;
import sa.lib.gui.SGuiFields;
import sa.lib.gui.SGuiParams;
import sa.lib.gui.SGuiUtils;
import sa.lib.gui.SGuiValidation;

/**
 *
 * @author Sergio Flores
 */
public abstract class SBeanDialogReport extends JDialog {

    public static JFrame OwnerFrame;

    protected SGuiClient miClient;
    protected int mnFormType;
    protected int mnFormSubtype;
    protected boolean mbFirstActivation;
    protected boolean mbCloseOnPrint;
    protected String msTitle;
    protected SGuiFields moFields;
    protected SGuiParams moParams;
    protected HashMap<String, Object> moParamsMap;

    /** Creates new form SBeanDialogReport */
    public SBeanDialogReport() {
        super(OwnerFrame, false);
        initComponents();
        initComponentsBean();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpContainer = new javax.swing.JPanel();
        jpCommand = new javax.swing.JPanel();
        jpCommandLeft = new javax.swing.JPanel();
        jpCommandCenter = new javax.swing.JPanel();
        jpCommandRight = new javax.swing.JPanel();
        jbPrint = new javax.swing.JButton();
        jbClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("DBeanForm");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jpContainer.setLayout(new java.awt.BorderLayout());
        getContentPane().add(jpContainer, java.awt.BorderLayout.CENTER);

        jpCommand.setLayout(new java.awt.BorderLayout());

        jpCommandLeft.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        jpCommand.add(jpCommandLeft, java.awt.BorderLayout.WEST);
        jpCommand.add(jpCommandCenter, java.awt.BorderLayout.CENTER);

        jpCommandRight.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        jbPrint.setText("Imprimir");
        jbPrint.setPreferredSize(new java.awt.Dimension(75, 23));
        jbPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPrintActionPerformed(evt);
            }
        });
        jpCommandRight.add(jbPrint);

        jbClose.setText("Cerrar");
        jbClose.setPreferredSize(new java.awt.Dimension(75, 23));
        jbClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCloseActionPerformed(evt);
            }
        });
        jpCommandRight.add(jbClose);

        jpCommand.add(jpCommandRight, java.awt.BorderLayout.EAST);

        getContentPane().add(jpCommand, java.awt.BorderLayout.SOUTH);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-480)/2, (screenSize.height-300)/2, 480, 300);
    }// </editor-fold>//GEN-END:initComponents

    private void jbPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPrintActionPerformed
        actionPrint();
    }//GEN-LAST:event_jbPrintActionPerformed

    private void jbCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCloseActionPerformed
        actionClose();
    }//GEN-LAST:event_jbCloseActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        windowActivated();
    }//GEN-LAST:event_formWindowActivated

    protected void initComponentsBean() {
        miClient = null;
        mnFormType = SLibConsts.UNDEFINED;
        mnFormSubtype = SLibConsts.UNDEFINED;
        mbFirstActivation = false;
        mbCloseOnPrint = false;
        moFields = new SGuiFields();
        moParams = null;
        moParamsMap = null;

        SGuiUtils.createActionMap(rootPane, this, "actionClose", "close", KeyEvent.VK_ESCAPE);
    }

    protected void windowActivated() {
        if (mbFirstActivation) {
            mbFirstActivation = false;

            boolean focusRequested = false;
            
            for (SGuiField field : moFields.getFields()) {
                if (field.isFocusable()) {
                    if (field instanceof JSpinner && ((JSpinner) field).getEditor() instanceof JSpinner.NumberEditor) {
                        ((JSpinner.NumberEditor) ((JSpinner) field).getEditor()).getTextField().requestFocusInWindow();
                    }
                    else {
                        field.getComponent().requestFocusInWindow();
                    }
                        
                    focusRequested = true;
                    break;
                }
            }
            
            if (!focusRequested) {
                if (jbPrint.isEnabled()) {
                    jbPrint.requestFocusInWindow();
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton jbClose;
    protected javax.swing.JButton jbPrint;
    private javax.swing.JPanel jpCommand;
    private javax.swing.JPanel jpCommandCenter;
    private javax.swing.JPanel jpCommandLeft;
    private javax.swing.JPanel jpCommandRight;
    private javax.swing.JPanel jpContainer;
    // End of variables declaration//GEN-END:variables

    /*
     * Public methods
     */

    public void setCloseOnPrint(boolean b) { mbCloseOnPrint = b; }

    public boolean isCloseOnPrint() { return mbCloseOnPrint; }

    public JPanel getBeanPanel() {
        return jpContainer;
    }

    /*
     * Overriden methods
     */

    public int getFormType() {
        return mnFormType;
    }

    public int getFormSubtype() {
        return mnFormSubtype;
    }

    public void setFormSettings(final SGuiClient client, final int formType, final int formSubtype, final String title) {
        miClient = client;
        mnFormType = formType;
        mnFormSubtype = formSubtype;
        msTitle = title;

        setTitle(msTitle);
    }

    public void setFormVisible(final boolean visible) {
        setVisible(visible);
    }

    public abstract void createParamsMap();
    public abstract SGuiValidation validateForm();

    public void setValue(final int type, final Object value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object getValue(final int type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void actionPrint() {
        if (jbPrint.isEnabled()) {
            if (SGuiUtils.computeValidation(miClient, validateForm())) {
                createParamsMap();
                miClient.getSession().printReport(mnFormType, mnFormSubtype, moParams, moParamsMap);
                if (mbCloseOnPrint) {
                    dispose();
                }
            }
        }
    }

    public void actionClose() {
        if (jbClose.isEnabled()) {
            dispose();
        }
    }
}
