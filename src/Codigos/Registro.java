package Codigos;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Registro {
    private String idRegistro;
    private Date fecha;
    private String idUsuario;
    private List<String> listaPrestamoLibro;


    public Registro(Date fecha, String idUsuario, String idRegistro) {
        this.fecha = fecha;
        this.idUsuario = idUsuario;
        this.idRegistro = idRegistro;
        this.listaPrestamoLibro = new ArrayList<>();
    }

    public void generarReportePrestamo() {
        System.out.println("Reporte de Préstamo:");
        for (String libro : listaPrestamoLibro) {
            System.out.println(libro);
        }
    }
    
    public Date getFecha() {
         return fecha;
    }

    public String getIdUsuario() {
         return idUsuario;
    }

    public List<String> getListaPrestamoLibro() {
         return listaPrestamoLibro;
    }

    public String getIdRegistro() {
         return idRegistro;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setIdUsuario(String idUsuario) {
         this.idUsuario = idUsuario;
    }

    public void setIdRegistro(String idRegistro) {
        this.idRegistro = idRegistro;
    }

    public void agregarPrestamo(String libro) {
        listaPrestamoLibro.add(libro);
    }

    public void eliminarPrestamo(String libro) {
        listaPrestamoLibro.remove(libro);
    }
   
}