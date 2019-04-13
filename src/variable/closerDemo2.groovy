package variable

/**
 * @Author xuming* @date 2019/4/13
 * @Version v1.0.0
 * 字符串中闭包的使用
 */

def str = " the 2 and 3 is 5"

//str.each {s->print(s)}
//查找第一个
def res = str.find {s->s.isNumber()}
//println(res)

//查找所有
res = str.findAll {s->s.isNumber()}
//println(res)
//println(res.class)

res = str.collect {s-> s.toUpperCase()}
println(res.toString())
