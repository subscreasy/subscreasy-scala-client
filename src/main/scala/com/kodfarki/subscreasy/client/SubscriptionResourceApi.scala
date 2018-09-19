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

import com.kodfarki.subscreasy.client.model.Cancellation
import com.kodfarki.subscreasy.client.model.StartSubscriptionRequest
import com.kodfarki.subscreasy.client.model.StartSubscriptionResult
import com.kodfarki.subscreasy.client.model.Subsription
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

class SubscriptionResourceApi(
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
  val helper = new SubscriptionResourceApiAsyncHelper(client, config)

  /**
   * cancelSubscription
   * 
   *
   * @param cancellation cancellation 
   * @return Subsription
   */
  def cancelSubscriptionUsingPUT(cancellation: Cancellation): Option[Subsription] = {
    val await = Try(Await.result(cancelSubscriptionUsingPUTAsync(cancellation), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * cancelSubscription asynchronously
   * 
   *
   * @param cancellation cancellation 
   * @return Future(Subsription)
   */
  def cancelSubscriptionUsingPUTAsync(cancellation: Cancellation): Future[Subsription] = {
      helper.cancelSubscriptionUsingPUT(cancellation)
  }

  /**
   * getActiveSubscriptionsByEmail
   * 
   *
   * @param email email 
   * @return List[Subsription]
   */
  def getActiveSubscriptionsByEmailUsingGET(email: String): Option[List[Subsription]] = {
    val await = Try(Await.result(getActiveSubscriptionsByEmailUsingGETAsync(email), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * getActiveSubscriptionsByEmail asynchronously
   * 
   *
   * @param email email 
   * @return Future(List[Subsription])
   */
  def getActiveSubscriptionsByEmailUsingGETAsync(email: String): Future[List[Subsription]] = {
      helper.getActiveSubscriptionsByEmailUsingGET(email)
  }

  /**
   * getActiveSubscriptions
   * 
   *
   * @param secureId secureId 
   * @return List[Subsription]
   */
  def getActiveSubscriptionsUsingGET(secureId: String): Option[List[Subsription]] = {
    val await = Try(Await.result(getActiveSubscriptionsUsingGETAsync(secureId), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * getActiveSubscriptions asynchronously
   * 
   *
   * @param secureId secureId 
   * @return Future(List[Subsription])
   */
  def getActiveSubscriptionsUsingGETAsync(secureId: String): Future[List[Subsription]] = {
      helper.getActiveSubscriptionsUsingGET(secureId)
  }

  /**
   * getAllCompanySubscriptions
   * 
   *
   * @param id id 
   * @return List[Subsription]
   */
  def getAllCompanySubscriptionsUsingGET(id: String): Option[List[Subsription]] = {
    val await = Try(Await.result(getAllCompanySubscriptionsUsingGETAsync(id), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * getAllCompanySubscriptions asynchronously
   * 
   *
   * @param id id 
   * @return Future(List[Subsription])
   */
  def getAllCompanySubscriptionsUsingGETAsync(id: String): Future[List[Subsription]] = {
      helper.getAllCompanySubscriptionsUsingGET(id)
  }

  /**
   * getSubscription
   * 
   *
   * @param id id 
   * @return Subsription
   */
  def getSubscriptionUsingGET(id: Long): Option[Subsription] = {
    val await = Try(Await.result(getSubscriptionUsingGETAsync(id), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * getSubscription asynchronously
   * 
   *
   * @param id id 
   * @return Future(Subsription)
   */
  def getSubscriptionUsingGETAsync(id: Long): Future[Subsription] = {
      helper.getSubscriptionUsingGET(id)
  }

  /**
   * startSubscription
   * 
   *
   * @param request request 
   * @return StartSubscriptionResult
   */
  def startSubscriptionUsingPOST(request: StartSubscriptionRequest): Option[StartSubscriptionResult] = {
    val await = Try(Await.result(startSubscriptionUsingPOSTAsync(request), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * startSubscription asynchronously
   * 
   *
   * @param request request 
   * @return Future(StartSubscriptionResult)
   */
  def startSubscriptionUsingPOSTAsync(request: StartSubscriptionRequest): Future[StartSubscriptionResult] = {
      helper.startSubscriptionUsingPOST(request)
  }

}

class SubscriptionResourceApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def cancelSubscriptionUsingPUT(cancellation: Cancellation)(implicit reader: ClientResponseReader[Subsription], writer: RequestWriter[Cancellation]): Future[Subsription] = {
    // create path and map variables
    val path = (addFmt("/api/subscriptions/cancel"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (cancellation == null) throw new Exception("Missing required parameter 'cancellation' when calling SubscriptionResourceApi->cancelSubscriptionUsingPUT")

    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(cancellation))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getActiveSubscriptionsByEmailUsingGET(email: String)(implicit reader: ClientResponseReader[List[Subsription]]): Future[List[Subsription]] = {
    // create path and map variables
    val path = (addFmt("/api/subscriptions/subscriber/email/{email}")
      replaceAll("\\{" + "email" + "\\}", email.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (email == null) throw new Exception("Missing required parameter 'email' when calling SubscriptionResourceApi->getActiveSubscriptionsByEmailUsingGET")


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getActiveSubscriptionsUsingGET(secureId: String)(implicit reader: ClientResponseReader[List[Subsription]]): Future[List[Subsription]] = {
    // create path and map variables
    val path = (addFmt("/api/subscriptions/subscriber/{secureId}")
      replaceAll("\\{" + "secureId" + "\\}", secureId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (secureId == null) throw new Exception("Missing required parameter 'secureId' when calling SubscriptionResourceApi->getActiveSubscriptionsUsingGET")


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getAllCompanySubscriptionsUsingGET(id: String)(implicit reader: ClientResponseReader[List[Subsription]]): Future[List[Subsription]] = {
    // create path and map variables
    val path = (addFmt("/api/subscriptions/company/{id}")
      replaceAll("\\{" + "id" + "\\}", id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (id == null) throw new Exception("Missing required parameter 'id' when calling SubscriptionResourceApi->getAllCompanySubscriptionsUsingGET")


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getSubscriptionUsingGET(id: Long)(implicit reader: ClientResponseReader[Subsription]): Future[Subsription] = {
    // create path and map variables
    val path = (addFmt("/api/subscriptions/{id}")
      replaceAll("\\{" + "id" + "\\}", id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def startSubscriptionUsingPOST(request: StartSubscriptionRequest)(implicit reader: ClientResponseReader[StartSubscriptionResult], writer: RequestWriter[StartSubscriptionRequest]): Future[StartSubscriptionResult] = {
    // create path and map variables
    val path = (addFmt("/api/subscriptions/start"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (request == null) throw new Exception("Missing required parameter 'request' when calling SubscriptionResourceApi->startSubscriptionUsingPOST")

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(request))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}