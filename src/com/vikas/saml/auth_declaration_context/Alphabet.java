package com.vikas.saml.auth_declaration_context;

public class Alphabet
{
    private String excludedChars;

    private String requiredChars;

    private String _case;

    public String getExcludedChars ()
    {
        return excludedChars;
    }

    public void setExcludedChars (String excludedChars)
    {
        this.excludedChars = excludedChars;
    }

    public String getRequiredChars ()
    {
        return requiredChars;
    }

    public void setRequiredChars (String requiredChars)
    {
        this.requiredChars = requiredChars;
    }

    public String getCase ()
    {
        return _case;
    }

    public void setCase (String _case)
    {
        this._case = _case;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [excludedChars = "+excludedChars+", requiredChars = "+requiredChars+", case = "+_case+"]";
    }
}