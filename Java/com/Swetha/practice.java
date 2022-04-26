package com.Swetha;

public class practice {
    public String name;
    private String password;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        if(password !="") {
        this.password = password;
        }
    }
}
 class modify {
   public static void main(String[] args) {
       practice obj =new practice();
       obj.setName("Swetha");
       obj.setPassword("123Swe2");
       System.out.println(obj.getName()+ "   " +obj.getPassword());
   }
}
