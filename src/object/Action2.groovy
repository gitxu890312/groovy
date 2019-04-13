package object

/**
 * @Author xuming* @date 2019/4/13
 * @Version v1.0.0
 * trait中可以有默认的实现
 */
trait Action2 {

    abstract  void play()

    void working(){
        println("i am working")
    }
}