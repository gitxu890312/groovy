package variable

/**
 * @Author xuming* @date 2019/4/13
 * @Version v1.0.0
 * 闭包与基本类型的结合使用
 */
//通过闭包实现阶乘
int fab(int number){
    int result = 1
    1.upto(number,{num->result*=num})
    return result
}
//向下阶乘
double fab2(double number){
    double result = 1
    number.downto(1,{num->result*=num})
    return result
}

int sum(int num){
    int result = 0
    num.times {n->
//        println(n)
        result+=n
    }
    return result
}
def result = sum(5)
//println(result)

def oneline = {String str->
    String tmp = "oneline"
    //会返回下面的bool值，默认应该是返回栈顶的值
    str.isNumber()

}
result = oneline("123")
print(result)