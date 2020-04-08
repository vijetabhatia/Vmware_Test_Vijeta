package operations.api.controller;

import operations.api.pojo.request.AddRequest;
import operations.api.pojo.request.DifferenceRequest;
import operations.api.pojo.response.AddResponse;
import operations.api.service.CalculationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CalculationController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CalculationController.class);
    private CalculationService calculationService;

    /*
    Controller to map the POST request for the addition Operation
     */
    @RequestMapping(value = "/api/add", method = RequestMethod.POST)
    public ResponseEntity<AddResponse> addingResponse(@RequestBody AddRequest addRequest) {

        String result = CalculationService.addOperation(addRequest.getX(), addRequest.getY());
        LOGGER.info("Value of result recieved" + result);
        return new ResponseEntity<>(new AddResponse(result), HttpStatus.OK);


    }

    /*
    Controller to map the POST request for the difference Operation
     */

    @RequestMapping(value = "/api/diff", method = RequestMethod.POST)
    public ResponseEntity<AddResponse> differenceResponse(@RequestBody DifferenceRequest differenceRequest) {

        String result = CalculationService.diffOperation(differenceRequest.getX(), differenceRequest.getY());
        LOGGER.info("Value of the result recieved is" + result);
        return new ResponseEntity<>(new AddResponse(result), HttpStatus.OK);
    }


}
