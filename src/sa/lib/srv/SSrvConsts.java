/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sa.lib.srv;

/**
 *
 * @author Sergio Flores
 */
public abstract class SSrvConsts {

    public static final int RESP_TYPE_OK = 1;
    public static final int RESP_TYPE_ERROR = 2;

    public static final int LOCK_GAINED = 1;
    public static final int LOCK_GAIN_DENIED = 2;
    public static final int LOCK_RECOVERED = 3;
    public static final int LOCK_RECOVER_DENIED = 4;
    public static final int LOCK_ST_ALIVE = 5;
    public static final int LOCK_ST_EXPIRED = 6;

    public static final int REQ_LOCK_GAIN = 1310;
    public static final int REQ_LOCK_RECOVER = 1320;
    public static final int REQ_LOCK_STATUS = 1330;
    public static final int REQ_LOCK_RELEASE = 1340;

    public static final java.lang.String MSG_ERR_LOCK_ON_EVALUATE = "Error al evaluar el acceso exclusivo al registro.";
    public static final java.lang.String MSG_ERR_LOCK_ON_VERIFY = "Error al verificar el acceso exclusivo al registro.";
    public static final java.lang.String MSG_ERR_LOCK_GAIN_DENIED = "No fue posible obtener el acceso exclusivo al registro.\nEstá siendo utilizado por el usuario: ";
    public static final java.lang.String MSG_ERR_LOCK_RECOVER_DENIED = "No fue posible recuperar el acceso exclusivo al registro.\nEstá siendo utilizado por el usuario: ";
    public static final java.lang.String MSG_ERR_COMMAND_HELP = "Type command 'help' for more information.";
    public static final java.lang.String MSG_ERR_COMMAND_UNKNOWN = "Error: Unknown command! " + MSG_ERR_COMMAND_HELP;
    public static final java.lang.String MSG_ERR_COMMAND_SYNTAX = "Error: Invalid syntax! " + MSG_ERR_COMMAND_HELP;
}
