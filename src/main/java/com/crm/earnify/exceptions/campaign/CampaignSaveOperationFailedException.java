
package com.crm.earnify.exceptions.campaign;

/**
 *  @version     1.0, 21/2/16
 *  @author sandeepandey
 */

public class CampaignSaveOperationFailedException extends CampaignBasedException {

    //-----------------------------------------------------------------------------
    public CampaignSaveOperationFailedException() {
        super();
    }

    //-----------------------------------------------------------------------------
    public CampaignSaveOperationFailedException(String message) {
        super(message);
    }

    //-----------------------------------------------------------------------------
    public CampaignSaveOperationFailedException(String message, Throwable cause) {
        super(message, cause);
    }

    //-----------------------------------------------------------------------------
    public CampaignSaveOperationFailedException(Throwable cause) {
        super(cause);
    }

    //-----------------------------------------------------------------------------

}
