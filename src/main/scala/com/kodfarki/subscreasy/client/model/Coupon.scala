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

case class Coupon (
  code: Option[String] = None,
  company: Option[Company] = None,
  currentUsage: Option[Integer] = None,
  discountAmount: Number,
  discountType: String,
  expireDate: Option[Date] = None,
  id: Option[Long] = None,
  maxLimit: Integer
)
