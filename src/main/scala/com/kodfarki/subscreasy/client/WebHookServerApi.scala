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

package com.kodfarki.subscreasy.client

import java.text.SimpleDateFormat

import com.kodfarki.subscreasy.client.model.WebHookRequest
import io.swagger.client.{ApiInvoker, ApiException}

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date
import java.util.TimeZone

import scala.collection.mutable.HashMap

import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

import java.net.URI

import com.wordnik.swagger.client.ClientResponseReaders.Json4sFormatsReader._
import com.wordnik.swagger.client.RequestWriters.Json4sFormatsWriter._

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent._
import scala.concurrent.duration._
import scala.util.{Failure, Success, Try}

import org.json4s._

class WebHookServerApi(
  val defBasePath: String = "https://localhost:8080",
  defApiInvoker: ApiInvoker = ApiInvoker
) {
  private lazy val dateTimeFormatter = {
    val formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    formatter.setTimeZone(TimeZone.getTimeZone("UTC"))
    formatter
  }
  private val dateFormatter = {
    val formatter = new SimpleDateFormat("yyyy-MM-dd")
    formatter.setTimeZone(TimeZone.getTimeZone("UTC"))
    formatter
  }
  implicit val formats = new org.json4s.DefaultFormats {
    override def dateFormatter = dateTimeFormatter
  }
  implicit val stringReader: ClientResponseReader[String] = ClientResponseReaders.StringReader
  implicit val unitReader: ClientResponseReader[Unit] = ClientResponseReaders.UnitReader
  implicit val jvalueReader: ClientResponseReader[JValue] = ClientResponseReaders.JValueReader
  implicit val jsonReader: ClientResponseReader[Nothing] = JsonFormatsReader
  implicit val stringWriter: RequestWriter[String] = RequestWriters.StringWriter
  implicit val jsonWriter: RequestWriter[Nothing] = JsonFormatsWriter

  var basePath: String = defBasePath
  var apiInvoker: ApiInvoker = defApiInvoker

  def addHeader(key: String, value: String): mutable.HashMap[String, String] = {
    apiInvoker.defaultHeaders += key -> value
  }

  val config: SwaggerConfig = SwaggerConfig.forUrl(new URI(defBasePath))
  val client = new RestClient(config)
  val helper = new WebHookServerApiAsyncHelper(client, config)

  /**
   * paymentUpdated
   * 
   *
   * @param r r 
   * @return Any
   */
  def paymentUpdatedUsingPOST(r: WebHookRequest): Option[Any] = {
    val await = Try(Await.result(paymentUpdatedUsingPOSTAsync(r), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * paymentUpdated asynchronously
   * 
   *
   * @param r r 
   * @return Future(Any)
   */
  def paymentUpdatedUsingPOSTAsync(r: WebHookRequest): Future[Any] = {
      helper.paymentUpdatedUsingPOST(r)
  }

  /**
   * subscriberCreated
   * 
   *
   * @param r r 
   * @return Any
   */
  def subscriberCreatedUsingPOST(r: WebHookRequest): Option[Any] = {
    val await = Try(Await.result(subscriberCreatedUsingPOSTAsync(r), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * subscriberCreated asynchronously
   * 
   *
   * @param r r 
   * @return Future(Any)
   */
  def subscriberCreatedUsingPOSTAsync(r: WebHookRequest): Future[Any] = {
      helper.subscriberCreatedUsingPOST(r)
  }

  /**
   * subscriberUpdated
   * 
   *
   * @param r r 
   * @return Any
   */
  def subscriberUpdatedUsingPOST(r: WebHookRequest): Option[Any] = {
    val await = Try(Await.result(subscriberUpdatedUsingPOSTAsync(r), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * subscriberUpdated asynchronously
   * 
   *
   * @param r r 
   * @return Future(Any)
   */
  def subscriberUpdatedUsingPOSTAsync(r: WebHookRequest): Future[Any] = {
      helper.subscriberUpdatedUsingPOST(r)
  }

  /**
   * subscriptionEnded
   * 
   *
   * @param r r 
   * @return Any
   */
  def subscriptionEndedUsingPOST(r: WebHookRequest): Option[Any] = {
    val await = Try(Await.result(subscriptionEndedUsingPOSTAsync(r), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * subscriptionEnded asynchronously
   * 
   *
   * @param r r 
   * @return Future(Any)
   */
  def subscriptionEndedUsingPOSTAsync(r: WebHookRequest): Future[Any] = {
      helper.subscriptionEndedUsingPOST(r)
  }

  /**
   * subscriptionRenewalFailed
   * 
   *
   * @param r r 
   * @return Any
   */
  def subscriptionRenewalFailedUsingPOST(r: WebHookRequest): Option[Any] = {
    val await = Try(Await.result(subscriptionRenewalFailedUsingPOSTAsync(r), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * subscriptionRenewalFailed asynchronously
   * 
   *
   * @param r r 
   * @return Future(Any)
   */
  def subscriptionRenewalFailedUsingPOSTAsync(r: WebHookRequest): Future[Any] = {
      helper.subscriptionRenewalFailedUsingPOST(r)
  }

  /**
   * subscriptionRenewed
   * 
   *
   * @param r r 
   * @return Any
   */
  def subscriptionRenewedUsingPOST(r: WebHookRequest): Option[Any] = {
    val await = Try(Await.result(subscriptionRenewedUsingPOSTAsync(r), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * subscriptionRenewed asynchronously
   * 
   *
   * @param r r 
   * @return Future(Any)
   */
  def subscriptionRenewedUsingPOSTAsync(r: WebHookRequest): Future[Any] = {
      helper.subscriptionRenewedUsingPOST(r)
  }

  /**
   * subscriptionStarted
   * 
   *
   * @param r r 
   * @return Any
   */
  def subscriptionStartedUsingPOST(r: WebHookRequest): Option[Any] = {
    val await = Try(Await.result(subscriptionStartedUsingPOSTAsync(r), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * subscriptionStarted asynchronously
   * 
   *
   * @param r r 
   * @return Future(Any)
   */
  def subscriptionStartedUsingPOSTAsync(r: WebHookRequest): Future[Any] = {
      helper.subscriptionStartedUsingPOST(r)
  }

}

class WebHookServerApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def paymentUpdatedUsingPOST(r: WebHookRequest)(implicit reader: ClientResponseReader[Any], writer: RequestWriter[WebHookRequest]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/subscreasy/webhook/payment-updated"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (r == null) throw new Exception("Missing required parameter 'r' when calling WebHookServerApi->paymentUpdatedUsingPOST")

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(r))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def subscriberCreatedUsingPOST(r: WebHookRequest)(implicit reader: ClientResponseReader[Any], writer: RequestWriter[WebHookRequest]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/subscreasy/webhook/subscriber-created"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (r == null) throw new Exception("Missing required parameter 'r' when calling WebHookServerApi->subscriberCreatedUsingPOST")

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(r))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def subscriberUpdatedUsingPOST(r: WebHookRequest)(implicit reader: ClientResponseReader[Any], writer: RequestWriter[WebHookRequest]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/subscreasy/webhook/subscriber-updated"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (r == null) throw new Exception("Missing required parameter 'r' when calling WebHookServerApi->subscriberUpdatedUsingPOST")

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(r))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def subscriptionEndedUsingPOST(r: WebHookRequest)(implicit reader: ClientResponseReader[Any], writer: RequestWriter[WebHookRequest]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/subscreasy/webhook/subscription-ended"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (r == null) throw new Exception("Missing required parameter 'r' when calling WebHookServerApi->subscriptionEndedUsingPOST")

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(r))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def subscriptionRenewalFailedUsingPOST(r: WebHookRequest)(implicit reader: ClientResponseReader[Any], writer: RequestWriter[WebHookRequest]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/subscreasy/webhook/subscription-renewal-failed"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (r == null) throw new Exception("Missing required parameter 'r' when calling WebHookServerApi->subscriptionRenewalFailedUsingPOST")

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(r))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def subscriptionRenewedUsingPOST(r: WebHookRequest)(implicit reader: ClientResponseReader[Any], writer: RequestWriter[WebHookRequest]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/subscreasy/webhook/subscription-renewed"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (r == null) throw new Exception("Missing required parameter 'r' when calling WebHookServerApi->subscriptionRenewedUsingPOST")

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(r))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def subscriptionStartedUsingPOST(r: WebHookRequest)(implicit reader: ClientResponseReader[Any], writer: RequestWriter[WebHookRequest]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/subscreasy/webhook/subscription-started"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (r == null) throw new Exception("Missing required parameter 'r' when calling WebHookServerApi->subscriptionStartedUsingPOST")

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(r))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
