package com.wc.core.ws;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("wc")
public class SetHealthData {

    @Path("setHealthInfo")
    @Consumes(MediaType.APPLICATION_JSON)
    @POST
    public String setHealthInfo(HealthData inputObj) {
        System.out.println("Inside setHealthInfo...");
        String userId = null;
        try {
           userId = inputObj.getUserId();       
            System.out.println("userId>> " + userId);
            List<DataObject> data = inputObj.getData();
            System.out.println("data len>> " + data.size());
            if(data.size()>0){                
                System.out.println("First data value is :::" + data.get(0));
            }
            
        } catch (Exception e) {
         
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
