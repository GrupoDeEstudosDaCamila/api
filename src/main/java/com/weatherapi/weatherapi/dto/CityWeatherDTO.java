package com.weatherapi.weatherapi.dto;

public record CityWeatherDTO(String city, String temperature, String max_temperature, String min_temperature, String feels_like, String description) {

}
