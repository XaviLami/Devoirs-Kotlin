interface Animal {


    fun quiSuisje()
    fun parler()

}

fun main(){
    var perroquet = Perroquet()
    var chat = Chat()
    var chien = Chien()
    var animalerie =Animalerie()
    animalerie.add(perroquet)
    animalerie.add(chat)
    animalerie.add(chien)
    animalerie.afficherAnimaux()




}
class Chien:Animal {
    override fun quiSuisje() {
        println("Je suis un chien") //To change body of created functions use File | Settings | File Templates.
    }

    override fun parler() {
        println("Wouaf wouaf") //To change body of created functions use File | Settings | File Templates.
    }

}
class Chat:Animal {
    override fun quiSuisje() {
        println("Je suis un chat") //To change body of created functions use File | Settings | File Templates.
    }

    override fun parler() {
        println("Miaou Miaou") //To change body of created functions use File | Settings | File Templates.
    }

}
class Perroquet:Animal {
    override fun quiSuisje() {
        println("Je suis un perroquet") //To change body of created functions use File | Settings | File Templates.
    }

    override fun parler() {
        println("Moi je suis un beau perroquet") //To change body of created functions use File | Settings | File Templates.
    }

}
class Animalerie() {
    var listeOfAnimal=arrayListOf<Animal>()



    fun add(animal:Animal) {

        listeOfAnimal.add(animal)

    }
    fun afficherAnimaux(){
        listeOfAnimal.forEach {
            it.quiSuisje()
            it.parler()
        }

    }


}
