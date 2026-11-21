# ALED - Práctica 4: Concurrencia con hilos

Código base para la práctica 4 de Algoritmos y Estructuras de Datos
(Grado en Ingeniería Biomédica, UPM).

El repositorio contiene dos aplicaciones Java:

- Simulación de un servicio de urgencias hospitalario mediante hilos.
- Búsqueda lineal paralelizada de una secuencia de ADN dentro de un
  genoma de referencia.

## Cómo trabajar en esta práctica

1. Haz un **fork** de este repositorio a tu cuenta de GitHub.
2. Antes de empezar a hacer commits, comprueba en `Settings > General`
   de tu fork que la visibilidad es **pública**. Solo se evaluarán
   los commits hechos sobre un fork público.
3. Clona tu fork e impórtalo como proyecto Eclipse existente
   (`.project` y `.classpath` ya están incluidos).
4. Trabaja, haz commit de tus cambios y haz push a tu fork.

## Documentación

El guion de la práctica está en [`docs/ALED-lab4.pdf`](docs/ALED-lab4.pdf),
generado automáticamente a partir de su fuente LaTeX en Overleaf.

## Licencia

El código fuente (`src/`) y los datos de `er/` se distribuyen bajo
licencia MIT. Consulta [`LICENSE.md`](LICENSE.md).

Los enunciados (`docs/`) se distribuyen bajo licencia CC BY-NC-SA 4.0.
Consulta [`LICENSE-DOCS.md`](LICENSE-DOCS.md).

Los ficheros `cromosomes/chr19.fa` y `cromosomes/chr19segment.fa`
proceden del ensamblado de referencia GRCh38 (Genome Reference
Consortium) y no están cubiertos por ninguna de las dos licencias. El
resto de secuencias de `cromosomes/` son sintéticas.
