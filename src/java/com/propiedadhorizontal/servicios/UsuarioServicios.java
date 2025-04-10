/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.propiedadhorizontal.servicios;

/**
 *
 * @author Aley Cabrera D
 */

import com.propiedadhorizontal.modelo.Usuario;
import com.propiedadhorizontal.util.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioServicios {
    // Método para crear un usuario
    public boolean crearUsuario(Usuario usuario) {
        String sql = "INSERT INTO usuarios (primer_nombre, segundo_nombre, primer_apellido, "
                + "segundo_apellido, email, celular, nombre_propiedad_horizontal, "
                + "tipo_propiedad, numero_propiedad, contrasena) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, usuario.getPrimerNombre());
            stmt.setString(2, usuario.getSegundoNombre());
            stmt.setString(3, usuario.getPrimerApellido());
            stmt.setString(4, usuario.getSegundoApellido());
            stmt.setString(5, usuario.getEmail());
            stmt.setString(6, usuario.getCelular());
            stmt.setString(7, usuario.getNombrePropiedadHorizontal());
            stmt.setString(8, usuario.getTipoPropiedad());
            stmt.setString(9, usuario.getNumeroPropiedad());
            stmt.setString(10, usuario.getContrasena());
            
            return stmt.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
    
    // Método para obtener todos los usuarios
    public List<Usuario> obtenerTodosUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        String sql = "SELECT * FROM usuarios";
        
        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            
            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setId(rs.getInt("id"));
                usuario.setPrimerNombre(rs.getString("primer_nombre"));
                usuario.setSegundoNombre(rs.getString("segundo_nombre"));
                usuario.setPrimerApellido(rs.getString("primer_apellido"));
                usuario.setSegundoApellido(rs.getString("segundo_apellido"));
                usuario.setEmail(rs.getString("email"));
                usuario.setCelular(rs.getString("celular"));
                usuario.setNombrePropiedadHorizontal(rs.getString("nombre_propiedad_horizontal"));
                usuario.setTipoPropiedad(rs.getString("tipo_propiedad"));
                usuario.setNumeroPropiedad(rs.getString("numero_propiedad"));
                usuario.setContrasena(rs.getString("contrasena"));
                
                usuarios.add(usuario);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return usuarios;
    }
    
    // Métodos para actualizar y eliminar (similar a los anteriores)
    // ... (implementar updateUsuario y eliminarUsuario)
}
