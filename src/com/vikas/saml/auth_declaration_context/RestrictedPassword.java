package com.vikas.saml.auth_declaration_context;

public class RestrictedPassword
{
    private String[] Extension;

    private Generation Generation;

    private Length Length;

    private String ExternalVerification;

    public String[] getExtension ()
    {
        return Extension;
    }

    public void setExtension (String[] Extension)
    {
        this.Extension = Extension;
    }

    public Generation getGeneration ()
    {
        return Generation;
    }

    public void setGeneration (Generation Generation)
    {
        this.Generation = Generation;
    }

    public Length getLength ()
    {
        return Length;
    }

    public void setLength (Length Length)
    {
        this.Length = Length;
    }

    public String getExternalVerification ()
    {
        return ExternalVerification;
    }

    public void setExternalVerification (String ExternalVerification)
    {
        this.ExternalVerification = ExternalVerification;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Extension = "+Extension+", Generation = "+Generation+", Length = "+Length+", ExternalVerification = "+ExternalVerification+"]";
    }
}
