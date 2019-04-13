package datastruct

/**
 * @Author xuming* @date 2019/4/13
 * @Version v1.0.0
 * groovy 数据结构list
 */
//list结构的定义
def list = [1,2,3,4,5]
//println(list.class)
//println(list.toString())
//数组的定义
def array = [2,3,4,5,6] as int[]
int[] arr = [3,4,5,56,7]


def list1 = [-1,-4,6,7,-9,3]

//list1.add(10)
//println list1[1]
//println list1.sum()
//
//list1.sort {it->Math.abs(it)}
//println(list1)
println("-----------遍历")
println("each")
list1.each {it->println(it)}
println("eachWithIndex")

list1.eachWithIndex{ int entry, int i ->
    println("index is ${i} value is ${entry}")
}
