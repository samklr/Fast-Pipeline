

object JobConfigurationKeys extends Enumeration {
  type JobConfigurationKeys = String

  val INPUT_FOLDER_PATH = Value("input")
  val OUTPUT = Value("output") 
  val OUTPUT_NAMENODE = Value("output-namenode")
}
