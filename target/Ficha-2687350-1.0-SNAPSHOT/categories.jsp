<!DOCTYPE html>
<html lang="es">
<head>
    <title>Login</title>
    <meta charset="UTF-8">
    <meta name="author" content="Sayra">
    <meta name="description" content="">
    <meta name="keywords" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
          crossorigin="anonymous">
    <link rel="stylesheet" href="https:/cdn.jsdelivr.net/npm/bootstrap-icons@1.10.3/font/bootstrap-icons.css">
    <link rel="stylesheet" href="./css/signin.css">
</head>
<body class="text-center">
    <main class="form-signin w-100 m-auto">
        <img class="mb-4" src="img/categorias.png" alt="" width="200">
        <form action="" method="post">
            <h4 class="text-secondary">MY -APP</h4>
            <h1 class="h5 mb-3 fw-normal">Categoria</h1>

                     <div class="form-floating">
                <input type="number" class="form-control" id="categoriaId"
                    placeholder="" required>
                <label for="categoriaId">ID de la categoria:</label>
            </div>

            <div class="form-floating">
                <input type="text" class="form-control" id="categoriaNombre"
                    placeholder="" required>
                <label for="categoriaNombre">Nombre de la categoria:</label>
            </div>
            <br>
            <button class="btn btn-lg btn-primary" type="submit">Registrar categoria</button>
            <div id="register">
            </div>
            <p class="mt-3 mb-3 text-muted">Todos los Derechos Reservados MY APP © </p>
        </form>
    </main>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
</body>
</html>
