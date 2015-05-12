package com.wc.core.ws;


public class HealthData {
    
    String userId;
    String data;
    
    public String getUserId() {
    
        return userId;
    }
    
    public void setUserId(String userId) {
    
        this.userId = userId;
    }
    
    public String getData() {
    
        return data;
    }
    
    public void setData(String data) {
    
        this.data = data;
    }
    
    @Override
    public String toString() {
        return "HealthData [userId=" + userId + ", data=" + data + "]";
    }
    

}
