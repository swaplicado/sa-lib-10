/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sa.lib.gui.bean;

import java.beans.*;

/**
 *
 * @author Sergio Flores
 */
public class SBeanOptionPickerBeanInfo extends SimpleBeanInfo {

    // Bean descriptor//GEN-FIRST:BeanDescriptor
    /*lazy BeanDescriptor*/
    private static BeanDescriptor getBdescriptor(){
        BeanDescriptor beanDescriptor = new BeanDescriptor  ( sa.lib.gui.bean.SBeanOptionPicker.class , null ); // NOI18N//GEN-HEADEREND:BeanDescriptor

    beanDescriptor.setValue("containerDelegate", "getBeanPanel");

        return beanDescriptor;     }//GEN-LAST:BeanDescriptor


    // Property identifiers//GEN-FIRST:Properties
    private static final int PROPERTY_accessibleContext = 0;
    private static final int PROPERTY_active = 1;
    private static final int PROPERTY_alignmentX = 2;
    private static final int PROPERTY_alignmentY = 3;
    private static final int PROPERTY_alwaysOnTop = 4;
    private static final int PROPERTY_alwaysOnTopSupported = 5;
    private static final int PROPERTY_background = 6;
    private static final int PROPERTY_backgroundSet = 7;
    private static final int PROPERTY_baselineResizeBehavior = 8;
    private static final int PROPERTY_beanPanel = 9;
    private static final int PROPERTY_bounds = 10;
    private static final int PROPERTY_bufferStrategy = 11;
    private static final int PROPERTY_colorModel = 12;
    private static final int PROPERTY_component = 13;
    private static final int PROPERTY_componentCount = 14;
    private static final int PROPERTY_componentListeners = 15;
    private static final int PROPERTY_componentOrientation = 16;
    private static final int PROPERTY_components = 17;
    private static final int PROPERTY_containerListeners = 18;
    private static final int PROPERTY_contentPane = 19;
    private static final int PROPERTY_cursor = 20;
    private static final int PROPERTY_cursorSet = 21;
    private static final int PROPERTY_defaultCloseOperation = 22;
    private static final int PROPERTY_displayable = 23;
    private static final int PROPERTY_doubleBuffered = 24;
    private static final int PROPERTY_dropTarget = 25;
    private static final int PROPERTY_enabled = 26;
    private static final int PROPERTY_focusable = 27;
    private static final int PROPERTY_focusableWindow = 28;
    private static final int PROPERTY_focusableWindowState = 29;
    private static final int PROPERTY_focusCycleRoot = 30;
    private static final int PROPERTY_focusCycleRootAncestor = 31;
    private static final int PROPERTY_focused = 32;
    private static final int PROPERTY_focusListeners = 33;
    private static final int PROPERTY_focusOwner = 34;
    private static final int PROPERTY_focusTraversable = 35;
    private static final int PROPERTY_focusTraversalKeys = 36;
    private static final int PROPERTY_focusTraversalKeysEnabled = 37;
    private static final int PROPERTY_focusTraversalPolicy = 38;
    private static final int PROPERTY_focusTraversalPolicyProvider = 39;
    private static final int PROPERTY_focusTraversalPolicySet = 40;
    private static final int PROPERTY_font = 41;
    private static final int PROPERTY_fontSet = 42;
    private static final int PROPERTY_foreground = 43;
    private static final int PROPERTY_foregroundSet = 44;
    private static final int PROPERTY_formResult = 45;
    private static final int PROPERTY_glassPane = 46;
    private static final int PROPERTY_graphics = 47;
    private static final int PROPERTY_graphicsConfiguration = 48;
    private static final int PROPERTY_height = 49;
    private static final int PROPERTY_hierarchyBoundsListeners = 50;
    private static final int PROPERTY_hierarchyListeners = 51;
    private static final int PROPERTY_iconImage = 52;
    private static final int PROPERTY_iconImages = 53;
    private static final int PROPERTY_ignoreRepaint = 54;
    private static final int PROPERTY_inputContext = 55;
    private static final int PROPERTY_inputMethodListeners = 56;
    private static final int PROPERTY_inputMethodRequests = 57;
    private static final int PROPERTY_insets = 58;
    private static final int PROPERTY_JMenuBar = 59;
    private static final int PROPERTY_keyListeners = 60;
    private static final int PROPERTY_layeredPane = 61;
    private static final int PROPERTY_layout = 62;
    private static final int PROPERTY_lightweight = 63;
    private static final int PROPERTY_locale = 64;
    private static final int PROPERTY_location = 65;
    private static final int PROPERTY_locationByPlatform = 66;
    private static final int PROPERTY_locationOnScreen = 67;
    private static final int PROPERTY_locationRelativeTo = 68;
    private static final int PROPERTY_maximumSize = 69;
    private static final int PROPERTY_maximumSizeSet = 70;
    private static final int PROPERTY_minimumSize = 71;
    private static final int PROPERTY_minimumSizeSet = 72;
    private static final int PROPERTY_modal = 73;
    private static final int PROPERTY_modalExclusionType = 74;
    private static final int PROPERTY_modalityType = 75;
    private static final int PROPERTY_mostRecentFocusOwner = 76;
    private static final int PROPERTY_mouseListeners = 77;
    private static final int PROPERTY_mouseMotionListeners = 78;
    private static final int PROPERTY_mousePosition = 79;
    private static final int PROPERTY_mouseWheelListeners = 80;
    private static final int PROPERTY_name = 81;
    private static final int PROPERTY_opaque = 82;
    private static final int PROPERTY_ownedWindows = 83;
    private static final int PROPERTY_owner = 84;
    private static final int PROPERTY_parent = 85;
    private static final int PROPERTY_peer = 86;
    private static final int PROPERTY_preferredSize = 87;
    private static final int PROPERTY_preferredSizeSet = 88;
    private static final int PROPERTY_propertyChangeListeners = 89;
    private static final int PROPERTY_resizable = 90;
    private static final int PROPERTY_rootPane = 91;
    private static final int PROPERTY_showing = 92;
    private static final int PROPERTY_size = 93;
    private static final int PROPERTY_title = 94;
    private static final int PROPERTY_toolkit = 95;
    private static final int PROPERTY_transferHandler = 96;
    private static final int PROPERTY_treeLock = 97;
    private static final int PROPERTY_undecorated = 98;
    private static final int PROPERTY_valid = 99;
    private static final int PROPERTY_visible = 100;
    private static final int PROPERTY_warningString = 101;
    private static final int PROPERTY_width = 102;
    private static final int PROPERTY_windowFocusListeners = 103;
    private static final int PROPERTY_windowListeners = 104;
    private static final int PROPERTY_windowStateListeners = 105;
    private static final int PROPERTY_x = 106;
    private static final int PROPERTY_y = 107;

    // Property array 
    /*lazy PropertyDescriptor*/
    private static PropertyDescriptor[] getPdescriptor(){
        PropertyDescriptor[] properties = new PropertyDescriptor[108];
    
        try {
            properties[PROPERTY_accessibleContext] = new PropertyDescriptor ( "accessibleContext", sa.lib.gui.bean.SBeanOptionPicker.class, "getAccessibleContext", null ); // NOI18N
            properties[PROPERTY_active] = new PropertyDescriptor ( "active", sa.lib.gui.bean.SBeanOptionPicker.class, "isActive", null ); // NOI18N
            properties[PROPERTY_alignmentX] = new PropertyDescriptor ( "alignmentX", sa.lib.gui.bean.SBeanOptionPicker.class, "getAlignmentX", null ); // NOI18N
            properties[PROPERTY_alignmentY] = new PropertyDescriptor ( "alignmentY", sa.lib.gui.bean.SBeanOptionPicker.class, "getAlignmentY", null ); // NOI18N
            properties[PROPERTY_alwaysOnTop] = new PropertyDescriptor ( "alwaysOnTop", sa.lib.gui.bean.SBeanOptionPicker.class, "isAlwaysOnTop", "setAlwaysOnTop" ); // NOI18N
            properties[PROPERTY_alwaysOnTopSupported] = new PropertyDescriptor ( "alwaysOnTopSupported", sa.lib.gui.bean.SBeanOptionPicker.class, "isAlwaysOnTopSupported", null ); // NOI18N
            properties[PROPERTY_background] = new PropertyDescriptor ( "background", sa.lib.gui.bean.SBeanOptionPicker.class, "getBackground", "setBackground" ); // NOI18N
            properties[PROPERTY_backgroundSet] = new PropertyDescriptor ( "backgroundSet", sa.lib.gui.bean.SBeanOptionPicker.class, "isBackgroundSet", null ); // NOI18N
            properties[PROPERTY_baselineResizeBehavior] = new PropertyDescriptor ( "baselineResizeBehavior", sa.lib.gui.bean.SBeanOptionPicker.class, "getBaselineResizeBehavior", null ); // NOI18N
            properties[PROPERTY_beanPanel] = new PropertyDescriptor ( "beanPanel", sa.lib.gui.bean.SBeanOptionPicker.class, "getBeanPanel", null ); // NOI18N
            properties[PROPERTY_bounds] = new PropertyDescriptor ( "bounds", sa.lib.gui.bean.SBeanOptionPicker.class, "getBounds", "setBounds" ); // NOI18N
            properties[PROPERTY_bufferStrategy] = new PropertyDescriptor ( "bufferStrategy", sa.lib.gui.bean.SBeanOptionPicker.class, "getBufferStrategy", null ); // NOI18N
            properties[PROPERTY_colorModel] = new PropertyDescriptor ( "colorModel", sa.lib.gui.bean.SBeanOptionPicker.class, "getColorModel", null ); // NOI18N
            properties[PROPERTY_component] = new IndexedPropertyDescriptor ( "component", sa.lib.gui.bean.SBeanOptionPicker.class, null, null, "getComponent", null ); // NOI18N
            properties[PROPERTY_componentCount] = new PropertyDescriptor ( "componentCount", sa.lib.gui.bean.SBeanOptionPicker.class, "getComponentCount", null ); // NOI18N
            properties[PROPERTY_componentListeners] = new PropertyDescriptor ( "componentListeners", sa.lib.gui.bean.SBeanOptionPicker.class, "getComponentListeners", null ); // NOI18N
            properties[PROPERTY_componentOrientation] = new PropertyDescriptor ( "componentOrientation", sa.lib.gui.bean.SBeanOptionPicker.class, "getComponentOrientation", "setComponentOrientation" ); // NOI18N
            properties[PROPERTY_components] = new PropertyDescriptor ( "components", sa.lib.gui.bean.SBeanOptionPicker.class, "getComponents", null ); // NOI18N
            properties[PROPERTY_containerListeners] = new PropertyDescriptor ( "containerListeners", sa.lib.gui.bean.SBeanOptionPicker.class, "getContainerListeners", null ); // NOI18N
            properties[PROPERTY_contentPane] = new PropertyDescriptor ( "contentPane", sa.lib.gui.bean.SBeanOptionPicker.class, "getContentPane", "setContentPane" ); // NOI18N
            properties[PROPERTY_cursor] = new PropertyDescriptor ( "cursor", sa.lib.gui.bean.SBeanOptionPicker.class, "getCursor", "setCursor" ); // NOI18N
            properties[PROPERTY_cursorSet] = new PropertyDescriptor ( "cursorSet", sa.lib.gui.bean.SBeanOptionPicker.class, "isCursorSet", null ); // NOI18N
            properties[PROPERTY_defaultCloseOperation] = new PropertyDescriptor ( "defaultCloseOperation", sa.lib.gui.bean.SBeanOptionPicker.class, "getDefaultCloseOperation", "setDefaultCloseOperation" ); // NOI18N
            properties[PROPERTY_displayable] = new PropertyDescriptor ( "displayable", sa.lib.gui.bean.SBeanOptionPicker.class, "isDisplayable", null ); // NOI18N
            properties[PROPERTY_doubleBuffered] = new PropertyDescriptor ( "doubleBuffered", sa.lib.gui.bean.SBeanOptionPicker.class, "isDoubleBuffered", null ); // NOI18N
            properties[PROPERTY_dropTarget] = new PropertyDescriptor ( "dropTarget", sa.lib.gui.bean.SBeanOptionPicker.class, "getDropTarget", "setDropTarget" ); // NOI18N
            properties[PROPERTY_enabled] = new PropertyDescriptor ( "enabled", sa.lib.gui.bean.SBeanOptionPicker.class, "isEnabled", "setEnabled" ); // NOI18N
            properties[PROPERTY_focusable] = new PropertyDescriptor ( "focusable", sa.lib.gui.bean.SBeanOptionPicker.class, "isFocusable", "setFocusable" ); // NOI18N
            properties[PROPERTY_focusableWindow] = new PropertyDescriptor ( "focusableWindow", sa.lib.gui.bean.SBeanOptionPicker.class, "isFocusableWindow", null ); // NOI18N
            properties[PROPERTY_focusableWindowState] = new PropertyDescriptor ( "focusableWindowState", sa.lib.gui.bean.SBeanOptionPicker.class, "getFocusableWindowState", "setFocusableWindowState" ); // NOI18N
            properties[PROPERTY_focusCycleRoot] = new PropertyDescriptor ( "focusCycleRoot", sa.lib.gui.bean.SBeanOptionPicker.class, "isFocusCycleRoot", "setFocusCycleRoot" ); // NOI18N
            properties[PROPERTY_focusCycleRootAncestor] = new PropertyDescriptor ( "focusCycleRootAncestor", sa.lib.gui.bean.SBeanOptionPicker.class, "getFocusCycleRootAncestor", null ); // NOI18N
            properties[PROPERTY_focused] = new PropertyDescriptor ( "focused", sa.lib.gui.bean.SBeanOptionPicker.class, "isFocused", null ); // NOI18N
            properties[PROPERTY_focusListeners] = new PropertyDescriptor ( "focusListeners", sa.lib.gui.bean.SBeanOptionPicker.class, "getFocusListeners", null ); // NOI18N
            properties[PROPERTY_focusOwner] = new PropertyDescriptor ( "focusOwner", sa.lib.gui.bean.SBeanOptionPicker.class, "getFocusOwner", null ); // NOI18N
            properties[PROPERTY_focusTraversable] = new PropertyDescriptor ( "focusTraversable", sa.lib.gui.bean.SBeanOptionPicker.class, "isFocusTraversable", null ); // NOI18N
            properties[PROPERTY_focusTraversalKeys] = new IndexedPropertyDescriptor ( "focusTraversalKeys", sa.lib.gui.bean.SBeanOptionPicker.class, null, null, "getFocusTraversalKeys", null ); // NOI18N
            properties[PROPERTY_focusTraversalKeysEnabled] = new PropertyDescriptor ( "focusTraversalKeysEnabled", sa.lib.gui.bean.SBeanOptionPicker.class, "getFocusTraversalKeysEnabled", "setFocusTraversalKeysEnabled" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicy] = new PropertyDescriptor ( "focusTraversalPolicy", sa.lib.gui.bean.SBeanOptionPicker.class, "getFocusTraversalPolicy", "setFocusTraversalPolicy" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicyProvider] = new PropertyDescriptor ( "focusTraversalPolicyProvider", sa.lib.gui.bean.SBeanOptionPicker.class, "isFocusTraversalPolicyProvider", "setFocusTraversalPolicyProvider" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicySet] = new PropertyDescriptor ( "focusTraversalPolicySet", sa.lib.gui.bean.SBeanOptionPicker.class, "isFocusTraversalPolicySet", null ); // NOI18N
            properties[PROPERTY_font] = new PropertyDescriptor ( "font", sa.lib.gui.bean.SBeanOptionPicker.class, "getFont", "setFont" ); // NOI18N
            properties[PROPERTY_fontSet] = new PropertyDescriptor ( "fontSet", sa.lib.gui.bean.SBeanOptionPicker.class, "isFontSet", null ); // NOI18N
            properties[PROPERTY_foreground] = new PropertyDescriptor ( "foreground", sa.lib.gui.bean.SBeanOptionPicker.class, "getForeground", "setForeground" ); // NOI18N
            properties[PROPERTY_foregroundSet] = new PropertyDescriptor ( "foregroundSet", sa.lib.gui.bean.SBeanOptionPicker.class, "isForegroundSet", null ); // NOI18N
            properties[PROPERTY_formResult] = new PropertyDescriptor ( "formResult", sa.lib.gui.bean.SBeanOptionPicker.class, "getFormResult", null ); // NOI18N
            properties[PROPERTY_glassPane] = new PropertyDescriptor ( "glassPane", sa.lib.gui.bean.SBeanOptionPicker.class, "getGlassPane", "setGlassPane" ); // NOI18N
            properties[PROPERTY_graphics] = new PropertyDescriptor ( "graphics", sa.lib.gui.bean.SBeanOptionPicker.class, "getGraphics", null ); // NOI18N
            properties[PROPERTY_graphicsConfiguration] = new PropertyDescriptor ( "graphicsConfiguration", sa.lib.gui.bean.SBeanOptionPicker.class, "getGraphicsConfiguration", null ); // NOI18N
            properties[PROPERTY_height] = new PropertyDescriptor ( "height", sa.lib.gui.bean.SBeanOptionPicker.class, "getHeight", null ); // NOI18N
            properties[PROPERTY_hierarchyBoundsListeners] = new PropertyDescriptor ( "hierarchyBoundsListeners", sa.lib.gui.bean.SBeanOptionPicker.class, "getHierarchyBoundsListeners", null ); // NOI18N
            properties[PROPERTY_hierarchyListeners] = new PropertyDescriptor ( "hierarchyListeners", sa.lib.gui.bean.SBeanOptionPicker.class, "getHierarchyListeners", null ); // NOI18N
            properties[PROPERTY_iconImage] = new PropertyDescriptor ( "iconImage", sa.lib.gui.bean.SBeanOptionPicker.class, null, "setIconImage" ); // NOI18N
            properties[PROPERTY_iconImages] = new PropertyDescriptor ( "iconImages", sa.lib.gui.bean.SBeanOptionPicker.class, null, "setIconImages" ); // NOI18N
            properties[PROPERTY_ignoreRepaint] = new PropertyDescriptor ( "ignoreRepaint", sa.lib.gui.bean.SBeanOptionPicker.class, "getIgnoreRepaint", "setIgnoreRepaint" ); // NOI18N
            properties[PROPERTY_inputContext] = new PropertyDescriptor ( "inputContext", sa.lib.gui.bean.SBeanOptionPicker.class, "getInputContext", null ); // NOI18N
            properties[PROPERTY_inputMethodListeners] = new PropertyDescriptor ( "inputMethodListeners", sa.lib.gui.bean.SBeanOptionPicker.class, "getInputMethodListeners", null ); // NOI18N
            properties[PROPERTY_inputMethodRequests] = new PropertyDescriptor ( "inputMethodRequests", sa.lib.gui.bean.SBeanOptionPicker.class, "getInputMethodRequests", null ); // NOI18N
            properties[PROPERTY_insets] = new PropertyDescriptor ( "insets", sa.lib.gui.bean.SBeanOptionPicker.class, "getInsets", null ); // NOI18N
            properties[PROPERTY_JMenuBar] = new PropertyDescriptor ( "JMenuBar", sa.lib.gui.bean.SBeanOptionPicker.class, "getJMenuBar", "setJMenuBar" ); // NOI18N
            properties[PROPERTY_keyListeners] = new PropertyDescriptor ( "keyListeners", sa.lib.gui.bean.SBeanOptionPicker.class, "getKeyListeners", null ); // NOI18N
            properties[PROPERTY_layeredPane] = new PropertyDescriptor ( "layeredPane", sa.lib.gui.bean.SBeanOptionPicker.class, "getLayeredPane", "setLayeredPane" ); // NOI18N
            properties[PROPERTY_layout] = new PropertyDescriptor ( "layout", sa.lib.gui.bean.SBeanOptionPicker.class, "getLayout", "setLayout" ); // NOI18N
            properties[PROPERTY_lightweight] = new PropertyDescriptor ( "lightweight", sa.lib.gui.bean.SBeanOptionPicker.class, "isLightweight", null ); // NOI18N
            properties[PROPERTY_locale] = new PropertyDescriptor ( "locale", sa.lib.gui.bean.SBeanOptionPicker.class, "getLocale", "setLocale" ); // NOI18N
            properties[PROPERTY_location] = new PropertyDescriptor ( "location", sa.lib.gui.bean.SBeanOptionPicker.class, "getLocation", "setLocation" ); // NOI18N
            properties[PROPERTY_locationByPlatform] = new PropertyDescriptor ( "locationByPlatform", sa.lib.gui.bean.SBeanOptionPicker.class, "isLocationByPlatform", "setLocationByPlatform" ); // NOI18N
            properties[PROPERTY_locationOnScreen] = new PropertyDescriptor ( "locationOnScreen", sa.lib.gui.bean.SBeanOptionPicker.class, "getLocationOnScreen", null ); // NOI18N
            properties[PROPERTY_locationRelativeTo] = new PropertyDescriptor ( "locationRelativeTo", sa.lib.gui.bean.SBeanOptionPicker.class, null, "setLocationRelativeTo" ); // NOI18N
            properties[PROPERTY_maximumSize] = new PropertyDescriptor ( "maximumSize", sa.lib.gui.bean.SBeanOptionPicker.class, "getMaximumSize", "setMaximumSize" ); // NOI18N
            properties[PROPERTY_maximumSizeSet] = new PropertyDescriptor ( "maximumSizeSet", sa.lib.gui.bean.SBeanOptionPicker.class, "isMaximumSizeSet", null ); // NOI18N
            properties[PROPERTY_minimumSize] = new PropertyDescriptor ( "minimumSize", sa.lib.gui.bean.SBeanOptionPicker.class, "getMinimumSize", "setMinimumSize" ); // NOI18N
            properties[PROPERTY_minimumSizeSet] = new PropertyDescriptor ( "minimumSizeSet", sa.lib.gui.bean.SBeanOptionPicker.class, "isMinimumSizeSet", null ); // NOI18N
            properties[PROPERTY_modal] = new PropertyDescriptor ( "modal", sa.lib.gui.bean.SBeanOptionPicker.class, "isModal", "setModal" ); // NOI18N
            properties[PROPERTY_modalExclusionType] = new PropertyDescriptor ( "modalExclusionType", sa.lib.gui.bean.SBeanOptionPicker.class, "getModalExclusionType", "setModalExclusionType" ); // NOI18N
            properties[PROPERTY_modalityType] = new PropertyDescriptor ( "modalityType", sa.lib.gui.bean.SBeanOptionPicker.class, "getModalityType", "setModalityType" ); // NOI18N
            properties[PROPERTY_mostRecentFocusOwner] = new PropertyDescriptor ( "mostRecentFocusOwner", sa.lib.gui.bean.SBeanOptionPicker.class, "getMostRecentFocusOwner", null ); // NOI18N
            properties[PROPERTY_mouseListeners] = new PropertyDescriptor ( "mouseListeners", sa.lib.gui.bean.SBeanOptionPicker.class, "getMouseListeners", null ); // NOI18N
            properties[PROPERTY_mouseMotionListeners] = new PropertyDescriptor ( "mouseMotionListeners", sa.lib.gui.bean.SBeanOptionPicker.class, "getMouseMotionListeners", null ); // NOI18N
            properties[PROPERTY_mousePosition] = new PropertyDescriptor ( "mousePosition", sa.lib.gui.bean.SBeanOptionPicker.class, "getMousePosition", null ); // NOI18N
            properties[PROPERTY_mouseWheelListeners] = new PropertyDescriptor ( "mouseWheelListeners", sa.lib.gui.bean.SBeanOptionPicker.class, "getMouseWheelListeners", null ); // NOI18N
            properties[PROPERTY_name] = new PropertyDescriptor ( "name", sa.lib.gui.bean.SBeanOptionPicker.class, "getName", "setName" ); // NOI18N
            properties[PROPERTY_opaque] = new PropertyDescriptor ( "opaque", sa.lib.gui.bean.SBeanOptionPicker.class, "isOpaque", null ); // NOI18N
            properties[PROPERTY_ownedWindows] = new PropertyDescriptor ( "ownedWindows", sa.lib.gui.bean.SBeanOptionPicker.class, "getOwnedWindows", null ); // NOI18N
            properties[PROPERTY_owner] = new PropertyDescriptor ( "owner", sa.lib.gui.bean.SBeanOptionPicker.class, "getOwner", null ); // NOI18N
            properties[PROPERTY_parent] = new PropertyDescriptor ( "parent", sa.lib.gui.bean.SBeanOptionPicker.class, "getParent", null ); // NOI18N
            properties[PROPERTY_peer] = new PropertyDescriptor ( "peer", sa.lib.gui.bean.SBeanOptionPicker.class, "getPeer", null ); // NOI18N
            properties[PROPERTY_preferredSize] = new PropertyDescriptor ( "preferredSize", sa.lib.gui.bean.SBeanOptionPicker.class, "getPreferredSize", "setPreferredSize" ); // NOI18N
            properties[PROPERTY_preferredSizeSet] = new PropertyDescriptor ( "preferredSizeSet", sa.lib.gui.bean.SBeanOptionPicker.class, "isPreferredSizeSet", null ); // NOI18N
            properties[PROPERTY_propertyChangeListeners] = new PropertyDescriptor ( "propertyChangeListeners", sa.lib.gui.bean.SBeanOptionPicker.class, "getPropertyChangeListeners", null ); // NOI18N
            properties[PROPERTY_resizable] = new PropertyDescriptor ( "resizable", sa.lib.gui.bean.SBeanOptionPicker.class, "isResizable", "setResizable" ); // NOI18N
            properties[PROPERTY_rootPane] = new PropertyDescriptor ( "rootPane", sa.lib.gui.bean.SBeanOptionPicker.class, "getRootPane", null ); // NOI18N
            properties[PROPERTY_showing] = new PropertyDescriptor ( "showing", sa.lib.gui.bean.SBeanOptionPicker.class, "isShowing", null ); // NOI18N
            properties[PROPERTY_size] = new PropertyDescriptor ( "size", sa.lib.gui.bean.SBeanOptionPicker.class, "getSize", "setSize" ); // NOI18N
            properties[PROPERTY_title] = new PropertyDescriptor ( "title", sa.lib.gui.bean.SBeanOptionPicker.class, "getTitle", "setTitle" ); // NOI18N
            properties[PROPERTY_toolkit] = new PropertyDescriptor ( "toolkit", sa.lib.gui.bean.SBeanOptionPicker.class, "getToolkit", null ); // NOI18N
            properties[PROPERTY_transferHandler] = new PropertyDescriptor ( "transferHandler", sa.lib.gui.bean.SBeanOptionPicker.class, "getTransferHandler", "setTransferHandler" ); // NOI18N
            properties[PROPERTY_treeLock] = new PropertyDescriptor ( "treeLock", sa.lib.gui.bean.SBeanOptionPicker.class, "getTreeLock", null ); // NOI18N
            properties[PROPERTY_undecorated] = new PropertyDescriptor ( "undecorated", sa.lib.gui.bean.SBeanOptionPicker.class, "isUndecorated", "setUndecorated" ); // NOI18N
            properties[PROPERTY_valid] = new PropertyDescriptor ( "valid", sa.lib.gui.bean.SBeanOptionPicker.class, "isValid", null ); // NOI18N
            properties[PROPERTY_visible] = new PropertyDescriptor ( "visible", sa.lib.gui.bean.SBeanOptionPicker.class, "isVisible", "setVisible" ); // NOI18N
            properties[PROPERTY_warningString] = new PropertyDescriptor ( "warningString", sa.lib.gui.bean.SBeanOptionPicker.class, "getWarningString", null ); // NOI18N
            properties[PROPERTY_width] = new PropertyDescriptor ( "width", sa.lib.gui.bean.SBeanOptionPicker.class, "getWidth", null ); // NOI18N
            properties[PROPERTY_windowFocusListeners] = new PropertyDescriptor ( "windowFocusListeners", sa.lib.gui.bean.SBeanOptionPicker.class, "getWindowFocusListeners", null ); // NOI18N
            properties[PROPERTY_windowListeners] = new PropertyDescriptor ( "windowListeners", sa.lib.gui.bean.SBeanOptionPicker.class, "getWindowListeners", null ); // NOI18N
            properties[PROPERTY_windowStateListeners] = new PropertyDescriptor ( "windowStateListeners", sa.lib.gui.bean.SBeanOptionPicker.class, "getWindowStateListeners", null ); // NOI18N
            properties[PROPERTY_x] = new PropertyDescriptor ( "x", sa.lib.gui.bean.SBeanOptionPicker.class, "getX", null ); // NOI18N
            properties[PROPERTY_y] = new PropertyDescriptor ( "y", sa.lib.gui.bean.SBeanOptionPicker.class, "getY", null ); // NOI18N
        }
        catch(IntrospectionException e) {
            e.printStackTrace();
        }//GEN-HEADEREND:Properties

    // Here you can add code for customizing the properties array.

        return properties;     }//GEN-LAST:Properties

    // EventSet identifiers//GEN-FIRST:Events
    private static final int EVENT_componentListener = 0;
    private static final int EVENT_containerListener = 1;
    private static final int EVENT_focusListener = 2;
    private static final int EVENT_hierarchyBoundsListener = 3;
    private static final int EVENT_hierarchyListener = 4;
    private static final int EVENT_inputMethodListener = 5;
    private static final int EVENT_keyListener = 6;
    private static final int EVENT_mouseListener = 7;
    private static final int EVENT_mouseMotionListener = 8;
    private static final int EVENT_mouseWheelListener = 9;
    private static final int EVENT_propertyChangeListener = 10;
    private static final int EVENT_windowFocusListener = 11;
    private static final int EVENT_windowListener = 12;
    private static final int EVENT_windowStateListener = 13;

    // EventSet array
    /*lazy EventSetDescriptor*/
    private static EventSetDescriptor[] getEdescriptor(){
        EventSetDescriptor[] eventSets = new EventSetDescriptor[14];
    
        try {
            eventSets[EVENT_componentListener] = new EventSetDescriptor ( sa.lib.gui.bean.SBeanOptionPicker.class, "componentListener", java.awt.event.ComponentListener.class, new String[] {"componentResized", "componentMoved", "componentShown", "componentHidden"}, "addComponentListener", "removeComponentListener" ); // NOI18N
            eventSets[EVENT_containerListener] = new EventSetDescriptor ( sa.lib.gui.bean.SBeanOptionPicker.class, "containerListener", java.awt.event.ContainerListener.class, new String[] {"componentAdded", "componentRemoved"}, "addContainerListener", "removeContainerListener" ); // NOI18N
            eventSets[EVENT_focusListener] = new EventSetDescriptor ( sa.lib.gui.bean.SBeanOptionPicker.class, "focusListener", java.awt.event.FocusListener.class, new String[] {"focusGained", "focusLost"}, "addFocusListener", "removeFocusListener" ); // NOI18N
            eventSets[EVENT_hierarchyBoundsListener] = new EventSetDescriptor ( sa.lib.gui.bean.SBeanOptionPicker.class, "hierarchyBoundsListener", java.awt.event.HierarchyBoundsListener.class, new String[] {"ancestorMoved", "ancestorResized"}, "addHierarchyBoundsListener", "removeHierarchyBoundsListener" ); // NOI18N
            eventSets[EVENT_hierarchyListener] = new EventSetDescriptor ( sa.lib.gui.bean.SBeanOptionPicker.class, "hierarchyListener", java.awt.event.HierarchyListener.class, new String[] {"hierarchyChanged"}, "addHierarchyListener", "removeHierarchyListener" ); // NOI18N
            eventSets[EVENT_inputMethodListener] = new EventSetDescriptor ( sa.lib.gui.bean.SBeanOptionPicker.class, "inputMethodListener", java.awt.event.InputMethodListener.class, new String[] {"inputMethodTextChanged", "caretPositionChanged"}, "addInputMethodListener", "removeInputMethodListener" ); // NOI18N
            eventSets[EVENT_keyListener] = new EventSetDescriptor ( sa.lib.gui.bean.SBeanOptionPicker.class, "keyListener", java.awt.event.KeyListener.class, new String[] {"keyTyped", "keyPressed", "keyReleased"}, "addKeyListener", "removeKeyListener" ); // NOI18N
            eventSets[EVENT_mouseListener] = new EventSetDescriptor ( sa.lib.gui.bean.SBeanOptionPicker.class, "mouseListener", java.awt.event.MouseListener.class, new String[] {"mouseClicked", "mousePressed", "mouseReleased", "mouseEntered", "mouseExited"}, "addMouseListener", "removeMouseListener" ); // NOI18N
            eventSets[EVENT_mouseMotionListener] = new EventSetDescriptor ( sa.lib.gui.bean.SBeanOptionPicker.class, "mouseMotionListener", java.awt.event.MouseMotionListener.class, new String[] {"mouseDragged", "mouseMoved"}, "addMouseMotionListener", "removeMouseMotionListener" ); // NOI18N
            eventSets[EVENT_mouseWheelListener] = new EventSetDescriptor ( sa.lib.gui.bean.SBeanOptionPicker.class, "mouseWheelListener", java.awt.event.MouseWheelListener.class, new String[] {"mouseWheelMoved"}, "addMouseWheelListener", "removeMouseWheelListener" ); // NOI18N
            eventSets[EVENT_propertyChangeListener] = new EventSetDescriptor ( sa.lib.gui.bean.SBeanOptionPicker.class, "propertyChangeListener", java.beans.PropertyChangeListener.class, new String[] {"propertyChange"}, "addPropertyChangeListener", "removePropertyChangeListener" ); // NOI18N
            eventSets[EVENT_windowFocusListener] = new EventSetDescriptor ( sa.lib.gui.bean.SBeanOptionPicker.class, "windowFocusListener", java.awt.event.WindowFocusListener.class, new String[] {"windowGainedFocus", "windowLostFocus"}, "addWindowFocusListener", "removeWindowFocusListener" ); // NOI18N
            eventSets[EVENT_windowListener] = new EventSetDescriptor ( sa.lib.gui.bean.SBeanOptionPicker.class, "windowListener", java.awt.event.WindowListener.class, new String[] {"windowOpened", "windowClosing", "windowClosed", "windowIconified", "windowDeiconified", "windowActivated", "windowDeactivated"}, "addWindowListener", "removeWindowListener" ); // NOI18N
            eventSets[EVENT_windowStateListener] = new EventSetDescriptor ( sa.lib.gui.bean.SBeanOptionPicker.class, "windowStateListener", java.awt.event.WindowStateListener.class, new String[] {"windowStateChanged"}, "addWindowStateListener", "removeWindowStateListener" ); // NOI18N
        }
        catch(IntrospectionException e) {
            e.printStackTrace();
        }//GEN-HEADEREND:Events

    // Here you can add code for customizing the event sets array.

        return eventSets;     }//GEN-LAST:Events

    // Method identifiers//GEN-FIRST:Methods
    private static final int METHOD_action0 = 0;
    private static final int METHOD_actionCancel1 = 1;
    private static final int METHOD_actionOk2 = 2;
    private static final int METHOD_actionPerformed3 = 3;
    private static final int METHOD_add4 = 4;
    private static final int METHOD_add5 = 5;
    private static final int METHOD_add6 = 6;
    private static final int METHOD_add7 = 7;
    private static final int METHOD_add8 = 8;
    private static final int METHOD_add9 = 9;
    private static final int METHOD_addNotify10 = 10;
    private static final int METHOD_addPropertyChangeListener11 = 11;
    private static final int METHOD_applyComponentOrientation12 = 12;
    private static final int METHOD_applyResourceBundle13 = 13;
    private static final int METHOD_applyResourceBundle14 = 14;
    private static final int METHOD_areFocusTraversalKeysSet15 = 15;
    private static final int METHOD_bounds16 = 16;
    private static final int METHOD_checkImage17 = 17;
    private static final int METHOD_checkImage18 = 18;
    private static final int METHOD_contains19 = 19;
    private static final int METHOD_contains20 = 20;
    private static final int METHOD_countComponents21 = 21;
    private static final int METHOD_createBufferStrategy22 = 22;
    private static final int METHOD_createBufferStrategy23 = 23;
    private static final int METHOD_createImage24 = 24;
    private static final int METHOD_createImage25 = 25;
    private static final int METHOD_createVolatileImage26 = 26;
    private static final int METHOD_createVolatileImage27 = 27;
    private static final int METHOD_deliverEvent28 = 28;
    private static final int METHOD_disable29 = 29;
    private static final int METHOD_dispatchEvent30 = 30;
    private static final int METHOD_dispose31 = 31;
    private static final int METHOD_doLayout32 = 32;
    private static final int METHOD_enable33 = 33;
    private static final int METHOD_enable34 = 34;
    private static final int METHOD_enableInputMethods35 = 35;
    private static final int METHOD_findComponentAt36 = 36;
    private static final int METHOD_findComponentAt37 = 37;
    private static final int METHOD_firePropertyChange38 = 38;
    private static final int METHOD_firePropertyChange39 = 39;
    private static final int METHOD_firePropertyChange40 = 40;
    private static final int METHOD_firePropertyChange41 = 41;
    private static final int METHOD_firePropertyChange42 = 42;
    private static final int METHOD_firePropertyChange43 = 43;
    private static final int METHOD_getBaseline44 = 44;
    private static final int METHOD_getBounds45 = 45;
    private static final int METHOD_getComponentAt46 = 46;
    private static final int METHOD_getComponentAt47 = 47;
    private static final int METHOD_getComponentZOrder48 = 48;
    private static final int METHOD_getFontMetrics49 = 49;
    private static final int METHOD_getIconImages50 = 50;
    private static final int METHOD_getListeners51 = 51;
    private static final int METHOD_getLocation52 = 52;
    private static final int METHOD_getMousePosition53 = 53;
    private static final int METHOD_getOwnerlessWindows54 = 54;
    private static final int METHOD_getPropertyChangeListeners55 = 55;
    private static final int METHOD_getSize56 = 56;
    private static final int METHOD_getWindows57 = 57;
    private static final int METHOD_gotFocus58 = 58;
    private static final int METHOD_handleEvent59 = 59;
    private static final int METHOD_hasFocus60 = 60;
    private static final int METHOD_hide61 = 61;
    private static final int METHOD_imageUpdate62 = 62;
    private static final int METHOD_insets63 = 63;
    private static final int METHOD_inside64 = 64;
    private static final int METHOD_invalidate65 = 65;
    private static final int METHOD_isAncestorOf66 = 66;
    private static final int METHOD_isDefaultLookAndFeelDecorated67 = 67;
    private static final int METHOD_isFocusCycleRoot68 = 68;
    private static final int METHOD_isFocusOwner69 = 69;
    private static final int METHOD_keyDown70 = 70;
    private static final int METHOD_keyUp71 = 71;
    private static final int METHOD_layout72 = 72;
    private static final int METHOD_list73 = 73;
    private static final int METHOD_list74 = 74;
    private static final int METHOD_list75 = 75;
    private static final int METHOD_list76 = 76;
    private static final int METHOD_list77 = 77;
    private static final int METHOD_locate78 = 78;
    private static final int METHOD_location79 = 79;
    private static final int METHOD_lostFocus80 = 80;
    private static final int METHOD_minimumSize81 = 81;
    private static final int METHOD_mouseDown82 = 82;
    private static final int METHOD_mouseDrag83 = 83;
    private static final int METHOD_mouseEnter84 = 84;
    private static final int METHOD_mouseExit85 = 85;
    private static final int METHOD_mouseMove86 = 86;
    private static final int METHOD_mouseUp87 = 87;
    private static final int METHOD_move88 = 88;
    private static final int METHOD_nextFocus89 = 89;
    private static final int METHOD_pack90 = 90;
    private static final int METHOD_paint91 = 91;
    private static final int METHOD_paintAll92 = 92;
    private static final int METHOD_paintComponents93 = 93;
    private static final int METHOD_postEvent94 = 94;
    private static final int METHOD_preferredSize95 = 95;
    private static final int METHOD_prepareImage96 = 96;
    private static final int METHOD_prepareImage97 = 97;
    private static final int METHOD_print98 = 98;
    private static final int METHOD_printAll99 = 99;
    private static final int METHOD_printComponents100 = 100;
    private static final int METHOD_remove101 = 101;
    private static final int METHOD_remove102 = 102;
    private static final int METHOD_remove103 = 103;
    private static final int METHOD_removeAll104 = 104;
    private static final int METHOD_removeNotify105 = 105;
    private static final int METHOD_removePropertyChangeListener106 = 106;
    private static final int METHOD_repaint107 = 107;
    private static final int METHOD_repaint108 = 108;
    private static final int METHOD_repaint109 = 109;
    private static final int METHOD_repaint110 = 110;
    private static final int METHOD_requestFocus111 = 111;
    private static final int METHOD_requestFocusInWindow112 = 112;
    private static final int METHOD_reshape113 = 113;
    private static final int METHOD_resize114 = 114;
    private static final int METHOD_resize115 = 115;
    private static final int METHOD_setBounds116 = 116;
    private static final int METHOD_setComponentZOrder117 = 117;
    private static final int METHOD_setDefaultLookAndFeelDecorated118 = 118;
    private static final int METHOD_setFocusTraversalKeys119 = 119;
    private static final int METHOD_setFormSettings120 = 120;
    private static final int METHOD_show121 = 121;
    private static final int METHOD_show122 = 122;
    private static final int METHOD_size123 = 123;
    private static final int METHOD_toBack124 = 124;
    private static final int METHOD_toFront125 = 125;
    private static final int METHOD_toString126 = 126;
    private static final int METHOD_transferFocus127 = 127;
    private static final int METHOD_transferFocusBackward128 = 128;
    private static final int METHOD_transferFocusDownCycle129 = 129;
    private static final int METHOD_transferFocusUpCycle130 = 130;
    private static final int METHOD_update131 = 131;
    private static final int METHOD_validate132 = 132;

    // Method array 
    /*lazy MethodDescriptor*/
    private static MethodDescriptor[] getMdescriptor(){
        MethodDescriptor[] methods = new MethodDescriptor[133];
    
        try {
            methods[METHOD_action0] = new MethodDescriptor(java.awt.Component.class.getMethod("action", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_action0].setDisplayName ( "" );
            methods[METHOD_actionCancel1] = new MethodDescriptor(sa.lib.gui.bean.SBeanOptionPicker.class.getMethod("actionCancel", new Class[] {})); // NOI18N
            methods[METHOD_actionCancel1].setDisplayName ( "" );
            methods[METHOD_actionOk2] = new MethodDescriptor(sa.lib.gui.bean.SBeanOptionPicker.class.getMethod("actionOk", new Class[] {})); // NOI18N
            methods[METHOD_actionOk2].setDisplayName ( "" );
            methods[METHOD_actionPerformed3] = new MethodDescriptor(sa.lib.gui.bean.SBeanOptionPicker.class.getMethod("actionPerformed", new Class[] {java.awt.event.ActionEvent.class})); // NOI18N
            methods[METHOD_actionPerformed3].setDisplayName ( "" );
            methods[METHOD_add4] = new MethodDescriptor(java.awt.Component.class.getMethod("add", new Class[] {java.awt.PopupMenu.class})); // NOI18N
            methods[METHOD_add4].setDisplayName ( "" );
            methods[METHOD_add5] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_add5].setDisplayName ( "" );
            methods[METHOD_add6] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.lang.String.class, java.awt.Component.class})); // NOI18N
            methods[METHOD_add6].setDisplayName ( "" );
            methods[METHOD_add7] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class, int.class})); // NOI18N
            methods[METHOD_add7].setDisplayName ( "" );
            methods[METHOD_add8] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_add8].setDisplayName ( "" );
            methods[METHOD_add9] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class, java.lang.Object.class, int.class})); // NOI18N
            methods[METHOD_add9].setDisplayName ( "" );
            methods[METHOD_addNotify10] = new MethodDescriptor(java.awt.Dialog.class.getMethod("addNotify", new Class[] {})); // NOI18N
            methods[METHOD_addNotify10].setDisplayName ( "" );
            methods[METHOD_addPropertyChangeListener11] = new MethodDescriptor(java.awt.Window.class.getMethod("addPropertyChangeListener", new Class[] {java.lang.String.class, java.beans.PropertyChangeListener.class})); // NOI18N
            methods[METHOD_addPropertyChangeListener11].setDisplayName ( "" );
            methods[METHOD_applyComponentOrientation12] = new MethodDescriptor(java.awt.Container.class.getMethod("applyComponentOrientation", new Class[] {java.awt.ComponentOrientation.class})); // NOI18N
            methods[METHOD_applyComponentOrientation12].setDisplayName ( "" );
            methods[METHOD_applyResourceBundle13] = new MethodDescriptor(java.awt.Window.class.getMethod("applyResourceBundle", new Class[] {java.util.ResourceBundle.class})); // NOI18N
            methods[METHOD_applyResourceBundle13].setDisplayName ( "" );
            methods[METHOD_applyResourceBundle14] = new MethodDescriptor(java.awt.Window.class.getMethod("applyResourceBundle", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_applyResourceBundle14].setDisplayName ( "" );
            methods[METHOD_areFocusTraversalKeysSet15] = new MethodDescriptor(java.awt.Container.class.getMethod("areFocusTraversalKeysSet", new Class[] {int.class})); // NOI18N
            methods[METHOD_areFocusTraversalKeysSet15].setDisplayName ( "" );
            methods[METHOD_bounds16] = new MethodDescriptor(java.awt.Component.class.getMethod("bounds", new Class[] {})); // NOI18N
            methods[METHOD_bounds16].setDisplayName ( "" );
            methods[METHOD_checkImage17] = new MethodDescriptor(java.awt.Component.class.getMethod("checkImage", new Class[] {java.awt.Image.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_checkImage17].setDisplayName ( "" );
            methods[METHOD_checkImage18] = new MethodDescriptor(java.awt.Component.class.getMethod("checkImage", new Class[] {java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_checkImage18].setDisplayName ( "" );
            methods[METHOD_contains19] = new MethodDescriptor(java.awt.Component.class.getMethod("contains", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_contains19].setDisplayName ( "" );
            methods[METHOD_contains20] = new MethodDescriptor(java.awt.Component.class.getMethod("contains", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_contains20].setDisplayName ( "" );
            methods[METHOD_countComponents21] = new MethodDescriptor(java.awt.Container.class.getMethod("countComponents", new Class[] {})); // NOI18N
            methods[METHOD_countComponents21].setDisplayName ( "" );
            methods[METHOD_createBufferStrategy22] = new MethodDescriptor(java.awt.Window.class.getMethod("createBufferStrategy", new Class[] {int.class})); // NOI18N
            methods[METHOD_createBufferStrategy22].setDisplayName ( "" );
            methods[METHOD_createBufferStrategy23] = new MethodDescriptor(java.awt.Window.class.getMethod("createBufferStrategy", new Class[] {int.class, java.awt.BufferCapabilities.class})); // NOI18N
            methods[METHOD_createBufferStrategy23].setDisplayName ( "" );
            methods[METHOD_createImage24] = new MethodDescriptor(java.awt.Component.class.getMethod("createImage", new Class[] {java.awt.image.ImageProducer.class})); // NOI18N
            methods[METHOD_createImage24].setDisplayName ( "" );
            methods[METHOD_createImage25] = new MethodDescriptor(java.awt.Component.class.getMethod("createImage", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_createImage25].setDisplayName ( "" );
            methods[METHOD_createVolatileImage26] = new MethodDescriptor(java.awt.Component.class.getMethod("createVolatileImage", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_createVolatileImage26].setDisplayName ( "" );
            methods[METHOD_createVolatileImage27] = new MethodDescriptor(java.awt.Component.class.getMethod("createVolatileImage", new Class[] {int.class, int.class, java.awt.ImageCapabilities.class})); // NOI18N
            methods[METHOD_createVolatileImage27].setDisplayName ( "" );
            methods[METHOD_deliverEvent28] = new MethodDescriptor(java.awt.Container.class.getMethod("deliverEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_deliverEvent28].setDisplayName ( "" );
            methods[METHOD_disable29] = new MethodDescriptor(java.awt.Component.class.getMethod("disable", new Class[] {})); // NOI18N
            methods[METHOD_disable29].setDisplayName ( "" );
            methods[METHOD_dispatchEvent30] = new MethodDescriptor(java.awt.Component.class.getMethod("dispatchEvent", new Class[] {java.awt.AWTEvent.class})); // NOI18N
            methods[METHOD_dispatchEvent30].setDisplayName ( "" );
            methods[METHOD_dispose31] = new MethodDescriptor(java.awt.Window.class.getMethod("dispose", new Class[] {})); // NOI18N
            methods[METHOD_dispose31].setDisplayName ( "" );
            methods[METHOD_doLayout32] = new MethodDescriptor(java.awt.Container.class.getMethod("doLayout", new Class[] {})); // NOI18N
            methods[METHOD_doLayout32].setDisplayName ( "" );
            methods[METHOD_enable33] = new MethodDescriptor(java.awt.Component.class.getMethod("enable", new Class[] {})); // NOI18N
            methods[METHOD_enable33].setDisplayName ( "" );
            methods[METHOD_enable34] = new MethodDescriptor(java.awt.Component.class.getMethod("enable", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_enable34].setDisplayName ( "" );
            methods[METHOD_enableInputMethods35] = new MethodDescriptor(java.awt.Component.class.getMethod("enableInputMethods", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_enableInputMethods35].setDisplayName ( "" );
            methods[METHOD_findComponentAt36] = new MethodDescriptor(java.awt.Container.class.getMethod("findComponentAt", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_findComponentAt36].setDisplayName ( "" );
            methods[METHOD_findComponentAt37] = new MethodDescriptor(java.awt.Container.class.getMethod("findComponentAt", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_findComponentAt37].setDisplayName ( "" );
            methods[METHOD_firePropertyChange38] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, byte.class, byte.class})); // NOI18N
            methods[METHOD_firePropertyChange38].setDisplayName ( "" );
            methods[METHOD_firePropertyChange39] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, char.class, char.class})); // NOI18N
            methods[METHOD_firePropertyChange39].setDisplayName ( "" );
            methods[METHOD_firePropertyChange40] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, short.class, short.class})); // NOI18N
            methods[METHOD_firePropertyChange40].setDisplayName ( "" );
            methods[METHOD_firePropertyChange41] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, long.class, long.class})); // NOI18N
            methods[METHOD_firePropertyChange41].setDisplayName ( "" );
            methods[METHOD_firePropertyChange42] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, float.class, float.class})); // NOI18N
            methods[METHOD_firePropertyChange42].setDisplayName ( "" );
            methods[METHOD_firePropertyChange43] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, double.class, double.class})); // NOI18N
            methods[METHOD_firePropertyChange43].setDisplayName ( "" );
            methods[METHOD_getBaseline44] = new MethodDescriptor(java.awt.Component.class.getMethod("getBaseline", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getBaseline44].setDisplayName ( "" );
            methods[METHOD_getBounds45] = new MethodDescriptor(java.awt.Component.class.getMethod("getBounds", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_getBounds45].setDisplayName ( "" );
            methods[METHOD_getComponentAt46] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentAt", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getComponentAt46].setDisplayName ( "" );
            methods[METHOD_getComponentAt47] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentAt", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_getComponentAt47].setDisplayName ( "" );
            methods[METHOD_getComponentZOrder48] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentZOrder", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_getComponentZOrder48].setDisplayName ( "" );
            methods[METHOD_getFontMetrics49] = new MethodDescriptor(java.awt.Component.class.getMethod("getFontMetrics", new Class[] {java.awt.Font.class})); // NOI18N
            methods[METHOD_getFontMetrics49].setDisplayName ( "" );
            methods[METHOD_getIconImages50] = new MethodDescriptor(java.awt.Window.class.getMethod("getIconImages", new Class[] {})); // NOI18N
            methods[METHOD_getIconImages50].setDisplayName ( "" );
            methods[METHOD_getListeners51] = new MethodDescriptor(java.awt.Window.class.getMethod("getListeners", new Class[] {java.lang.Class.class})); // NOI18N
            methods[METHOD_getListeners51].setDisplayName ( "" );
            methods[METHOD_getLocation52] = new MethodDescriptor(java.awt.Component.class.getMethod("getLocation", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_getLocation52].setDisplayName ( "" );
            methods[METHOD_getMousePosition53] = new MethodDescriptor(java.awt.Container.class.getMethod("getMousePosition", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_getMousePosition53].setDisplayName ( "" );
            methods[METHOD_getOwnerlessWindows54] = new MethodDescriptor(java.awt.Window.class.getMethod("getOwnerlessWindows", new Class[] {})); // NOI18N
            methods[METHOD_getOwnerlessWindows54].setDisplayName ( "" );
            methods[METHOD_getPropertyChangeListeners55] = new MethodDescriptor(java.awt.Component.class.getMethod("getPropertyChangeListeners", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_getPropertyChangeListeners55].setDisplayName ( "" );
            methods[METHOD_getSize56] = new MethodDescriptor(java.awt.Component.class.getMethod("getSize", new Class[] {java.awt.Dimension.class})); // NOI18N
            methods[METHOD_getSize56].setDisplayName ( "" );
            methods[METHOD_getWindows57] = new MethodDescriptor(java.awt.Window.class.getMethod("getWindows", new Class[] {})); // NOI18N
            methods[METHOD_getWindows57].setDisplayName ( "" );
            methods[METHOD_gotFocus58] = new MethodDescriptor(java.awt.Component.class.getMethod("gotFocus", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_gotFocus58].setDisplayName ( "" );
            methods[METHOD_handleEvent59] = new MethodDescriptor(java.awt.Component.class.getMethod("handleEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_handleEvent59].setDisplayName ( "" );
            methods[METHOD_hasFocus60] = new MethodDescriptor(java.awt.Component.class.getMethod("hasFocus", new Class[] {})); // NOI18N
            methods[METHOD_hasFocus60].setDisplayName ( "" );
            methods[METHOD_hide61] = new MethodDescriptor(java.awt.Dialog.class.getMethod("hide", new Class[] {})); // NOI18N
            methods[METHOD_hide61].setDisplayName ( "" );
            methods[METHOD_imageUpdate62] = new MethodDescriptor(java.awt.Component.class.getMethod("imageUpdate", new Class[] {java.awt.Image.class, int.class, int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_imageUpdate62].setDisplayName ( "" );
            methods[METHOD_insets63] = new MethodDescriptor(java.awt.Container.class.getMethod("insets", new Class[] {})); // NOI18N
            methods[METHOD_insets63].setDisplayName ( "" );
            methods[METHOD_inside64] = new MethodDescriptor(java.awt.Component.class.getMethod("inside", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_inside64].setDisplayName ( "" );
            methods[METHOD_invalidate65] = new MethodDescriptor(java.awt.Container.class.getMethod("invalidate", new Class[] {})); // NOI18N
            methods[METHOD_invalidate65].setDisplayName ( "" );
            methods[METHOD_isAncestorOf66] = new MethodDescriptor(java.awt.Container.class.getMethod("isAncestorOf", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_isAncestorOf66].setDisplayName ( "" );
            methods[METHOD_isDefaultLookAndFeelDecorated67] = new MethodDescriptor(javax.swing.JDialog.class.getMethod("isDefaultLookAndFeelDecorated", new Class[] {})); // NOI18N
            methods[METHOD_isDefaultLookAndFeelDecorated67].setDisplayName ( "" );
            methods[METHOD_isFocusCycleRoot68] = new MethodDescriptor(java.awt.Container.class.getMethod("isFocusCycleRoot", new Class[] {java.awt.Container.class})); // NOI18N
            methods[METHOD_isFocusCycleRoot68].setDisplayName ( "" );
            methods[METHOD_isFocusOwner69] = new MethodDescriptor(java.awt.Component.class.getMethod("isFocusOwner", new Class[] {})); // NOI18N
            methods[METHOD_isFocusOwner69].setDisplayName ( "" );
            methods[METHOD_keyDown70] = new MethodDescriptor(java.awt.Component.class.getMethod("keyDown", new Class[] {java.awt.Event.class, int.class})); // NOI18N
            methods[METHOD_keyDown70].setDisplayName ( "" );
            methods[METHOD_keyUp71] = new MethodDescriptor(java.awt.Component.class.getMethod("keyUp", new Class[] {java.awt.Event.class, int.class})); // NOI18N
            methods[METHOD_keyUp71].setDisplayName ( "" );
            methods[METHOD_layout72] = new MethodDescriptor(java.awt.Container.class.getMethod("layout", new Class[] {})); // NOI18N
            methods[METHOD_layout72].setDisplayName ( "" );
            methods[METHOD_list73] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {})); // NOI18N
            methods[METHOD_list73].setDisplayName ( "" );
            methods[METHOD_list74] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintStream.class})); // NOI18N
            methods[METHOD_list74].setDisplayName ( "" );
            methods[METHOD_list75] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintWriter.class})); // NOI18N
            methods[METHOD_list75].setDisplayName ( "" );
            methods[METHOD_list76] = new MethodDescriptor(java.awt.Container.class.getMethod("list", new Class[] {java.io.PrintStream.class, int.class})); // NOI18N
            methods[METHOD_list76].setDisplayName ( "" );
            methods[METHOD_list77] = new MethodDescriptor(java.awt.Container.class.getMethod("list", new Class[] {java.io.PrintWriter.class, int.class})); // NOI18N
            methods[METHOD_list77].setDisplayName ( "" );
            methods[METHOD_locate78] = new MethodDescriptor(java.awt.Container.class.getMethod("locate", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_locate78].setDisplayName ( "" );
            methods[METHOD_location79] = new MethodDescriptor(java.awt.Component.class.getMethod("location", new Class[] {})); // NOI18N
            methods[METHOD_location79].setDisplayName ( "" );
            methods[METHOD_lostFocus80] = new MethodDescriptor(java.awt.Component.class.getMethod("lostFocus", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_lostFocus80].setDisplayName ( "" );
            methods[METHOD_minimumSize81] = new MethodDescriptor(java.awt.Container.class.getMethod("minimumSize", new Class[] {})); // NOI18N
            methods[METHOD_minimumSize81].setDisplayName ( "" );
            methods[METHOD_mouseDown82] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseDown", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseDown82].setDisplayName ( "" );
            methods[METHOD_mouseDrag83] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseDrag", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseDrag83].setDisplayName ( "" );
            methods[METHOD_mouseEnter84] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseEnter", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseEnter84].setDisplayName ( "" );
            methods[METHOD_mouseExit85] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseExit", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseExit85].setDisplayName ( "" );
            methods[METHOD_mouseMove86] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseMove", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseMove86].setDisplayName ( "" );
            methods[METHOD_mouseUp87] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseUp", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseUp87].setDisplayName ( "" );
            methods[METHOD_move88] = new MethodDescriptor(java.awt.Component.class.getMethod("move", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_move88].setDisplayName ( "" );
            methods[METHOD_nextFocus89] = new MethodDescriptor(java.awt.Component.class.getMethod("nextFocus", new Class[] {})); // NOI18N
            methods[METHOD_nextFocus89].setDisplayName ( "" );
            methods[METHOD_pack90] = new MethodDescriptor(java.awt.Window.class.getMethod("pack", new Class[] {})); // NOI18N
            methods[METHOD_pack90].setDisplayName ( "" );
            methods[METHOD_paint91] = new MethodDescriptor(java.awt.Container.class.getMethod("paint", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paint91].setDisplayName ( "" );
            methods[METHOD_paintAll92] = new MethodDescriptor(java.awt.Component.class.getMethod("paintAll", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paintAll92].setDisplayName ( "" );
            methods[METHOD_paintComponents93] = new MethodDescriptor(java.awt.Container.class.getMethod("paintComponents", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paintComponents93].setDisplayName ( "" );
            methods[METHOD_postEvent94] = new MethodDescriptor(java.awt.Window.class.getMethod("postEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_postEvent94].setDisplayName ( "" );
            methods[METHOD_preferredSize95] = new MethodDescriptor(java.awt.Container.class.getMethod("preferredSize", new Class[] {})); // NOI18N
            methods[METHOD_preferredSize95].setDisplayName ( "" );
            methods[METHOD_prepareImage96] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_prepareImage96].setDisplayName ( "" );
            methods[METHOD_prepareImage97] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_prepareImage97].setDisplayName ( "" );
            methods[METHOD_print98] = new MethodDescriptor(java.awt.Container.class.getMethod("print", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_print98].setDisplayName ( "" );
            methods[METHOD_printAll99] = new MethodDescriptor(java.awt.Component.class.getMethod("printAll", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_printAll99].setDisplayName ( "" );
            methods[METHOD_printComponents100] = new MethodDescriptor(java.awt.Container.class.getMethod("printComponents", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_printComponents100].setDisplayName ( "" );
            methods[METHOD_remove101] = new MethodDescriptor(java.awt.Component.class.getMethod("remove", new Class[] {java.awt.MenuComponent.class})); // NOI18N
            methods[METHOD_remove101].setDisplayName ( "" );
            methods[METHOD_remove102] = new MethodDescriptor(java.awt.Container.class.getMethod("remove", new Class[] {int.class})); // NOI18N
            methods[METHOD_remove102].setDisplayName ( "" );
            methods[METHOD_remove103] = new MethodDescriptor(javax.swing.JDialog.class.getMethod("remove", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_remove103].setDisplayName ( "" );
            methods[METHOD_removeAll104] = new MethodDescriptor(java.awt.Container.class.getMethod("removeAll", new Class[] {})); // NOI18N
            methods[METHOD_removeAll104].setDisplayName ( "" );
            methods[METHOD_removeNotify105] = new MethodDescriptor(java.awt.Window.class.getMethod("removeNotify", new Class[] {})); // NOI18N
            methods[METHOD_removeNotify105].setDisplayName ( "" );
            methods[METHOD_removePropertyChangeListener106] = new MethodDescriptor(java.awt.Component.class.getMethod("removePropertyChangeListener", new Class[] {java.lang.String.class, java.beans.PropertyChangeListener.class})); // NOI18N
            methods[METHOD_removePropertyChangeListener106].setDisplayName ( "" );
            methods[METHOD_repaint107] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {})); // NOI18N
            methods[METHOD_repaint107].setDisplayName ( "" );
            methods[METHOD_repaint108] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {long.class})); // NOI18N
            methods[METHOD_repaint108].setDisplayName ( "" );
            methods[METHOD_repaint109] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_repaint109].setDisplayName ( "" );
            methods[METHOD_repaint110] = new MethodDescriptor(javax.swing.JDialog.class.getMethod("repaint", new Class[] {long.class, int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_repaint110].setDisplayName ( "" );
            methods[METHOD_requestFocus111] = new MethodDescriptor(java.awt.Component.class.getMethod("requestFocus", new Class[] {})); // NOI18N
            methods[METHOD_requestFocus111].setDisplayName ( "" );
            methods[METHOD_requestFocusInWindow112] = new MethodDescriptor(java.awt.Component.class.getMethod("requestFocusInWindow", new Class[] {})); // NOI18N
            methods[METHOD_requestFocusInWindow112].setDisplayName ( "" );
            methods[METHOD_reshape113] = new MethodDescriptor(java.awt.Window.class.getMethod("reshape", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_reshape113].setDisplayName ( "" );
            methods[METHOD_resize114] = new MethodDescriptor(java.awt.Component.class.getMethod("resize", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_resize114].setDisplayName ( "" );
            methods[METHOD_resize115] = new MethodDescriptor(java.awt.Component.class.getMethod("resize", new Class[] {java.awt.Dimension.class})); // NOI18N
            methods[METHOD_resize115].setDisplayName ( "" );
            methods[METHOD_setBounds116] = new MethodDescriptor(java.awt.Window.class.getMethod("setBounds", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_setBounds116].setDisplayName ( "" );
            methods[METHOD_setComponentZOrder117] = new MethodDescriptor(java.awt.Container.class.getMethod("setComponentZOrder", new Class[] {java.awt.Component.class, int.class})); // NOI18N
            methods[METHOD_setComponentZOrder117].setDisplayName ( "" );
            methods[METHOD_setDefaultLookAndFeelDecorated118] = new MethodDescriptor(javax.swing.JDialog.class.getMethod("setDefaultLookAndFeelDecorated", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_setDefaultLookAndFeelDecorated118].setDisplayName ( "" );
            methods[METHOD_setFocusTraversalKeys119] = new MethodDescriptor(java.awt.Container.class.getMethod("setFocusTraversalKeys", new Class[] {int.class, java.util.Set.class})); // NOI18N
            methods[METHOD_setFocusTraversalKeys119].setDisplayName ( "" );
            methods[METHOD_setFormSettings120] = new MethodDescriptor(sa.lib.gui.bean.SBeanOptionPicker.class.getMethod("setFormSettings", new Class[] {sa.lib.gui.SGuiClient.class, int.class})); // NOI18N
            methods[METHOD_setFormSettings120].setDisplayName ( "" );
            methods[METHOD_show121] = new MethodDescriptor(java.awt.Component.class.getMethod("show", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_show121].setDisplayName ( "" );
            methods[METHOD_show122] = new MethodDescriptor(java.awt.Dialog.class.getMethod("show", new Class[] {})); // NOI18N
            methods[METHOD_show122].setDisplayName ( "" );
            methods[METHOD_size123] = new MethodDescriptor(java.awt.Component.class.getMethod("size", new Class[] {})); // NOI18N
            methods[METHOD_size123].setDisplayName ( "" );
            methods[METHOD_toBack124] = new MethodDescriptor(java.awt.Dialog.class.getMethod("toBack", new Class[] {})); // NOI18N
            methods[METHOD_toBack124].setDisplayName ( "" );
            methods[METHOD_toFront125] = new MethodDescriptor(java.awt.Window.class.getMethod("toFront", new Class[] {})); // NOI18N
            methods[METHOD_toFront125].setDisplayName ( "" );
            methods[METHOD_toString126] = new MethodDescriptor(java.awt.Component.class.getMethod("toString", new Class[] {})); // NOI18N
            methods[METHOD_toString126].setDisplayName ( "" );
            methods[METHOD_transferFocus127] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocus", new Class[] {})); // NOI18N
            methods[METHOD_transferFocus127].setDisplayName ( "" );
            methods[METHOD_transferFocusBackward128] = new MethodDescriptor(java.awt.Container.class.getMethod("transferFocusBackward", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusBackward128].setDisplayName ( "" );
            methods[METHOD_transferFocusDownCycle129] = new MethodDescriptor(java.awt.Container.class.getMethod("transferFocusDownCycle", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusDownCycle129].setDisplayName ( "" );
            methods[METHOD_transferFocusUpCycle130] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocusUpCycle", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusUpCycle130].setDisplayName ( "" );
            methods[METHOD_update131] = new MethodDescriptor(javax.swing.JDialog.class.getMethod("update", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_update131].setDisplayName ( "" );
            methods[METHOD_validate132] = new MethodDescriptor(java.awt.Container.class.getMethod("validate", new Class[] {})); // NOI18N
            methods[METHOD_validate132].setDisplayName ( "" );
        }
        catch( Exception e) {}//GEN-HEADEREND:Methods

    // Here you can add code for customizing the methods array.

        return methods;     }//GEN-LAST:Methods

    private static java.awt.Image iconColor16 = null;//GEN-BEGIN:IconsDef
    private static java.awt.Image iconColor32 = null;
    private static java.awt.Image iconMono16 = null;
    private static java.awt.Image iconMono32 = null;//GEN-END:IconsDef
    private static String iconNameC16 = null;//GEN-BEGIN:Icons
    private static String iconNameC32 = null;
    private static String iconNameM16 = null;
    private static String iconNameM32 = null;//GEN-END:Icons

    private static final int defaultPropertyIndex = -1;//GEN-BEGIN:Idx
    private static final int defaultEventIndex = -1;//GEN-END:Idx


//GEN-FIRST:Superclass

    // Here you can add code for customizing the Superclass BeanInfo.

//GEN-LAST:Superclass

    /**
     * Gets the bean's <code>BeanDescriptor</code>s.
     *
     * @return BeanDescriptor describing the editable
     * properties of this bean.  May return null if the
     * information should be obtained by automatic analysis.
     */
    public BeanDescriptor getBeanDescriptor() {
	return getBdescriptor();
    }

    /**
     * Gets the bean's <code>PropertyDescriptor</code>s.
     *
     * @return An array of PropertyDescriptors describing the editable
     * properties supported by this bean.  May return null if the
     * information should be obtained by automatic analysis.
     * <p>
     * If a property is indexed, then its entry in the result array will
     * belong to the IndexedPropertyDescriptor subclass of PropertyDescriptor.
     * A client of getPropertyDescriptors can use "instanceof" to check
     * if a given PropertyDescriptor is an IndexedPropertyDescriptor.
     */
    public PropertyDescriptor[] getPropertyDescriptors() {
	return getPdescriptor();
    }

    /**
     * Gets the bean's <code>EventSetDescriptor</code>s.
     *
     * @return  An array of EventSetDescriptors describing the kinds of
     * events fired by this bean.  May return null if the information
     * should be obtained by automatic analysis.
     */
    public EventSetDescriptor[] getEventSetDescriptors() {
	return getEdescriptor();
    }

    /**
     * Gets the bean's <code>MethodDescriptor</code>s.
     *
     * @return  An array of MethodDescriptors describing the methods
     * implemented by this bean.  May return null if the information
     * should be obtained by automatic analysis.
     */
    public MethodDescriptor[] getMethodDescriptors() {
	return getMdescriptor();
    }

    /**
     * A bean may have a "default" property that is the property that will
     * mostly commonly be initially chosen for update by human's who are
     * customizing the bean.
     * @return  Index of default property in the PropertyDescriptor array
     * 		returned by getPropertyDescriptors.
     * <P>	Returns -1 if there is no default property.
     */
    public int getDefaultPropertyIndex() {
        return defaultPropertyIndex;
    }

    /**
     * A bean may have a "default" event that is the event that will
     * mostly commonly be used by human's when using the bean.
     * @return Index of default event in the EventSetDescriptor array
     *		returned by getEventSetDescriptors.
     * <P>	Returns -1 if there is no default event.
     */
    public int getDefaultEventIndex() {
        return defaultEventIndex;
    }

    /**
     * This method returns an image object that can be used to
     * represent the bean in toolboxes, toolbars, etc.   Icon images
     * will typically be GIFs, but may in future include other formats.
     * <p>
     * Beans aren't required to provide icons and may return null from
     * this method.
     * <p>
     * There are four possible flavors of icons (16x16 color,
     * 32x32 color, 16x16 mono, 32x32 mono).  If a bean choses to only
     * support a single icon we recommend supporting 16x16 color.
     * <p>
     * We recommend that icons have a "transparent" background
     * so they can be rendered onto an existing background.
     *
     * @param  iconKind  The kind of icon requested.  This should be
     *    one of the constant values ICON_COLOR_16x16, ICON_COLOR_32x32,
     *    ICON_MONO_16x16, or ICON_MONO_32x32.
     * @return  An image object representing the requested icon.  May
     *    return null if no suitable icon is available.
     */
    public java.awt.Image getIcon(int iconKind) {
        switch ( iconKind ) {
        case ICON_COLOR_16x16:
            if ( iconNameC16 == null )
                return null;
            else {
                if( iconColor16 == null )
                    iconColor16 = loadImage( iconNameC16 );
                return iconColor16;
            }
        case ICON_COLOR_32x32:
            if ( iconNameC32 == null )
                return null;
            else {
                if( iconColor32 == null )
                    iconColor32 = loadImage( iconNameC32 );
                return iconColor32;
            }
        case ICON_MONO_16x16:
            if ( iconNameM16 == null )
                return null;
            else {
                if( iconMono16 == null )
                    iconMono16 = loadImage( iconNameM16 );
                return iconMono16;
            }
        case ICON_MONO_32x32:
            if ( iconNameM32 == null )
                return null;
            else {
                if( iconMono32 == null )
                    iconMono32 = loadImage( iconNameM32 );
                return iconMono32;
            }
	default: return null;
        }
    }

}
