# Sistema de Compra y Facturación (Terminal App)

## Descripción Breve

Este proyecto es una aplicación desarrollada en Java que simula un sistema de compra y facturación. La aplicación se maneja directamente desde la terminal (consola) y utiliza los principios de la Programación Orientada a Objetos (POO) para modelar el proceso de compra con tarjeta de crédito. Permite a los usuarios ingresar el límite de su tarjeta, realizar compras (siempre y cuando tengan saldo suficiente), y al finalizar, muestra un listado de las compras realizadas y el saldo restante de la tarjeta.

## Funcionalidades Principales

* **Registro del Límite de Crédito:** El usuario puede ingresar el límite de crédito inicial de su tarjeta.
* **Realización de Compras:** Los usuarios pueden ingresar la descripción y el valor de cada compra que desean realizar.
* **Validación de Saldo:** El sistema verifica si el saldo disponible en la tarjeta es suficiente para realizar la compra.
* **Registro de Compras:** Cada compra exitosa se guarda en una lista, manteniendo un historial de las transacciones.
* **Listado de Compras:** Al finalizar las compras, se muestra una lista de todas las compras realizadas, ordenadas por su valor.
* **Visualización del Saldo:** Al final del proceso, se muestra el saldo restante en la tarjeta de crédito.

## Estructura del Proyecto

├── .idea/

├── src/

│   └── Main.java

│   └── CrediCart.java

│   └── Shop.java

├── .gitignore

└── shopping.iml


* **.idea/:** Contiene los archivos de configuración específicos del IDE IntelliJ IDEA.
* **src/:** Contiene el código fuente de la aplicación Java.
    * **Main.java:** Clase principal que contiene el método `main` y la lógica de interacción con el usuario.
    * **CrediCart.java:** Clase que representa la tarjeta de crédito, gestionando el límite, el saldo y la lista de compras.
    * **Shop.java:** Clase que representa una compra individual, con su precio y descripción.
* **.gitignore:** Especifica los archivos y directorios que Git debe ignorar.
* **shopping.iml:** Archivo de módulo de IntelliJ IDEA, que contiene información sobre la configuración del módulo Java.

## Cómo Ejecutar

1.  **Requisitos:** Asegúrate de tener instalado el Java Development Kit (JDK) en tu sistema.
2.  **Compilación (opcional):** Si no estás utilizando un IDE, puedes compilar los archivos `.java` desde la terminal utilizando el comando:
    ```bash
    javac src/Main.java src/CrediCart.java src/Shop.java
    ```
3.  **Ejecución:** Navega hasta el directorio donde se encuentran los archivos `.class` compilados (normalmente dentro de `src/` si no se especificó otra ruta) y ejecuta la aplicación con el comando:
    ```bash
    java Main
    ```
    Si estás ejecutando desde un IDE, simplemente ejecuta la clase `Main`.

## Uso de la Aplicación

1.  Al iniciar la aplicación, se mostrará un mensaje de bienvenida y se solicitará que ingreses el límite de la tarjeta de crédito.
2.  A continuación, entrarás en un bucle donde se te pedirá la descripción y el valor de cada compra.
3.  El sistema intentará realizar la compra si el saldo es suficiente. Se mostrará un mensaje indicando si la compra fue exitosa o si el saldo es insuficiente.
4.  Después de cada intento de compra exitoso, se te preguntará si deseas realizar otra compra (ingresando `1`) o salir del sistema (ingresando `0`).
5.  Una vez que decidas salir, se mostrará un listado de todas las compras realizadas, ordenadas por precio, seguido del saldo final de la tarjeta de crédito.

## Tecnologías Utilizadas

* **Java:** Lenguaje de programación principal utilizado para desarrollar la aplicación.
* **Programación Orientada a Objetos (POO):** Paradigma de programación fundamental en el diseño de la aplicación, utilizando clases y objetos para modelar las entidades del sistema (tarjeta de crédito, compra).
* **`java.util.Scanner`:** Utilizado para la entrada de datos por parte del usuario desde la terminal.
* **`java.util.ArrayList`:** Utilizado en la clase `CrediCart` para almacenar la lista de objetos `Shop` (compras realizadas).
* **`java.util.Collections.sort()`:** Utilizado para ordenar la lista de compras por su precio.
* **`java.lang.Comparable`:** Implementado por la clase `Shop` para permitir la comparación de objetos por su precio y así poder ordenarlos.

## Contribución

Las contribuciones a este proyecto son bienvenidas. Si deseas mejorar la aplicación, corregir errores o añadir nuevas funcionalidades, puedes seguir los siguientes pasos:

1.  Realiza un fork del repositorio.
2.  Crea una nueva rama con un nombre descriptivo para tus cambios.
3.  Realiza tus modificaciones y commitea tus cambios.
4.  Sube tus cambios a tu fork.
5.  Crea un pull request para que tus cambios sean revisados y mergeados al repositorio principal.

## Autor

Este proyecto fue desarrollado como un ejercicio práctico de programación orientada a objetos en Java.
