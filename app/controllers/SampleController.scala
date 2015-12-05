package controllers

import play.api._
import play.api.mvc._

import models._

class SampleController extends Controller {

  def index = Action {
    Ok(views.html.Sample.index("index page."))
  }

  def list = Action {
    val lists = List(Task(1,"hogehoge"),Task(11,"hogehoge11"),Task(21,"hogehoge21"))


    Ok(views.html.Sample.list("list page.", lists))
  }

  def hoge = Action {
    Ok(views.html.Sample.hoge("hoge title!!!"))
  }

  def test = Action {
    Ok(views.html.Sample.test("test!!!"))
  }

}

