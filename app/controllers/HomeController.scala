package controllers

import javax.inject.{Singleton, Inject}
import play.api.db.slick.DatabaseConfigProvider
import play.api._
import play.api.mvc._
import scala.concurrent.ExecutionContext

import models.Model1
import slick.model.Model

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(
  protected val dbConfigProvider: DatabaseConfigProvider, 
  controllerComponents: ControllerComponents)(implicit ec: ExecutionContext) extends BaseController {

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index() = Action { implicit request: Request[AnyContent] =>
    {
      var model = new Model1(dbConfigProvider)
      Ok(views.html.index())
    }
  }
}
