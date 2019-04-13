package datastruct

/**
 * @author xuming* @date 2019/4/13
 * @version v1.0.0
 * 范围结构
 */

//定义
def range = 0..<10
println(range)
println(range.size())

//for (i in range){
//    print(i+",")
//}
//
//range.each {it->print(it)}

//range在switch中的使用
def getScore(Number num){
    def result;
    switch (num){
        case 0..<60:
            result="不及格"
            break
        case 60..<70:
            result="及格"
            break
        case 70..<80:
            result='良好'
            break
        default:
            result="优秀"
            break
    }
    return result
}

def msg = getScore(75)
println(msg)