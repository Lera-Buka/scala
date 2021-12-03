import scala.util.Random
class Node(_name : String = "Node",
           _money : Int = 0,
           _token : Int = 0)
  extends Human (_name, _money, _token) {

  private var teacherList = List(new Teacher()).take(0)
  private var managerList = List(new Manager()).take(0)

  var change = new Change()
  var reserve = new Fund()

  def Process(): Unit =
  {
    if(this._token<=0)
      this.token += reserve.GiveToken()
    for(a <- teacherList.indices)
    {
      teacherList(a).Start()
    }

  }




}