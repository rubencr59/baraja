package Almacen

class AguaMineral(litros:Double, precio:Double, marca:String, manantialOrigen:String):Bebida(litros, precio, marca) {

    var MOrigen: String = manantialOrigen
        set(value){
            if (value.isEmpty()){
                println("Introduce un manantial válido.")
            }else{
                field = value
            }
        }
        get(){
            return field
        }

    override fun toString(): String {
        return super.toString()+ "\nManantial origen:$MOrigen"
    }

}