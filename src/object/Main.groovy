package object

/**
 * @Author xuming* @date 2019/4/13
 * @Version v1.0.0
 */
class Main {

    static void main(String ...args){
        println("应用正在初始化")
        ApplicationManager.init()
        println("应用初始化完成")

        Doctor doctor = Doctor.createDoctor("扁鹊",300)

        println(doctor.name)
        println(doctor.work())
    }
}
