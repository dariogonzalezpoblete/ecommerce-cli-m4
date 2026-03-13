# E-Commerce Óptica Multifocus

¡Bienvenido al sistema de ventas de Óptica Multifocus! Esta es una aplicación de consola (CLI) desarrollada en Java para gestionar el proceso de compra de productos ópticos, incluyendo un catálogo, carrito de compras y aplicación automática de beneficios.

## 🔗 Repositorio
**Enlace al proyecto:** [https://github.com/TU_dariogonzalezpoblete/ecommerce-cli-e4]

## 🚀 Instrucciones de Ejecución

Para ejecutar este proyecto en tu entorno local, sigue estos pasos:

### 1. Requisitos previos
- Tener instalado **Java JDK 17** o superior.
- Git instalado (opcional, para clonar).

### 2. Compilación
Desde la raíz del proyecto (`ecommerce-cli-e4`), ejecuta el siguiente comando para generar los archivos compilados en la carpeta `bin`:
```powershell
javac -d bin src/Main.java src/model/*.java src/exception/*.java src/ui/*.java

### 3. Ejecucion 
una vez compilado entra en la carpena de binarios y ejecuta
cd bin
java Main

### Menús del Sistema
El sistema utiliza un menú interactivo mediante consola:

Ver Catálogo y Comprar: Explora los productos disponibles (marcos, lentes) y añádelos a tu carrito de compras.

Ver mi Carrito: Revisa la lista de productos seleccionados y el subtotal acumulado hasta el momento.

Finalizar Compra: El sistema calcula el total final, aplica beneficios automáticos y cierra la transacción.

Salir: Finaliza la ejecución del programa de forma segura.

### Descuento aplicado
======= RESUMEN DE VENTA - ÓPTICA MULTIFOCUS =======
Subtotal: $170.000
¡DESCUENTO DEL 10% APLICADO POR COMPRA SUPERIOR A $100.000!
TOTAL FINAL: $153.000
====================================================
¡Gracias por preferir Multifocus!