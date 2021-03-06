/*
 * SGuiDateRangePicker.java
 *
 * Created on 3 de abril de 2008, 08:26 PM
 */

package sa.lib.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.swing.JDialog;
import sa.lib.SLibConsts;
import sa.lib.SLibTimeUtils;

/**
 *
 * @author Sergio Flores
 */
public class SGuiDateRangePicker extends JDialog implements SGuiOptionPicker, ActionListener {

    private int mnPickerType;
    private int mnPickerResult;
    private boolean mbFirstActivation;
    private SGuiClient miClient;
    private SGuiFields moFields;

    /** Creates new form SGuiDateRangePicker */
    public SGuiDateRangePicker(SGuiClient client) {
        super(client.getFrame(), true);
        miClient = client;
        mnPickerType = SGuiConsts.DATE_PICKER_DATE_RANGE;
        initComponents();
        initComponentsCustom();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpRange = new javax.swing.JPanel();
        jpRangeDates = new javax.swing.JPanel();
        jpRangeDatesNorth = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jlDateStart = new javax.swing.JLabel();
        moDateStart = new sa.lib.gui.bean.SBeanFieldDate();
        jPanel2 = new javax.swing.JPanel();
        jlDateEnd = new javax.swing.JLabel();
        moDateEnd = new sa.lib.gui.bean.SBeanFieldDate();
        jpRangeMonths = new javax.swing.JPanel();
        jpRangeMonthsNorth = new javax.swing.JPanel();
        jpRangeMonthsNorthYear = new javax.swing.JPanel();
        jlYear = new javax.swing.JLabel();
        moCalYear = new sa.lib.gui.bean.SBeanFieldCalendarYear();
        jbYear = new javax.swing.JButton();
        jpRangeMonthsNorthMonths = new javax.swing.JPanel();
        jbMonth01 = new javax.swing.JButton();
        jbMonth02 = new javax.swing.JButton();
        jbMonth03 = new javax.swing.JButton();
        jbMonth04 = new javax.swing.JButton();
        jbMonth05 = new javax.swing.JButton();
        jbMonth06 = new javax.swing.JButton();
        jbMonth07 = new javax.swing.JButton();
        jbMonth08 = new javax.swing.JButton();
        jbMonth09 = new javax.swing.JButton();
        jbMonth10 = new javax.swing.JButton();
        jbMonth11 = new javax.swing.JButton();
        jbMonth12 = new javax.swing.JButton();
        jpCommand = new javax.swing.JPanel();
        jbOk = new javax.swing.JButton();
        jbCancel = new javax.swing.JButton();

        setTitle("Período por rango de fechas");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jpRange.setBorder(javax.swing.BorderFactory.createTitledBorder("Rango de fechas:"));
        jpRange.setLayout(new java.awt.GridLayout(1, 2));

        jpRangeDates.setLayout(new java.awt.BorderLayout());

        jpRangeDatesNorth.setLayout(new java.awt.GridLayout(2, 1, 0, 5));

        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlDateStart.setText("Fecha inicial:");
        jlDateStart.setPreferredSize(new java.awt.Dimension(65, 23));
        jPanel1.add(jlDateStart);
        jPanel1.add(moDateStart);

        jpRangeDatesNorth.add(jPanel1);

        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlDateEnd.setText("Fecha final:");
        jlDateEnd.setPreferredSize(new java.awt.Dimension(65, 23));
        jPanel2.add(jlDateEnd);
        jPanel2.add(moDateEnd);

        jpRangeDatesNorth.add(jPanel2);

        jpRangeDates.add(jpRangeDatesNorth, java.awt.BorderLayout.NORTH);

        jpRange.add(jpRangeDates);

        jpRangeMonths.setLayout(new java.awt.BorderLayout());

        jpRangeMonthsNorth.setLayout(new java.awt.BorderLayout(0, 5));

        jpRangeMonthsNorthYear.setLayout(new java.awt.GridLayout(1, 3, 5, 0));

        jlYear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlYear.setText("Año:");
        jlYear.setPreferredSize(new java.awt.Dimension(50, 23));
        jpRangeMonthsNorthYear.add(jlYear);
        jpRangeMonthsNorthYear.add(moCalYear);

        jbYear.setText("Año");
        jbYear.setMargin(new java.awt.Insets(2, 0, 2, 0));
        jbYear.setPreferredSize(new java.awt.Dimension(50, 23));
        jpRangeMonthsNorthYear.add(jbYear);

        jpRangeMonthsNorth.add(jpRangeMonthsNorthYear, java.awt.BorderLayout.PAGE_START);

        jpRangeMonthsNorthMonths.setLayout(new java.awt.GridLayout(4, 3, 5, 5));

        jbMonth01.setText("01");
        jbMonth01.setMargin(new java.awt.Insets(2, 0, 2, 0));
        jpRangeMonthsNorthMonths.add(jbMonth01);

        jbMonth02.setText("02");
        jbMonth02.setMargin(new java.awt.Insets(2, 0, 2, 0));
        jpRangeMonthsNorthMonths.add(jbMonth02);

        jbMonth03.setText("03");
        jbMonth03.setMargin(new java.awt.Insets(2, 0, 2, 0));
        jpRangeMonthsNorthMonths.add(jbMonth03);

        jbMonth04.setText("04");
        jbMonth04.setMargin(new java.awt.Insets(2, 0, 2, 0));
        jpRangeMonthsNorthMonths.add(jbMonth04);

        jbMonth05.setText("05");
        jbMonth05.setMargin(new java.awt.Insets(2, 0, 2, 0));
        jpRangeMonthsNorthMonths.add(jbMonth05);

        jbMonth06.setText("06");
        jbMonth06.setMargin(new java.awt.Insets(2, 0, 2, 0));
        jpRangeMonthsNorthMonths.add(jbMonth06);

        jbMonth07.setText("07");
        jbMonth07.setMargin(new java.awt.Insets(2, 0, 2, 0));
        jpRangeMonthsNorthMonths.add(jbMonth07);

        jbMonth08.setText("08");
        jbMonth08.setMargin(new java.awt.Insets(2, 0, 2, 0));
        jpRangeMonthsNorthMonths.add(jbMonth08);

        jbMonth09.setText("09");
        jbMonth09.setMargin(new java.awt.Insets(2, 0, 2, 0));
        jpRangeMonthsNorthMonths.add(jbMonth09);

        jbMonth10.setText("10");
        jbMonth10.setMargin(new java.awt.Insets(2, 0, 2, 0));
        jpRangeMonthsNorthMonths.add(jbMonth10);

        jbMonth11.setText("11");
        jbMonth11.setMargin(new java.awt.Insets(2, 0, 2, 0));
        jpRangeMonthsNorthMonths.add(jbMonth11);

        jbMonth12.setText("12");
        jbMonth12.setMargin(new java.awt.Insets(2, 0, 2, 0));
        jpRangeMonthsNorthMonths.add(jbMonth12);

        jpRangeMonthsNorth.add(jpRangeMonthsNorthMonths, java.awt.BorderLayout.CENTER);

        jpRangeMonths.add(jpRangeMonthsNorth, java.awt.BorderLayout.NORTH);

        jpRange.add(jpRangeMonths);

        getContentPane().add(jpRange, java.awt.BorderLayout.CENTER);

        jpCommand.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        jbOk.setText("Aceptar");
        jbOk.setToolTipText("[Ctrl + Enter]");
        jbOk.setPreferredSize(new java.awt.Dimension(75, 23));
        jpCommand.add(jbOk);

        jbCancel.setText("Cancelar");
        jbCancel.setToolTipText("[Escape]");
        jpCommand.add(jbCancel);

        getContentPane().add(jpCommand, java.awt.BorderLayout.SOUTH);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-400)/2, (screenSize.height-250)/2, 400, 250);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        if (mbFirstActivation) {
            mbFirstActivation = false;
            moDateStart.processFocus();
        }
    }//GEN-LAST:event_formWindowActivated

    private void initComponentsCustom() {
        String[] months = SLibTimeUtils.createMonthsOfYear(Locale.getDefault(), Calendar.SHORT);

        moDateStart.setDateSettings(miClient, SGuiUtils.getLabelName(jlDateStart.getText()), true);
        moDateEnd.setDateSettings(miClient, SGuiUtils.getLabelName(jlDateEnd.getText()), true);

        moFields = new SGuiFields();
        moFields.addField(moDateStart);
        moFields.addField(moDateEnd);
        moFields.setFormButton(jbOk);

        jbMonth01.setText(months[0]);
        jbMonth02.setText(months[1]);
        jbMonth03.setText(months[2]);
        jbMonth04.setText(months[3]);
        jbMonth05.setText(months[4]);
        jbMonth06.setText(months[5]);
        jbMonth07.setText(months[6]);
        jbMonth08.setText(months[7]);
        jbMonth09.setText(months[8]);
        jbMonth10.setText(months[9]);
        jbMonth11.setText(months[10]);
        jbMonth12.setText(months[11]);

        jbOk.addActionListener(this);
        jbCancel.addActionListener(this);
        jbYear.addActionListener(this);
        jbMonth01.addActionListener(this);
        jbMonth02.addActionListener(this);
        jbMonth03.addActionListener(this);
        jbMonth04.addActionListener(this);
        jbMonth05.addActionListener(this);
        jbMonth06.addActionListener(this);
        jbMonth07.addActionListener(this);
        jbMonth08.addActionListener(this);
        jbMonth09.addActionListener(this);
        jbMonth10.addActionListener(this);
        jbMonth11.addActionListener(this);
        jbMonth12.addActionListener(this);

        SGuiUtils.createActionMap(rootPane, this, "actionOk", "ok", KeyEvent.VK_ENTER, KeyEvent.CTRL_DOWN_MASK);
        SGuiUtils.createActionMap(rootPane, this, "actionCancel", "cancel", KeyEvent.VK_ESCAPE, 0);
    }

    private void actionYear() {
        moDateStart.setValue(SLibTimeUtils.createDate((Integer) moCalYear.getValue(), 1, 1));
        moDateEnd.setValue(SLibTimeUtils.createDate((Integer) moCalYear.getValue(), 12, 31));

        actionOk();
    }

    private void actionMonth(int month) {
        moDateStart.setValue(SLibTimeUtils.createDate((Integer) moCalYear.getValue(), month, 1));
        moDateEnd.setValue(SLibTimeUtils.createDate((Integer) moCalYear.getValue(), month, SLibTimeUtils.getMaxDayOfMonth(moDateStart.getValue())));

        actionOk();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbCancel;
    private javax.swing.JButton jbMonth01;
    private javax.swing.JButton jbMonth02;
    private javax.swing.JButton jbMonth03;
    private javax.swing.JButton jbMonth04;
    private javax.swing.JButton jbMonth05;
    private javax.swing.JButton jbMonth06;
    private javax.swing.JButton jbMonth07;
    private javax.swing.JButton jbMonth08;
    private javax.swing.JButton jbMonth09;
    private javax.swing.JButton jbMonth10;
    private javax.swing.JButton jbMonth11;
    private javax.swing.JButton jbMonth12;
    private javax.swing.JButton jbOk;
    private javax.swing.JButton jbYear;
    private javax.swing.JLabel jlDateEnd;
    private javax.swing.JLabel jlDateStart;
    private javax.swing.JLabel jlYear;
    private javax.swing.JPanel jpCommand;
    private javax.swing.JPanel jpRange;
    private javax.swing.JPanel jpRangeDates;
    private javax.swing.JPanel jpRangeDatesNorth;
    private javax.swing.JPanel jpRangeMonths;
    private javax.swing.JPanel jpRangeMonthsNorth;
    private javax.swing.JPanel jpRangeMonthsNorthMonths;
    private javax.swing.JPanel jpRangeMonthsNorthYear;
    private sa.lib.gui.bean.SBeanFieldCalendarYear moCalYear;
    private sa.lib.gui.bean.SBeanFieldDate moDateEnd;
    private sa.lib.gui.bean.SBeanFieldDate moDateStart;
    // End of variables declaration//GEN-END:variables

    /*
     * Overriden methods
     */

    @Override
    public void setPickerSettings(SGuiClient client, int pickerType, int pickerSubtype, SGuiOptionPickerSettings settings) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void resetPicker() {
        mnPickerResult = SLibConsts.UNDEFINED;
        mbFirstActivation = true;

        moDateStart.setValue(SLibTimeUtils.getBeginOfMonth(miClient.getSession().getCurrentDate()));
        moDateEnd.setValue(SLibTimeUtils.getEndOfMonth(miClient.getSession().getCurrentDate()));
        moCalYear.setValue(SLibTimeUtils.digestYear(miClient.getSession().getCurrentDate())[0]);
    }

    @Override
    public void setPickerVisible(final boolean visible) {
        setVisible(visible);
    }

    @Override
    public void setOption(final Object option) {
        moDateStart.setValue(((Date[]) option)[0]);
        moDateEnd.setValue(((Date[]) option)[1]);
    }

    @Override
    public Date[] getOption() {
        return new Date[] { moDateStart.getValue(), moDateEnd.getValue() };
    }

    @Override
    public SGuiValidation validatePicker() {
        SGuiValidation validation = moFields.validateFields();

        if (validation.isValid()) {
            validation = SGuiUtils.validateDateRange(moDateStart, moDateEnd);
        }

        return validation;
    }

    @Override
    public int getPickerType() {
        return mnPickerType;
    }

    @Override
    public int getPickerSubtype() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getPickerResult() {
        return mnPickerResult;
    }

    @Override
    public void actionOk() {
        if (SGuiUtils.computeValidation(miClient, validatePicker())) {
            mnPickerResult = SGuiConsts.FORM_RESULT_OK;
            setVisible(false);
        }
    }

    @Override
    public void actionCancel() {
        mnPickerResult = SGuiConsts.FORM_RESULT_CANCEL;
        setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof javax.swing.JButton) {
            javax.swing.JButton button = (javax.swing.JButton) e.getSource();

            if (button == jbOk) {
                actionOk();
            }
            else if (button == jbCancel) {
                actionCancel();
            }
            else if (button == jbYear) {
                actionYear();
            }
            else if (button == jbMonth01) {
                actionMonth(1);
            }
            else if (button == jbMonth02) {
                actionMonth(2);
            }
            else if (button == jbMonth03) {
                actionMonth(3);
            }
            else if (button == jbMonth04) {
                actionMonth(4);
            }
            else if (button == jbMonth05) {
                actionMonth(5);
            }
            else if (button == jbMonth06) {
                actionMonth(6);
            }
            else if (button == jbMonth07) {
                actionMonth(7);
            }
            else if (button == jbMonth08) {
                actionMonth(8);
            }
            else if (button == jbMonth09) {
                actionMonth(9);
            }
            else if (button == jbMonth10) {
                actionMonth(10);
            }
            else if (button == jbMonth11) {
                actionMonth(11);
            }
            else if (button == jbMonth12) {
                actionMonth(12);
            }
        }
    }
}
