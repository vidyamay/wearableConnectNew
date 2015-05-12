package com.wc.core.ws;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/")
public class SetHealthData {

    @Path("/setHealthInfo")
    @Consumes(MediaType.APPLICATION_JSON)
    @POST
    public String setHealthInfo() {

        return "<html><body><p>Name=Vidya</p></body></html>";
    }
    
    @Path("/getHealthInfo")
    @GET
    public String getHealthInfo() {

        return "<html><body><p>Name=Vidya</p></body></html>";
    }

}
