package com.vikas.saml.auth_declaration_context;

public class Identification
{
    private String[] Extension;

    private String nym;

    private PhysicalVerification PhysicalVerification;

    private WrittenConsent WrittenConsent;

    private GoverningAgreements GoverningAgreements;

    public String[] getExtension ()
    {
        return Extension;
    }

    public void setExtension (String[] Extension)
    {
        this.Extension = Extension;
    }

    public String getNym ()
    {
        return nym;
    }

    public void setNym (String nym)
    {
        this.nym = nym;
    }

    public PhysicalVerification getPhysicalVerification ()
    {
        return PhysicalVerification;
    }

    public void setPhysicalVerification (PhysicalVerification PhysicalVerification)
    {
        this.PhysicalVerification = PhysicalVerification;
    }

    public WrittenConsent getWrittenConsent ()
    {
        return WrittenConsent;
    }

    public void setWrittenConsent (WrittenConsent WrittenConsent)
    {
        this.WrittenConsent = WrittenConsent;
    }

    public GoverningAgreements getGoverningAgreements ()
    {
        return GoverningAgreements;
    }

    public void setGoverningAgreements (GoverningAgreements GoverningAgreements)
    {
        this.GoverningAgreements = GoverningAgreements;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Extension = "+Extension+", nym = "+nym+", PhysicalVerification = "+PhysicalVerification+", WrittenConsent = "+WrittenConsent+", GoverningAgreements = "+GoverningAgreements+"]";
    }
}
