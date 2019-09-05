package medicalsoft;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Persona {

    private String nombre = "";
    private String apellido = "";
    private String fecha_nacimiento = "";
    private String identificacion = "";
    private String genero = "";
    private String direccion = "";
    private String email = "";
    private String telefono = "";
    private String celular = "";

    public Persona(String nom, String ape, String fec) {     //CONSTRUCTOR
        this.nombre = nom;
        this.apellido = ape;
        this.fecha_nacimiento = fec;
    }

    public Persona() {

    }

    public String getNombre() {
        return nombre.toLowerCase();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    /*public int edad(String Fecha_nacimiento){

        Date fechaActual = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String hoy = formato.format(fechaActual);
        String[] dat1 = Fecha_nacimiento.split("/");
        String[] dat2 = hoy.split("/");
        int fechas = Integer.parseInt(dat2[2]) - Integer.parseInt(dat1[2]);
        int mes = Integer.parseInt(dat2[1]) - Integer.parseInt(dat1[1]);
        if (mes < 0) {
            fechas = fechas - 1;
        } else if (mes == 0) {
            int dia = Integer.parseInt(dat2[0]) - Integer.parseInt(dat1[0]);
            if (dia > 0) {
                fechas = fechas - 1;
            }
        }

    return fechas;
    }*/
    public int getEdad() {

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNac = LocalDate.parse(this.fecha_nacimiento, fmt);
        LocalDate ahora = LocalDate.now();

        Period periodo = Period.between(fechaNac, ahora);
        
        return periodo.getYears();
    }

    public boolean validateEmail() {

        return true;
    }

    public String getFullName() {

        return this.nombre + " " + "" + this.apellido;
    }

}
