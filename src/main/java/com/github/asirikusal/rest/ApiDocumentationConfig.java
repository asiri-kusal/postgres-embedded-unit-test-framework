package com.github.asirikusal.rest;

import io.swagger.annotations.Contact;
import io.swagger.annotations.ExternalDocs;
import io.swagger.annotations.Info;
import io.swagger.annotations.License;
import io.swagger.annotations.SwaggerDefinition;

@SwaggerDefinition(
		info = @Info(
				description = "Awesome Resources",
				version = "V12.0.12",
				title = "Awesome Resource API",
				contact = @Contact(
						name = "Asiri kusal",
						email = "asiri.kusal@gmail.com"

				),
				license = @License(
						name = "Apache 2.0",
						url = "http://www.apache.org/licenses/LICENSE-2.0"
				)
		),
		basePath = "/customers/*",
		consumes = {"application/json", "application/xml"},
		produces = {"application/json", "application/xml"},
		schemes = {SwaggerDefinition.Scheme.HTTP, SwaggerDefinition.Scheme.HTTPS},
		externalDocs = @ExternalDocs(value = "Read This For Sure", url = "http://collibra.com")
)
public interface ApiDocumentationConfig {
}
