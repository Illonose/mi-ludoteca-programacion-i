# Plantilla Java para Programación I (Java 21)

## Inicio rápido
1. Descomprime el ZIP y abre la carpeta `Plantilla_Java_VSCode` desde **Archivo > Abrir carpeta** en VS Code.
2. Instala **Extension Pack for Java** cuando se sugiera; comprueba que `java -version` y `javac -version` indican JDK 21.
3. Abre `src/presentacion/Main.java`.
4. Ejecuta **Terminal > Ejecutar tarea...** y elige **Compilar**, **Ejecutar**, **Crear JAR**, **Ejecutar JAR** o **Limpiar**.
5. Para depurar, abre **Ejecutar y depurar**, selecciona **Depurar Main** y pulsa F5. Puedes añadir puntos de interrupción.

## Organización
- `src/presentacion`: entrada y salida; inicialmente solo contiene `Main.java`.
- `src/aplicacion`: operaciones y coordinación, para más adelante.
- `src/dominio`: representación y reglas del problema, para más adelante.
- `bin`: archivos compilados, generados automáticamente.
- `dist`: JAR ejecutable, generado automáticamente.
- `lib`: JAR externos, reservado para futuras prácticas (por ejemplo JUnit).
- `scripts`: comandos para Windows (`.bat`) y macOS/Linux (`.sh`).

**La plantilla no contiene clases de dominio ni de aplicación:** se crearán cuando se estudien.

## Asistencia de IA
La configuración del proyecto (`.vscode/settings.json`) establece `chat.disableAIFeatures: true`, desactiva Copilot y las sugerencias en línea. La configuración oficial de VS Code deshabilita las funciones de IA integradas en este espacio de trabajo. **No es un bloqueo inviolable**: el estudiante puede cambiar los ajustes, utilizar otras extensiones o recurrir a herramientas externas. Para un examen, se requieren medidas adicionales.

Se mantiene el autocompletado convencional del lenguaje (IntelliSense), que no equivale a generación de código con IA.

## Notas técnicas
Las tareas de ejecución compilan antes de ejecutar. La creación de JAR supone una aplicación sencilla sin dependencias externas; cuando se introduzcan bibliotecas y JUnit habrá que ampliar la configuración. En macOS/Linux, las tareas usan `bash`, `find`, `xargs` y el JDK; en Windows usan `cmd.exe` y el JDK. Es necesario tener las herramientas del JDK en `PATH`.


## Acciones rápidas desde VS Code (sin escribir comandos)

Abre **la carpeta raíz del proyecto** (la que contiene `.vscode` y `scripts`) en VS Code.

- **Compilar:** `Terminal > Ejecutar tarea... > Compilar` o `Ctrl+Mayús+B` (Windows/Linux; en Mac `Cmd+Mayús+B` cuando esté asignado a la tarea de compilación).
- **Ejecutar:** `Terminal > Ejecutar tarea... > Ejecutar`.
- **Limpiar:** `Terminal > Ejecutar tarea... > Limpiar`.
- **Crear JAR:** `Terminal > Ejecutar tarea... > Crear JAR`.
- **Ejecutar JAR:** `Terminal > Ejecutar tarea... > Ejecutar JAR`.
- **Depurar:** vista `Ejecutar y depurar` (`Ctrl+Mayús+D`) > `Depurar Main` > iniciar con `F5`.

Las tareas están configuradas en `.vscode/tasks.json`; VS Code selecciona el script `.bat` en Windows o `.sh` en macOS/Linux. **No hace falta abrir una terminal ni teclear comandos**: VS Code muestra la salida en su panel integrado automáticamente. La tarea Ejecutar ya compila antes de iniciar `presentacion.Main`.
