<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="/smercado/produtos/novo" method="post">
		<div>
			<label>Nome: </label> <input type="text" name="nome" />
		</div>
		<div>
			<label>Tipo: </label> <input type="text" name="tipo" />
		</div>
		<div>
			<label>Quantidade: </label> <input type="text" name="quantidade" />
		</div>
		<div>
			<label>Pre�o: </label> <input type="text" name="preco" />
		</div>
		<div>
			<label>Data de Validade: </label> <input type="text"
				name="dataValidade" />
		</div>
		<div>
			<button type="submit">Adicionar</button>
		</div>
	</form>

</body>
</html>