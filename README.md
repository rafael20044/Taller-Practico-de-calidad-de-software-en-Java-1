# Proyecto: Pruebas Unitarias de la Clase `Calculadora`

Este proyecto contiene un conjunto de **pruebas unitarias** desarrolladas con **JUnit 5** para validar el correcto funcionamiento de la clase `Calculadora`, la cual implementa diversas operaciones matemáticas básicas .
---
## ⚙️ Tecnologías utilizadas

- **Lenguaje:** Java 11+  
- **Libreria de pruebas:** [JUnit 5](https://junit.org/junit5/)  

---

## 🧪 Descripción de las pruebas

La clase `CalculadoraTest` valida el comportamiento de los métodos de la clase `Calculadora`.  
Cada prueba usa **asserts** para comprobar que los resultados sean correctos.

### ✅ Pruebas implementadas

1. **Suma (`testSuma`)**  
   - Verifica que la operación de suma funcione correctamente.

2. **Multiplicación (`testMultiplicar`)**  
   - Comprueba que el método de multiplicación retorne el resultado esperado.

3. **División (⚠️ `testDividir`)**  
   - **Nota:** Actualmente esta prueba está configurada con una llamada incorrecta (`multiplicar(16, 2)` en lugar de `dividir(16, 2)`).  
   - Se recomienda corregir la implementación para probar realmente la división.

4. **Resta (`testRestar`)**  
   - Evalúa la operación de resta.

5. **Potencia (`testPotencia`)**  
   - Valida que el cálculo de una potencia funcione como se espera.

6. **Raíz cuadrada (`testRaizCuadrada`)**  
   - Comprueba que la raíz cuadrada sea correcta utilizando `Math.sqrt()` como referencia.

7. **División entre cero (`testDividirEntreCero`)**  
   - Verifica que el método lance una excepción `IllegalArgumentException` con el mensaje `"No se puede dividir entre 0"`.

8. **Promedio entre cuatro números (`testPromedioEntreCuatroNumeros`)**  
   - Confirma que el método de promedio funcione adecuadamente.

### ✅ Pruebas adicionales implementadas

- **Suma con números negativos (`testSumaNegativos`)**  
  Valida la operación de suma con números negativos.

- **Suma de positivo y negativo (`testSumaPositivoNegativo`)**  
  Evalúa la suma de un número positivo y uno negativo.

- **Resta con cadenas válidas (`testRestar`)**  
  Evalúa la operación de resta con cadenas de texto.

- **Resta con signos (`testRestarNumerosPositivos`)**  
  Evalúa la operación de resta con cadenas que incluyen signos positivos.

- **Resta de positivo con positivo (`testRestarNumeroPositivo`)**  
  Evalúa la resta con una cadena de texto sin signo y otra con signo positivo.

- **Resta con cadenas no válidas (`testRestarConStringsNovalidos`)**  
  Verifica que el método de resta lance una `IllegalArgumentException` al recibir entradas no numéricas.

- **Prueba de integración (`testIntegracionPromedioConSuma`)**  
  Combina los resultados de la suma y el promedio para verificar que funcionen juntos correctamente.

- **Prueba de sistema (`testOperacionCompleta`)**  
  Evalúa una secuencia de operaciones (suma, multiplicación y potencia) para validar un flujo de trabajo completo.

- **Prueba de robustez (`testRobustezEntradasInvalidas`)**  
  Prueba que los métodos de suma y resta lancen excepciones al recibir entradas no numéricas.

- **Prueba de estrés (`testStressMultiplicacion`)**  
  Ejecuta la operación de multiplicación 10,000 veces para evaluar el rendimiento bajo carga.

- **Prueba de regresión (`testRegresionDivision`)**  
  Asegura que un cambio reciente no haya roto la funcionalidad de división.

---

## 🚀 Flujo de Trabajo (Workflow)

Este proyecto ha sido configurado con un flujo de trabajo de **GitHub Actions** que permite la automatización de pruebas y la integración continua (CI).

### 📝 Archivo `ci.yml`

El workflow se define en el archivo `.github/workflows/ci.yml`. Su propósito es:

- Ejecutarse automáticamente en cada **push** y **pull_request** a la rama `main`.  
- Utilizar una imagen de Docker con **Maven y JDK 21** preinstalados para un entorno de ejecución consistente.  
- Correr el comando `mvn clean test` para compilar el código y ejecutar todas las pruebas unitarias.  

---

## 🐳 Ejecución Local con `act` y Docker

Para simular el flujo de trabajo de GitHub Actions en un entorno local, se utilizaron **[nektos/act](https://github.com/nektos/act)** y Docker. Esto permite validar la configuración de CI antes de subir los cambios al repositorio.

- **Validación de ejecución exitosa:** El flujo de trabajo se ejecutó localmente y pasó todas las pruebas, lo que confirma que el código y la configuración son correctos.  
- **Validación de ejecución fallida:** Se modificó una prueba intencionalmente para que fallara, y la ejecución de `act` demostró que el workflow detecta y reporta los fallos correctamente.  

---