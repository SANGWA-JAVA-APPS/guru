/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeguru_base.util;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 *
 * @author HP
 */
@NoArgsConstructor
@Getter
public class SendSmsTermil {

    public SendSmsTermil(String number, String smsBody) {
        sendSms("25" + number, smsBody);
    }


    public void sendSms(String number, String smsBody) {
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpPost post = new HttpPost("https://api.ng.termii.com/api/sms/send");
            post.setHeader("Content-Type", "application/json");

            String sms = "{\"to\":\"25" + number + "\",\"from\": \"dsd.clinic\","
                    + "\"sms\": \"" + smsBody + "\","
                    + "\"type\": \"plain\",\"channel\": \"generic\","
                    + "\"api_key\":\"TLDeHpL3OoEAdWlOMYeeZs85fCbK905L2rpmvDM0Je8EXVFAdcVLcKKg5OFiwG\"}";
            String json = sms;
            StringEntity entity = new StringEntity(json);
            post.setEntity(entity);

            try (CloseableHttpResponse response = httpClient.execute(post)) {
                String responseString = EntityUtils.toString(response.getEntity(), "UTF-8");
                System.out.println("Response: " + responseString);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
