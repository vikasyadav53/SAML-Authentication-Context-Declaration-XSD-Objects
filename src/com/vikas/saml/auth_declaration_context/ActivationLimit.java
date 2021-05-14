package com.vikas.saml.auth_declaration_context;

public class ActivationLimit
{
    private String ActivationLimitSession;

    public String getActivationLimitSession ()
    {
        return ActivationLimitSession;
    }

    public void setActivationLimitSession (String ActivationLimitSession)
    {
        this.ActivationLimitSession = ActivationLimitSession;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [ActivationLimitSession = "+ActivationLimitSession+"]";
    }
}