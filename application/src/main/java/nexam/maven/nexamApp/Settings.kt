package nexamApp

import java.awt.Color

lateinit var background:java.awt.Color

class Settings(){
  //TODO: change background to a different color
 init{
   background = Color(255, 255, 255)
 }
}

fun setDefault(){
  background = Color(255, 255, 255)
}
