package Almacen

fun main(){
    val Almacen1 = Almacen()
    val CocaCola = BebidaAzucarada(0.25,1.0,"Coca-cola",50.0, true)
    Almacen1.AgregarProducto(CocaCola)
    val Agua = AguaMineral(1.0,0.5,"Bezoya","Granada")
    Almacen1.AgregarProducto(Agua)
    val CocaCola1 = BebidaAzucarada(2.0,2.0,"Coca-cola",50.0, true)
    Almacen1.AgregarProducto(CocaCola1)
    val CocaCola2 = BebidaAzucarada(2.0,2.0,"Coca-cola",50.0, true)
    Almacen1.AgregarProducto(CocaCola2)

    println(Almacen1.PrecioEstanteria(3))


}
