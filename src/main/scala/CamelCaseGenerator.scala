import slick.codegen.SourceCodeGenerator
import slick.model.Model

class CamelCaseGenerator(model: Model) extends SourceCodeGenerator(model) {
  override def entityName: String => String = (dbName: String) => {
    if (dbName.contains("_")) {
      super.entityName(dbName)
    } else {
      dbName+"Row"
    }
  }

  override def tableName: String => String = (dbName: String) => {
    if (dbName.contains("_")) {
      super.tableName(dbName)
    } else {
      dbName
    }
  }
}
