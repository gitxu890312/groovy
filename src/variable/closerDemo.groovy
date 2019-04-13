package variable

/**
 * @Author xuming* @date 2019/4/13
 * @Version v1.0.0
 * 闭包demo
 */

//闭包的定义
def closer1 = {println("hello closer")}

//闭包的调用
//closer1.call()
//closer1()

//定义有参数的闭包
def paramCloser={String name,int age->
    println("my name is ${name},my age is ${age}")
}

//paramCloser("zhangsan",12)

//闭包的默认参数,如果不定义参数，会默认存在一个it的参数,如果定义了参数，it就不会存在了
def defParamCloser = {
    println("my name is ${it}")
}
//defParamCloser("lisi")


//defParamCloser1 = {String name->
//    //错误的使用了 it参数
//    println("it param is ${it} ")
//}
//defParamCloser1("wangwu")

//闭包的返回值,闭包一定会有一个返回值，默认为null
def returnCloser = {String name->
//    return "hello ${name}"
}

def result = returnCloser("closer")
println(result)
if(result==null){
    println("return value is null")
}
