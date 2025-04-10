
package com.propiedadhorizontal.controlador;

/**
 *
 * @author Aley Cabrera D
 */
import com.propiedadhorizontal.modelo.Usuario;
import com.propiedadhorizontal.servicios.UsuarioServicios;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "UsuarioServlet", urlPatterns = {"/usuarios"})
public class UsuarioServlet extends HttpServlet {

    private UsuarioServicios usuarioServicios = new UsuarioServicios();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Usuario> usuarios = usuarioServicios.obtenerTodosUsuarios();
        request.setAttribute("usuarios", usuarios);
        request.getRequestDispatcher("/listaUsuarios.jsp").forward(request, response);
    }
}
