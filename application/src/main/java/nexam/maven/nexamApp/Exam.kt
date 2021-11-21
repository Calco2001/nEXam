package nexamApp

import java.time.LocalDate

//with lateinit you can initialice the variable later
lateinit var subject:String
lateinit var topics:ArrayList<Topic>
lateinit var date:LocalDate
//= LocalDate.parse("2021-11-21")


class Exam(var paramName:String, var examDate:LocalDate){
  init{
    subject = paramName
    topics = ArrayList<Topic>()
    date = examDate
  }
}

fun addTopic(paramTopic:Topic){
  topics.add(paramTopic)
}

fun removeTopic(paramTopic:Topic){
  topics.remove(paramTopic)
}

/*fun getTopics(): ArrayList<Topic>{
  return topics
}

fun setSubject(paramSubject:String){
  subject = paramSubject
}

fun getSubject(): String{
  return subject
}

fun setDate(paramDate:LocalDate){
  date = paramDate
}

fun getDate(): LocalDate{
  return date
}
*/
