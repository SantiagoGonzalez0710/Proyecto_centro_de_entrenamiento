## Actividad 1: Identificación de Objetos (Ejercicio 01) ##

**Identificación de Objetos – Centro de Entrenamiento “FitPro Training”**

Estudiante: Santiago Alexander Niño González
Ficha: 3228973B
Dominio: Centro de Entrenamiento “FitPro Training”

**1. Objeto: Cliente**

¿Qué es?
Persona que recibe servicios de entrenamiento y seguimiento físico personalizado dentro del centro.

Características (Atributos):
nombre, cédula, edad, peso, altura, objetivoFitness, planAsignado, progresoSemanal

Comportamientos (Métodos):
registrarMedidas(), asignarRutina(), actualizarProgreso(), consultarPlan(), generarReporte()

**2. Objeto: Entrenador**

¿Qué es?
Profesional certificado encargado de planificar, guiar y supervisar los entrenamientos de los clientes.

Características (Atributos):
nombre, idEntrenador, especialidad, certificaciones, horarioDisponible

Comportamientos (Métodos):
crearRutina(), evaluarCliente(), actualizarHorario(), registrarAsistencia()

**3. Objeto: Rutina de Entrenamiento**

¿Qué es?
Conjunto estructurado de ejercicios y repeticiones asignado a un cliente según su nivel físico y objetivo.

Características (Atributos):
nombreRutina, nivel, duraciónSemanal, listaEjercicios, objetivo

Comportamientos (Métodos):
agregarEjercicio(), modificarRutina(), calcularDuraciónTotal(), mostrarRutina()

**4. Objeto: Ejercicio**

¿Qué es?
Actividad física específica que forma parte de una rutina de entrenamiento.

Características (Atributos):
nombreEjercicio, grupoMuscular, repeticiones, series, pesoUsado, tiempoDescanso

Comportamientos (Métodos):
ejecutar(), aumentarPeso(), modificarRepeticiones(), consultarDetalles()

**5. Objeto: Plan de Membresía**

¿Qué es?
Paquete de servicios que define el acceso del cliente al gimnasio (duración, beneficios y precio).

Características (Atributos):
tipoPlan, duraciónMeses, precio, beneficios, estado

Comportamientos (Métodos):
activarPlan(), renovarPlan(), cancelarPlan(), consultarBeneficios()

# Actividad 2: Comparación de Paradigmas (Ejercicio 02)

1. **Programación estructurada** (usando variables sueltas y funciones)
2. **Programación orientada a objetos** (usando una clase)

# SOLUCION:

1. **Programación estructurada**

/**
* Gestión de Cliente - Enfoque Estructurado
  */

public class GestionClienteEstructurada {

    // Variables globales (datos del cliente)

    static String nombre;
    static int edad;
    static double peso;
    static double altura;
    static String objetivo;

    // Función para calcular el IMC

    static double calcularIMC() {
        return peso / (altura * altura);
    }

    // Función para mostrar la información del cliente

    static void mostrarInformacion() {
        System.out.println("=== Información del Cliente ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " m");
        System.out.println("Objetivo: " + objetivo);
        System.out.println("IMC: " + calcularIMC());
    }

    public static void main(String[] args) {

        // Inicializar datos del cliente

        nombre = "Carlos Ramírez";
        edad = 28;
        peso = 78.5;
        altura = 1.80;
        objetivo = "Aumentar masa muscular";

        // Mostrar información

        mostrarInformacion();
    }
}


** 2. Programación orientada a objetos **

/**
* Gestión de Cliente - Enfoque POO
  */
  public class ClienteEntrenamiento {

  // Atributos (datos del cliente)

  private String nombre;
  private int edad;
  private double peso;
  private double altura;
  private String objetivo;
  private double progresoMensual;

  // Constructor

  public ClienteEntrenamiento(String nombre, int edad, double peso, double altura, String objetivo, double progresoMensual) {
  this.nombre = nombre;
  this.edad = edad;
  this.peso = peso;
  this.altura = altura;
  this.objetivo = objetivo;
  this.progresoMensual = progresoMensual;
  }

  // Método para calcular el IMC (Índice de Masa Corporal)

  public double calcularIMC() {
  return peso / (altura * altura);
  }

  // Método para mostrar información del cliente

  public void mostrarInformacion() {
  System.out.println("Nombre: " + nombre);
  System.out.println("Edad: " + edad + " años");
  System.out.println("Peso: " + peso + " kg");
  System.out.println("Altura: " + altura + " m");
  System.out.println("Objetivo: " + objetivo);
  System.out.println("IMC: " + calcularIMC());
  System.out.println("Progreso mensual: " + progresoMensual + "%");
  System.out.println("------------------------------");
  }
  }

/**
* Clase de prueba
  */

public class PruebaClienteEntrenamiento {
public static void main(String[] args) {
// Crear objetos cliente

        ClienteEntrenamiento cliente1 = new ClienteEntrenamiento("Carlos Ramírez", 28, 75.0, 1.75, "Ganar masa muscular", 12.5);
        ClienteEntrenamiento cliente2 = new ClienteEntrenamiento("Laura Gómez", 31, 62.0, 1.68, "Perder grasa corporal", 8.3);

        // Usar los métodos del objeto

        cliente1.mostrarInformacion();
        cliente2.mostrarInformacion();
    }
}