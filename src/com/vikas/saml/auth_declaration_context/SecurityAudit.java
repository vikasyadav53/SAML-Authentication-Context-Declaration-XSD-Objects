package com.vikas.saml.auth_declaration_context;

public class SecurityAudit
{
    private String[] Extension;

    private SwitchAudit SwitchAudit;

    public String[] getExtension ()
    {
        return Extension;
    }

    public void setExtension (String[] Extension)
    {
        this.Extension = Extension;
    }

    public SwitchAudit getSwitchAudit ()
    {
        return SwitchAudit;
    }

    public void setSwitchAudit (SwitchAudit SwitchAudit)
    {
        this.SwitchAudit = SwitchAudit;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Extension = "+Extension+", SwitchAudit = "+SwitchAudit+"]";
    }
}
