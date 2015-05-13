package com.wc.core.ws;

import java.util.List;

public class HealthData {

    public String userId;

    public List<DataObject> data;

    public String getUserId() {

        return userId;
    }

    public void setUserId(String userId) {

        this.userId = userId;
    }

    public List<DataObject> getData() {

        return data;
    }

    public void setData(List<DataObject> data) {

        this.data = data;
    }

    @Override
    public String toString() {

        return "HealthData [userId=" + userId + ", data=" + data + "]";
    }

}
