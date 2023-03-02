package Almacen

class Almacen() {



    val Estanteria1:MutableList<Bebida> = mutableListOf()
    val Estanteria2:MutableList<Bebida> = mutableListOf()
    val Estanteria3:MutableList<Bebida> = mutableListOf()
    val Estanteria4:MutableList<Bebida> = mutableListOf()

    var Estanterias = mutableMapOf<Int, MutableList<Bebida>>(1 to Estanteria1, 2 to Estanteria2, 3 to Estanteria3, 4 to Estanteria4)



    fun PrecioTotal():Double{
        var preciototal:Double = 0.0
        for ((key,value )in Estanterias){
            for (bebida in value){
                preciototal += bebida.p
            }
        }
        return preciototal
    }

    fun PrecioMarca(Marca:String):Double{
        var preciomarca:Double = 0.0
        for ((key,value )in Estanterias){
            for (bebida in value){
                if (bebida.m == Marca){
                    preciomarca += bebida.p
                }
            }
        }
        return preciomarca
    }

    fun PrecioEstanteria(Estanteria:Int):Double{
        var precioestanteria:Double = 0.0
        for ((key,value )in Estanterias){
            if (key == Estanteria){
                for (bebida in value){
                    precioestanteria += bebida.p
                }
            }
        }
        return precioestanteria
    }


    fun AgregarProducto(Bebida:Bebida){
        var EstanteriaMasVacia:MutableList<Bebida> = mutableListOf()
        for ((key,value) in Estanterias){
           if (value.size <= EstanteriaMasVacia.size){
               EstanteriaMasVacia = value
               value.add(Bebida)
               break
           }
        }

    }

}