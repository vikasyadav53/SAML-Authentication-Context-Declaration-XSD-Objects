package com.vikas.saml.auth_declaration_context;

public class AuthenticationContextDeclaration
{
    private String[] Extension;

    private AuthnMethod AuthnMethod;

    private TechnicalProtection TechnicalProtection;

    private OperationalProtection OperationalProtection;

    private Identification Identification;

    private String ID;

    private GoverningAgreements GoverningAgreements;

    public String[] getExtension ()
    {
        return Extension;
    }

    public void setExtension (String[] Extension)
    {
        this.Extension = Extension;
    }

    public AuthnMethod getAuthnMethod ()
    {
        return AuthnMethod;
    }

    public void setAuthnMethod (AuthnMethod AuthnMethod)
    {
        this.AuthnMethod = AuthnMethod;
    }

    public TechnicalProtection getTechnicalProtection ()
    {
        return TechnicalProtection;
    }

    public void setTechnicalProtection (TechnicalProtection TechnicalProtection)
    {
        this.TechnicalProtection = TechnicalProtection;
    }

    public OperationalProtection getOperationalProtection ()
    {
        return OperationalProtection;
    }

    public void setOperationalProtection (OperationalProtection OperationalProtection)
    {
        this.OperationalProtection = OperationalProtection;
    }

    public Identification getIdentification ()
    {
        return Identification;
    }

    public void setIdentification (Identification Identification)
    {
        this.Identification = Identification;
    }

    public String getID ()
    {
        return ID;
    }

    public void setID (String ID)
    {
        this.ID = ID;
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
        return "ClassPojo [Extension = "+Extension+", AuthnMethod = "+AuthnMethod+", TechnicalProtection = "+TechnicalProtection+", OperationalProtection = "+OperationalProtection+", Identification = "+Identification+", ID = "+ID+", GoverningAgreements = "+GoverningAgreements+"]";
    }
}
