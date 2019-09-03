package com.workflow.demo.util.mail;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

/**
 * @Author: Elvis
 * @Date: 2019/9/3 23:17
 */
public class MyAuthenticator extends Authenticator {

    String userName=null;
    String password=null;

    public MyAuthenticator(){
    }
    public MyAuthenticator(String username, String password) {
        this.userName = username;
        this.password = password;
    }
    protected PasswordAuthentication getPasswordAuthentication(){
        return new PasswordAuthentication(userName, password);
    }
}
