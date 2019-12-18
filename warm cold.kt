fun main(args:Array<String>) {


    var question = "Quel est votre nombre ?"
    println(question)
    val player1Reponse = readLine()
    //10println("Ton nombre: $player1Reponse")

    println("Quel est le bon chiffre  ?")



    do {
        val player2Reponse = readLine()
        println("Ton chiffre: $player2Reponse")

        if (player1Reponse == player2Reponse) {

            print("Bonne rep")
        } else {
            if ("$player1Reponse" > "$player2Reponse") {
                println("plus")
            } else {
                println("moins")

            }
        }

    } while ("$player1Reponse" != "$player2Reponse")
}



//Si la réponse de joueur2= reponse joueur1 alors true, sinon boucle
//If player2Reponse = player1Reponse println("bonne réponse) else boucle

