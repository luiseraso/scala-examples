package com.example
package cafe

case class CreditCard(number: String) {
  override def toString = "CreditCard[number="+number+"]"
}
