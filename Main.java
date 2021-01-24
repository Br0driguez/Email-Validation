class Main 
{
  public static void main(String[] args) 
  {
    //jOption wasnt inputing @ so I used scanner instead
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter an email: ");
    String email = input.next();

    Scanner input2 = new Scanner(System.in);
    System.out.print("Please enter a password: ");
    String password = input2.next();

    String[] tokens = email.split("@");//this will split the email into local and domain
    String local = tokens[0];//array 0 being local
    String domain = tokens[1];//array 2 being domain
    int minLen = 6;//six character longs
    int minSpecial =1;//one special character
    int minUpper = 2;//atleast two lowercase numbers
    int minLower =1;//one upper case number
    
    Password pw = new Password(minLen, minSpecial, minUpper, minLower, password);
    Email myEmail = new Email(local,domain);
    //myEmail.checkLocal(local);
    //myEmail.checkDomain(domain);

    //will print if the email is valid or not if its true or false
    if(myEmail.verify())
    {
      System.out.println("The email is valid");
    }
    else
    {
      System.out.println("The email was not Valid");
    }

    //prints if the password is secure
    if(pw.check())
    {
      System.out.println("The password is secure.");
    }
    else
    {
      System.out.println("the password is not secure");
    }
  }
}