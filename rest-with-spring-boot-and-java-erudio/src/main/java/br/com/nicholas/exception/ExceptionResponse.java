package br.com.nicholas.exception;

import br.com.nicholas.model.Greeting;

import java.util.Date;

public record ExceptionResponse(Date timestamp, String message, String details) {

}
