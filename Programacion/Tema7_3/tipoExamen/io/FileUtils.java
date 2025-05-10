package Tema7_3.tipoExamen.io;

import Tema7_3.tipoExamen.model.Producto;
import Tema7_3.tipoExamen.model.Usuario;
import Tema7_3.tipoExamen.model.enumes.Categoria;
import Tema7_3.tipoExamen.model.enumes.Estado;
import Tema7_3.tipoExamen.model.enumes.Genero;
import Tema7_3.tipoExamen.service.GestionComprasVentas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class FileUtils {

    /**
     * cargarCSV (): método que cargará tres ficheros csv que tienes que crear tú. Uno para usuarios
     * (20 usuarios), otro para productos de segunda mano (50 productos), y otro para compras (20
     * compras de productos). Los datos los puedes generar con Mockaroo. Con esa información
     * debes devolver un objeto GestionComprasVentas que tenga relleno el Set de VentasUsuario y
     * el List de Compras.
     */

    public static GestionComprasVentas cargarCSV(){

        GestionComprasVentas gcv = new GestionComprasVentas();

        List<Usuario> usuarios;
        List<Producto> productos;

        try {
            usuarios = Files.lines(Paths.get("practica/Usuario.csv"))
                    .map(linea -> {
                        List<String> tokens = Arrays.asList(linea.split(";"));

                        Usuario user = new Usuario(tokens.get(0),
                                tokens.get(1),
                                tokens.get(2),
                                Genero.valueOf(tokens.get(3)),
                                LocalDate.parse(tokens.get(4)),
                                tokens.get(5),
                                tokens.get(6),
                                tokens.get(7)
                                );

                        return user;

                    })
                    .toList();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /*try {
            productos = Files.lines(Paths.get("practica/Prodocto.csv"))
                    .map(linea -> {
                        List<String> tokens = Arrays.asList(linea.split(";"));
                        Producto pro = new Producto(
                                tokens.get(0),
                                tokens.get(1),
                                tokens.get(2),
                                Categoria.valueOf(tokens.get(3)),
                                Estado.valueOf(tokens.get(4)),
                                Boolean.parseBoolean(tokens.get(5)),
                                Double.parseDouble(tokens.get(6)),
                                usuarios.get(usuarios.indexOf(new Usuario(tokens.get(7),
                                        null,null,null,null,null,null,null))));

                        )
                    });


        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/


        return gcv;

    }



}
