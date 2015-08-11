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
 * The implementations are dummy for now.
 * At 3-load-po-file, we'll modify them to load from language files.
 */
object I18n extends I18n {
  def t(singular: String): String =
    singular
  
  def tn(singular: String, plural: String, n: Long): String =
    singular

  def tc(context: String, singular: String): String =
    singular
    
  def tcn(context: String, singular: String, plural: String, n: Long): String =
    singular
}
