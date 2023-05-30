<!DOCTYPE html>
<html lang="es">
<head>
    <title>Login</title>
</head>
<meta charset="UTF-8">
<meta name="author" content="Nombre Autor">
<meta name="description" content="Esta debe ser la información que aparece en el párrafo que acompaña los resultados de una busqueda de internet">
<meta name="keywords" content="registro de usuario, formulario de registro, crear cuenta, reistro en línea">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>login MY APP</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
      crossorigin="anonymous">
<link rel="stylesheet" href="https:/cdn.jsdelivr.net/npm/bootstrap-icons@1.10.3/font/bootstrap-icons.css">
<link rel="stylesheet" href="./css/signin.css">

<body class="text-center">
<main class="form-signing w-100 m-auto">
    <form action="" method="post">
        <img class="mb-4" src="img/logo.png" alt="MY APP" width="100">
        <h4 class="text-secondary">MY -APP</h4>
        <h1 class="h5 mb-3 fw-normal">Login</h1>
        <div class="form-floating"></div>

        <form action="" method="post"></form>
        <label for="firstName">Nombres:</label><br>
        <input type="text" id="firstName" name="firstName" placeholder="Ingrese sus nombres" required outof pattern="[A-Za-z]{2,40}">
        </div>


        <form action="" method="post"></form>
        <label for="Email">Correo:</label><br>
        <input type="email" id="email" name="email" placeholder="Su email" required outof
               pattern="{,60}">

        <form action="" method="post"></form>
        <label for="password">Contraseña:</label><br>
        <input type="password" id="password" name="password" placeholder="Ingrese su contraseña" required pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2, 3}$"><br>

        <div>
            <input class="btn btn-primary" type="submit" value="Enviar">

            <input class="btn btn-second" type="submit" value="Ingresar"><br>


            <a href="register.jsp">Iniciar secion</a>
            <a href="productos.jsp">Registar productos</a>



        </div>

    </form>
</main>

</body>
<footer></footer>
