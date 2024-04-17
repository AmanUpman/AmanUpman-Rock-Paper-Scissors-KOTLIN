package com.example.rockpaperscissors

fun main(){
    var computerChoice = ""
    var playerChoice = ""

    println("Enter Rock, Paper or Scissors")
    playerChoice = readln().lowercase()

    while(playerChoice != "rock" && playerChoice != "paper" && playerChoice != "scissors"){
        println("Enter the correct choice.")
        playerChoice = readln().lowercase()
    }

    val randomNumber = (1..3).random()

    /* if(randomNumber == 1){
        computerChoice = "Rock" }
    else if(randomNumber == 2){
        computerChoice = "Paper"}
    else{
        computerChoice = "Scissors"} */
    when (randomNumber) {
        1 -> {
            computerChoice = "Rock" }
        2 -> {
            computerChoice = "Paper"}
        3 -> {
            computerChoice = "Scissors"}
    }
    println("Computer entered $computerChoice")
    computerChoice = computerChoice.lowercase()

    val winner = when{
        playerChoice == computerChoice -> "Tie"
        playerChoice == "rock" && computerChoice == "scissors" -> "Player"
        playerChoice == "paper" && computerChoice == "rock" -> "Player"
        playerChoice == "scissors" && computerChoice == "paper" -> "Player"
        else -> "Computer"
    }

    if(winner == "Tie"){
        println("It's a tie.")
    }
    else {
        println("$winner won")
    }


}