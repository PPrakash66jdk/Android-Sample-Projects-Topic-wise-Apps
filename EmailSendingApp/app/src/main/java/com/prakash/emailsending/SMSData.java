package com.prakash.emailsending;

import java.lang.String;
/**
 * Created by PRAKASH on 7/2/2016.
 */
public class SMSData {

    public String getSenderNum() {
        return senderNum;
    }

    public void setSenderNum(String senderNum) {
        this.senderNum = senderNum;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    String senderNum;
    String message;




}
