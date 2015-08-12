package hello

object Hello {
  def main(args: Array[String]) {
    // Mark that this string needs to be extracted by scala-xgettext.
    println(I18n.t("Hello world"))
  }
}

/**
 * Marker methods for scala-xgettext to know what strings to extract.
 */
trait I18n {
  def t(singular: String): String
  def tn(singular: String, plural: String, n: Long): String

  def tc(context: String, singular: String): String
  def tcn(context: String, singular: String, plural: String, n: Long): String
}

/**
 * Loads i18n strings from a language file.
 */
object I18n extends I18n {
  private val LANGUAGE_FILE = "fr.po"
  private val po = scaposer.Parser.parsePo(readFile(LANGUAGE_FILE)).right.get
  
  private def readFile(fileName: String): String = {
    val source = scala.io.Source.fromFile(fileName)
    try source.mkString finally source.close()
  }
  
  def t(singular: String): String =
    po.t(singular)
  
  def tn(singular: String, plural: String, n: Long): String =
    po.tn(singular, plural, n)

  def tc(context: String, singular: String): String =
    po.tc(context, singular)
    
  def tcn(context: String, singular: String, plural: String, n: Long): String =
    po.tcn(context, singular, plural, n)
}
