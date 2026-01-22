## Teoría
El syncronized se utiliza en las funciones de los objetos
a los que acceden los hilos y que tienen una condicion
de carrera que quiero evitar.

---

##  Resultados del ejercicio:
Cuando los hilos no están sincronizados, al acceder al contador estos van a sumar sus 5000 de golpe, ya que acceden a la variable una vez y le suman 5000. Esto hace muy improbabke que llegue a los 25000 esperados. 
<br>Cuando se sincronizan, en cada repeticion del for los hilos pueden acceder uno a la vez al contador, lo que hace que los 5000 se sumen escalonadamente, haciendo que el contador llegue a 25000 sí o sí.
