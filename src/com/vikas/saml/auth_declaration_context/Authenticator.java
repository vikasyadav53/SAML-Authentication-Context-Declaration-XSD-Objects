package com.vikas.saml.auth_declaration_context;

public class Authenticator
{
    private AsymmetricDecryption AsymmetricDecryption;

    private SharedSecretDynamicPlaintext SharedSecretDynamicPlaintext;

    private SharedSecretChallengeResponse SharedSecretChallengeResponse;

    private DigSig DigSig;

    private String[] Extension;

    private RestrictedPassword RestrictedPassword;

    private ResumeSession ResumeSession;

    private PreviousSession PreviousSession;

    private SubscriberLineNumber[] SubscriberLineNumber;

    private IPAddress IPAddress;

    private UserSuffix UserSuffix;

    private AsymmetricKeyAgreement AsymmetricKeyAgreement;

    private Password Password;

    private ZeroKnowledge ZeroKnowledge;

    public AsymmetricDecryption getAsymmetricDecryption ()
    {
        return AsymmetricDecryption;
    }

    public void setAsymmetricDecryption (AsymmetricDecryption AsymmetricDecryption)
    {
        this.AsymmetricDecryption = AsymmetricDecryption;
    }

    public SharedSecretDynamicPlaintext getSharedSecretDynamicPlaintext ()
    {
        return SharedSecretDynamicPlaintext;
    }

    public void setSharedSecretDynamicPlaintext (SharedSecretDynamicPlaintext SharedSecretDynamicPlaintext)
    {
        this.SharedSecretDynamicPlaintext = SharedSecretDynamicPlaintext;
    }

    public SharedSecretChallengeResponse getSharedSecretChallengeResponse ()
    {
        return SharedSecretChallengeResponse;
    }

    public void setSharedSecretChallengeResponse (SharedSecretChallengeResponse SharedSecretChallengeResponse)
    {
        this.SharedSecretChallengeResponse = SharedSecretChallengeResponse;
    }

    public DigSig getDigSig ()
    {
        return DigSig;
    }

    public void setDigSig (DigSig DigSig)
    {
        this.DigSig = DigSig;
    }

    public String[] getExtension ()
    {
        return Extension;
    }

    public void setExtension (String[] Extension)
    {
        this.Extension = Extension;
    }

    public RestrictedPassword getRestrictedPassword ()
    {
        return RestrictedPassword;
    }

    public void setRestrictedPassword (RestrictedPassword RestrictedPassword)
    {
        this.RestrictedPassword = RestrictedPassword;
    }

    public ResumeSession getResumeSession ()
    {
        return ResumeSession;
    }

    public void setResumeSession (ResumeSession ResumeSession)
    {
        this.ResumeSession = ResumeSession;
    }

    public PreviousSession getPreviousSession ()
    {
        return PreviousSession;
    }

    public void setPreviousSession (PreviousSession PreviousSession)
    {
        this.PreviousSession = PreviousSession;
    }

    public SubscriberLineNumber[] getSubscriberLineNumber ()
    {
        return SubscriberLineNumber;
    }

    public void setSubscriberLineNumber (SubscriberLineNumber[] SubscriberLineNumber)
    {
        this.SubscriberLineNumber = SubscriberLineNumber;
    }

    public IPAddress getIPAddress ()
    {
        return IPAddress;
    }

    public void setIPAddress (IPAddress IPAddress)
    {
        this.IPAddress = IPAddress;
    }

    public UserSuffix getUserSuffix ()
    {
        return UserSuffix;
    }

    public void setUserSuffix (UserSuffix UserSuffix)
    {
        this.UserSuffix = UserSuffix;
    }

    public AsymmetricKeyAgreement getAsymmetricKeyAgreement ()
    {
        return AsymmetricKeyAgreement;
    }

    public void setAsymmetricKeyAgreement (AsymmetricKeyAgreement AsymmetricKeyAgreement)
    {
        this.AsymmetricKeyAgreement = AsymmetricKeyAgreement;
    }

    public Password getPassword ()
    {
        return Password;
    }

    public void setPassword (Password Password)
    {
        this.Password = Password;
    }

    public ZeroKnowledge getZeroKnowledge ()
    {
        return ZeroKnowledge;
    }

    public void setZeroKnowledge (ZeroKnowledge ZeroKnowledge)
    {
        this.ZeroKnowledge = ZeroKnowledge;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [AsymmetricDecryption = "+AsymmetricDecryption+", SharedSecretDynamicPlaintext = "+SharedSecretDynamicPlaintext+", SharedSecretChallengeResponse = "+SharedSecretChallengeResponse+", DigSig = "+DigSig+", Extension = "+Extension+", RestrictedPassword = "+RestrictedPassword+", ResumeSession = "+ResumeSession+", PreviousSession = "+PreviousSession+", SubscriberLineNumber = "+SubscriberLineNumber+", IPAddress = "+IPAddress+", UserSuffix = "+UserSuffix+", AsymmetricKeyAgreement = "+AsymmetricKeyAgreement+", Password = "+Password+", ZeroKnowledge = "+ZeroKnowledge+"]";
    }
}
