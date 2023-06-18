<!DOCTYPE html>
<html lang="es">
<head>
    <title>Products</title>
</head>
<meta charset="UTF-8">
<meta name="author" content="Sayra">
<meta name="description" content="">
<meta name="keywords" content="">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Registro de Productos MY APP</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
      crossorigin="anonymous">
<link rel="stylesheet" href="https:/cdn.jsdelivr.net/npm/bootstrap-icons@1.10.3/font/bootstrap-icons.css">
<link rel="stylesheet" href="./css/signin.css">

<body class="text-center">
<main class="form-signin w-100 m-auto">
    <form action="" method="post">
        <img class="mb-4" src="img/productos.jpg" alt="" width="200">
        <h4 class="text-secondary">MY -APP</h4>
        <h1 class="h5 mb-3 fw-normal">Productos</h1>

        <div class="form-floating">
            <input type="text" class="form-control" id="floatingInput"
                   placeholder="" required autofocus
                   pattern="[A-Za-z0-9]{8, 12}">
            <label for="floatingInput">Id del producto:</label>
        </div>
        <div class="form-floating">
            <input type="text" class="form-control"
                   placeholder="" required autofocus
                   pattern="[A-Za-z0-9]{8, 35}">
            <label for="floatingInput">Nombre del producto:</label>
        </div>
        </div>
        <div class="form-floating">
            <input type="text" class="form-control"
                   placeholder="" required autofocus
                   pattern="[A-Za-z0-9]{8, 35}">
            <label for="floatingInput">Valor del producto:</label>
        </div>
        <br>
        <br>
        <button class=" btn btn-lg btn-primary" type="submit">Registrar producto</button>
        <div id="register">
        </div>
        <p class="mt-3 mb-3 text-muted">Todos los Derechos Reservados MY APP © </p>

    </form>
</main>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>


</body>
</html>
