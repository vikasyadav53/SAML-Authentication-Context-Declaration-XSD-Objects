package com.vikas.saml.auth_declaration_context;

public class Token
{
    private String[] Extension;

    private TimeSyncToken TimeSyncToken;

    public String[] getExtension ()
    {
        return Extension;
    }

    public void setExtension (String[] Extension)
    {
        this.Extension = Extension;
    }

    public TimeSyncToken getTimeSyncToken ()
    {
        return TimeSyncToken;
    }

    public void setTimeSyncToken (TimeSyncToken TimeSyncToken)
    {
        this.TimeSyncToken = TimeSyncToken;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Extension = "+Extension+", TimeSyncToken = "+TimeSyncToken+"]";
    }
}
