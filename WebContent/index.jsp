<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" type="text/css" href="paginas/css/style.css">
<title>Prova Pr�tica - 4POA</title>
</head>
<body>
	<!-- PASSO 1 - CRIAR O FORMUL�RIO -->
	
	<!-- NO FINAL DESTE ARQUIVO TEM INSTRU��ES PARA O PASSO 2 -->
	
	<form action="Servlet" method="post">
		
	<!-- TIPO TEXT -->
		<label for="placa">Placa</label><input type="text" class="placa" name="placa" id="placa" required />
		<br /><br />
	<!-- TIPO RADIO BUTTON -->
		<fieldset>
			<legend> Montadora </legend>
			<input type="radio" name="montadora" id="montadora" value="fiat"> Fiat<br />
			<input type="radio" name="montadora" id="montadora" value="ford"> Ford<br />
			<input type="radio" name="montadora" id="montadora" value="honda"> Honda<br />
			<input type="radio" name="montadora" id="montadora" value="toyota"> Toyota<br />
			<input type="radio" name="montadora" id="montadora" value="volkswagen"> Volkswagen<br />
		</fieldset>
		<br />
	<!-- TIPO TEXT -->
		<label for="modelo">Modelo</label><input type="text" name="modelo" id="modelo" required />
	<!-- TIPO SELECT -->
		<label for="ano">Ano</label>
		<select name="ano" id="ano">
			<option value="2016">2014</option>
			<option value="2016">2015</option>
			<option value="2016">2016</option>
			<option value="2017">2017</option>
			<option value="2018">2018</option>
			<option value="2019">2019</option>
		</select>
		<br /><br />
	<!-- TIPO CHECKBOX (PERMITIDAS V�RIAS SELE��ES -- RECUPERAR ARRAY-->
		<fieldset>
			<legend>Opcionais</legend>
			<input type="checkbox" name="opcionais" id="opcionais" value="C�MBIO AUTOM."> C�mbio Autom�tico<br />
			<input type="checkbox" name="opcionais" id="opcionais" value="AIRBAG"> Airbag<br />
			<input type="checkbox" name="opcionais" id="opcionais" value="FREIO ABS"> Freio ABS<br />
			<input type="checkbox" name="opcionais" id="opcionais" value="VIDRO EL�T."> Vidro El�trico<br />
		</fieldset>
		<br />
	<!-- BOT�O PARA ENVIAR INFORMA��ES VIA M�TODO DO FORMUL�RIO -->
		<input class="botao" type="submit" value="Enviar">
		<input class="botao" style="color: red;" type="reset" value="Redefinir">
	</form>
	
	<!-- PASSO 2 - DEPOIS QUE CRIAR O FORMUL�RIO, CRIE UM PACOTE EM: JAVA RESOURCES -> SRC -> servlet
	
			DENTRO DELE, CRIE UM ARQUIVO (FILE) SERVLET E ATRIBUA O NOME QUE VOC� DEU NO ACTION DESTE FORMUL�RIO!!!
		
		INDEX TERMINADA!!!
		V� PRA O SERVLET!!-->
		
		<script type="text/javascript" src="https://code.jquery.com/jquery-latest.min.js"></script>
		<script type="text/javascript" src="paginas/js/jquery.mask.min.js"></script>
		<script>
			$(document).ready(function(){
    			$('#placa').mask('SSS-0A00');
			});
		</script>
</body>
</html>

