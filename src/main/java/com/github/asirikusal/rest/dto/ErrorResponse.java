package com.github.asirikusal.rest.dto;

import lombok.Builder;
import lombok.ToString;

/**
 * @author Asiri
 */
@Builder
@ToString
public class ErrorResponse {

	private String message;
}
