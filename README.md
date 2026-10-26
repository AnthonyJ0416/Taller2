# pa2_u1_cc_ag

## Preguntas de Analisis

### 1. ¿En qué parte del ejercicio se aplica IoC y en cuál DI?
* **IoC (Inversión de Control):** Se aplica cuando Quarkus gestiona el ciclo de vida de los componentes (como `VentaService` y las calculadoras de descuento), encargándose de crearlos, inicializarlos y destruirlos sin que tengas que usar la palabra `new` manualmente.
* **DI (Inyección de Dependencias):** Se aplica explícitamente en la clase `VentaService`, donde inyectamos las dependencias necesarias (`Auditoria`, `descuentoRegular` por campo y `descuentoVIP` por constructor) utilizando la anotación `@Inject`.

### 2. ¿Qué función cumplen los Qualifiers y por qué son necesarios?
En el proyecto se usan calificadores como `@Named("regular")` y `@Named("vip")`. Son necesarios porque la interfaz `CalculadoraDescuento` tiene múltiples implementaciones, y el calificador actúa como una etiqueta exacta para que Quarkus sepa qué clase específica debe inyectar en cada variable.

### 3. ¿Cuál es la diferencia entre @ApplicationScoped y @Dependent?
* **`@ApplicationScoped`:** (Usado en `VentaService`) Crea una **única instancia compartida** que permanece viva durante toda la ejecución de la aplicación.
* **`@Dependent`:** (Usado en `Auditoria`) Crea una **instancia nueva** cada vez que el componente es solicitado, ligándose por completo al ciclo de vida del objeto que lo consume.

### 4. ¿Por qué las instancias @ApplicationScoped pueden reutilizarse entre varias ventas?
Porque `VentaService` no almacena el estado de las transacciones en sus atributos (los datos de las ventas se reciben como parámetros locales en el método `procesarVentas`). Al ser un servicio sin estado, múltiples ejecuciones pueden usar la misma instancia con total seguridad. 

### 5. ¿Qué sucedería si se elimina el Qualifier de un punto de inyección de CalculadoraDescuento?
Si se elimina `@Named("regular")` o `@Named("vip")` de `VentaService`, Quarkus arrojará un error al iniciar la aplicación (`AmbiguousResolutionException`). Esto ocurre porque al existir más de una clase que implementa `CalculadoraDescuento`, el contenedor se vuelve incapaz de determinar cuál de ellas debe inyectar sin la etiqueta del calificador.