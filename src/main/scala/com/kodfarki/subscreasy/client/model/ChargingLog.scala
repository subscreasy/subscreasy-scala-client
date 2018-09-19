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

case class ChargingLog (
  appliedCoupon: Option[Long] = None,
  authCode: Option[String] = None,
  companyId: Option[Long] = None,
  createDate: Option[Date] = None,
  currency: Option[String] = None,
  errorCode: Option[String] = None,
  errorText: Option[String] = None,
  id: Option[Long] = None,
  invoiceId: Option[Long] = None,
  jobId: Option[Long] = None,
  offerId: Option[Long] = None,
  parentId: Option[Long] = None,
  paymentGateway: Option[String] = None,
  paymentId: Option[String] = None,
  price: Option[Number] = None,
  reason: Option[String] = None,
  savedCard: Option[SavedCard] = None,
  savedCardId: Option[Long] = None,
  serviceInstanceId: Option[Long] = None,
  status: Option[String] = None,
  subscriberSecureId: Option[String] = None,
  subscriptionId: Option[Long] = None,
  transactionId: Option[String] = None
)

