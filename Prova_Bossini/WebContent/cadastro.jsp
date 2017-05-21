<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
     <head>
      <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
       <title>Insert title here</title>
     </head>
     <body>
           <a href="index.html">Home</a>
           <br>
           <form name="formulario" method="post" action="controle?acao=cadastrar">
           
                  <label> Título do Livro </label>
                  <br>
                  
                  <input type="text" id="titulo" name="titulo" /> 
                  <br>
                  
                  <label> Número de Páginas </label>
                  <br>
                  
                  <input type="text" id="numpagn" name="numpagn" /> 
                  <br>
                  
                  <label> Autor </label>
                  <br>
                  
                  <input type="text" id="autor" name="autor" /> 
                  <br>
           
           <button type="submit" > Cadastrar </button>
           </form> 
    </body>
</html>