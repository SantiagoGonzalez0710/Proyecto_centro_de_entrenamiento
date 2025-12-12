# Semana 02 - Clases y Objetos

## FitPro Training - Sistema de Gestión

- **Estudiante:** Santiago Alexander Niño Gonzalez
- **Ficha:** 3228973B
- **Dominio:** Centro de Entrenamiento "FitPro Training"

---

## 📋 Descripción del Proyecto

Sistema de gestión para el centro de entrenamiento **FitPro Training** que permite administrar clientes, entrenadores y sesiones de entrenamiento mediante programación orientada a objetos en Java.

---

## 🏗️ Estructura del Proyecto

semana-02/
├── README.md
├── TrainingClient.java (Clase Cliente)
├── Trainer.java (Clase Entrenador - NUEVA)
├── TrainingSession.java (Clase Sesión - NUEVA)
├── GymManager.java (Clase Gestora con ArrayList)
└── Main.java (Programa Principal)


---

## 📦 Clases Implementadas

### 1. `TrainingClient` (Cliente de Entrenamiento)

**Atributos:**

- `name` (String): Nombre del cliente
- `id` (String): Cédula del cliente
- `age` (int): Edad
- `weight` (double): Peso en kg
- `height` (double): Altura en metros
- `fitnessGoal` (String): Objetivo fitness

**Métodos principales:**

- `calculateBMI()`: Calcula el índice de masa corporal
- `showInfo()`: Muestra información completa del cliente
- `getShortInfo()`: Retorna resumen corto

---

### 2. `Trainer` (Entrenador) ✨ *Nueva clase*

**Atributos:**

- `name` (String): Nombre del entrenador
- `id` (String): ID del entrenador
- `specialty` (String): Especialidad (Musculación, CrossFit, etc.)
- `yearsExperience` (int): Años de experiencia
- `certification` (String): Certificación profesional

**Métodos principales:**

- `getExperienceLevel()`: Retorna nivel (Junior/Intermedio/Senior)
- `showInfo()`: Muestra información completa del entrenador
- `getShortInfo()`: Retorna resumen corto

---

### 3. `TrainingSession` (Sesión de Entrenamiento) ✨ *Nueva clase*

**Atributos:**

- `client` (`TrainingClient`): Cliente asignado **[Relación]**
- `trainer` (`Trainer`): Entrenador asignado **[Relación]**
- `date` (String): Fecha de la sesión
- `durationMinutes` (int): Duración en minutos
- `sessionType` (String): Tipo de sesión
- `pricePerSession` (double): Precio de la sesión

**Métodos principales:**

- `calculateTotalCost()`: Calcula costo con descuentos (10% si > 90 min)
- `getDurationInHours()`: Convierte minutos a horas
- `showInfo()`: Muestra información completa de la sesión
- `getShortSummary()`: Retorna resumen corto

**Relaciones:**

- Composición con `TrainingClient`
- Composición con `Trainer`

---

### 4. `GymManager` (Gestor del Gimnasio) 📊 *Clase gestora*

**Atributos:**

- `gymName` (String): Nombre del gimnasio
- `location` (String): Ubicación
- `sessions` (`ArrayList<TrainingSession>`): Lista de sesiones
- `clients` (`ArrayList<TrainingClient>`): Lista de clientes
- `trainers` (`ArrayList<Trainer>`): Lista de entrenadores

**Métodos principales:**

- `addClient()`: Agrega un cliente a la lista
- `addTrainer()`: Agrega un entrenador a la lista
- `addSession()`: Agrega una sesión a la lista
- `showAllClients()`: Muestra todos los clientes
- `showAllTrainers()`: Muestra todos los entrenadores
- `showAllSessions()`: Muestra todas las sesiones
- `calculateTotalRevenue()`: Calcula ingresos totales
- `showStatistics()`: Muestra estadísticas generales

**Uso de ArrayList:** ✅ Gestiona 3 colecciones diferentes

---

## 🔗 Relaciones entre Clases

GymManager
├── ArrayList <TrainingClient>
├── ArrayList <Trainer>
└── ArrayList <TrainingSession>
├── TrainingClient (composición)
└── Trainer (composición)


---

## ▶️ Ejecución del Programa

**Compilar:**

javac *.java


**Ejecutar:**

Java principal


---

## 📊 Salida Esperada

El programa muestra:

- Registro de clientes (5 clientes)
- Registro de entrenadores (3 entrenadores)
- Programación de sesiones (5 sesiones)
- Listado completo de clientes
- Listado completo de entrenadores
- Listado completo de sesiones programadas
- Estadísticas generales (totales e ingresos)
- Detalles individuales (cliente, entrenador, sesión)

---

## ✅ Cumplimiento de Requisitos

**Ejercicio 1: Nuevas Clases (30 puntos)**

- ✅ Clase `Trainer` con 5 atributos
- ✅ Clase `TrainingSession` con 6 atributos
- ✅ Constructores completos
- ✅ Getters y Setters completos
- ✅ Métodos de negocio implementados

**Ejercicio 2: Relaciones (25 puntos)**

- ✅ `TrainingSession` relaciona `TrainingClient` y `Trainer`
- ✅ Composición correctamente implementada
- ✅ Métodos que usan las relaciones

**Ejercicio 3: ArrayList (20 puntos)**

- ✅ `GymManager` usa 3 `ArrayList`
- ✅ Métodos `add()` implementados
- ✅ Métodos de iteración implementados
- ✅ Método `size()` utilizado

**Ejercicio 4: Principal Completo (25 puntos)**

- ✅ Creación de múltiples objetos
- ✅ Relaciones establecidas correctamente
- ✅ Uso completo de `ArrayList`
- ✅ Salida formateada y profesional

---

## 🎯 Conceptos Aplicados

- ✅ Encapsulamiento (atributos privados)
- ✅ Constructores parametrizados
- ✅ Getters y Setters
- ✅ Métodos de negocio
- ✅ Composición entre clases
- ✅ Colecciones (`ArrayList`)
- ✅ Iteración sobre colecciones
- ✅ Formato de salida profesional

---

## 🚀 Características Adicionales

- Cálculo de IMC para clientes
- Clasificación de experiencia para entrenadores
- Descuentos automáticos en sesiones largas
- Conversión de tiempo (minutos a horas)
- Cálculo de ingresos totales
- Estadísticas del gimnasio
- Interfaz de consola formateada

---

## 📝 Notas

Este proyecto demuestra la aplicación práctica de programación orientada a objetos en el contexto de un centro de entrenamiento real, utilizando relaciones entre clases y colecciones para gestionar información de manera eficiente.

- **Fecha de desarrollo:** Diciembre 2025
- **Versión:** 1.0  
