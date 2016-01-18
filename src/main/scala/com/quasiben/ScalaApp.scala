package com.quasiben

import com.quasiben.ClientArguments.parseArgs

object ScalaApp {
  def main(args: Array[String]) {
    println("Hello World!")
    val a = 10
    println(a)
    val parsedArgs = parseArgs(args)
    println(parsedArgs)
    println("HELLO WORLD")
  }
}



