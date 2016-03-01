package com.crm.earnify.exceptions.campaign;
/**
 *  @version     1.0, 21/2/16
 *  @author sandeepandey
 */

public class CampaignDeleteOperationFailedException extends CampaignBasedException {

    //--------------------------------------------------------------
    public CampaignDeleteOperationFailedException() {
        super();
    }

    //--------------------------------------------------------------
    public CampaignDeleteOperationFailedException(String message) {
        super(message);
    }

    //--------------------------------------------------------------
    public CampaignDeleteOperationFailedException(String message, Throwable cause) {
        super(message, cause);
    }

    //--------------------------------------------------------------
    public CampaignDeleteOperationFailedException(Throwable cause) {
        super(cause);
    }
    //--------------------------------------------------------------
}
