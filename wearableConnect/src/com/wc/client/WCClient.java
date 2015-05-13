package com.wc.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class WCClient {

    public static void main(String[] args) throws Exception {

        // httpcall();
        jerseyCall();

    }

    public static void httpcall() throws Exception {

        URL url =
            new URL("https://wearableconnectnew.herokuapp.com/wc/setHealthInfo");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setDoOutput(true);
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Type", "application/json");

        // String input = "{\"qty\":100,\"name\":\"iPad 4\"}";

        String input = "{\"userId\":\"1234\",\"data\": \"SPO2\"}";

        OutputStream os = conn.getOutputStream();
        os.write(input.getBytes());
        os.flush();

        System.out.println(conn.getResponseCode());
        System.out.println(conn.getResponseMessage());
        /*
         * if (conn.getResponseCode() != HttpURLConnection.HTTP_CREATED) { throw new
         * RuntimeException("Failed : HTTP error code : " + conn.getResponseCode()); }
         */

        BufferedReader br =
            new BufferedReader(new InputStreamReader((conn.getInputStream())));

        String output;
        System.out.println("Output from Server .... \n");
        while ((output = br.readLine()) != null) {
            System.out.println(output);
        }

        conn.disconnect();
    }

    public static void jerseyCall() {

        Client client = Client.create();
        WebResource webResource =
            client
                .resource("https://wearableconnectnew.herokuapp.com/wc/setHealthInfo");
        String input =
            "{\"userId\":\"1234\",\"data\":[{\"dataType\": \"SPO2\" , \"value\" : \"90\",\"deviceName\" : \"fitbit\", \"deviceId\":\"123\"},"
                + "{\"dataType\": \"HeartRate\" , \"value\" : \"70\",\"deviceName\" : \"fitbit\", \"deviceId\":\"123\"}]}";

        ClientResponse response =
            webResource.type("application/json").post(ClientResponse.class,
                input);

        System.out.println("response.getStatus() >> " + response.getStatus());
        System.out.println("Output from Server .... \n");
        String output = response.getEntity(String.class);
        System.out.println(output);
    }

}
