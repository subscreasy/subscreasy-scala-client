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

import com.kodfarki.subscreasy.client.model.ResponseEntity
import com.kodfarki.subscreasy.client.model.UserDTO
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

class AccountResourceApi(
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
  val helper = new AccountResourceApiAsyncHelper(client, config)

  /**
   * isAuthenticated
   * 
   *
   * @return String
   */
  def isAuthenticatedUsingGET(): Option[String] = {
    val await = Try(Await.result(isAuthenticatedUsingGETAsync(), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * isAuthenticated asynchronously
   * 
   *
   * @return Future(String)
   */
  def isAuthenticatedUsingGETAsync(): Future[String] = {
      helper.isAuthenticatedUsingGET()
  }

  /**
   * registerAccount
   * 
   *
   * @param managedUserVM managedUserVM 
   * @return ResponseEntity
   */
  def registerAccountUsingPOST(managedUserVM: UserDTO): Option[ResponseEntity] = {
    val await = Try(Await.result(registerAccountUsingPOSTAsync(managedUserVM), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * registerAccount asynchronously
   * 
   *
   * @param managedUserVM managedUserVM 
   * @return Future(ResponseEntity)
   */
  def registerAccountUsingPOSTAsync(managedUserVM: UserDTO): Future[ResponseEntity] = {
      helper.registerAccountUsingPOST(managedUserVM)
  }

}

class AccountResourceApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def isAuthenticatedUsingGET()(implicit reader: ClientResponseReader[String]): Future[String] = {
    // create path and map variables
    val path = (addFmt("/api/authenticate"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def registerAccountUsingPOST(managedUserVM: UserDTO)(implicit reader: ClientResponseReader[ResponseEntity], writer: RequestWriter[UserDTO]): Future[ResponseEntity] = {
    // create path and map variables
    val path = (addFmt("/api/register"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (managedUserVM == null) throw new Exception("Missing required parameter 'managedUserVM' when calling AccountResourceApi->registerAccountUsingPOST")

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(managedUserVM))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}