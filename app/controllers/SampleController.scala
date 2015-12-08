package controllers

import play.api._
import play.api.mvc._

import play.api.data.Form
import play.api.data.Forms._
val form = Form( "name" -> text )

import models._

class SampleController extends Controller {

  def index = Action {
    Ok(views.html.Sample.index("index page."))
  }

  def add = Action { implicit request =>
    val name = form.bindFromRequest.get
    Ok(views.html.Sample.add("add page."+name))
  }

  def list = Action {
    val lists = List(Task(1,"hogehoge"),Task(11,"hogehoge11"),Task(21,"hogehoge21"))


    Ok(views.html.Sample.list("list page.", lists))
  }

  def listDummy = Action {
    val lists = List(Task(1,"hogehoge"),Task(11,"hogehoge11"),Task(21,"hogehoge21"))


    Ok(views.html.Sample.list("list page.", lists))
  }

  def todo = TODO

  def echo = Action { request =>
    Ok("Got request [" + request + "]")
  }

  def hoge = Action {
    Ok(views.html.Sample.hoge("hoge title!!!"))
  }

  def test = Action {
    Ok(views.html.Sample.test("test!!!"))
  }

}

