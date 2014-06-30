import apis._
import akka.actor.ActorSystem
import com.wordnik.swagger.app.{ ResourcesApp, SwaggerApp }
import javax.servlet.ServletContext
import org.scalatra.LifeCycle

class ScalatraBootstrap extends LifeCycle {
  implicit val swagger = new SwaggerApp

  override def init(context: ServletContext) {
    implicit val system = ActorSystem("mySystem")
    try {
      context mount (new UserApi, "/user/*")
      context mount (new PetApi, "/pet/*")
      context mount (new StoreApi, "/store/*")
      context mount (new ResourcesApp, "/api-docs/*")
    } catch {
      case e: Throwable => e.printStackTrace()
    }
  }
}
