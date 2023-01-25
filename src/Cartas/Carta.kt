package Cartas
/*MIAUUUa*/
class Carta(Minumero: Int, mipalo: Char) {
    var numero=Minumero
        set(value) {
            if (value !in 1..13) {
                println("Numero de carta inválido.")
            } else
                field = value
        }
        get() {
            return field
        }
    var palo=mipalo
        set(value) {
            //'C','P', 'R', 'T'
            val l = listOf<Char>('C', 'P', 'R', 'T')
            if (value !in l) {
                println("Palo de carta inválido.")
            } else
                field = value
        }
        get() {
            return field
        }
/*
    init {
        this.numero = numero
        this.palo = palo
    }
*/
    constructor(otraCarta: Carta) : this(otraCarta.numero, otraCarta.palo) {
    }

    fun mostrarCarta() {
        var paloMostrar = ""
        var numeroMostrar = ""
        when {
            palo == 'C' -> paloMostrar = "Corazones"
            palo == 'P' -> paloMostrar = "Picas"
            palo == 'R' -> paloMostrar = "Rombos"
            palo == 'T' -> paloMostrar = "Trebol"
        }
        when {
            numero == 1 -> numeroMostrar = "As"
            numero in (2..10) -> numeroMostrar = numero.toString()
            numero == 11 -> numeroMostrar = "Jack"
            numero == 12 -> numeroMostrar = "Reina"
            numero == 13 -> numeroMostrar = "Rey"
        }
        println("$numeroMostrar de $paloMostrar.")
    }

    fun compararCarta(otraCarta : Carta) {
        /*
        var numero2 = this.numero
        var palo2 = this.palo*/
        if (this.numero > otraCarta.numero) {
            print("La carta mayor es: ")
            this.mostrarCarta()
        } else if (this.numero < otraCarta.numero) {
            print("La carta mayor es: ")
            otraCarta.mostrarCarta()
        } else {//número iguales
            if (this.palo > otraCarta.palo) {
                print("La carta mayor es: ")
                this.mostrarCarta()
            } else {
                print("La carta mayor es: ")
                otraCarta.mostrarCarta()
            }
        }
    }
}
fun paloAleatorio():Char{
    val l = listOf<Char>('C', 'P', 'R', 'T')
    return(l.get((0..3).random()) )
}
fun numeroAPalo(n:Int):Char{
    val l = listOf<Char>('C', 'P', 'R', 'T')
    if (n>=0 && n<=3)
     return(l.get(n) )
    else return l.get(0)
}
fun main(args: Array<String>) {
    /*
    println("Cartas.Carta numero 1:")
    val numero1 = readln().toInt()
    val palo1 = readLine()!!.uppercase()!![0]
    val carta1 = Cartas.Carta(numero1, palo1)
    carta1.mostrarCarta()

    val carta2=Cartas.Carta(carta1)
    carta2.numero = 7
    carta2.palo = 'T'
    carta2.mostrarCarta()

    carta1.compararCarta(carta2)
    */
    var listaCartas= mutableListOf<Carta>()
    for (n in (1..13))
        for (p in (0..3)){
            /*
            val c=Cartas.Carta(n,Cartas.numeroAPalo(p))
            listaCartas.add(c)

             */
            listaCartas.add(Carta(n, numeroAPalo(p))  )
        }
    for (cartadelaLista in listaCartas){
        cartadelaLista.mostrarCarta()
    }



    /*
    println("Cartas.Carta numero 2:")
    val numero2 = readln().toInt()
    val palo2 = readLine()!!.uppercase()!![0]
    val carta2 = Cartas.Carta(numero2)
    println(carta2.mostrarCarta(numero2, palo2))
    println(carta1.compararCarta(numero2, palo2))
    */

}
