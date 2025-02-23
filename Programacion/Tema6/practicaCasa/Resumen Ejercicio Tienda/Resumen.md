# Proyecto Tienda

Este proyecto es una simulación de una tienda en línea que permite gestionar productos, realizar compras y manejar el inventario.

## Estructura del Proyecto:

- **app**: Contiene la clase `Main.java` con el punto de entrada para ejecutar el programa.
- **entities**: Define las entidades principales como `Producto`, `ProductoBase`, `Equipamiento`, y `RopaDeportiva`.
- **services**: Contiene las clases `Tienda` y `Compra` que manejan la lógica de operaciones de la tienda y compras.
- **exceptions**: Define las excepciones personalizadas, como `StockInsuficienteException`, para manejar errores específicos.

##  Pistas y Consejos:

-  **Organización**: Organizar tu código en paquetes (por ejemplo, modelo, excepciones,
   aplicacion) para mantener una estructura limpia.

- **Validaciones**: Validar la entrada del usuario en el menú, evitando que se ingresen
  valores no numéricos donde se requiera un número.

- **Herencia e Interfaces**: La creación de una clase abstracta (ProductoBase) que implemente la interfaz
  Producto te ayudará a reducir duplicación de código en las subclases.

- **Manejo de Fechas**:  Para la fecha de la compra, puedes usar LocalDate y formatearla según se necesite.

- **Manejo de Excepciones**: Implementa la excepción StockInsuficienteException para que, en el
  método realizarCompra, si el stock no es suficiente, se lance y se capture en el
  main mostrando un mensaje adecuado.
