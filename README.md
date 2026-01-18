Kata 2: Modelado de Datos (POJOs)
> **El reto:** *Transformar texto plano en objetos útiles.*

Aquí abandonamos los scripts simples. El objetivo es leer un **Dataset externo** (TSV) y mapearlo a memoria.
* Diseñamos **Clases Inmutables** para garantizar la integridad de los datos.
* Implementamos cargadores (`Loaders`) que separan la lectura del archivo de la lógica del negocio.
