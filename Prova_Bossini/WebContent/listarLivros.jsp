<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean class="manadgBeans.ManadgBeansListarLivros" id="mb"></jsp:useBean>
<html>
<head>
      <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
      <title>Listar Livros</title>
</head>


<body>
        <a href="index.html">Home</a>
        <br><br>
        <table>  
               <thead> 
                        <tr> 
                              <th>Título do livro</th>
                              <th>Número de páginas</th>
                              <th>Autor</th>
                              <th>ID</th>                         
                        </tr> 
               </thead> 
               
               <tbody>
                    <c:forEach items="${mb.listlivro}" var="livro">
                           <tr>
                               <td>${livro.titulo}</td>
                               <td>${livro.numPagn}</td>
                               <td>${livro.autor}</td>
                               <td>${livro.idLivro}</td>
                          </tr>
                    </c:forEach>
               </tbody>
        </table>
</body>
</html>