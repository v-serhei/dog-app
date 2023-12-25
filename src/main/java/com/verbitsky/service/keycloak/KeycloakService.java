package com.verbitsky.service.keycloak;

import reactor.core.publisher.Mono;

import com.verbitsky.api.client.response.ApiResponse;

import java.util.Map;

@SuppressWarnings("unused")
public interface KeycloakService {
    Mono<ApiResponse> processLogin(String userName, String password);

    Mono<ApiResponse> processLogout(String userId);

    Mono<ApiResponse> processUserRegistration(Map<String, String> regData);

    Mono<ApiResponse> processRefreshToken(String token);

    void initAdminTokenUpdate();
}
