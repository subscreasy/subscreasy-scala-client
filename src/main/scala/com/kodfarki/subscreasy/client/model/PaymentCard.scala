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


case class PaymentCard (
  cardAlias: Option[String] = None,
  cardExpiry: Option[String] = None,
  cardFamily: Option[String] = None,
  cardHolderName: Option[String] = None,
  cardNumber: Option[String] = None,
  cardToken: Option[String] = None,
  cardUserKey: Option[String] = None,
  cvc: Option[String] = None,
  expireMonth: Option[String] = None,
  expireYear: Option[String] = None,
  registerCard: Option[Integer] = None
)

