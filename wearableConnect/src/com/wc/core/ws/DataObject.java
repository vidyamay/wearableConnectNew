package com.wc.core.ws;

public class DataObject {

    String dataType;

    String value;

    String deviceName;

    String deviceId;

    public DataObject() {

    }

    public DataObject(String dataType, String value, String deviceName,
                      String deviceId) {

        this.dataType = dataType;
        this.value = value;
        this.deviceName = deviceName;
        this.deviceId = deviceId;
    }

    public String getDataType() {

        return dataType;
    }

    public void setDataType(String dataType) {

        this.dataType = dataType;
    }

    public String getValue() {

        return value;
    }

    public void setValue(String value) {

        this.value = value;
    }

    public String getDeviceName() {

        return deviceName;
    }

    public void setDeviceName(String deviceName) {

        this.deviceName = deviceName;
    }

    public String getDeviceId() {

        return deviceId;
    }

    public void setDeviceId(String deviceId) {

        this.deviceId = deviceId;
    }

    public String toString() {

        return "Data [ dataType :" + dataType + " value : " + value
            + " deviceName : " + deviceName + " deviceId : " + deviceId + "] ";
    }

}
