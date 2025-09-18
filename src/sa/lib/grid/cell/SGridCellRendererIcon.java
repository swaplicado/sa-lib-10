/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sa.lib.grid.cell;

import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import sa.lib.SLibConsts;
import sa.lib.SLibUtils;
import sa.lib.grid.SGridConsts;

/**
 *
 * @author Sergio Flores, Isabel Servín
 */
public class SGridCellRendererIcon extends DefaultTableCellRenderer {

    public static final ImageIcon moIconNull = new ImageIcon(new Object().getClass().getResource("/sa/lib/img/view_null.png"));
    public static final ImageIcon moIconAnnul = new ImageIcon(new Object().getClass().getResource("/sa/lib/img/view_annul.png"));
    public static final ImageIcon moIconCross = new ImageIcon(new Object().getClass().getResource("/sa/lib/img/view_cross.png"));
    public static final ImageIcon moIconWarn = new ImageIcon(new Object().getClass().getResource("/sa/lib/img/view_warn.png"));
    public static final ImageIcon moIconOk = new ImageIcon(new Object().getClass().getResource("/sa/lib/img/view_ok.png"));
    public static final ImageIcon moIconDoc = new ImageIcon(new Object().getClass().getResource("/sa/lib/img/view_doc.png"));
    public static final ImageIcon moIconThumbsUp = new ImageIcon(new Object().getClass().getResource("/sa/lib/img/view_thum_up.png"));
    public static final ImageIcon moIconThumbsDown = new ImageIcon(new Object().getClass().getResource("/sa/lib/img/view_thum_down.png"));
    public static final ImageIcon moIconXmlPending = new ImageIcon(new Object().getClass().getResource("/sa/lib/img/view_xml_pend.png"));
    public static final ImageIcon moIconXmlIssued = new ImageIcon(new Object().getClass().getResource("/sa/lib/img/view_xml_issu.png"));
    public static final ImageIcon moIconXmlAnnulled = new ImageIcon(new Object().getClass().getResource("/sa/lib/img/view_xml_annul.png"));
    public static final ImageIcon moIconXmlAnnulledPdf = new ImageIcon(new Object().getClass().getResource("/sa/lib/img/view_xml_annul_pdf.png"));
    public static final ImageIcon moIconXmlAnnulledXml = new ImageIcon(new Object().getClass().getResource("/sa/lib/img/view_xml_annul_xml.png"));
    public static final ImageIcon moIconWait = new ImageIcon(new Object().getClass().getResource("/sa/lib/img/view_st_wait.png"));
    public static final ImageIcon moIconFolder = new ImageIcon(new Object().getClass().getResource("/sa/lib/img/view_folder.png"));

    private JLabel moLabel;

    public SGridCellRendererIcon() {
        moLabel = new JLabel();
        moLabel.setOpaque(true);
        moLabel.setHorizontalAlignment(JLabel.CENTER);
    }

    public void setLabel(JLabel o) { moLabel = o; }

    public JLabel getLabel() { return moLabel; }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col) {
        int icon = SLibConsts.UNDEFINED;

        try {
            icon = value == null ? SGridConsts.ICON_NULL : ((Number) value).intValue();
        }
        catch (java.lang.Exception e) {
            SLibUtils.showException(this, e);
        }

        switch (icon) {
            case SGridConsts.ICON_NULL:
                moLabel.setIcon(moIconNull);
                break;
            case SGridConsts.ICON_ANNUL:
                moLabel.setIcon(moIconAnnul);
                break;
            case SGridConsts.ICON_CROSS:
                moLabel.setIcon(moIconCross);
                break;
            case SGridConsts.ICON_WARN:
                moLabel.setIcon(moIconWarn);
                break;
            case SGridConsts.ICON_OK:
                moLabel.setIcon(moIconOk);
                break;
            case SGridConsts.ICON_DOC:
                moLabel.setIcon(moIconDoc);
                break;
            case SGridConsts.ICON_THUMBS_UP:
                moLabel.setIcon(moIconThumbsUp);
                break;
            case SGridConsts.ICON_THUMBS_DOWN:
                moLabel.setIcon(moIconThumbsDown);
                break;
            case SGridConsts.ICON_XML_PEND:
                moLabel.setIcon(moIconXmlPending);
                break;
            case SGridConsts.ICON_XML_ISSU:
                moLabel.setIcon(moIconXmlIssued);
                break;
            case SGridConsts.ICON_XML_ANNUL:
                moLabel.setIcon(moIconXmlAnnulled);
                break;
            case SGridConsts.ICON_XML_ANNUL_PDF:
                moLabel.setIcon(moIconXmlAnnulledPdf);
                break;
            case SGridConsts.ICON_XML_ANNUL_XML:
                moLabel.setIcon(moIconXmlAnnulledXml);
                break;
            case SGridConsts.ICON_WAIT:
                moLabel.setIcon(moIconWait);
                break;
            case SGridConsts.ICON_FOLDER:
                moLabel.setIcon(moIconFolder);
                break;
            default:
                moLabel.setIcon(moIconNull);
        }

        if (isSelected) {
            if (table.isCellEditable(row, col)) {
                moLabel.setForeground(SGridConsts.COLOR_FG_EDIT);
                moLabel.setBackground(hasFocus ? SGridConsts.COLOR_BG_SELECT_EDIT_FOCUS : SGridConsts.COLOR_BG_SELECT_EDIT);
            }
            else {
                moLabel.setForeground(SGridConsts.COLOR_FG_READ);
                moLabel.setBackground(hasFocus ? SGridConsts.COLOR_BG_SELECT_READ_FOCUS : SGridConsts.COLOR_BG_SELECT_READ);
            }
        }
        else {
            if (table.isCellEditable(row, col)) {
                moLabel.setForeground(SGridConsts.COLOR_FG_EDIT);
                moLabel.setBackground(SGridConsts.COLOR_BG_PLAIN_EDIT);
            }
            else {
                moLabel.setForeground(SGridConsts.COLOR_FG_READ);
                moLabel.setBackground(SGridConsts.COLOR_BG_PLAIN_READ);
            }
        }

        return moLabel;
    }
}
