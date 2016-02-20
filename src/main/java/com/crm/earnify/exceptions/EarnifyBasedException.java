/*  Copyright 2016 Jasper Infotech (P) Limited . All Rights Reserved.
*  JASPER INFOTECH PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
*/
package com.crm.earnify.exceptions;

/**
 * @author sandeepandey
 * @version 1.0, 8/2/16
 */
public class EarnifyBasedException extends RuntimeException {
    public EarnifyBasedException() {
        super();
    }

    public EarnifyBasedException(String message) {
        super(message);
    }

    public EarnifyBasedException(String message, Throwable cause) {
        super(message, cause);
    }

    public EarnifyBasedException(Throwable cause) {
        super(cause);
    }
}
