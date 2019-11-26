/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SBeanForm.java
 *
 * Created on 30/06/2011, 12:00:26 AM
 */

package sa.lib.gui.bean;

import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import sa.lib.SLibConsts;
import sa.lib.SLibUtils;
import sa.lib.db.SDbConsts;
import sa.lib.db.SDbRegistry;
import sa.lib.grid.SGridPaneForm;
import sa.lib.gui.SGuiClient;
import sa.lib.gui.SGuiConsts;
import sa.lib.gui.SGuiField;
import sa.lib.gui.SGuiFields;
import sa.lib.gui.SGuiForm;
import sa.lib.gui.SGuiUtils;
import sa.lib.gui.SGuiValidation;

/**
 *
 * @author Sergio Flores
 */
public abstract class SBeanForm extends JDialog implements SGuiForm {

    public static JFrame OwnerFrame;

    protected SGuiClient miClient;
    protected int mnBeanFormType;
    protected int mnFormType;
    protected int mnFormSubtype;
    protected int mnFormStatus;
    protected int mnFormResult;
    protected boolean mbFirstActivation;
    protected boolean mbCanShowForm;
    protected String msTitle;
    protected String msReadInfo;
    protected String msCanShowFormMessage;
    protected Vector<SGridPaneForm> mvFormGrids;
    protected SGuiFields moFields;

    /** Creates new form SBeanForm */
    public SBeanForm() {
        super(OwnerFrame, true);
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
        jtfRegistryKey = new javax.swing.JTextField();
        jpCommandCenter = new javax.swing.JPanel();
        jpCommandRight = new javax.swing.JPanel();
        jbEdit = new javax.swing.JButton();
        jbReadInfo = new javax.swing.JButton();
        jbSave = new javax.swing.JButton();
        jbCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("DBeanForm");
        setModal(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jpContainer.setLayout(new java.awt.BorderLayout());
        getContentPane().add(jpContainer, java.awt.BorderLayout.CENTER);

        jpCommand.setLayout(new java.awt.BorderLayout());

        jpCommandLeft.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jtfRegistryKey.setEditable(false);
        jtfRegistryKey.setText("KEY");
        jtfRegistryKey.setEnabled(false);
        jtfRegistryKey.setFocusable(false);
        jtfRegistryKey.setPreferredSize(new java.awt.Dimension(100, 23));
        jpCommandLeft.add(jtfRegistryKey);

        jpCommand.add(jpCommandLeft, java.awt.BorderLayout.WEST);
        jpCommand.add(jpCommandCenter, java.awt.BorderLayout.CENTER);

        jpCommandRight.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        jbEdit.setText("Modificar");
        jbEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditActionPerformed(evt);
            }
        });
        jpCommandRight.add(jbEdit);

        jbReadInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sa/lib/img/cmd_form_help.gif"))); // NOI18N
        jbReadInfo.setToolTipText("Ayuda modificar");
        jbReadInfo.setPreferredSize(new java.awt.Dimension(23, 23));
        jbReadInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbReadInfoActionPerformed(evt);
            }
        });
        jpCommandRight.add(jbReadInfo);

        jbSave.setText("Guardar");
        jbSave.setMaximumSize(new java.awt.Dimension(75, 23));
        jbSave.setMinimumSize(new java.awt.Dimension(75, 23));
        jbSave.setPreferredSize(new java.awt.Dimension(75, 23));
        jbSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSaveActionPerformed(evt);
            }
        });
        jpCommandRight.add(jbSave);

        jbCancel.setText("Cancelar");
        jbCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelActionPerformed(evt);
            }
        });
        jpCommandRight.add(jbCancel);

        jpCommand.add(jpCommandRight, java.awt.BorderLayout.EAST);

        getContentPane().add(jpCommand, java.awt.BorderLayout.SOUTH);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-480)/2, (screenSize.height-300)/2, 480, 300);
    }// </editor-fold>//GEN-END:initComponents

    private void jbEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditActionPerformed
        actionEdit();
    }//GEN-LAST:event_jbEditActionPerformed

    private void jbReadInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbReadInfoActionPerformed
        actionReadInfo();
    }//GEN-LAST:event_jbReadInfoActionPerformed

    private void jbSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSaveActionPerformed
        actionSave();
    }//GEN-LAST:event_jbSaveActionPerformed

    private void jbCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelActionPerformed
        actionCancel();
    }//GEN-LAST:event_jbCancelActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        windowActivated();
    }//GEN-LAST:event_formWindowActivated

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        windowClosed();
    }//GEN-LAST:event_formWindowClosed

    protected void initComponentsBean() {
        miClient = null;
        mnBeanFormType = SLibConsts.UNDEFINED;
        mnFormType = SLibConsts.UNDEFINED;
        mnFormSubtype = SLibConsts.UNDEFINED;
        mnFormStatus = SLibConsts.UNDEFINED;
        mnFormResult = SLibConsts.UNDEFINED;
        mbFirstActivation = false;
        mbCanShowForm = true;
        msReadInfo = "";
        msCanShowFormMessage = "";
        mvFormGrids = new Vector<SGridPaneForm>();
        moFields = new SGuiFields();

        SGuiUtils.createActionMap(rootPane, this, "actionCancel", "cancel", KeyEvent.VK_ESCAPE);
    }

    protected void windowActivated() {
        if (!mbCanShowForm) {
            miClient.showMsgBoxWarning(msCanShowFormMessage);
            msCanShowFormMessage = "";
            mbCanShowForm = true;
            actionCancel();
        }
        else if (mbFirstActivation) {
            mbFirstActivation = false;

            if (mnFormStatus == SGuiConsts.FORM_STATUS_READ) {
                jbCancel.requestFocus();
            }
            else {
                for (SGuiField field : moFields.getFields()) {
                    if (field.isFocusable()) {
                        if (field instanceof JSpinner && ((JSpinner) field).getEditor() instanceof JSpinner.NumberEditor) {
                            ((JSpinner.NumberEditor) ((JSpinner) field).getEditor()).getTextField().requestFocusInWindow();
                        }
                        else {
                            field.getComponent().requestFocusInWindow();
                        }
                        break;
                    }
                }
            }
        }
    }

    protected void windowClosed() {
        for (SGridPaneForm grid : mvFormGrids) {
            grid.paneViewClosed();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton jbCancel;
    protected javax.swing.JButton jbEdit;
    protected javax.swing.JButton jbReadInfo;
    protected javax.swing.JButton jbSave;
    protected javax.swing.JPanel jpCommand;
    protected javax.swing.JPanel jpCommandCenter;
    protected javax.swing.JPanel jpCommandLeft;
    protected javax.swing.JPanel jpCommandRight;
    private javax.swing.JPanel jpContainer;
    protected javax.swing.JTextField jtfRegistryKey;
    // End of variables declaration//GEN-END:variables

    /*
     * Public methods
     */

    public boolean isFormEditable() {
        return true;
    }

    public JPanel getBeanPanel() {
        return jpContainer;
    }

    /*
     * Overriden methods
     */

    @Override
    public int getBeanFormType() {
        return mnBeanFormType;
    }

    @Override
    public int getFormType() {
        return mnFormType;
    }

    @Override
    public int getFormSubtype() {
        return mnFormSubtype;
    }

    @Override
    public int getFormStatus() {
        return mnFormStatus;
    }

    @Override
    public int getFormResult() {
        return mnFormResult;
    }

    @Override
    public boolean canShowForm() {
        return mbCanShowForm;
    }

    @Override
    public void setFormSettings(final SGuiClient client, final int beanFormType, final int formType, final int formSubtype, final String title) {
        miClient = client;
        mnBeanFormType = beanFormType;
        mnFormType = formType;
        mnFormSubtype = formSubtype;
        msTitle = title;

        setTitle(msTitle);
    }

    @Override
    public void setFormVisible(final boolean visible) {
        setVisible(visible);
    }

    @Override
    public void setFormEditable(final boolean editable) {
        if (editable) {
            mnFormStatus = SGuiConsts.FORM_STATUS_EDIT;
            moFields.setFieldsEditable(true);
            jbEdit.setEnabled(false);
            jbReadInfo.setEnabled(false);
            jbSave.setEnabled(true);
        }
        else {
            mnFormStatus = SGuiConsts.FORM_STATUS_READ;
            moFields.setFieldsEditable(false);
            jbEdit.setEnabled(isFormEditable());
            jbReadInfo.setEnabled(!jbEdit.isEnabled());
            jbSave.setEnabled(false);
        }

        updateFormControlStatus();
    }

    /**
     * Override this method for extra functionality on setFormEditable() call.
     */
    @Override
    public void updateFormControlStatus() {

    }

    public abstract void addAllListeners();
    public abstract void removeAllListeners();
    public abstract void reloadCatalogues();
    public abstract void setRegistry(final SDbRegistry registry) throws Exception;
    public abstract SDbRegistry getRegistry() throws Exception;
    public abstract SGuiValidation validateForm();

    @Override
    public boolean isFormDataEdited() {
        return false;
    }

    @Override
    public void setValue(final int type, final Object value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object getValue(final int type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public SGuiFields getFields() {
        return moFields;
    }

    @Override
    public void actionEdit() {
        if (jbEdit.isEnabled()) {
            setFormEditable(true);
        }
    }

    @Override
    public void actionReadInfo() {
        if (jbReadInfo.isEnabled()) {
            miClient.showMsgBoxInformation(msReadInfo);
        }
    }

    @Override
    public void actionSave() {
        if (jbSave.isEnabled()) {
            if (SGuiUtils.computeValidation(miClient, validateForm())) {
                SDbRegistry registry = null;

                try {
                    registry = getRegistry();

                    if (registry.canSave(miClient.getSession())) {
                        mnFormResult = SGuiConsts.FORM_RESULT_OK;
                        dispose();
                    }
                    else {
                        miClient.showMsgBoxWarning(SDbConsts.MSG_REG_DENIED_UPDATE + (registry.getQueryResult().length() == 0 ? "" : "\n" + registry.getQueryResult()));
                    }
                }
                catch (SQLException e) {
                    SLibUtils.showException(this, e);
                }
                catch (Exception e) {
                    SLibUtils.showException(this, e);
                }
            }
        }
    }

    @Override
    public void actionCancel() {
        if (jbCancel.isEnabled()) {
            mnFormResult = SGuiConsts.FORM_RESULT_CANCEL;
            dispose();
        }
    }
}
