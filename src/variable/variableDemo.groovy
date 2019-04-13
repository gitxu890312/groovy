package variable

/**
 * @Author xuming* @date 2019/4/13
 * @Version v1.0.0
 */
//强类型定义，在定义变量的时候指定具体的类型
// groovy基本数据类型会转换为java的包装类型
//int i = 1;
//println(i.class)
//
//float f = 2.0
//println(f.class)
//
//double d = 3.0
//println(d.class)
//
//byte be = 2
//println(be.class)
//
//short s = 22
//println(s.class)
//
//boolean bool = true
//println(bool.class)
//
//String s2 ="hello groovy"
//println(s2.class)


//弱类型对应，在定义变量的时候没有指定类型，groovy会自根据变量的值自动识别类型，实现动态类型转换
def var = 22
println(var.class)

var="hello groovy"
println(var.class)



