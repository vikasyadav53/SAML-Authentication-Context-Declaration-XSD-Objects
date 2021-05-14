package com.vikas.saml.auth_declaration_context;

public class Password
{
    private Alphabet Alphabet;

    private String[] Extension;

    private Generation Generation;

    private Length Length;

    private String ExternalVerification;

    public Alphabet getAlphabet ()
    {
        return Alphabet;
    }

    public void setAlphabet (Alphabet Alphabet)
    {
        this.Alphabet = Alphabet;
    }

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
        return "ClassPojo [Alphabet = "+Alphabet+", Extension = "+Extension+", Generation = "+Generation+", Length = "+Length+", ExternalVerification = "+ExternalVerification+"]";
    }
}
