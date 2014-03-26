package controllers.chat

import play.api.mvc.{WebSocket, Controller}
import play.api.libs.iteratee.{Enumerator, Iteratee}
import scala.concurrent.ExecutionContext.Implicits.global

/**
 * Created by endlick1989 on 2014/03/23.
 */
object Chat extends Controller {
  def say = WebSocket.async[String] { request =>
    val it: Iteratee[String, _] = Iteratee.foreach[String](f => println(f))
    val it2: Iteratee[String, _] = Iteratee.fold1(""){(s1, s2) => s1 + s2}
  }
}
