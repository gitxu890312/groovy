package datastruct

/**
 * @Author xuming* @date 2019/4/13
 * @Version v1.0.0
 * map数据结构
 */

//map的定义
def map =[name:"唐僧",age:1000,'like':"取经",father:"dont konw"]
//def map1 =[name:"唐僧",age:1000,like:"取经",father:"dont konw"] as Hashtable //指定具体的类型 as HashMap不好用

//println(map1)
//println(map1.getClass())

//map的访问
//println map.name
//println( map.size())
//println(map['age'])
//
//map.tudi="悟空"
//println(map)

//便利
//map.each {def entry->
//    println(entry.key+":"+entry.value)
//}
//println("------------")
//map.each {key,value->
//    println(key+":"+value)
//}
//println("------------")
//map.eachWithIndex{ def entry, int i ->
//    println("key is ${entry.key} , value is ${entry.value} , index is ${i}")
//}
//println("------------")
//map.eachWithIndex{ def key,def value , int i ->
//    println("key is ${key} , value is ${value} , index is ${i}")
//}
//println("------------")

//查找
def students = [
        1:[number:'0001','name':'zhangsan',age:12,score:80],
        2:[number:'0002','name':'lisi',age:20,score:50],
        3:[number:'0003','name':'wangwu',age:25,score:60],
        4:[number:'0004','name':'zhangliu',age:18,score:40],
]

def res = students.find {student->student.value.age>18}
println(res.getClass())
res = students.findAll {student->student.value.age>18}

//获取成绩大于60 的同学的名字
res = students.findAll {student->
    student.value.score>=60
}.collect {item->
    item.value.name
}
res = students.any {student->student.value.age>20}
res = students.every {stu->stu.value.score>60}

//获取及格的人数
res = students.findAll {stu->stu.value.score>=60}.size()
println(res)


