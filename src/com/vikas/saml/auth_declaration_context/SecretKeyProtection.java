package com.vikas.saml.auth_declaration_context;

public class SecretKeyProtection
{
    private String[] Extension;

    private KeyStorage KeyStorage;

    private KeyActivation KeyActivation;

    public String[] getExtension ()
    {
        return Extension;
    }

    public void setExtension (String[] Extension)
    {
        this.Extension = Extension;
    }

    public KeyStorage getKeyStorage ()
    {
        return KeyStorage;
    }

    public void setKeyStorage (KeyStorage KeyStorage)
    {
        this.KeyStorage = KeyStorage;
    }

    public KeyActivation getKeyActivation ()
    {
        return KeyActivation;
    }

    public void setKeyActivation (KeyActivation KeyActivation)
    {
        this.KeyActivation = KeyActivation;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Extension = "+Extension+", KeyStorage = "+KeyStorage+", KeyActivation = "+KeyActivation+"]";
    }
}