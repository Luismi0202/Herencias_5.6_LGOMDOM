class Ordenador(
    var tipo: TipoOrdenador,
    nombre:String,
    precio:Double
):Articulo(nombre,precio) {
    override fun promocionNavidad(porcentajeRebaja: Double) {
        if(precio > 500.0){
            super.promocionNavidad(porcentajeRebaja)
        }
        else{
            println("Para aplicar la rebaja el ordenador debe costar más de 500€")
        }
    }
}