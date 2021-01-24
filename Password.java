class Password
{
  // Fields
  private String password;
  private int minLen;
  private int minSpecialChar;
  private int minLowerCase;
  private int minUpperCase;
  // Constructor
  public Password(int minLen, int minSpecialChar, int minLowerCase, int minUpperCase, String password)
  {
    this.password = password;
    setminLen(minLen);
    this.minSpecialChar = minSpecialChar;
    this.minLowerCase = minLowerCase;
    this.minUpperCase = minUpperCase;
  }

  // Setters
  public void setminSpecialChar(int minSpecialChar)
  {
    this.minSpecialChar = minSpecialChar;
  }

  public void setminLen(int minLen)
  {
    this.minLen = minLen;
  }

  public void setminLowerCase (int minLowerCase)
  {
    this.minLowerCase = minLowerCase;
  }

  public void setminUpperCase (int minUpperCase)
  {
    this.minUpperCase = minUpperCase;
  }

  // Getters
  public int getminSpecialChar()
  {
    return this.minSpecialChar;
  }

  public int getminLen()
  {
    return this.minLen;
  }

  public int getminLowerCase()
  {
    return this.minLowerCase;
  }

  public int getminUpperCase()
  {
    return this.minUpperCase;
  }

  // Boolean Methods to check for length, lowercase, uppercase, and a special character 
  public boolean checkLen()
  {
    if(this.password.length() >= getminLen())
    {
      return true;
    }
    else 
    {
      return false;
    }
  }

  public boolean checkLowerCase()
  {
    boolean isLower = false;
    int amount = 0;

    for(int i = 0; i < password.length(); i++)
    {
      if(Character.isLowerCase(this.password.charAt(i)) == true)
      {
        isLower = true;
        amount ++;
      }
    }

    if (isLower == true && amount >= getminLowerCase())
    {
      return true;
    }
    else
    {
      return false;
    }
  }

  public boolean checkUpperCase()
  {
    boolean isUpper = false;
    int amount = 0;

    for(int i = 0; i < password.length(); i++)
    {
      if(Character.isUpperCase(this.password.charAt(i)) == true)
      {
        isUpper = true;
        amount ++;
      }
    }

    if (isUpper == true && amount >= getminUpperCase())
    {
      return true;
    }
    else
    {
      return false;
    }

  }

  public boolean checkSpecialCharacter()
  {
    boolean isSpecial = false;
    int amount = 0;

    for(int i = 0; i < password.length(); i++)
    {
      if(Character.isLetterOrDigit(this.password.charAt(i)) == false)
      {
        isSpecial = true;
        amount ++;
      }
    }

    if (isSpecial == true && amount >= getminSpecialChar())
    {
      return true;
    }
    else
    {
      return false;
    }

  }

  public boolean check()
  {
    if (checkLen() == true && checkLowerCase() == true && checkUpperCase() == true && checkSpecialCharacter() == true)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
}