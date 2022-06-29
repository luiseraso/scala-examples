package com.example
package cafe

object AppMain {

  def main(args: Array[String]): Unit = {
    println("AppMain:Cafe")
    val cc1 = new CreditCard("1234-5678")
    val cc2 = new CreditCard("7890-1234")

    val cafe = new Cafe()

    val ch1a = cafe.buyCoffee(cc1)
    val ch3b = cafe.buyCoffees(cc2, 3)
    println(ch1a)
    println(ch3b)
  }

}
