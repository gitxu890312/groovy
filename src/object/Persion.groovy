package object

/**
 * @Author xuming* @date 2019/4/13
 * @Version v1.0.0
 * groovy中的所有的类和方法 成员变量都是public的
 */
class ObjPersion implements Action2, Action1 {
    String name
    def age

    @Override
    void eat() {
        println 'i am eating'
    }

    @Override
    void drink() {
        println( 'i am drinking')
    }


    @Override
    void play() {
        println('i am playing')
    }
}

object.ObjPersion p = new object.ObjPersion(name:'zhangsan',age: 12)
p.drink()
p.eat()
p.working()
p.play()