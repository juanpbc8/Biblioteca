package Codigos;

public class Bibliotecario {
    private static int contadorBibliotecarios = 0;
    private int id_bibliotecario;
    private String nombreCompleto;
    private String email;
    private int edad;
    private int dni;
    private String contrasena;

    public Bibliotecario() {
    }

    public Bibliotecario(String nombreCompleto, String email, int edad, String contrasena, int dni) {
        this.id_bibliotecario = contadorBibliotecarios + 1;
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.edad = edad;
        this.contrasena = contrasena;
        this.dni = dni;
        contadorBibliotecarios++;
    }

    public int getId_bibliotecario() {
        return id_bibliotecario;
    }

    public void setId_bibliotecario(int id_bibliotecario) {
        this.id_bibliotecario = id_bibliotecario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
        
