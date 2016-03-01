package com.crm.earnify.exceptions.campaign;

import com.crm.earnify.exceptions.EarnifyBasedException;

/**
 *  @version     1.0, 21/2/16
 *  @author sandeepandey
 */

public class CampaignBasedException extends EarnifyBasedException {

    //--------------------------------------------------------------

    public CampaignBasedException() {
        super();
    }

    //--------------------------------------------------------------
    public CampaignBasedException(String message) {
        super(message);
    }

    //--------------------------------------------------------------
    public CampaignBasedException(String message, Throwable cause) {
        super(message, cause);
    }

    //--------------------------------------------------------------
    public CampaignBasedException(Throwable cause) {
        super(cause);
    }
    //--------------------------------------------------------------

}
