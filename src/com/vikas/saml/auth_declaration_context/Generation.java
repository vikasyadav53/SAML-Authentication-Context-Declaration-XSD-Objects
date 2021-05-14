package com.vikas.saml.auth_declaration_context;

public class Generation
{
    private String mechanism;

    public String getMechanism ()
    {
        return mechanism;
    }

    public void setMechanism (String mechanism)
    {
        this.mechanism = mechanism;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [mechanism = "+mechanism+"]";
    }
}
