package com.vikas.saml.auth_declaration_context;

public class TechnicalProtection
{
    private SecretKeyProtection SecretKeyProtection;

    private String[] Extension;

    public SecretKeyProtection getSecretKeyProtection ()
    {
        return SecretKeyProtection;
    }

    public void setSecretKeyProtection (SecretKeyProtection SecretKeyProtection)
    {
        this.SecretKeyProtection = SecretKeyProtection;
    }

    public String[] getExtension ()
    {
        return Extension;
    }

    public void setExtension (String[] Extension)
    {
        this.Extension = Extension;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [SecretKeyProtection = "+SecretKeyProtection+", Extension = "+Extension+"]";
    }
}
