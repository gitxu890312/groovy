package object

import javax.print.Doc

/**
 * @Author xuming* @date 2019/4/13
 * @Version v1.0.0
 * groovy 方法的寻址优先级
 * 1.类中定义的方法>2.meteClass中定义的方法>3.methodMissing>4.invokeMethod
 *
 * groovy可以通过metaClass动态在类中添加方法和成员变量
 */
class Doctor {
    String name
    def age

    //当调用的方法不存在的时候，默认会调用此方法
    def invokeMethod(String name,def args){
        return "method is missing ${name} args is ${args}"
    }
    // 当调用的方法不存在的时候，默认会调用此方法
    def methodMissing(String name,def args){
        return "method missing is call at ${name}"
    }
}
//动态地添加方法
Doctor.metaClass.work = {
    return "doctor is working ${name} and age is ${age}"
}
Doctor.metaClass.sex = 'man' //添加成员变量
//添加静态方法
Doctor.metaClass.static.createDoctor = {String name,def age->
    return new Doctor(name:name,age:age)
}
Doctor doctor = new Doctor(name:'huatuo',age:100)
def res = doctor.work()
println(res)
println(doctor.sex)

Doctor d1 = Doctor.createDoctor("bianque",200)
println(d1.work())
