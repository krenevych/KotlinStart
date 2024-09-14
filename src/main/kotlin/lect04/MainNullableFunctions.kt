package lect04


fun foo(st: String, bar: ((String) -> Unit)?){
//    bar ?: return

//    bar.invoke(st)  == bar(st)

    bar?.invoke(st)
}


fun main() {

    foo ("Kotlin", ::println)
    foo ("Kotlin2", null)


}