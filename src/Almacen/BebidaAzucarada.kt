package Almacen

class BebidaAzucarada(litros:Double, precio:Double, marca:String, porcentajeAzucar:Double, promocion:Boolean):Bebida(litros, precio, marca) {

    var porazucar = porcentajeAzucar
        set(value){
            if (value <= 0.0){
                println("Introduzca un porcentaje válido.")
            }else{
                field = value
            }
        }
        get(){
            return field
        }
    var promocion = promocion


    override fun Calcular(cant_prod: Int): Double {
        var totaldescuento: Double = 0.0
        if (promocion == true){
            println("Tiene un 10 % de descuento.")
            totaldescuento = super.Calcular(cant_prod) - super.Calcular(cant_prod)*10/100
            return totaldescuento
        }else{
            println("No tiene descuento.")
            return super.Calcular(cant_prod)
        }
    }

    override fun toString(): String {
        return super.toString() + "\nPorcentaje de azucar:$porazucar\nPromoción:$promocion"

    }
}