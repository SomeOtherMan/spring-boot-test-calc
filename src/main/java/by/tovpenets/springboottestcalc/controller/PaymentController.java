package by.tovpenets.springboottestcalc.controller;

import by.tovpenets.springboottestcalc.model.PaymentRequest;
import by.tovpenets.springboottestcalc.model.ResponseAnswer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @GetMapping("/{id}")
    public ResponseAnswer showStatus(@PathVariable String id) {
        return new ResponseAnswer(200, "Status for id " + id + " is OK");
    }

    @PostMapping("/pay")
    public ResponseAnswer pay(@RequestBody PaymentRequest request) {
        if (request.getPayment() - request.getDiscount() < 0)
            return new ResponseAnswer(500, "ERROR");
        else return new ResponseAnswer(200, "OK");
    }
}
