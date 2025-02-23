# Carpeta `entities`

Esta carpeta contiene las clases que representan los productos y sus tipos en la tienda.

## Contenido:

- **Producto.java**: Interfaz que define los métodos básicos que deben implementar los productos.
- **ProductoBase.java**: Clase abstracta que implementa la interfaz `Producto` y proporciona la implementación común para productos con atributos como `codigo`, `nombre`, `precio`, y `stock`.
- **Equipamiento.java**: Subclase de `ProductoBase` que representa productos relacionados con equipos deportivos. Añade atributos específicos como `deporte` y `marca`.
- **RopaDeportiva.java**: Subclase de `ProductoBase` que representa ropa deportiva. Incluye atributos como `talla` y `material`.

El propósito de esta carpeta es manejar la definición y representación de los productos en la tienda.
