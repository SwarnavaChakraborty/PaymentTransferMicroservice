package com.revolut.configuration;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.dropwizard.Configuration;
import io.federecio.dropwizard.swagger.SwaggerBundleConfiguration;

public class ApplicationConfiguration extends Configuration {

	@JsonProperty("swagger")
	public SwaggerBundleConfiguration swaggerBundleConfiguration;

}
