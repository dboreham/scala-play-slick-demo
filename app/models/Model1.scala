package models

import scala.concurrent.{ ExecutionContext, Future }
import javax.inject.Inject

import play.api.db.slick.DatabaseConfigProvider
import play.api.db.slick.HasDatabaseConfigProvider
import slick.jdbc.JdbcProfile
import slick.jdbc.SQLActionBuilder
import slick.jdbc.PostgresProfile.api._

class Model1 @Inject() (protected val dbConfigProvider: DatabaseConfigProvider)(
    implicit ec: ExecutionContext
) extends HasDatabaseConfigProvider[JdbcProfile] {

    def get(id: String) : Future[String] = {
        val db = dbConfigProvider.get.db
        val query = sql"select 1".as[String].head
        val foo = db.run(query)
        return foo
    }

}