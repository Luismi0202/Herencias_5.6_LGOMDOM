
fun main(){
    val articulo1 = Articulo("NaranjaMecánica",25.0)
    val articulo2 = Articulo("PeraFuturista",45.0)

    val ordenador1 = Ordenador(TipoOrdenador.GAMING,"TorreGamerPalLol",1299.99)
    val ordenador2 = Ordenador(TipoOrdenador.BASICO,"OrdenadorDePacotilla",399.99)

    val listaArticulos = listOf(articulo1,articulo2,
                                                ordenador1,ordenador2)

    for(articulo in listaArticulos){
        articulo.promocionNavidad(25.2)
        println(articulo)
    }

}