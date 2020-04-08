package operations.api;

import operations.api.controller.CalculationController;
import operations.api.pojo.request.AddRequest;
import operations.api.pojo.request.DifferenceRequest;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
public class OperationTest {

    private CalculationController calculationController;
    private static final Logger LOGGER = LoggerFactory.getLogger(OperationTest.class);
    TestRestTemplate testRestTemplate;

    /*
    Test to  verify the functioning of the Operation Controller
     */
    @Test
    public void testOperationController(){
        assertThat(calculationController).isNotNull();
        LOGGER.info("The value of operation Controller is not null");
        AddRequest addRequest = new AddRequest();
        addRequest.setX("20");
        addRequest.setY("10");
        DifferenceRequest diffRequest = new DifferenceRequest();
        diffRequest.setX("20");
        diffRequest.setY("30");
        calculationController.addingResponse(addRequest);
        calculationController.differenceResponse(diffRequest);

    }


    }
