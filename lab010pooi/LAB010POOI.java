package LAB010POOI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class LAB010POOI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Paciente> listaPacientes = new ArrayList<>();
        List<Medico> listaDoctores = new ArrayList<>();
        int opcion;
        double peso = 0;
        double pesoMasRepetido = 0;
        int maxFrecuencia = 0;
        
        // Definir un mapa para almacenar la frecuencia de cada peso
        Map<Double, Integer> frecuenciaPesos = new HashMap<>();
        
        
        // Definir un médico antes de usarlo en un paciente
        Medico Martinez = new Medico(11111, "Dr. Martinez", "Pediatria");
        Medico Gonzalez = new Medico(22222, "Dra. Gonzalez", "Dermatologia");
        Medico Rodriguez = new Medico(33333, "Dr. Rodriguez", "Gastroenterologia");
        Medico Ramirez = new Medico(44444, "Dra. Ramirez", "Neurologia");
        Medico Flores = new Medico(55555, "Dr. Flores", "Oftalmologia");
        Medico Sanchez = new Medico(66666, "Dra. Sanchez", "Endocrinologia");
        Medico Lopez = new Medico(77777, "Dr. Lopez", "Cirugia General");
        Medico Perez = new Medico(88888, "Dra. Perez", "Urologia");
        Medico Mendoza = new Medico(99999, "Dr. Mendoza", "Oncologia");
        Medico Castro = new Medico(10101, "Dra. Castro", "Reumatologia");
        Medico Diaz = new Medico(20202, "Dr. Diaz", "Nefrologia");
        Medico Ortega = new Medico(30303, "Dra. Ortega", "Hematologia");
        Medico Jimenez = new Medico(40404, "Dr. Jimenez", "Infectologia");
        Medico Silva = new Medico(50505, "Dra. Silva", "Psiquiatria");
        Medico Cruz = new Medico(60606, "Dr. Cruz", "Otorrinolaringologia");
        Medico Navarro = new Medico(70707, "Dra. Navarro", "Traumatologia");
        Medico Avila = new Medico(80808, "Dr. Avila", "Medicina Interna");
        Medico Torres = new Medico(90909, "Dra. Torres", "Alergologia");
        Medico Vega = new Medico(11112, "Dr. Vega", "Cardiologia Pediatrica");
        Medico Hernandez = new Medico(22223, "Dra. Hernandez", "Cirugia Plastica");
        
        // Agregar médicos a la lista de doctores
        listaDoctores.addAll(Arrays.asList(Martinez, Gonzalez, Rodriguez, Ramirez, Flores, Sanchez, Lopez, Perez,
        Mendoza, Castro, Diaz, Ortega, Jimenez, Silva, Cruz, Navarro, Avila, Torres, Vega, Hernandez));
        
        // Agregar algunos pacientes a la lista
        listaPacientes.add(new Paciente(123456789, "Juan Perez", "Calle 123", 70.5, 37.2, listaDoctores.get(0)));
        listaPacientes.add(new Paciente(987654321, "Maria Rodriguez", "Avenida 456", 65.2, 36.8, listaDoctores.get(1)));
        listaPacientes.add(new Paciente(111222333, "Carlos Sanchez", "Callejon 789", 80.0, 37.5, listaDoctores.get(2)));
        listaPacientes.add(new Paciente(555666777, "Ana Lopez", "Plaza Principal", 55.8, 36.9, listaDoctores.get(3)));
        listaPacientes.add(new Paciente(999888777, "Luis Ramirez", "Avenida Central", 68.3, 37.0, listaDoctores.get(4)));
        listaPacientes.add(new Paciente(333222111, "Laura Martinez", "Calle 567", 62.0, 36.7, listaDoctores.get(5)));
        listaPacientes.add(new Paciente(444555666, "Roberto Gonzalez", "Calle 890", 75.5, 37.8, listaDoctores.get(6)));
        listaPacientes.add(new Paciente(777888999, "Elena Castro", "Avenida 123", 61.2, 36.5, listaDoctores.get(7)));
        listaPacientes.add(new Paciente(888777666, "Pedro Hernandez", "Callejon 456", 85.0, 38.1, listaDoctores.get(8)));
        listaPacientes.add(new Paciente(222333444, "Sofia Diaz", "Plaza Secundaria", 58.7, 36.6, listaDoctores.get(9)));
        listaPacientes.add(new Paciente(666555444, "Alejandro Vega", "Avenida 789", 72.4, 37.3, listaDoctores.get(10)));
        listaPacientes.add(new Paciente(121212121, "Isabel Mendoza", "Calle 101", 63.8, 36.8, listaDoctores.get(11)));
        listaPacientes.add(new Paciente(343434343, "Fernando Cruz", "Callejon 112", 77.1, 37.7, listaDoctores.get(12)));
        listaPacientes.add(new Paciente(565656565, "Rosa Navarro", "Avenida 131", 69.5, 37.0, listaDoctores.get(13)));
        listaPacientes.add(new Paciente(787878787, "Diego Ortega", "Plaza Principal", 72.4, 37.4, listaDoctores.get(14)));
        listaPacientes.add(new Paciente(909090909, "Julia Jimenez", "Calle 141", 66.9, 36.9, listaDoctores.get(15)));
        listaPacientes.add(new Paciente(232323232, "Manuel Silva", "Avenida 151", 82.3, 37.9, listaDoctores.get(16)));
        listaPacientes.add(new Paciente(454545454, "Carmen Torres", "Callejon 161", 60.4, 36.7, listaDoctores.get(17)));
        listaPacientes.add(new Paciente(676767676, "Hector Flores", "Calle 171", 79.8, 38.0, listaDoctores.get(18)));
        listaPacientes.add(new Paciente(898989898, "Monica Avila", "Plaza Central", 67.1, 36.6, listaDoctores.get(19)));

    do {
            System.out.println("1-REGISTRAR NUEVO PACIENTE");
            System.out.println("2-ELIMINAR PACIENTE");
            System.out.println("3-MODIFICAR DATOS DE PACIENTE");
            System.out.println("4-MOSTRAR PESO MAS REPETIDO");
            System.out.println("5-CANTIDAD DE PACIENTES CON PESO MAS REPETIDO");
            System.out.println("6-MOSTRAR PESO MAYOR Y MENOR");
            System.out.println("7-MOSTRAR CANTIDAD DE PACIENTES EN RANGOS DE PESO");
            System.out.println("8-MOSTRAR LISTA DE PACIENTES ORDENADOS POR APELLIDOS");
            System.out.println("9-INDICAR DOCTOR QUE ATIENDE A UN PACIENTE");
            System.out.println("10-BUSCAR DOCTORES POR ESPECIALIDAD");
            System.out.println("11-SALIR");
            System.out.print(" QUE ACTIVIDAD DESEA EJECUTAR? ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("****** REGISTRAR NUEVO PACIENTE ******");
                    System.out.print("Ingrese el DNI del paciente: ");
                    int dni = scanner.nextInt();
                    scanner.nextLine();  // Limpiar el buffer de entrada
                    System.out.print("Ingrese el nombre del paciente: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese la direccion del paciente: ");
                    String direccion = scanner.nextLine();
                    System.out.print("Ingrese el peso del paciente: ");
                    peso = scanner.nextDouble();
                    System.out.print("Ingrese la temperatura del paciente: ");
                    double temperatura = scanner.nextDouble();

                    // Asignar un médico al azar al paciente (puedes ajustar esta lógica según tus necesidades)
                    Medico medicoAsignado = listaDoctores.get(new Random().nextInt(listaDoctores.size()));

                    // Crear un nuevo paciente y agregarlo a la lista
                    Paciente nuevoPaciente = new Paciente(dni, nombre, direccion, peso, temperatura, medicoAsignado);
                    listaPacientes.add(nuevoPaciente);

                    System.out.println("Paciente registrado con exito.");
                    break;
                case 2:
                    System.out.println("****** ELIMINAR PACIENTE ******");
                    System.out.print("Ingrese la posicion del paciente que desea eliminar: ");
                    int posicionEliminar = scanner.nextInt();
    
                    // Verificar si la posición es válida
                    if (posicionEliminar >= 0 && posicionEliminar < listaPacientes.size()) {
                    // Eliminar el paciente en la posición especificada
                    Paciente pacienteEliminado = listaPacientes.remove(posicionEliminar);
                    System.out.println("Paciente eliminado con exito:");
                    System.out.println(pacienteEliminado);
                    } else {
                    System.out.println("Posicion no valida. No se pudo eliminar el paciente.");
                    }
                    break;
                case 3:
                    System.out.println("****** MODIFICAR DATOS DE PACIENTE ******");
                    System.out.print("Ingrese la posicion del paciente que desea modificar: ");
                    int posicionModificar = scanner.nextInt();

                    // Verificar si la posición es válida
                    if (posicionModificar >= 0 && posicionModificar < listaPacientes.size()) {
                    // Obtener el paciente en la posición especificada
                    Paciente pacienteAModificar = listaPacientes.get(posicionModificar);

                    // Mostrar la información actual del paciente
                    System.out.println("Datos actuales del paciente:");
                    System.out.println(pacienteAModificar);

                    // Solicitar nuevos datos al usuario
                    System.out.print("Ingrese el nuevo DNI del paciente: ");
                    int nuevoDni = scanner.nextInt();
                    scanner.nextLine();  // Limpiar el buffer de entrada
                    System.out.print("Ingrese el nuevo nombre del paciente: ");
                    String nuevoNombre = scanner.nextLine();
                    System.out.print("Ingrese la nueva direccion del paciente: ");
                    String nuevaDireccion = scanner.nextLine();
                    System.out.print("Ingrese el nuevo peso del paciente: ");
                    double nuevoPeso = scanner.nextDouble();
                    System.out.print("Ingrese la nueva temperatura del paciente: ");
                    double nuevaTemperatura = scanner.nextDouble();

                    // Modificar los datos del paciente
                    pacienteAModificar.setDni(nuevoDni);
                    pacienteAModificar.setNombre(nuevoNombre);
                    pacienteAModificar.setDireccion(nuevaDireccion);
                    pacienteAModificar.setPeso(nuevoPeso);
                    pacienteAModificar.setTemperatura(nuevaTemperatura);

                    System.out.println("Datos del paciente modificados con exito:");
                    System.out.println(pacienteAModificar);
                    } else {
                    System.out.println("Posicion no valida. No se pudo modificar el paciente.");
                    }
                    break;
                case 4:
                    System.out.println("****** MOSTRAR PESO MAS REPETIDO ******");

                    // Limpiar el mapa de frecuencia antes de volver a contar
                    frecuenciaPesos.clear();

                    // Iterar sobre la lista de pacientes y contar la frecuencia de cada peso
                    for (Paciente paciente : listaPacientes) {
                    double pesoPaciente = paciente.getPeso();
                    frecuenciaPesos.put(pesoPaciente, frecuenciaPesos.getOrDefault(pesoPaciente, 0) + 1);
                    }

                    // Encontrar el peso con la mayor frecuencia
                    for (Map.Entry<Double, Integer> entry : frecuenciaPesos.entrySet()) {
                    if (entry.getValue() > maxFrecuencia) {
                    maxFrecuencia = entry.getValue();
                    pesoMasRepetido = entry.getKey();
                    }
                    }
                    
                    // Mostrar el resultado
                    if (maxFrecuencia > 1) {
                    System.out.println("El peso mas repetido es: " + pesoMasRepetido);
                    } else {
                    System.out.println("No hay un peso mas repetido. Todos los pesos son unicos en la lista.");
                    }
                    break;

                case 5:
                    System.out.println("****** CANTIDAD DE PACIENTES CON PESO MAS REPETIDO ******");
                 
                    for (Map.Entry<Double, Integer> entry : frecuenciaPesos.entrySet()) {
                        if (entry.getValue() > maxFrecuencia) {
                            maxFrecuencia = entry.getValue();
                            pesoMasRepetido = entry.getKey();
                        }
                    }

                    // Mostrar la cantidad de pacientes con el peso más repetido
                    int cantidadPacientesConPesoRepetido = 0;

                    for (Paciente paciente : listaPacientes) {
                        if (paciente.getPeso() == pesoMasRepetido) {
                            cantidadPacientesConPesoRepetido++;
                        }
                    }

                    System.out.println("La cantidad de pacientes con el peso mas repetido (" + pesoMasRepetido + ") es: " + cantidadPacientesConPesoRepetido);
                    break;

                case 6:
                    System.out.println("****** MOSTRAR PESO MAYOR Y MENOR ******");

                    // Encontrar el peso mayor y menor
                    double pesoMayor = Double.MIN_VALUE;
                    double pesoMenor = Double.MAX_VALUE;

                    for (Paciente paciente : listaPacientes) {
                    double pesoActual = paciente.getPeso();
                    if (pesoActual > pesoMayor) {
                    pesoMayor = pesoActual;
                    }
                    if (pesoActual < pesoMenor) {
                    pesoMenor = pesoActual;
                    }
                    }

                    // Mostrar el peso mayor y menor
                    System.out.println("El peso mayor es: " + pesoMayor);
                    System.out.println("El peso menor es: " + pesoMenor);
                    break;
                case 7:
                    System.out.println("****** MOSTRAR CANTIDAD DE PACIENTES EN RANGOS DE PESO ******");

                    // Definir los límites de los rangos de peso
                    double pesoMinimo = 40.0;
                    double pesoMaximo = 120.0;
                    int cantidadRangos = 4;

                    // Calcular el tamaño de cada rango
                    double rango = (pesoMaximo - pesoMinimo) / cantidadRangos;

                    // Inicializar un arreglo para contar la cantidad de pacientes en cada rango
                    int[] conteoRangos = new int[cantidadRangos];

                    // Contar la cantidad de pacientes en cada rango
                    for (Paciente paciente : listaPacientes) {
                    double pesoPaciente = paciente.getPeso();
                    int indiceRango = (int) ((pesoPaciente - pesoMinimo) / rango);
                    // Asegurar que el índice esté en el rango [0, cantidadRangos - 1]
                    indiceRango = Math.min(Math.max(indiceRango, 0), cantidadRangos - 1);
                    conteoRangos[indiceRango]++;
                    }

                    // Mostrar la cantidad de pacientes en cada rango
                    for (int i = 0; i < cantidadRangos; i++) {
                    double rangoMinimo = pesoMinimo + i * rango;
                    double rangoMaximo = pesoMinimo + (i + 1) * rango;
                    System.out.println("Rango " + (i + 1) + ": " + conteoRangos[i] +
                    " pacientes (de " + rangoMinimo + " a " + rangoMaximo + " kg)");
                    }
                    break;
                case 8:
                    System.out.println("****** MOSTRAR LISTA DE PACIENTES ORDENADOS POR NOMBRES ******");

                    // Definir un comparador personalizado para ordenar por nombres y otros campos en caso de empate
                    Comparator<Paciente> comparadorPersonalizado = Comparator
                    .comparing(Paciente::getNombre)
                    .thenComparing(Paciente::getDni)
                    .thenComparing(Paciente::getDireccion)
                    .thenComparing(Paciente::getPeso)
                    .thenComparing(Paciente::getTemperatura);

                    // Ordenar la lista de pacientes
                    Collections.sort(listaPacientes, comparadorPersonalizado);

                    // Mostrar la lista ordenada
                    for (Paciente paciente : listaPacientes) {
                    // Imprimir primero el nombre
                    System.out.println("Nombre: " + paciente.getNombre() +
                    ", DNI: " + paciente.getDni() +
                    ", Direccion: " + paciente.getDireccion() +
                    ", Peso: " + paciente.getPeso() +
                    ", Temperatura: " + paciente.getTemperatura());
                    }
                    break;
                case 9:
                    System.out.println("****** INDICAR DOCTOR QUE ATIENDE A UN PACIENTE ******");
                    System.out.print("Ingrese el DNI del paciente: ");
                    int dniPaciente = scanner.nextInt();

                    // Buscar el paciente por DNI
                    Paciente pacienteBuscado = null;
                    for (Paciente paciente : listaPacientes) {
                    if (paciente.getDni() == dniPaciente) {
                    pacienteBuscado = paciente;
                    break;
                    }
                    }
                    
                    // Mostrar información de depuración
                    System.out.println("Datos del paciente: " + pacienteBuscado);

                    // Mostrar el médico asociado al paciente
                    if (pacienteBuscado != null) {
                    Medico medicoAsociado = pacienteBuscado.getMedico();
                    System.out.println("Datos del medico: " + medicoAsociado);
                    if (medicoAsociado != null) {
                    System.out.println("El paciente " + pacienteBuscado.getNombre() +
                    " fue atendido por el doctor " + medicoAsociado.getNombre() +
                    " con especialidad " + medicoAsociado.getEspecialidad());
                    } else {
                    System.out.println("El paciente " + pacienteBuscado.getNombre() +
                    " no tiene asignado un medico.");
                    }
                    } else {
                    System.out.println("No se encontro un paciente con el DNI proporcionado.");
                    }
                    break;
                case 10:
                    System.out.println("****** BUSCAR DOCTORES POR ESPECIALIDAD ******");
                    System.out.print("Ingrese la especialidad a buscar: ");
                    scanner.nextLine();  // Limpiar el buffer de entrada
                    String especialidadBuscada = scanner.nextLine().trim().toLowerCase();  // Normalizar la especialidad

                    // Mostrar la especialidad buscada
                    System.out.println("Especialidad buscada: " + especialidadBuscada);

                    // Buscar doctores por especialidad
                    List<Medico> doctoresEncontrados = new ArrayList<>();
                    for (Medico doctor : listaDoctores) {
                    // Utilizar equalsIgnoreCase para una comparación que no distinga mayúsculas de minúsculas
                    if (doctor.getEspecialidad().equalsIgnoreCase(especialidadBuscada)) {
                    doctoresEncontrados.add(doctor);
                        }
                    }

                    // Mostrar los doctores encontrados
                    if (!doctoresEncontrados.isEmpty()) {
                    System.out.println("Doctores encontrados con especialidad '" + especialidadBuscada + "':");
                    for (Medico doctorEncontrado : doctoresEncontrados) {
                    System.out.println("Numero de Colegiatura: " + doctorEncontrado.getNumeroColegiatura() +
                    ", Nombre: " + doctorEncontrado.getNombre());
                    }
                    } else {
                    System.out.println("No se encontraron doctores con la especialidad proporcionada.");
                    }
                    break;
                case 11:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
                    break;
            }

            if (opcion != 11) {
                System.out.print(" DESEA INGRESAR OTRA OPCION? (1-SI, 0-NO): ");
                int continuar = scanner.nextInt();
                if (continuar != 1) {
                    opcion = 11; // Terminar el bucle
                }
            }
        } while (opcion != 11);
    }
}