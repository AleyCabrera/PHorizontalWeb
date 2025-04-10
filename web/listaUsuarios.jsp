<%-- 
    Document   : listaUsuario
    Created on : 9/04/2025, 7:53:31 p. m.
    Author     : Aley Cabrera D
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Lista de Usuarios</title>
    <style>
        body { font-family: Arial, sans-serif; margin: 20px; }
        table { width: 100%; border-collapse: collapse; }
        th, td { border: 1px solid #ddd; padding: 8px; text-align: left; }
        th { background-color: #f2f2f2; }
    </style>
</head>
<body>
    <h1>Lista de Usuarios Registrados</h1>
    
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Nombre Completo</th>
                <th>Email</th>
                <th>Celular</th>
                <th>Propiedad</th>
                <th>Tipo</th>
                <th>Número</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="usuario" items="${usuarios}">
                <tr>
                    <td>${usuario.id}</td>
                    <td>${usuario.primerNombre} ${usuario.segundoNombre} ${usuario.primerApellido} ${usuario.segundoApellido}</td>
                    <td>${usuario.email}</td>
                    <td>${usuario.celular}</td>
                    <td>${usuario.nombrePropiedadHorizontal}</td>
                    <td>${usuario.tipoPropiedad}</td>
                    <td>${usuario.numeroPropiedad}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    
    <p><a href="${pageContext.request.contextPath}/registro">Registrar nuevo usuario</a></p>
</body>
</html>
