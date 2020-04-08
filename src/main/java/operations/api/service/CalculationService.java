package operations.api.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CalculationService {
    private static final Logger LOGGER = LoggerFactory.getLogger(CalculationService.class);

    /*
    To operate the addition
     */
    public static String addOperation(String x, String y) {
        String additionValue = String.valueOf(Integer.parseInt(x) + Integer.parseInt(y));
        LOGGER.info("The added value can be seen here " + additionValue);
        return additionValue;


    }
    /*
    To operate the difference
     */


    public static String diffOperation(String x, String y) {

        String differenceValue = String.valueOf(Integer.parseInt(x) - Integer.parseInt(y));
        LOGGER.info("The added value can be seen here " + differenceValue);
        return differenceValue;

    }

}
