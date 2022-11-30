package oracle.model;

import org.apache.struts.action.ActionForm;


public class User extends ActionForm{
    @SuppressWarnings("compatibility:-155969204613153654")
    private static final long serialVersionUID = 1L;
    private String name;
   private int age;
    
   public User(){};
    public User(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
