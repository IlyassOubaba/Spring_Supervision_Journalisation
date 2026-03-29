package ma.fstkech.controller;


import ma.fstkech.service.DemService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemController {

    private final DemService service;

    public DemController(DemService service) {
        this.service = service;
    }

    @GetMapping("/process")
    public String process() {
        return service.processData();
    }
}