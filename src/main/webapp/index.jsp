<!DOCTYPE html>
<html lang="es">
<head>
    <title>Login</title>
</head>
<meta charset="UTF-8">
<meta name="author" content="Nombre Autor">
<meta name="description" content="">
<meta name="keywords" content="">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>login MY APP</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
      crossorigin="anonymous">
<link rel="stylesheet" href="https:/cdn.jsdelivr.net/npm/bootstrap-icons@1.10.3/font/bootstrap-icons.css">
<link rel="stylesheet" href="css/signin.css">
<link href="Templates/plantillas.jsp">

<body class="text-center">
<main class="form-signing w-100 m-auto">
    <form action="" method="post">
        <img class="mb-4" src="img/Logo.jpg" alt="" width="150">
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
        <br>

        <div>
            <input class="btn btn-primary" type="submit" value="Enviar"><br>

            <input class="btn btn-second" type="submit" value="Ingresar"><br>


            <a href="register.jsp">Iniciar sesion</a>
            <br>
            <a href="categories.jsp">Registar categorias</a><br>
            <a href="productos.jsp">Registar productos</a><br>
            <link href="Templates/footer.jsp">





        </div>

    </form>
</main>

</body>
<footer></footer>
