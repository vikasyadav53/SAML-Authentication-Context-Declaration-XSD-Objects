package com.vikas.saml.auth_declaration_context;

public class PrincipalAuthenticationMechanism
{
    private String[] Extension;

    private String preauth;

    private RestrictedPassword RestrictedPassword;

    private Token Token;

    private ActivationPin ActivationPin;

    private Password Password;

    private Smartcard Smartcard;

    public String[] getExtension ()
    {
        return Extension;
    }

    public void setExtension (String[] Extension)
    {
        this.Extension = Extension;
    }

    public String getPreauth ()
    {
        return preauth;
    }

    public void setPreauth (String preauth)
    {
        this.preauth = preauth;
    }

    public RestrictedPassword getRestrictedPassword ()
    {
        return RestrictedPassword;
    }

    public void setRestrictedPassword (RestrictedPassword RestrictedPassword)
    {
        this.RestrictedPassword = RestrictedPassword;
    }

    public Token getToken ()
    {
        return Token;
    }

    public void setToken (Token Token)
    {
        this.Token = Token;
    }

    public ActivationPin getActivationPin ()
    {
        return ActivationPin;
    }

    public void setActivationPin (ActivationPin ActivationPin)
    {
        this.ActivationPin = ActivationPin;
    }

    public Password getPassword ()
    {
        return Password;
    }

    public void setPassword (Password Password)
    {
        this.Password = Password;
    }

    public Smartcard getSmartcard ()
    {
        return Smartcard;
    }

    public void setSmartcard (Smartcard Smartcard)
    {
        this.Smartcard = Smartcard;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Extension = "+Extension+", preauth = "+preauth+", RestrictedPassword = "+RestrictedPassword+", Token = "+Token+", ActivationPin = "+ActivationPin+", Password = "+Password+", Smartcard = "+Smartcard+"]";
    }
}
