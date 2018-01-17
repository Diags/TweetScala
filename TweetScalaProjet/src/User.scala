class User(var nom: String="azzz" , var prenom: String="rrrr", var email: String="diags@gmail",
    var tweets:List[Tweet] =
      List(
              new Tweet("fff", java.time.LocalDate.now()), 
              new Tweet("aaa",java.time.LocalDate.now())
           )
           ){
  def tostring = " "+ nom + " " + prenom + " "+ email + " "+ tweets.foreach(println)
}