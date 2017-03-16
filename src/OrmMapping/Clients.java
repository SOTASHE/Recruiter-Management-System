package OrmMapping;
// Generated Mar 16, 2017 4:24:54 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Clients generated by hbm2java
 */
public class Clients  implements java.io.Serializable {


     private Integer id;
     private String name;
     private String email;
     private String password;
     private Set jobses = new HashSet(0);

    public Clients() {
    }

	
    public Clients(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }
    public Clients(String name, String email, String password, Set jobses) {
       this.name = name;
       this.email = email;
       this.password = password;
       this.jobses = jobses;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public Set getJobses() {
        return this.jobses;
    }
    
    public void setJobses(Set jobses) {
        this.jobses = jobses;
    }




}


