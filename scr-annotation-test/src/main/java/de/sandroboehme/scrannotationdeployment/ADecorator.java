/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package de.sandroboehme.scrannotationdeployment;

import javax.servlet.http.HttpServletRequest;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Properties;
import org.apache.felix.scr.annotations.Property;
import org.apache.felix.scr.annotations.Service;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceDecorator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Decorates resources that have been called with the {@link ResEditorResourceProvider} with the resource-editor resource type.
 * 
 */

@Component
@Service(value = ResourceDecorator.class)
@Properties({
 @Property(name = "service.description", value = "Decorates resources that have been called with the ResEditorResourceProvider with the resource-editor resource type."),
 @Property(name = "service.vendor", value = "The Apache Software Foundation")
})
public class ADecorator implements ResourceDecorator {
	public static final String DEBUG = "1"; 

	private final Logger log = LoggerFactory.getLogger(ADecorator.class);
	
	/**
	 * @see org.apache.sling.api.resource.ResourceDecorator#decorate(org.apache.sling.api.resource.Resource,
	 *      javax.servlet.http.HttpServletRequest)
	 */
	public Resource decorate(Resource resource, HttpServletRequest request) {
		log.info("Current value of the DEBUG variable: ===========> "+DEBUG+" <===========");
		return resource;
	}

	/**
	 * @see org.apache.sling.api.resource.ResourceDecorator#decorate(org.apache.sling.api.resource.Resource)
	 */
	public Resource decorate(Resource resource) {
		log.info("Current value of the DEBUG variable: ===========> "+DEBUG+" <===========");
		return resource;
	}

}