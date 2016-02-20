/*  Copyright 2016 Jasper Infotech (P) Limited . All Rights Reserved.
 *  JASPER INFOTECH PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
*/
package com.crm.earnify.test; /**
 *  @version 1.0, 10/2/16
 *  @author sandeepandey
 */

//import org.apache.commons.httpclient.HttpClient;
//import org.apache.commons.httpclient.HttpException;
//import org.apache.commons.httpclient.methods.PostMethod;
//import org.apache.commons.httpclient.methods.multipart.FilePart;
//import org.apache.commons.httpclient.methods.multipart.MultipartRequestEntity;
//import org.apache.commons.httpclient.methods.multipart.Part;
//import org.apache.commons.httpclient.methods.multipart.StringPart;
//
//import java.io.File;
//import java.io.IOException;
//
//public class SmsGupShupTest {
//    public static void main(String[] args) throws HttpException, IOException {
//        try {
//            HttpClient client = new HttpClient();
//            PostMethod method = new PostMethod("http://enterprise.smsgupshup.com/GatewayAPI/rest");
//
//            File f = new File("/home/sandeep/phone.csv");
//            Part[] parts = {
//                    new StringPart("method", "xlsUpload"),
//                    new StringPart("userid", "2000153235"),
//                    new StringPart("password", "abc123"),
//                    new StringPart("filetype", "csv"),
//                    new StringPart("v", "1.1"),
//                    new StringPart("auth_scheme", "PLAIN"),
//                    new FilePart(f.getName(), f) };
//
//            method.setRequestEntity(new MultipartRequestEntity(parts, method.getParams()));
//            int statusCode = client.executeMethod(method);
//            System.out.println(statusCode);
//        } catch (Exception e) {
//
//        }
//    }
//}

