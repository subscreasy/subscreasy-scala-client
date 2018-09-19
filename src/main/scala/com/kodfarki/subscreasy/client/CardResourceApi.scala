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

import com.kodfarki.subscreasy.client.model.SaveCardRequest
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

class CardResourceApi(
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
  val helper = new CardResourceApiAsyncHelper(client, config)

  /**
   * saveCard
   * 
   *
   * @param request request 
   * @return Any
   */
  def saveCardUsingPOST(request: SaveCardRequest): Option[Any] = {
    val await = Try(Await.result(saveCardUsingPOSTAsync(request), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * saveCard asynchronously
   * 
   *
   * @param request request 
   * @return Future(Any)
   */
  def saveCardUsingPOSTAsync(request: SaveCardRequest): Future[Any] = {
      helper.saveCardUsingPOST(request)
  }

}

class CardResourceApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def saveCardUsingPOST(request: SaveCardRequest)(implicit reader: ClientResponseReader[Any], writer: RequestWriter[SaveCardRequest]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/api/card"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (request == null) throw new Exception("Missing required parameter 'request' when calling CardResourceApi->saveCardUsingPOST")

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(request))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
