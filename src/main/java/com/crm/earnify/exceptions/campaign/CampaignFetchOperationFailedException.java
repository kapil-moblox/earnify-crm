package com.crm.earnify.exceptions.campaign;
/**
 *  @version     1.0, 21/2/16
 *  @author sandeepandey
 */

public class CampaignFetchOperationFailedException extends CampaignBasedException  {

    //--------------------------------------------------------------

    public CampaignFetchOperationFailedException() {
        super();
    }

    //--------------------------------------------------------------
    public CampaignFetchOperationFailedException(String message) {
        super(message);
    }

    //--------------------------------------------------------------
    public CampaignFetchOperationFailedException(String message, Throwable cause) {
        super(message, cause);
    }

    //--------------------------------------------------------------
    public CampaignFetchOperationFailedException(Throwable cause) {
        super(cause);
    }
    //--------------------------------------------------------------

}
