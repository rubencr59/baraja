package Almacen

abstract class Bebida {

    companion object{
        private var identificador = 1
    }

    var ID:Int

    var L:Double = 0.0
        set(value){
            if (value <= 0){
                println("Introduzca un número válido de litros.")
            }else{
                field = value
            }
        }
        get(){
            return field
        }

    var p:Double = 0.0
        set(value){
            if (value <= 0.0){
                println("Introduzca un precio válido.")
            }else{
                field = value
            }
        }
        get(){
            return field
        }

    var m:String = ""
        set(value){
            if (value.isEmpty()){
                println("Introduce una marca válida.")
            }else{
                field = value
            }
        }
        get(){
            return field
        }


    constructor(litros:Double, precio:Double, marca:String){
        ID = identificador
        identificador ++
        L = litros
        p = precio
        m = marca
    }

    open fun Calcular(cant_prod:Int):Double{
        val total= cant_prod * this.p
        return total
    }

    override fun toString(): String {
        return "Bebida\nIdentificador: ${ID}\nLitros:$L\nPrecio:$p\nMarca:'$m'"
    }



}