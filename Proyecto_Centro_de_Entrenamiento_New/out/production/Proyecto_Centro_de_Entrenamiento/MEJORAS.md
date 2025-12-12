# Mejoras - Semana 03: Encapsulación y Constructores

## Encapsulación Aplicada

### Clase: TrainingClientMejorado
- **Atributos encapsulados:** `name`, `idNumber`, `age`, `weight`, `height`, `fitnessGoal`.
- Todos los atributos ahora son `private` y se acceden mediante getters y setters públicos.
- Los setters incluyen validaciones:
    - El nombre y la cédula no pueden ser nulos ni vacíos.
    - La edad debe estar en un rango válido (0 a 100 años).
    - El peso y la altura deben ser valores positivos.
    - El objetivo fitness no puede quedar vacío; si no se envía, se asigna un valor por defecto.
- **Métodos privados auxiliares:**
    - `isNullOrEmpty(String)` para reutilizar validaciones de texto.
    - `generateDefaultId(String)` para generar un ID por defecto con base en el nombre.
- **Beneficio:** Se protege la información del cliente y se evita crear objetos con datos incoherentes.

---

### Clase: TrainerMejorado
- **Atributos encapsulados:** `name`, `code`, `specialty`, `yearsExperience`, `certification`.
- Todos los campos se declararon `private` con getters y setters.
- Validaciones implementadas en setters:
    - Nombre y código no pueden ser nulos ni vacíos.
    - La especialidad no puede quedar vacía; si no se especifica, se asigna “General”.
    - Los años de experiencia deben estar en un rango razonable (0 a 50).
    - La certificación puede quedar con un texto por defecto cuando no se proporciona.
- **Métodos privados auxiliares:**
    - `isNullOrEmpty(String)` para validación de cadenas.
    - `generateDefaultCode(String)` para generar un código por defecto usando el nombre.
- **Beneficio:** Se asegura que todos los entrenadores tengan información consistente y se facilita clasificar el nivel de experiencia.

---

### Clase: TrainingSessionMejorado
- **Atributos encapsulados:** `client`, `trainer`, `date`, `durationMinutes`, `sessionType`, `pricePerSession`.
- Encapsulación completa con getters y setters para cada atributo.
- Validaciones:
    - `client` y `trainer` no pueden ser `null`.
    - La fecha de la sesión no puede estar vacía.
    - La duración debe ser mayor que 0 minutos.
    - El precio no puede ser negativo.
    - El tipo de sesión recibe un valor por defecto cuando llega vacío.
- **Métodos privados auxiliares:**
    - `isLongSession()` determina si la sesión supera los 90 minutos.
- **Lógica de negocio mejorada:**
    - `calculateTotalCost()` aplica un 10 % de descuento cuando la sesión es larga, usando `isLongSession()`.
- **Beneficio:** Se garantiza que cada sesión tenga cliente, entrenador, duración y precio válidos, y se centraliza la lógica de descuentos.

---

### Clase: GymManagerMejorado
- **Atributos encapsulados:** `gymName`, `location`, `clients`, `trainers`, `sessions`.
- Todos los atributos se hicieron `private` y se exponen solo mediante getters.
- Validaciones:
    - El nombre del gimnasio no puede estar vacío.
    - La ubicación tiene un valor por defecto cuando no se especifica.
    - Los métodos `addClient`, `addTrainer` y `addSession` ignoran referencias `null` para evitar errores.
- **Método privado auxiliar:**
    - `isNullOrEmpty(String)` para reutilizar las validaciones de texto.
- **Beneficio:** El gestor controla mejor la información del gimnasio y evita que se agreguen elementos inválidos a las listas internas.

---

## Constructores Sobrecargados

### TrainingClientMejorado
- **Constructor completo:** recibe todos los atributos y valida cada dato.
- **Constructor básico:** recibe `name` e `idNumber`, y asigna valores por defecto a edad, peso, altura y objetivo.
- **Constructor mínimo:** recibe solo `name` y genera un `idNumber` por defecto usando `generateDefaultId`.

### TrainerMejorado
- **Constructor completo:** inicializa nombre, código, especialidad, años de experiencia y certificación.
- **Constructor básico:** recibe nombre, código y especialidad, y asigna un año de experiencia mínimo y certificación por defecto.
- **Constructor mínimo:** recibe solo el nombre y genera automáticamente un código de entrenador usando `generateDefaultCode`.

### TrainingSessionMejorado
- **Constructor completo:** recibe cliente, entrenador, fecha, duración, tipo de sesión y precio; todos los datos pasan por validaciones.
- **Constructor básico:** recibe cliente, entrenador y fecha, y asigna duración, tipo de sesión e importe con valores por defecto.

### GymManagerMejorado
- **Constructor completo:** recibe nombre del gimnasio y ubicación, e inicializa las listas de clientes, entrenadores y sesiones.
- **Constructor básico:** recibe solo el nombre y crea una ubicación genérica “Ubicación no especificada”.

---

## Beneficios Logrados

- Mayor **seguridad de datos** gracias a la encapsulación y al uso de getters/setters en lugar de campos públicos. [web:76][web:89]
- Menos **errores de lógica** al crear objetos, debido a las validaciones en constructores y setters.
- Mayor **flexibilidad**: los constructores sobrecargados permiten crear objetos con distinta cantidad de información inicial sin romper el diseño.
- Mejora en la **mantenibilidad** del código, ya que las reglas de negocio y las validaciones están concentradas dentro de las clases y no dispersas en el `main`.
