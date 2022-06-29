package com.example
package cafe

case class Coffee(_price: Int = 100) {

  def price: Int = _price

  override def toString:String = "Coffee[price= "+_price+"]"

}
