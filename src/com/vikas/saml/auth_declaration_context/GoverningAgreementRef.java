package com.vikas.saml.auth_declaration_context;

public class GoverningAgreementRef
{
    private String governingAgreementRef;

    public String getGoverningAgreementRef ()
    {
        return governingAgreementRef;
    }

    public void setGoverningAgreementRef (String governingAgreementRef)
    {
        this.governingAgreementRef = governingAgreementRef;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [governingAgreementRef = "+governingAgreementRef+"]";
    }
}
