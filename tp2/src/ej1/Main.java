package ej1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int opcion = 0;
        Scanner input = new Scanner(System.in);
        ArrayList <Persona> listaPersonas = new ArrayList<>();
        Alumno alumno = new Alumno();
        Profesor profe = new Profesor();
        Empleado empleado = new Empleado();

        do {
            try{
                System.out.print(" 1: Ingresar Alumno\n 2: Ingresar Profesor\n 3: Ingresar Empleado\n 4: Mostar Lista\n 5: Siguente\n 6: eliminar\n 7: Salir\n opcion :  ");
                opcion = input.nextInt();

                switch (opcion) {
                    case 1:
                        alumno.setTipo(1);
                        input.nextLine(); //limpia el buffer
                        System.out.print("Nombre : ");
                        alumno.setNombre(input.nextLine());
                        System.out.print("Apellido : ");
                        alumno.setApellido(input.nextLine());
                        System.out.print("DNI : ");
                        alumno.setDni(input.nextLine());
                        System.out.print("Estado civil : ");
                        alumno.setEstadoCivil(input.nextLine());
                        System.out.print("Año incorporacion : ");
                        alumno.setAgeIncorporacion(input.nextInt());
                        listaPersonas.add(alumno);
                        break;
                    case 2:
                        profe.setTipo(2);
                        input.nextLine();
                        System.out.print("Nombre : ");
                        profe.setNombre(input.nextLine());
                        System.out.print("Apellido : ");
                        profe.setApellido(input.nextLine());
                        System.out.print("DNI : ");
                        profe.setDni(input.nextLine());
                        System.out.print("Estado civil : ");
                        profe.setEstadoCivil(input.nextLine());
                        System.out.print("Año incorporacion : ");
                        profe.setAgeIncorporacion(input.nextInt());
                        System.out.print("Oficina : ");
                        profe.setNumOficina(input.nextInt());
                        listaPersonas.add(profe);
                        break;
                    case 3:
                        empleado.setTipo(3);
                        input.nextLine();
                        System.out.print("Nombre : ");
                        empleado.setNombre(input.nextLine());
                        System.out.print("Apellido : ");
                        empleado.setApellido(input.nextLine());
                        System.out.print("DNI : ");
                        empleado.setDni(input.nextLine());
                        System.out.print("Estado civil : ");
                        empleado.setEstadoCivil(input.nextLine());
                        System.out.print("Año incorporacion : ");
                        empleado.setAgeIncorporacion(input.nextInt());
                        System.out.print("Despacho : ");
                        empleado.setNumDespacho(input.nextInt());
                        listaPersonas.add(empleado);
                        break;
                    case 4:
                        for (Persona per : listaPersonas) {
                            System.out.println("Nombre: " + per.getNombre() + "   Apellido: " + per.apellido + "   DNI: " + per.getDni() + "   Estado Civil: " + per.getEstadoCivil() + "   Año incorporacion: " + per.getAgeIncorporacion());
                        }
                        break;
                    case 5:
                        for (Persona per : listaPersonas) {
                            do {
                                System.out.print("1: sig   2 : cancel   opcion :  ");
                                opcion = input.nextInt();
                                System.out.println("Nombre: " + per.getNombre() + "   Apellido: " + per.apellido + "   DNI: " + per.getDni() + "   Estado Civil: " + per.getEstadoCivil() + "   Año incorporacion: " + per.getAgeIncorporacion());
                                break;
                            } while (opcion != 2);
                        }
                        break;
                    case 6:
                        for (int i = 0; i < listaPersonas.size(); i++) {
                            listaPersonas.get(i).getTipo();
                            System.out.print("Eliminar -->  1: Alumno   2: Profesor   3: Empleado   opcion : ");
                            opcion = input.nextInt();
                            switch (opcion) {
                                case 1:
                                    if (listaPersonas.get(i).getTipo() == 1) ;
                                    listaPersonas.remove(i);
                                    break;
                                case 2:
                                    if (listaPersonas.get(i).getTipo() == 2) ;
                                    listaPersonas.remove(i);
                                    break;
                                case 3:
                                    if (listaPersonas.get(i).getTipo() == 3) ;
                                    listaPersonas.remove(i);
                                    break;
                            }
                        }
                        break;
                    case 7 :break;
                    default:
                        System.out.println("Elija numero del 1 al 6");
                }
            }
            catch(InputMismatchException e){
                System.out.println("dato incorrecto");
                break;
            }
        }while (opcion != 7 );
    }
}

