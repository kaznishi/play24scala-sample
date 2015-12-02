package controllers

import play.api._
import play.api.mvc._

class DefaultController extends Controller {

  def signin = Action {
    Ok(views.html.Default.signin())
  }

  //def signout = Action {
  //
  //}

}