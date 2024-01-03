package isap.vstu.by;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    // Получаем логгер по имени класса
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        // Записываем сообщения разных уровней в логи
        logger.info("This is an info message");
        logger.warn("This is a warning message");
        logger.error("This is an error message");
    }
}

