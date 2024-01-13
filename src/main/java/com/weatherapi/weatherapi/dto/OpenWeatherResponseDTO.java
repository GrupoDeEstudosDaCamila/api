package com.weatherapi.weatherapi.dto;

public record OpenWeatherResponseDTO(WeatherResponseDTO[] weather, MainWeatherResponseDTO main, String name) {
}

