class Fund(private var _token : Int = 1000) {


  def GiveToken() : Int =
  {
    this._token += 10
    _token-=10
    return 100
  }
}