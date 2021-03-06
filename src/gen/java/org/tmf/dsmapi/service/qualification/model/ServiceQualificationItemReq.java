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
import org.tmf.dsmapi.service.qualification.model.ServiceReq;
import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ServiceQualificationItemReq
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.TMFJaxRSServerCodegen", date = "2017-04-28T19:12:45.112+05:30")
public class ServiceQualificationItemReq   {
  
    
    
  
  
  private ServiceReq service = null;

  
  
  
  public ServiceQualificationItemReq service(ServiceReq service) {
    this.service = service;
    return this;
  }
  
  

  
   /**
  
  
   * Get service
  
  
  
   * @return service
  **/
 
  @ApiModelProperty(value = "")
  @JsonProperty("service")
   public ServiceReq getService() {
    return service;
  }
  

  public void setService(ServiceReq service) {
    this.service = service;
  }
  

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceQualificationItemReq serviceQualificationItemReq = (ServiceQualificationItemReq) o;
    return Objects.equals(this.service, serviceQualificationItemReq.service);
  }

  @Override
  public int hashCode() {
    return Objects.hash(service);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceQualificationItemReq {\n");
    
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
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

