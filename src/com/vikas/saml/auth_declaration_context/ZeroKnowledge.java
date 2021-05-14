package com.vikas.saml.auth_declaration_context;

public class ZeroKnowledge
{
    private String[] Extension;

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
        return "ClassPojo [Extension = "+Extension+"]";
    }
}
