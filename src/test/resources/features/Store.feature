# language: es

Característica: Realizar compra de articulos
  Como un nuevo cliente
  Quiero ingresar a la tienda http://opencart.abstracta.us/
  Para comprar articulos

  Escenario: Agregar articulos al carrito
    Dado que un cliente accede hasta la tienda web
    Cuando agrega los articulos al carrito
    Entonces puede ver la lista de articulos en el carrito

  Esquema del escenario: Agregar articulos al carrito
    Dado que un cliente accede hasta la tienda web
    Cuando agrega los articulos al carrito
      | <nombreProducto>  | <cantidadAgregar> |
    Entonces puede ver la lista de articulos en el carrito

    Ejemplos:
      | nombreProducto  | cantidadAgregar |
      | MacBook         | 1               |
      | IPhone          | 1               |