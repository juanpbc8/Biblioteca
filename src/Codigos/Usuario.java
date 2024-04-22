package Codigos;

public class Usuario{
    private static int contadorUsuarios = 0; // Contador para rastrear el número de usuarios

    private int id;
    private String email;
    private String nombreCompleto;
    private String DNI;
    private int edad;
    private String contraseña;
    private String telefono;

    public Usuario(String email, String nombreCompleto, String DNI, int edad, String contraseña, String telefono) {
        this.id = contadorUsuarios + 1; // Asignar un id único (basado en el contador de usuarios)
        this.email = email;
        this.nombreCompleto = nombreCompleto;
        this.DNI = DNI;
        this.edad = edad;
        this.contraseña = contraseña;
        this.telefono = telefono;
        contadorUsuarios++;// Incrementar el contador de usuarios
    }

  public int getId() {
    return id;
  }

  public String getEmail() {
    return email;
  }

  public String getContraseña() {
    return contraseña;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setContraseña(String contraseña) {
    this.contraseña = contraseña;
  }

}