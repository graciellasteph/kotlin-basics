fun main(args: Array<String>) {
    var myarr= arrayOf("bananas","oranges","mangoes")
    myarr[1]="pineapples"
    println("I love eating ${myarr[1]}")
    var myarr2= arrayOf<Int>(5,7,1,-8,6,12,15)
    println(myarr2.sorted())
    var myarr3= arrayOf<String>("Canada","Ghana","Southafrica")
    println(myarr3.sorted())
    var myarr4= arrayOf<Float>()


}