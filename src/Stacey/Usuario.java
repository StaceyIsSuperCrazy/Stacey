
package Stacey;

public class Usuario {
    private String user;
    private String password;

    
    public Usuario(String user,String password){
        this.user=user;
        this.password=password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if(other.user.equals(user) && other.password.equals(password)){
            return true;
        }else{
            return false;
        }
        
    }
    
    
    
    
}
