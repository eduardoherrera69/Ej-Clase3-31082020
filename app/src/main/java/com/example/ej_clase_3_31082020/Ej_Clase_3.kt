package com.example.ej_clase_3_31082020

fun main(){

// Ej 1.- Crear archivo Main.kt


// Ej 2.- Imprimir mi nombre
  val name = "Eduardo"
  println(name)
  println("Mi nombre es: " + name)


  // Ej 3.-
  val diez = 10
  val veinte = 20
  val treinta = 30


  // Ej 4.-
    println(diez+veinte+treinta)

  // Ej 5.-

  var variabstring: String
  var variabchar: Char


  // Ej 6 Asignarle valores a las variables.-
  variabstring = "Ark Reingen"
  variabchar = 'A'
  println(variabstring)
  println(variabchar)
  println(variabstring+variabchar)
  println(variabstring+variabchar)

  // Ej 6 otra forma.-

  val variabstringb: String = "Ark Reigen"
  var variabcharb: Char = 'A'
  println(variabstringb)
  println(variabcharb)
  println(variabstringb+variabcharb)
  ///////////println(variabstringb,variabcharb)

 // Ej 7 a.- imprimir la cantidad de caracteres que tiene la variable "variabstringb" (= 10)

  println(variabstringb.length)

// Ej 7 b.- Modificar la variable variabcharb a otro valor

  variabcharb = 'B'
  println(variabcharb)

//Ej 8.- Declarar una variable tipo float de forma explicita

  var varfloat: Float

// Ej 9.- Asignar un valor a la variable float

  varfloat = 1.5f

 // 10.- Imprimir los valores maximos que pueden almacenar las variables Byte y Short

  println(Byte.MAX_VALUE)
  println(Short.MAX_VALUE)
  println(Int.MAX_VALUE)
  println(Long.MAX_VALUE)

  // 11.- Imprimir los valores minimos que pueden almacenar las variables Int y Long
  println(Byte.MIN_VALUE)
  println(Short.MIN_VALUE)
  println(Int.MIN_VALUE)
  println(Long.MIN_VALUE)

  //12.- Declarar una variable Boolean con true o false e imprimir su valor

  var trueboolean: Boolean = true
  var falseboolean: Boolean = false
  println(trueboolean)
  println(falseboolean)

//13.- Crear una funcion llamada "imprimiendoparametros" que recibe dos parametros String y est
  fun imprimiendoparametros(x: String, y: Char){

      }
 println(imprimiendoparametros("nombre", 'C'))

 // 14.- Funcion que devuelve valor de IVA

  }

