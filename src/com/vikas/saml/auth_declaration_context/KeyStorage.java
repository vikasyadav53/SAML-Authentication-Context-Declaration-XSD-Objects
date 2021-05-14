package com.vikas.saml.auth_declaration_context;

public class KeyStorage
{
    private String medium;

    public String getMedium ()
    {
        return medium;
    }

    public void setMedium (String medium)
    {
        this.medium = medium;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [medium = "+medium+"]";
    }
}
