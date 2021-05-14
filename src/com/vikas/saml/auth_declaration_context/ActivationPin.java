package com.vikas.saml.auth_declaration_context;

public class ActivationPin
{
    private Alphabet Alphabet;

    private String[] Extension;

    private Generation Generation;

    private Length Length;

    private ActivationLimit ActivationLimit;

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

    public ActivationLimit getActivationLimit ()
    {
        return ActivationLimit;
    }

    public void setActivationLimit (ActivationLimit ActivationLimit)
    {
        this.ActivationLimit = ActivationLimit;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Alphabet = "+Alphabet+", Extension = "+Extension+", Generation = "+Generation+", Length = "+Length+", ActivationLimit = "+ActivationLimit+"]";
    }
}
