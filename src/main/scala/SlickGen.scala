import slick.codegen.SourceCodeGenerator

object SlickGen extends App {
  val database = args(0)
  val user = args(1)
  val password = args(2)
  SourceCodeGenerator.main(Array("slick.jdbc.MySQLProfile", "com.mysql.jdbc.Driver", s"jdbc:mysql://$database", "/Users/theilig/slick", "models.schema", user, password, "true", "CamelCaseGenerator", "true"))
}
