package com.weatherapi.weatherapi.service;


import com.weatherapi.weatherapi.dto.CityWeatherDTO;
import com.weatherapi.weatherapi.dto.OpenWeatherResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/")
public class OpenWeatherAPIAdapter {

    @GetMapping
    public OpenWeatherResponseDTO rota() {

        final String uri = "https://api.openweathermap.org/data/2.5/weather?q=blumenau,br&units=metric&appid=fd09f9bf1f860a85ed3904f6e60c05cc";

        RestTemplate restTemplate = new RestTemplate();
        OpenWeatherResponseDTO result = restTemplate.getForObject(uri, OpenWeatherResponseDTO.class);

        CityWeatherDTO response = new CityWeatherDTO(result.name(), result.main().temp(), result.main().temp_max(), result.main().temp_min(), result.main().feels_like(), result.weather()[0].description());

        return result;
    }

}
