package com.mak.springbootapp.dto;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("cmdb")
public class DisplyaCmdbProperties {

	private String endpointUrl;
	private List<Integer> endpointPort;
	public String getEndpointUrl() {
		return endpointUrl;
	}
	public void setEndpointUrl(String endpointUrl) {
		this.endpointUrl = endpointUrl;
	}
	public List<Integer> getEndpointPort() {
		return endpointPort;
	}
	public void setEndpointPort(List<Integer> endpointPort) {
		this.endpointPort = endpointPort;
	}
	@Override
	public String toString() {
		return "DisplyaCmdbProperties [endpointUrl=" + endpointUrl + ", endpointPort=" + endpointPort + "]";
	}

}
