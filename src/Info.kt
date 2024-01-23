class Info(
    val nombre:String,
    val dia:Int,
    val  gastado:Number,
    val domicilio: String
)
{
    val datos = listOf(
        Info("Nuria Costa", 5, 12780.78, "Calle Las Flores 355"),
        Info("Jorge Russo", 7, 699, "Mirasol 218"),
        Info("Nuria Costa", 7, 532.90, "Calle Las Flores 355"),
        Info("Julián Rodriguez", 12, 5715.99, "La Mancha 761"),
        Info("Jorge Russo", 15, 958, "Mirasol 218")
    )


    override fun toString(): String {
        return "Cliente: $nombre, el día $dia, ha gastado $gastado, y su domicilio es $domicilio"
    }


}

