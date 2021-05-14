package com.vikas.saml.auth_declaration_context;

public class KeyActivation
{
    private String[] Extension;

    private ActivationPin ActivationPin;

    public String[] getExtension ()
    {
        return Extension;
    }

    public void setExtension (String[] Extension)
    {
        this.Extension = Extension;
    }

    public ActivationPin getActivationPin ()
    {
        return ActivationPin;
    }

    public void setActivationPin (ActivationPin ActivationPin)
    {
        this.ActivationPin = ActivationPin;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Extension = "+Extension+", ActivationPin = "+ActivationPin+"]";
    }
}
