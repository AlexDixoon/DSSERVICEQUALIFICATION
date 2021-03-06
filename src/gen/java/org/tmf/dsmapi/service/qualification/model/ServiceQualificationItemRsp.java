/*
 * API ProductOrdering
 * 
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package org.tmf.dsmapi.service.qualification.model;

import java.util.Objects;
import org.tmf.dsmapi.service.qualification.model.ServiceRsp;
import java.util.*;
import java.util.Date;
import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ServiceQualificationItemRsp
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.TMFJaxRSServerCodegen", date = "2017-04-28T19:12:45.112+05:30")
public class ServiceQualificationItemRsp   {
  
    
    
  
  
  private ServiceRsp service = null;

  
    
    
  
  
  private List<ServiceRsp> alternativeService = new ArrayList<ServiceRsp>();

  
    
    
  
  
  private String availability = null;

  
    
    
  
  
  private Date serviceabilityDate = null;

  
  
  
  public ServiceQualificationItemRsp service(ServiceRsp service) {
    this.service = service;
    return this;
  }
  
  

  
   /**
  
  
   * Get service
  
  
  
   * @return service
  **/
 
  @ApiModelProperty(value = "")
  @JsonProperty("service")
   public ServiceRsp getService() {
    return service;
  }
  

  public void setService(ServiceRsp service) {
    this.service = service;
  }
  

  
  
  public ServiceQualificationItemRsp alternativeService(List<ServiceRsp> alternativeService) {
    this.alternativeService = alternativeService;
    return this;
  }
  
  

  
   /**
  
  
   * Get alternativeService
  
  
  
   * @return alternativeService
  **/
 
  @ApiModelProperty(value = "")
  @JsonProperty("alternativeService")
   public List<ServiceRsp> getAlternativeService() {
    return alternativeService;
  }
  

  public void setAlternativeService(List<ServiceRsp> alternativeService) {
    this.alternativeService = alternativeService;
  }
  

  
  
  public ServiceQualificationItemRsp availability(String availability) {
    this.availability = availability;
    return this;
  }
  
  

  
   /**
  
  
   * Get availability
  
  
  
   * @return availability
  **/
 
  @ApiModelProperty(value = "")
  @JsonProperty("availability")
   public String getAvailability() {
    return availability;
  }
  

  public void setAvailability(String availability) {
    this.availability = availability;
  }
  

  
  
  public ServiceQualificationItemRsp serviceabilityDate(Date serviceabilityDate) {
    this.serviceabilityDate = serviceabilityDate;
    return this;
  }
  
  

  
   /**
  
  
   * Get serviceabilityDate
  
  
  
   * @return serviceabilityDate
  **/
 
  @ApiModelProperty(value = "")
  @JsonProperty("serviceabilityDate")
   public Date getServiceabilityDate() {
    return serviceabilityDate;
  }
  

  public void setServiceabilityDate(Date serviceabilityDate) {
    this.serviceabilityDate = serviceabilityDate;
  }
  

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceQualificationItemRsp serviceQualificationItemRsp = (ServiceQualificationItemRsp) o;
    return Objects.equals(this.service, serviceQualificationItemRsp.service) &&
        Objects.equals(this.alternativeService, serviceQualificationItemRsp.alternativeService) &&
        Objects.equals(this.availability, serviceQualificationItemRsp.availability) &&
        Objects.equals(this.serviceabilityDate, serviceQualificationItemRsp.serviceabilityDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(service, alternativeService, availability, serviceabilityDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceQualificationItemRsp {\n");
    
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    alternativeService: ").append(toIndentedString(alternativeService)).append("\n");
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
    sb.append("    serviceabilityDate: ").append(toIndentedString(serviceabilityDate)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

