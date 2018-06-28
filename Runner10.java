
//////////java class path ///////////
/////comands for run this code giving path logger//////
//1. javac -cp .:lib/slf4j-api-1.7.25.jar:lib/slf4j-simple-1.7.25.jar Runner10.java///
//1. java -cp .:lib/slf4j-api-1.7.25.jar:lib/slf4j-simple-1.7.25.jar Runner10///




import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Runner10 {
  public static void main(String[] args) {
    Logger logger = LoggerFactory.getLogger(Runner10.class);
    logger.info("Hello World");
  }
}