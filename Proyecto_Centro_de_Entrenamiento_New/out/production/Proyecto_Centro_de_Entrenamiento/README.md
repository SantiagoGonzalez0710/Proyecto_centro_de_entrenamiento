# Semana 03 - Encapsulación y Constructores

## FitPro Training - Sistema de Gestión Mejorado

- **Estudiante:** Santiago Alexander Niño Gonzalez
- **Dominio:** Centro de Entrenamiento "FitPro Training"

---

## 🎯 Objetivo

Refactorizar el sistema de la semana 02 aplicando:

- Encapsulación completa (`private` + getters/setters)
- Sobrecarga de constructores (mínimo 2 por clase)
- Validaciones en constructores y setters
- Métodos auxiliares privados para reutilizar lógica

---

## 🏗️ Estructura del Proyecto

semana-03/
├── README.md
├── MEJORAS.md
├── TrainingClient.java
├── Trainer.java
├── TrainingSession.java
├── GymManager.java
└── Main.java
 
---

## 📦 Encapsulación Aplicada

### Clase `TrainingClient`

- Atributos privados: `name`, `idNumber`, `age`, `weight`, `height`, `fitnessGoal`
- Getters y setters con validaciones de textos, rangos y valores positivos
- Métodos privados auxiliares para validar cadenas y generar un ID por defecto

### Clase `Trainer`

- Atributos privados: `name`, `code`, `specialty`, `yearsExperience`, `certification`
- Getters y setters con validaciones de nombre, código, especialidad y años de experiencia
- Métodos privados auxiliares para validar textos y generar un código por defecto

### Clase `TrainingSession`

- Atributos privados: `client`, `trainer`, `date`, `durationMinutes`, `sessionType`, `pricePerSession`
- Validaciones de referencias no nulas, duración positiva, precio no negativo y fecha no vacía
- Método privado `isLongSession()` para detectar sesiones largas y aplicar descuentos

### Clase `GymManager`

- Atributos privados: `gymName`, `location`, `clients`, `trainers`, `sessions`
- Validaciones de nombre y ubicación y control de adiciones nulas en las listas
- Método privado auxiliar para validar textos

---

## 🔁 Sobrecarga de Constructores

- `TrainingClient`
    - Constructor completo con todos los atributos
    - Constructor básico (`name`, `idNumber`) con valores por defecto
    - Constructor mínimo (`name`) con generación automática de `idNumber`

- `Trainer`
    - Constructor completo
    - Constructor básico (`name`, `code`, `specialty`)
    - Constructor mínimo (`name`) con código generado por defecto

- `TrainingSession`
    - Constructor completo
    - Constructor básico (`client`, `trainer`, `date`) con duración y precio por defecto

- `GymManager`
    - Constructor completo (`gymName`, `location`)
    - Constructor básico (`gymName`) con ubicación genérica

---

## ✅ Validaciones Implementadas

- Strings no nulos ni vacíos (nombres, códigos, cédulas, tipos de sesión, etc.)
- Números positivos para peso, altura, duración y precio
- Rangos válidos para edad y años de experiencia
- Referencias no nulas para `client` y `trainer` en `TrainingSession`
- Valores por defecto cuando se omite información opcional

---

## ▶️ Ejecución del Programa

javac *.java

**Ejecución:**

java Main


El programa demuestra:

- Creación de clientes, entrenadores y sesiones usando distintos constructores
- Registro de objetos en `GymManager` con listas (`ArrayList`)
- Listados de clientes, entrenadores y sesiones
- Cálculo de ingresos totales y estadísticas generales
- Impresión detallada de un cliente, un entrenador y una sesión en consola

---

## 📝 Documento MEJORAS.md

En `MEJORAS.md` se describen las mejoras realizadas por clase:

- Atributos encapsulados
- Validaciones añadidas
- Constructores sobrecargados
- Beneficios obtenidos (mayor seguridad, menos errores y mejor diseño orientado a objetos)  

