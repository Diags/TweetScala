class TweetFactory() extends IFactory {
  def createTweet(): Tweet = {
    return new Tweet();
  }
  def createUser(): User = {
    return new User();
  }

}