package app.flores.com.atenciondetickets;

public class Usuario {

    private String email;
    private String password;
    private String nombres;
    private String rol;

    public void Usuario(){
    }

    public void Usuario(String email,String password,String nombres, String rol){
        this.email=email;
        this.password=password;
        this.nombres=nombres;
        this.rol=rol;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
