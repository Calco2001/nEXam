package nexamApp

//with lateinit you can initialice the variable later
lateinit var content: ArrayList<String>String


class Topic(){
  init{
    content = ArrayList<String>()
  }
}

fun addContent(paramContent:String){
  content.add(paramContent)
}

fun removeContent(paramContent:String){
  content.remove(paramContent)
}

/*fun getContent(): ArrayList<String>{
  return content
}
*()
