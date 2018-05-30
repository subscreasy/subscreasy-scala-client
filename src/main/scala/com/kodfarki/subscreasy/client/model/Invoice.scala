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

case class Invoice (
  amount: Option[Number] = None,
  billingMonth: Option[Integer] = None,
  billingYear: Option[Integer] = None,
  id: Option[Long] = None,
  periodEnd: Option[Date] = None,
  periodStart: Option[Date] = None,
  status: Option[String] = None,
  subscriberSecureId: Option[String] = None
)
