package com.vikas.saml.auth_declaration_context;

public class AuthenticatorTransportProtocol
{
    private String[] Extension;

    private ISDN ISDN;

    public String[] getExtension ()
    {
        return Extension;
    }

    public void setExtension (String[] Extension)
    {
        this.Extension = Extension;
    }

    public ISDN getISDN ()
    {
        return ISDN;
    }

    public void setISDN (ISDN ISDN)
    {
        this.ISDN = ISDN;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Extension = "+Extension+", ISDN = "+ISDN+"]";
    }
}