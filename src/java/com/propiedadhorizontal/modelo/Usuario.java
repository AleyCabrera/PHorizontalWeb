/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.propiedadhorizontal.modelo;

/**
 *
 * @author Aley Cabrera D
 */
public class Usuario {
    private int id;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String email;
    private String celular;
    private String nombrePropiedadHorizontal;
    private String tipoPropiedad;
    private String numeroPropiedad;
    private String contrasena;

    // Constructor vacío
    public Usuario() {
    }

    // Getters y Setters (generarlos automáticamente con Alt+Insert)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }
    
    public String getSegundoNombre() {
        return segundoNombre;
    }
    
    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }
     
    public String getPrimerApellido() {
        return primerApellido;
    }
    
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }
    
    public String getSegundoApellido() {
        return segundoApellido;
    }
    
    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getCelular() {
        return celular;
    }
    
    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    public String getNombrePropiedadHorizontal() {
        return nombrePropiedadHorizontal;
    }
    
    public void setNombrePropiedadHorizontal(String nombrePropiedadHorizontal) {
        this.nombrePropiedadHorizontal = nombrePropiedadHorizontal;
    }
    
    public String getTipoPropiedad() {
        return tipoPropiedad;
    }
    
    public void setTipoPropiedad(String tipoPropiedad) {
        this.tipoPropiedad = tipoPropiedad;
    }
    
    public String getNumeroPropiedad() {
        return numeroPropiedad;
    }
    
    public void setNumeroPropiedad(String numeroPropiedad) {
        this.numeroPropiedad = numeroPropiedad;
    }
    
    public String getContrasena() {
        return contrasena;
    }
    
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    // Continuar con todos los getters y setters para los demás atributos...
}
