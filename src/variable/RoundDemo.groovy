package variable

/**
 * @Author xuming* @date 2019/4/13
 * @Version v1.0.0
 * groovy循环demo
 */


def x = "hello1"
def result ;
switch (x){
    case Integer:
        result="Integer"
        break
    case "aaa":
        result ="aaa"
        break
    case [1,2,3,10,"hello"]:
        result = "list"
        break
    case BigDecimal:
        result = "bigdecimal"
        break
    default:
        result ="default"
        break
}
println(result)
//map结构
def map = ["aaa":1,"bbb":2,"ccc":3]
for (i in map){
    println(i.key+":"+i.value)
}
//list结构
for (i in 0..9){
    print(i+",")
}