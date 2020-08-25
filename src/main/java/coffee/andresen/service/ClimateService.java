package coffee.andresen.service;

import coffee.andresen.models.ClimatePoint;
import coffee.andresen.repository.ClimateRepository;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

@Service
public class ClimateService {

    private final ClimateRepository repository;

    public ClimateService(ClimateRepository repository) {
        this.repository = repository;
    }

    public void insertClimatePoint(ClimatePoint climatePoint) {
        climatePoint.setDate(getCurrentDate());
        repository.insertClimatePoint(climatePoint);
    }

    private String getCurrentDate() {
        TimeZone tz = TimeZone.getTimeZone("GMT+2");
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        df.setTimeZone(tz);
        return df.format(new Date());
    }
}
