# Proyecto: Pruebas Unitarias de la Clase `Calculadora`

Este proyecto contiene un conjunto de **pruebas unitarias** desarrolladas con **JUnit 5** para validar el correcto funcionamiento de la clase `Calculadora`, la cual implementa diversas operaciones matemáticas básicas.
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
