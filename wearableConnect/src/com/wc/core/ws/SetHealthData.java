package com.wc.core.ws;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.json.JSONException;
import org.json.JSONObject;

@Path("wc")
public class SetHealthData {

    @Path("setHealthInfo")
    @Consumes(MediaType.APPLICATION_JSON)
    @POST
    public String setHealthInfo(JSONObject inputJObj) {
        System.out.println("Inside setHealthInfo...");
        String userId = null;
        try {
            userId = (String) inputJObj.get("userId");       
            System.out.println("userId>> " + userId);
            
            
        } catch (JSONException e) {
            System.out.println("Parsing error, wrong input!!");
            e.printStackTrace();
        }
       
        return "<html><body><p>userId: " + userId + "</p></body></html>";
    }
    
    @Path("getHealthInfo")
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String getHealthInfo() {
        System.out.println("Inside getHealthInfo...");
        return "<html><body><p>Name=Vidya</p></body></html>";
    }

}
