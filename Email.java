public class Email
{
  //private
  private String local;
  private String domain;

  //constructor
  public Email(String local, String domain)
  {
    this.local = local;
    this.domain = domain;
  }
  //setters
  public void setLocal(String local)
  {
    this.local = local;
  }  
  public void setModel(String domain)
  {
    this.domain = domain;
  } 
  //getters
  public String getLocal()
  {
    return this.local;
  }
  public String getDomain()
  {
    return this.domain;
  }
  
  //will verify is both the domain and local are true
  public boolean verify()
  {
    if (checkLocal() == true && checkDomain() == true)
    {
      return true;
    }
    else 
    {
      return false;
    }
  }

  //checks if the local only has digits and numbers
  public boolean checkLocal()
  {
    boolean flag = true;
    for(int i = 0; i < getLocal().length(); i++)
    {
      if(Character.isLetterOrDigit(getLocal().charAt(i)) == false)
      {
        flag = false;
      }
    }

    if (flag == true)
    {
      return true;
    }
    else 
    {
      return false;
    }
  }

  //checks if the domain has digits and letters as well as the period
  public boolean checkDomain()
  {
    boolean flag = true;
    boolean asDot = false;
    for(int i = 0; i < getDomain().length(); i++)
    {
      if(Character.isLetterOrDigit(getDomain().charAt(i)) == false && getDomain().charAt(i) != '.')
      {
        flag = false;
      }

      if(getDomain().charAt(i) == '.')
      {
        asDot = true;
      }
    }

    if (flag == true && asDot == true)
    {
      return true;
    }
    else 
    {
      return false;
    }
  }
}