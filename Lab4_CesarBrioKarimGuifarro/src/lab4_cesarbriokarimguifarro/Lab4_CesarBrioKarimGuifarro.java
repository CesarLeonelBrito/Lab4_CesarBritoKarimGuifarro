package lab4_cesarbriokarimguifarro;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Lab4_CesarBrioKarimGuifarro {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) throws ParseException {
        
        ArrayList<Equipo> equipos = new ArrayList();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        int opcion = 1;
        
        while (opcion != 6) {
            System.out.print("===========MENU===========\n"
                    + "1. Agregar Equipo\n"
                    + "2. Modificar Equipo\n"
                    + "3. Eliminar Equipo\n"
                    + "4. Listar Equipo\n"
                    + "5. Simulacion del juego\n"
                    + "6. Salir del menu\n"
                    + "Ingrese su opcion: ");
            opcion = sc.nextInt();
            if (opcion == 1) {
                System.out.print("Ingrese el nombre del equipo: ");
                String nombreEquipo = sc.next();
                System.out.print("Ingrese el nombre del estadio: ");
                String estadio = sc.next();
                System.out.print("Ingrese el Pais: ");
                String pais = sc.next();
                System.out.print("Ingrese el nombre del nombre del entrenador: ");
                String nombreEntrenador = sc.next();
                System.out.print("Ingrese el nombre del nombre del dueño: ");
                String nombreDueño = sc.next();
                System.out.print("Ingrese el nombre del nombre de la mascota: ");
                String nombreMascota = sc.next();
                System.out.print("Ingrese el color del equipo: ");
                String color = sc.next();
                Date fecha = new Date();
                System.out.print("Ingrese su fecha de creacion dd/MM/yyyy: ");
                String entrada = sc.next();
                fecha = sdf.parse(entrada);
                ArrayList<Jugador> jugadores = new ArrayList();
                System.out.println("******JUGADORES******");
                System.out.println("***PATEADORES***");
                for (int i = 0; i < 3; i++) {
                    System.out.println("Nuevo Jugador*************");
                    System.out.print("Ingrese el nombre del jugador: ");
                    String nombre = sc.next();
                    System.out.print("Ingrese el apodo del jugador: ");
                    String apodo = sc.next();
                    System.out.print("Ingrese el numero de camiseta: ");
                    int numeroCamiseta = sc.nextInt();
                    System.out.print("Ingrese el equipo de futbol favorito: ");
                    String equipoFutFsvorito = sc.next();
                    System.out.print("Ingrese el equipo de Basketball favorito: ");
                    String equipoFBaskFsvorito = sc.next();
                    boolean mayor;
                    System.out.print("Es mayor de edad[s/n]: ");
                    char age = sc.next().charAt(0);
                    if (age == 's' || age == 'S') {
                        mayor = true;
                    } else {
                        mayor = false;
                    }
                    System.out.print("Ingrese el año de nacimiento: ");
                    int nacimiento = sc.nextInt();
                    System.out.print("Ingrese la cantidad de estrellas: ");
                    int estrellas = sc.nextInt();
                    System.out.print("Ingrese la habilidad pateadora[1-100]: ");
                    int habilidadPateadora = sc.nextInt();
                    System.out.print("Ingrese la fuerza[1-100]: ");
                    int fuerza = sc.nextInt();
                    System.out.print("Ingrese la habilidad ragateodora[1-100]: ");
                    int habilidadRagateadora = sc.nextInt();
                    jugadores.add(new Pateador(habilidadPateadora, fuerza, habilidadRagateadora, nombre, apodo, numeroCamiseta, equipoFutFsvorito, equipoFBaskFsvorito, equipoFutFsvorito, mayor, nacimiento, estrellas));
                }
                System.out.println("***TIRADORES***");
                for (int i = 0; i < 2; i++) {
                    System.out.println("Nuevo Jugador*************");
                    System.out.print("Ingrese el nombre del jugador: ");
                    String nombre = sc.next();
                    System.out.print("Ingrese el apodo del jugador: ");
                    String apodo = sc.next();
                    System.out.print("Ingrese el numero de camiseta: ");
                    int numeroCamiseta = sc.nextInt();
                    System.out.print("Ingrese el equipo de futbol favorito: ");
                    String equipoFutFsvorito = sc.next();
                    System.out.print("Ingrese el equipo de Basketball favorito: ");
                    String equipoFBaskFsvorito = sc.next();
                    boolean mayor;
                    System.out.print("Es mayor de edad[s/n]: ");
                    char age = sc.next().charAt(0);
                    if (age == 's' || age == 'S') {
                        mayor = true;
                    } else {
                        mayor = false;
                    }
                    System.out.print("Ingrese el año de nacimiento: ");
                    int nacimiento = sc.nextInt();
                    System.out.print("Ingrese la cantidad de estrellas: ");
                    int estrellas = sc.nextInt();
                    System.out.print("Ingrese el tiro de tres[1-100]: ");
                    int tiroTres = sc.nextInt();
                    System.out.print("Ingrese el tiro de dos[1-100]: ");
                    int tiroDos = sc.nextInt();
                    System.out.print("Ingrese el manejo del balon[1-100]: ");
                    int manejoBalon = sc.nextInt();
                    jugadores.add(new Tirador(tiroTres, tiroDos, manejoBalon, nombre, apodo, numeroCamiseta, equipoFutFsvorito, equipoFBaskFsvorito, equipoFutFsvorito, mayor, nacimiento, estrellas));
                }
                equipos.add(new Equipo(nombreEquipo, estadio, pais, nombreEntrenador, nombreDueño, nombreMascota, color, fecha, jugadores));
            } else if (opcion == 2) {
                System.out.print("Ingrese la posicion del equipo que desea modificar: ");
                int p = sc.nextInt();
                if (p < equipos.size()) {
                    System.out.print("******OPCIONES******\n"
                            + "1. Nombre del equipo\n"
                            + "2. Estadio\n"
                            + "3. Pais\n"
                            + "4. Entrenador\n"
                            + "5. Dueño\n"
                            + "6. Mascota\n"
                            + "7. Color\n"
                            + "8. Fecha\n"
                            + "9. Jugadores\n"
                            + "Ingrese su opcion: ");
                    int modi = sc.nextInt();
                    if (modi == 1) {
                        System.out.print("Ingrese el nombre del equipo: ");
                        String nombreEquipo = sc.next();
                        equipos.get(p).setNombreEquipo(nombreEquipo);
                    } else if (modi == 2) {
                        System.out.print("Ingrese el nombre del estadio: ");
                        String estadio = sc.next();
                        equipos.get(p).setEstadio(estadio);
                    } else if (modi == 3) {
                        System.out.print("Ingrese el Pais: ");
                        String pais = sc.next();
                        equipos.get(p).setPais(pais);
                    } else if (modi == 4) {
                        System.out.print("Ingrese el nombre del nombre del entrenador: ");
                        String nombreEntrenador = sc.next();
                        equipos.get(p).setNombreEntrenador(nombreEntrenador);
                    } else if (modi == 5) {
                        System.out.print("Ingrese el nombre del nombre del dueño: ");
                        String nombreDueño = sc.next();
                        equipos.get(p).setNombreDueño(nombreDueño);
                    } else if (modi == 6) {
                        System.out.print("Ingrese el nombre del nombre de la mascota: ");
                        String nombreMascota = sc.next();
                        equipos.get(p).setNombreMascota(nombreMascota);
                    } else if (modi == 7) {
                        System.out.print("Ingrese el color del equipo: ");
                        String color = sc.next();
                        equipos.get(p).setColor(color);
                    } else if (modi == 8) {
                        Date fecha = new Date();
                        System.out.print("Ingrese su fecha de nacimiento dd/MM/yyyy: ");
                        String entrada = sc.next();
                        fecha = sdf.parse(entrada);
                        equipos.get(p).setFecha(fecha);
                    } else if (modi == 9) {
                        ArrayList<Jugador> jugadores = new ArrayList();
                        System.out.println("******JUGADORES******");
                        System.out.println("***PATEADORES***");
                        for (int i = 0; i < 3; i++) {
                            System.out.println("Nuevo Jugador");
                            System.out.print("Ingrese el nombre del jugador: ");
                            String nombre = sc.next();
                            System.out.print("Ingrese el apodo del jugador: ");
                            String apodo = sc.next();
                            System.out.print("Ingrese el numero de camiseta: ");
                            int numeroCamiseta = sc.nextInt();
                            System.out.print("Ingrese el equipo de futbol favorito: ");
                            String equipoFutFsvorito = sc.next();
                            System.out.print("Ingrese el equipo de Basketball favorito: ");
                            String equipoFBaskFsvorito = sc.next();
                            boolean mayor;
                            System.out.print("Es mayor de edad[s/n]: ");
                            char age = sc.next().charAt(0);
                            if (age == 's' || age == 'S') {
                                mayor = true;
                            } else {
                                mayor = false;
                            }
                            System.out.print("Ingrese el año de nacimiento: ");
                            int nacimiento = sc.nextInt();
                            System.out.print("Ingrese la cantidad de estrellas: ");
                            int estrellas = sc.nextInt();
                            System.out.print("Ingrese la habilidad pateadora[1-100]: ");
                            int habilidadPateadora = sc.nextInt();
                            System.out.print("Ingrese la fuerza[1-100]: ");
                            int fuerza = sc.nextInt();
                            System.out.print("Ingrese la habilidad ragateodora[1-100]: ");
                            int habilidadRagateadora = sc.nextInt();
                            jugadores.add(new Pateador(habilidadPateadora, fuerza, habilidadRagateadora, nombre, apodo, numeroCamiseta, equipoFutFsvorito, equipoFBaskFsvorito, equipoFutFsvorito, mayor, nacimiento, estrellas));
                        }
                        System.out.println("***TIRADORES***");
                        for (int i = 0; i < 2; i++) {
                            System.out.println("Nuevo Jugador");
                            System.out.print("Ingrese el nombre del jugador: ");
                            String nombre = sc.next();
                            System.out.print("Ingrese el apodo del jugador: ");
                            String apodo = sc.next();
                            System.out.print("Ingrese el numero de camiseta: ");
                            int numeroCamiseta = sc.nextInt();
                            System.out.print("Ingrese el equipo de futbol favorito: ");
                            String equipoFutFsvorito = sc.next();
                            System.out.print("Ingrese el equipo de Basketball favorito: ");
                            String equipoFBaskFsvorito = sc.next();
                            boolean mayor;
                            System.out.print("Es mayor de edad[s/n]: ");
                            char age = sc.next().charAt(0);
                            if (age == 's' || age == 'S') {
                                mayor = true;
                            } else {
                                mayor = false;
                            }
                            System.out.print("Ingrese el año de nacimiento: ");
                            int nacimiento = sc.nextInt();
                            System.out.print("Ingrese la cantidad de estrellas: ");
                            int estrellas = sc.nextInt();
                            System.out.print("Ingrese el tiro de tres[1-100]: ");
                            int tiroTres = sc.nextInt();
                            System.out.print("Ingrese el tiro de dos[1-100]: ");
                            int tiroDos = sc.nextInt();
                            System.out.print("Ingrese el manejo del balon[1-100]: ");
                            int manejoBalon = sc.nextInt();
                            jugadores.add(new Tirador(tiroTres, tiroDos, manejoBalon, nombre, apodo, numeroCamiseta, equipoFutFsvorito, equipoFBaskFsvorito, equipoFutFsvorito, mayor, nacimiento, estrellas));
                        }
                        equipos.get(p).setJugadores(jugadores);
                    } else {
                        System.out.println("OPCION NO DISPONIBLE");
                    }
                    
                } else {
                    System.out.println("Esta posicion no esta disponible");
                }
                
            } else if (opcion == 3) {
                System.out.print("Ingrese la posicion del equipo que desea eliminar: ");
                int p = sc.nextInt();
                if (p < equipos.size()) {
                    equipos.remove(p);
                } else {
                    System.out.println("Esta posicion no esta disponible");
                }
                
            } else if (opcion == 4) {
                for (Object e : equipos) {
                    System.out.println(equipos.indexOf(e) + " - " + e);
                }
                
            } else if (opcion == 5) {
                if (equipos.size() > 2) {
                    System.out.print("Ingrese la posicion del equipo 1 para jugar: ");
                    int p = sc.nextInt();
                    while (p >= equipos.size()) {
                        System.out.println("Opcion no valida");
                        System.out.print("Ingrese la posicion del equipo 1 para jugar: ");
                        p = sc.nextInt();
                    }
                    Object equipo1 = equipos.get(p);
                    System.out.print("Ingrese la posicion del equipo 2 para jugar: ");
                    int p2 = sc.nextInt();
                    while (p2 == p || p2 >= equipos.size()) {
                        System.out.println("Opcion no valida(no puede repetir equipo)");
                        System.out.print("Ingrese la posicion del equipo para jugar: ");
                        p2 = sc.nextInt();
                    }
                    Object equipo2 = equipos.get(p2);
                    simulacion(equipo1, equipo2);
                } else {
                    System.out.println("NO HAY SUFICIENTES EQUIPOS");
                }
                
            } else if (opcion == 6) {
                System.out.println("SALIENDO DEL PROGRAMA.....");
            } else {
                System.out.println("OPCION NO DISPOBIBLE");
            }
        }
    }
    
    public static void simulacion(Object equipo1, Object equipo2) {
        
    }
    
}
