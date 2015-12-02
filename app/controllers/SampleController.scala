package controllers

import play.api._
import play.api.mvc._

class SampleController extends Controller {

  def index = Action {
    Ok(views.html.Sample.index("index page."))
  }

  def hoge = Action {
    Ok(views.html.Sample.hoge("hoge title!!!"))
  }

  def test = Action {
    Ok(views.html.Sample.test("test!!!"))
  }

}
