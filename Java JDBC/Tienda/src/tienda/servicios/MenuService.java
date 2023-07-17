/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.servicios;

import java.util.Scanner;

/**
 *
 * @author CamiloH
 */
public class MenuService {

    int option = 0;
    Scanner read = new Scanner(System.in);
    ProductoService pService = new ProductoService();
    FabricanteService fService = new FabricanteService();

    public void menuMain() throws Exception {
        do {
            try {
                System.out.println("    Bienvenido a la Tienda Virtual     ");
                System.out.println("----------------------------");
                System.out.println("       Menú Opciones         ");
                System.out.println("----------------------------");
                System.out.println("1. Listar nombre de los productos");
                System.out.println("2. Listar los nombres y los precios de "
                        + "los productos");
                System.out.println("3. Listar productos donde el precio esta "
                        + "entre 120 y 202");
                System.out.println("4. Buscar y listar todos los productos "
                        + "que son portatiles");
                System.out.println("5. Listar el nombre y el precio del "
                        + "producto mas barato");
                System.out.println("6. Ingresar un producto en la base de datos");
                System.out.println("7. Ingresar un fabricante en la base de datos");
                System.out.println("8. Editar un producto con datos a elección.");
                System.out.println("9. Salir");
                System.out.println("-------------------------------------------");
                System.out.print("Elija una opción: ");
                String g = read.nextLine();

                option = Integer.parseInt(g);
                optionsMenu(option);

            } catch (Exception e) {
                System.out.println("Ingrese un valor valido");
                option = 0;
            }
        } while (option != 9);

    }

    public void optionsMenu(int opcion) throws Exception {
        switch (opcion) {
            case 1:
                pService.imprimirNombreProductos();
                System.out.println("");
                break;
            case 2:
                pService.imprimirNombrePrecioProductos();
                System.out.println("");
                break;
            case 3:
                pService.consultaxPrecioProducto();
                System.out.println("");
                break;
            case 4:
                pService.consultarTipoProducto();
                System.out.println("");
                break;
            case 5:
                pService.consultarProductoBarato();
                System.out.println("");
                break;
            case 6:
                pService.insertarProducto();
                System.out.println("");
                break;
            case 7:
                fService.insertarFabricante();
                System.out.println("");
                break;
            case 8:
                
                System.out.println("");
                break;
            case 9:
                System.out.println("Ha elegido salir de la aplicación");
                break;    
            default:
                System.out.println("Opción incorrecta");
        }

    }

}
