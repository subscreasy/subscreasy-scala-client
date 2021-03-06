/**
 * Api Documentation
 * Api Documentation
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.kodfarki.subscreasy.client.model

import java.util.Date

case class UserDTO (
  activated: Option[Boolean] = None,
  authorities: Option[List[String]] = None,
  company: Option[Company] = None,
  createdBy: Option[String] = None,
  createdDate: Option[Date] = None,
  email: Option[String] = None,
  firstName: Option[String] = None,
  id: Option[Long] = None,
  imageUrl: Option[String] = None,
  langKey: Option[String] = None,
  lastModifiedBy: Option[String] = None,
  lastModifiedDate: Option[Date] = None,
  lastName: Option[String] = None,
  login: String,
  password: Option[String] = None,
  resetDate: Option[String] = None,
  siteName: Option[String] = None,
  subscriber: Option[Boolean] = None
)

