package coffee.andresen.controller;

import coffee.andresen.models.ClimatePoint;
import coffee.andresen.service.ClimateService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/climate")
public class ClimateController {

    private final ClimateService climateService;

    public ClimateController(ClimateService climateService) {
        this.climateService = climateService;
    }

    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    @PostMapping
    public void addClimateData(@RequestBody ClimatePoint climatePoint) {
        climateService.insertClimatePoint(climatePoint);
    }
}
