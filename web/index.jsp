<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="sources/css/bootstrap-grid.min.css">
        <link rel="stylesheet" href="sources/css/bootstrap.min.css">
      
        <title>Ejemplo de Sesiones</title>
    </head>
    <body>
        <div class="container">
            <div class="row">
                
                <div class="col-sm"></div>
                <div class="col-sm">
                    <h1>Ejemplo de Sesiones</h1>
                </div>
                <div class="col-sm"></div>
            </div>
            <div class="row">
                <form action='SesionesServlet' method="POST">
                    NOMBRE: <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email" name="NOMBRE">
                    <br />
                    APELLIDO: <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email" name="APELLIDO" />
                    <br />
                    <input type="submit" class="btn btn-primary" value="Submit" />
                </form>
            </div>
            <br>
        </div
    </body>
</html>
