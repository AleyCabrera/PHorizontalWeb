<%-- 
    Document   : registro
    Created on : 9/04/2025, 7:52:31 p. m.
    Author     : Aley Cabrera D
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Registro de Usuario</title>
    <style>
        body { font-family: Arial, sans-serif; margin: 20px; }
        .container { max-width: 600px; margin: 0 auto; }
        .form-group { margin-bottom: 15px; }
        label { display: block; margin-bottom: 5px; }
        input[type="text"], input[type="email"], input[type="password"], select {
            width: 100%; padding: 8px; box-sizing: border-box;
        }
        .error { color: red; }
    </style>
</head>
<body>
    <div class="container">
        <h1>Registro de Usuario - Propiedad Horizontal</h1>
        
        <% if (request.getAttribute("error") != null) { %>
            <p class="error"><%= request.getAttribute("error") %></p>
        <% } %>
        
        <form action="${pageContext.request.contextPath}/registro" method="post">
            <div class="form-group">
                <label for="primerNombre">Primer Nombre:</label>
                <input type="text" id="primerNombre" name="primerNombre" required>
            </div>
            
            <div class="form-group">
                <label for="segundoNombre">Segundo Nombre:</label>
                <input type="text" id="segundoNombre" name="segundoNombre">
            </div>
            
            <div class="form-group">
                <label for="primerApellido">Primer Apellido:</label>
                <input type="text" id="primerApellido" name="primerApellido" required>
            </div>
            
            <div class="form-group">
                <label for="segundoApellido">Segundo Apellido:</label>
                <input type="text" id="segundoApellido" name="segundoApellido">
            </div>
            
            <div class="form-group">
                <label for="email">Email:</label>
                <input type="email" id="email" name="email" required>
            </div>
            
            <div class="form-group">
                <label for="celular">Celular:</label>
                <input type="text" id="celular" name="celular">
            </div>
            
            <div class="form-group">
                <label for="nombrePropiedadHorizontal">Nombre Propiedad Horizontal:</label>
                <input type="text" id="nombrePropiedadHorizontal" name="nombrePropiedadHorizontal" required>
            </div>
            
            <div class="form-group">
                <label for="tipoPropiedad">Tipo de Propiedad:</label>
                <select id="tipoPropiedad" name="tipoPropiedad" required>
                    <option value="">Seleccione...</option>
                    <option value="Apartamento">Apartamento</option>
                    <option value="Casa">Casa</option>
                    <option value="Local">Local</option>
                    <option value="Oficina">Oficina</option>
                </select>
            </div>
            
            <div class="form-group">
                <label for="numeroPropiedad">Número de Propiedad:</label>
                <input type="text" id="numeroPropiedad" name="numeroPropiedad" required>
            </div>
            
            <div class="form-group">
                <label for="contrasena">Contraseña:</label>
                <input type="password" id="contrasena" name="contrasena" required>
            </div>
            
            <div class="form-group">
                <label for="confirmarContrasena">Confirmar Contraseña:</label>
                <input type="password" id="confirmarContrasena" name="confirmarContrasena" required>
            </div>
            
            <div class="form-group">
                <input type="submit" value="Registrar">
            </div>
        </form>
    </div>
</body>
</html>
