package com.javaffortesters.domainentities;

public class User  {
    private String username;
    private String password;
   // private TestAppEnv TestAppEnv;

    public User() {
        this("username", "password");

        // username="username";
        //password="password";
    }

    public User(String username,String password)
    {
        this.username=username;
        this.password=password;
     //   this.TestAppEnv=new TestAppEnv();
    }
    public String getPermission()
    {
        return "Normal";
    }


    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

   /* public User(String username1, String password1) { //this.username=username;
        //this.password=password;
        username = username1;
        password = password1;
    }*/

    public void setPassword(String password) {
        this.password = password;
    }
    public void setUsername(String username)
    {
        this.username=username;
    }

/*    public void setUsername(String username) {
        this.username = username;
    }*/
/*public String getUrl()
{
    return this.TestAppEnv.getUrl();
}*/

}