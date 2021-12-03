class Human(_name: String = "Human",
            _money: Int = 0,
            var _token: Int = 10)
{
  def name : String = _name
  def name_= (newValue : String): Unit = {
    name = newValue
  }
  def money: Int = _money
  def money_= (newValue : Int): Unit =
  {
    money = newValue
  }
  def token : Int = _token
  def token_= (newValue : Int):Unit =
  {
    _token = token
  }
  def GetHumanInfo(): Unit = {
    println(s"Name: ${_name}" + s"Money: ${_money}" + s"Token: ${_token}")
  }
}
