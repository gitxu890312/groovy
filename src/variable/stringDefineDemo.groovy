package variable

/**
 * @Author xuming* @date 2019/4/13
 * @Version v1.0.0
 * @desc 字符串定义方式
 */
def var = 'aaa'
//单引号的定义方式
def str1 = 'single sign string\tdefine'

//双引号，可以使用表达式 使用表达式会转换为GStringImpl ，与java.lang.String可以无缝集成
def str2 ="double sign string\tdefine ${var} , ${2+3}"

//三个单引号，可以定义复杂的格式字符串，如跨行
def str3 ='''\
three sign string define
one line
two line
'''

println(str1.class)
println(str1)

println(str2.class)
println(str2)

println(str3.class)
println(str3)