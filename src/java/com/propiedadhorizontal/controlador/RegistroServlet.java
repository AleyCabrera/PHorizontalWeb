
package com.propiedadhorizontal.controlador;

/**
 *
 * @author Aley Cabrera D
 */

import com.propiedadhorizontal.modelo.Usuario;
import com.propiedadhorizontal.servicios.UsuarioServicios;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "RegistroServlet", urlPatterns = {"/registro"})
public class RegistroServlet extends HttpServlet {

    private UsuarioServicios usuarioServicios = new UsuarioServicios();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Mostrar formulario de registro
        request.getRequestDispatcher("/registro.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Procesar formulario de registro
        Usuario usuario = new Usuario();
        usuario.setPrimerNombre(request.getParameter("primerNombre"));
        usuario.setSegundoNombre(request.getParameter("segundoNombre"));
        usuario.setPrimerApellido(request.getParameter("primerApellido"));
        usuario.setSegundoApellido(request.getParameter("segundoApellido"));
        usuario.setEmail(request.getParameter("email"));
        usuario.setCelular(request.getParameter("celular"));
        usuario.setNombrePropiedadHorizontal(request.getParameter("nombrePropiedadHorizontal"));
        usuario.setTipoPropiedad(request.getParameter("tipoPropiedad"));
        usuario.setNumeroPropiedad(request.getParameter("numeroPropiedad"));
        
        // Validar que las contraseñas coincidan
        String contrasena = request.getParameter("contrasena");
        String confirmarContrasena = request.getParameter("confirmarContrasena");
        
        if (!contrasena.equals(confirmarContrasena)) {
            request.setAttribute("error", "Las contraseñas no coinciden");
            request.getRequestDispatcher("/registro.jsp").forward(request, response);
            return;
        }
        
        usuario.setContrasena(contrasena);
        
        if (usuarioServicios.crearUsuario(usuario)) {
            response.sendRedirect(request.getContextPath() + "/exito.jsp");
        } else {
            request.setAttribute("error", "Error al registrar el usuario");
            request.getRequestDispatcher("/registro.jsp").forward(request, response);
        }
    }
}
