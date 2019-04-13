package variable

import org.codehaus.groovy.ast.tools.ClosureUtils

/**
 * @Author xuming* @date 2019/4/13
 * @Version v1.0.0
 * 闭包的高级用法-委托错略，闭包的三个关键字
 *
 * this:闭包定义位置的引用;不能修改
 * owner：闭包定义位置的引用；不能修改
 * delegate 委托:默认执行owner ，可以修改
 */
//在脚本中定义的闭包
def outCloser = {String outer->
    //在脚本中定义的闭包默认指向 脚本本身
    println("scriptGroovy this:"+this)
    println("scriptGroovy owner:"+owner)
    println("scriprGroovy delegate"+delegate)
    println("---------------")

    //闭包的嵌套 this还是执行脚本本身，但是owner和delegate指向了外层的闭包
    def innerCloser = {
        println("inner clouser this:"+this)
        println("inner clouser owner:"+owner)
        println("inner clouser delegate"+delegate)
    }
    innerCloser.call()
}
outCloser.call()


class Persion{

    def  fieldCloser = {
        //类中静态变量的闭包
        println("-------------")
        println("Class.FieldCloser this:"+this)
        println("Class.FieldCloser owner:"+owner)
        println("Class.FieldCloser delegate:"+delegate)
    }
     def func1(){
        def funcCloser = {
            //类中静态方法的闭包
            println("-------------")
            println("Class.MethodCloser this:"+this)
            println("Class.MethodCloser owner:"+owner)
            println("Class.MethodCloser delegate:"+delegate)
        }
        funcCloser.call()
    }

}
//Persion.fieldCloser.call()
//Persion.func1()

Persion p = new Persion()
p.fieldCloser.call()
p.func1()


class Student{
    String name
    def sayHello = {
         "my name is ${name}"
    }
    String toString(){
        sayHello.call()
    }
}

class Teacher{
    String name
}

def stu = new Student()
//def stu = new Student("悟空") 此行报错，不能直接使用构造函数；
stu.name = "悟空"
def tea = new Teacher()
tea.name = "唐僧"
//修改delegate的引用对象
stu.sayHello.delegate = tea
//修改闭包的委托策略
stu.sayHello.resolveStrategy = Closure.DELEGATE_FIRST
println stu.toString()