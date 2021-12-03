class Change (_name : String = "Change",
              _money : Int = 1000,
                _token : Int = 1000,
                private var _currency : Int = 1)
  extends Human (_name,_money, _token) {

  def currency = _currency
  def currency_= (newValue : Int) : Unit =
  {
    _currency = newValue
  }
}