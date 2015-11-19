package controllers

import play.api._
import play.api.mvc._

class SampleController extends Controller {

  def index = Action {
    Ok(views.html.sample.index("hoge."))
  }

}
