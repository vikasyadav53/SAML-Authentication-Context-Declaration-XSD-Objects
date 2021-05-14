package com.vikas.saml.auth_declaration_context;

public class GoverningAgreements
{
    private GoverningAgreementRef[] GoverningAgreementRef;

    public GoverningAgreementRef[] getGoverningAgreementRef ()
    {
        return GoverningAgreementRef;
    }

    public void setGoverningAgreementRef (GoverningAgreementRef[] GoverningAgreementRef)
    {
        this.GoverningAgreementRef = GoverningAgreementRef;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [GoverningAgreementRef = "+GoverningAgreementRef+"]";
    }
}
