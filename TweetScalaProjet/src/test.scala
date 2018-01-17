

object test {
   def main(args: Array[String]) {
     val Ifact: IFactory = new TweetFactory(); 
       val tweet: Tweet = Ifact.createTweet()
     val user: User = Ifact.createUser()
      val user1 = new User("azzz","ss","fff@gg")
    user1.tostring
  println(user.email);
    }
  }