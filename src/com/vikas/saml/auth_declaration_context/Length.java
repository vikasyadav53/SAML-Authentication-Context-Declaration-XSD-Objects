package com.vikas.saml.auth_declaration_context;

public class Length
{
    private String min;

    private String max;

    public String getMin ()
    {
        return min;
    }

    public void setMin (String min)
    {
        this.min = min;
    }

    public String getMax ()
    {
        return max;
    }

    public void setMax (String max)
    {
        this.max = max;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [min = "+min+", max = "+max+"]";
    }
}
