package object


/**
 * @Author xuming* @date 2019/4/13
 * @Version v1.0.0
 */
class ApplicationManager {
    static void init(){
        //是metaClass的修改全局有效
        ExpandoMetaClass.enableGlobally()
        //为doctor 添加静态方法
        Doctor.metaClass.static.createDoctor = {
            String  name,def age->
                return new Doctor(name:name,age:age)
        }

        //
//        Doctor.metaClass.work={
//            -> return "${self.name} is working"
//        }

    }
}
