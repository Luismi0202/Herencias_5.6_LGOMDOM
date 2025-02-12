# Herencias_5.6_LGOMDOM

Crear una clase Articulo con un nombre y un precio, que ambos se puedan modificar. También tendrá un id que se generará de forma automática mediante un contador (totalArticulos) y una función generarId(). Este id no podrá modificarse ni obtenerse fuera de Articulo.

Crear un método promocionNavidad() que reciba el porcentaje de rebaja y lo aplique al precio.

Sobreescribir el método toString() para que retorne el "{nombre} - {precio con dos decilames}€ (ID: {id})".

Crear una clase que herede de Articulo y se llame Ordenador. Debe agregar a su constructor primario el tipo, que será de TipoOrdenador => (BASICO, OFIMATICA, TODOTERRENO, GAMING) y por defecto será BASICO.

Sobreescribe el método promocionNavidad() para que solo aplique la promoción si el precio es superior a 500 euros.

En el main crea dos artículos con precios 25 y 45 euros. También crea dos ordenadores, el primero GAMING de precio 1299.99 y el segundo un ordenador básico de 399.99 euros.

Crear una variable para generar una lista con ellos y recorrerla aplicándoles la promoción e imprimiendo su contenido.

Puedes declarar la variable de la siguiente forma:

// Lista de todos los artículos
val articulos = listOf(articulo1, articulo2, ordenador1, ordenador2)
Responde a las siguientes preguntas:

# 1.-¿De qué tipo genera en la lista por defecto el compilador?
De clase Articulo, ya que es la padre de todas ellas y el compilador detectará automáticamente que la clase ordenador es heredada de ella.

# 2.-¿Qué está ocurriendo en este ejemplo con respecto a lo que hemos visto del polimorfismo de la herencia?
Que realmente la clase heredada será vista como una clase padre, con atributos y métodos similares (ya que puedes sobreescribir estos métodos y poner más atributos), haciendo que de una clase padre, podamos
hacer más clases relacionadas.

# 3.-¿Qué pasaría si creáramos la lista con listOf<Ordenador>? ¿Y si la hiciéramos con listOf<Any>?
List Ordenador> Será una lista donde solo podrá entrar la clase ordenador y no su padre
Any> Podrá entrar cualquier tipo de dato.
