/*  Copyright 2016 Jasper Infotech (P) Limited . All Rights Reserved.
 *  JASPER INFOTECH PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
*/  
package com.crm.earnify.exceptions; /**
 *  @version     1.0, 21/2/16
 *  @author sandeepandey
 */

public class TransformerBasedException extends EarnifyBasedException {


    //-------------------------------------------------------------

    /**
     *
     */
    public TransformerBasedException() {
        super();
    }

    //--------------------------------------------------------------

    /**
     *
     * @param message
     */
    public TransformerBasedException(String message) {
        super(message);
    }

    //---------------------------------------------------------------

    /**
     *
     * @param message
     * @param cause
     */
    public TransformerBasedException(String message, Throwable cause) {
        super(message, cause);
    }

    //----------------------------------------------------------------

    /**
     *
     * @param cause
     */
    public TransformerBasedException(Throwable cause) {
        super(cause);
    }

    //------------------------------------------------------------------

}
