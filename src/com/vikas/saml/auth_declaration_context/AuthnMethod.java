package com.vikas.saml.auth_declaration_context;

public class AuthnMethod
{
    private String[] Extension;

    private AuthenticatorTransportProtocol AuthenticatorTransportProtocol;

    private PrincipalAuthenticationMechanism PrincipalAuthenticationMechanism;

    private Authenticator Authenticator;

    public String[] getExtension ()
    {
        return Extension;
    }

    public void setExtension (String[] Extension)
    {
        this.Extension = Extension;
    }

    public AuthenticatorTransportProtocol getAuthenticatorTransportProtocol ()
    {
        return AuthenticatorTransportProtocol;
    }

    public void setAuthenticatorTransportProtocol (AuthenticatorTransportProtocol AuthenticatorTransportProtocol)
    {
        this.AuthenticatorTransportProtocol = AuthenticatorTransportProtocol;
    }

    public PrincipalAuthenticationMechanism getPrincipalAuthenticationMechanism ()
    {
        return PrincipalAuthenticationMechanism;
    }

    public void setPrincipalAuthenticationMechanism (PrincipalAuthenticationMechanism PrincipalAuthenticationMechanism)
    {
        this.PrincipalAuthenticationMechanism = PrincipalAuthenticationMechanism;
    }

    public Authenticator getAuthenticator ()
    {
        return Authenticator;
    }

    public void setAuthenticator (Authenticator Authenticator)
    {
        this.Authenticator = Authenticator;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Extension = "+Extension+", AuthenticatorTransportProtocol = "+AuthenticatorTransportProtocol+", PrincipalAuthenticationMechanism = "+PrincipalAuthenticationMechanism+", Authenticator = "+Authenticator+"]";
    }
}
