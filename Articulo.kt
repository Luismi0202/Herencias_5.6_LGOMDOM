open class Articulo(
    var nombre: String,
    var precio: Double
) {
    private var id = generarId()

    open fun promocionNavidad(porcentajeRebaja:Double){
       precio = precio * (porcentajeRebaja/100)
    }

    override fun toString(): String {
        return "$nombre - ${"%.2f".format(precio)}€ (ID: $id)"
    }

    companion object{
        private var contador = 0
        private fun generarId():Int{
            contador++
            return contador
        }
    }
}