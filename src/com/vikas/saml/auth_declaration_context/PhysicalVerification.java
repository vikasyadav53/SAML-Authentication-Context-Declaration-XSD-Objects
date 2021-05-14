package com.vikas.saml.auth_declaration_context;

public class PhysicalVerification
{
    private String credentialLevel;

    public String getCredentialLevel ()
    {
        return credentialLevel;
    }

    public void setCredentialLevel (String credentialLevel)
    {
        this.credentialLevel = credentialLevel;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [credentialLevel = "+credentialLevel+"]";
    }
}
