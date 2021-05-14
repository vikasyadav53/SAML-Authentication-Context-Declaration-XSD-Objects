package com.vikas.saml.auth_declaration_context;

public class TimeSyncToken
{
    private String DeviceType;

    private String DeviceInHand;

    private String SeedLength;

    public String getDeviceType ()
    {
        return DeviceType;
    }

    public void setDeviceType (String DeviceType)
    {
        this.DeviceType = DeviceType;
    }

    public String getDeviceInHand ()
    {
        return DeviceInHand;
    }

    public void setDeviceInHand (String DeviceInHand)
    {
        this.DeviceInHand = DeviceInHand;
    }

    public String getSeedLength ()
    {
        return SeedLength;
    }

    public void setSeedLength (String SeedLength)
    {
        this.SeedLength = SeedLength;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [DeviceType = "+DeviceType+", DeviceInHand = "+DeviceInHand+", SeedLength = "+SeedLength+"]";
    }
}