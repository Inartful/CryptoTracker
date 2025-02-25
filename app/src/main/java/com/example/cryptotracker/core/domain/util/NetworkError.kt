package com.example.cryptotracker.core.domain.util

enum class NetworkError: Error {
    REQUEST_TIMEOUT,
    TOO_MANY_REQUESTS,
    SERVER_ERROR,
    NO_INTERNET,
    SERIALIZATION,
    UNKNOWN
}