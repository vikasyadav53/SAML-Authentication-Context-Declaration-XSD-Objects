package com.vikas.saml.auth_declaration_context;

public class SharedSecretChallengeResponse
{
    private String[] Extension;

    private String method;

    public String[] getExtension ()
    {
        return Extension;
    }

    public void setExtension (String[] Extension)
    {
        this.Extension = Extension;
    }

    public String getMethod ()
    {
        return method;
    }

    public void setMethod (String method)
    {
        this.method = method;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Extension = "+Extension+", method = "+method+"]";
    }
}
