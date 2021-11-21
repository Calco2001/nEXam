package nexamApp

import java.io.File

//with lateinit you can initialice the variable later
lateinit var name:String
lateinit var lastname:String
lateinit var exams:ArrayList<Exam>
lateinit var settings:Settings
//val xmlMapper = XmlMapper()


class User(var paramName:String, var paramLastname:String){
  init{
    name = paramName
    lastname = paramLastname
    exams = ArrayList<Exam>()
    settings = Settings()
  }
}

/*fun exportUser(){
  xmlMapper.writeValue(File("./":String), object)
}

fun importUser(filePath:String){
  val imported:User = xmlMapper.readValue(File(filePath), :User)

}
*/

/*
fun setSettings(setting: Settings){
  settings = setting
}
*/
fun addExam(ex:Exam){
  exams.add(ex)
}
