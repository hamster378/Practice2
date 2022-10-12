fun main() {
    //z1,z3
 val age1 = 42.0 //тип Double
 val age2 = 21.toDouble() //тип Double

     //z2
 val avg1 = (age1+age2)/2
    /* В первый раз было не правильно,
    так как программа определила первые 2 константы в тип Int по умолчанию,
     а теперь мы уточнили, что нужен совсем другой тип
     /*
          вывод: 31.5
          */
     */


    //z4
    val firstName = "София "
    val lastName = "Озерова"

    //z5
    val fulName = firstName+lastName

    //z5
    val myDetails = "Првет! Меня зовут $fulName" // вывод:  Првет! Меня зовут София Озерова

    //z6
    val DateOfBirth = Triple (21,4,2004)
    val date = DateOfBirth.first
    val mouth = DateOfBirth.second
    val year = DateOfBirth.third
    println(mouth)
    print(year)
        /* Вывод: 4
        2004
         */

}
