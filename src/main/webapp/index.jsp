<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ServletGetPost</title>
</head>
<body>

       <h5>1 - Crie um novo Servlet que receba dois parâmetros, primeiroNome e ultimoNome, e que faça uma saudação ao usuário imprimindo uma mensagem que contenha o primeiro e o último nome do usuário (parâmetros da requisição).</h5>
 
      <form action="ServletGetPost" method="post">
      
 		<label for= "PrimeiroNome">Primeiro Nome</label>
 		
         <input type="text" name="PrimeiroNome"/>
         <br/>
         <label for= "UltimoNome">Último Nome</label>
         <input type="text" name="UltimoNome"/>
         <br/>
 
         <input type="submit" value="Enviar Questão1 "/>
 
      </form>
      
      <h5>2 - Crie uma classe chamada ServletPaginaAgenda que retorna uma página HTML com um formulário (pelo menos com: nome, telefone e data de nascimento) para enviar os dados para outra Servlet chamada ServletAgenda e apresente os dados preenchidos no formulário.
      </h5>
      
      <form action="ServletPaginaAgenda" method="post">
      
 		<label for= "nome"> Nome</label>
 		
         <input type="text" name="nome"/>
         <br/>
         <label for= "telefone">Telefone</label>
         <input type="text" name="telefone"/>
         <br/>
         
         <label for= "dataDeNascimento">Data de Nascimento</label>
         <input type="text" name="dataDeNascimento"/>
         <br/>
 
         <input type="submit" value="Enviar Questão2 "/>
 
      </form>
      
      
      <h5>
3 - Implemente uma calculadora que some todos os parâmetros enviados e apresente o resultado na tela.
      </h5>
      
      <form action="ServletCalculadora" method="post">
      
 		<label for= "num1">Parametro 1 </label>
 		
         <input type="text" name="num1"/>
         
         
         <label for= "num2">Parametro 2 </label>
 		
         <input type="text" name="num2"/>
         <br/>
         
         <label for= "num3">Parametro 3 </label>
 		
         <input type="text" name="num3"/>
         
         
         <label for= "num4">Parametro 4 </label>
 		
         <input type="text" name="num4"/>
         <br/>
         
 
         <input type="submit" value="Enviar Questão3 "/>
 
      </form>

 
</body>
</html>