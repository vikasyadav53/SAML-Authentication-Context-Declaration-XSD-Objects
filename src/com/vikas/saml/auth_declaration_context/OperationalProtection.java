package com.vikas.saml.auth_declaration_context;

public class OperationalProtection
{
    private String[] Extension;

    private SecurityAudit SecurityAudit;

    private DeactivationCallCenter DeactivationCallCenter;

    public String[] getExtension ()
    {
        return Extension;
    }

    public void setExtension (String[] Extension)
    {
        this.Extension = Extension;
    }

    public SecurityAudit getSecurityAudit ()
    {
        return SecurityAudit;
    }

    public void setSecurityAudit (SecurityAudit SecurityAudit)
    {
        this.SecurityAudit = SecurityAudit;
    }

    public DeactivationCallCenter getDeactivationCallCenter ()
    {
        return DeactivationCallCenter;
    }

    public void setDeactivationCallCenter (DeactivationCallCenter DeactivationCallCenter)
    {
        this.DeactivationCallCenter = DeactivationCallCenter;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Extension = "+Extension+", SecurityAudit = "+SecurityAudit+", DeactivationCallCenter = "+DeactivationCallCenter+"]";
    }
}
