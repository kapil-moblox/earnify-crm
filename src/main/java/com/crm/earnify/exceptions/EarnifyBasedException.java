package com.crm.earnify.exceptions;

/**
 * @author sandeepandey
 * @version 1.0, 8/2/16
 */
public class EarnifyBasedException extends RuntimeException {

    //-------------------------------------------------------------

    /**
     *
     */
    public EarnifyBasedException() {
        super();
    }

    //--------------------------------------------------------------

    /**
     *
     * @param message
     */
    public EarnifyBasedException(String message) {
        super(message);
    }

    //---------------------------------------------------------------

    /**
     *
     * @param message
     * @param cause
     */
    public EarnifyBasedException(String message, Throwable cause) {
        super(message, cause);
    }

    //----------------------------------------------------------------

    /**
     *
     * @param cause
     */
    public EarnifyBasedException(Throwable cause) {
        super(cause);
    }

    //------------------------------------------------------------------

}
