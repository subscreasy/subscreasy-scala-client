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

import com.kodfarki.subscreasy.client.model.History
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

class HistoryResourceApi(
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
  val helper = new HistoryResourceApiAsyncHelper(client, config)

  /**
   * createHistory
   * 
   *
   * @param history history 
   * @return History
   */
  def createHistoryUsingPOST(history: History): Option[History] = {
    val await = Try(Await.result(createHistoryUsingPOSTAsync(history), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * createHistory asynchronously
   * 
   *
   * @param history history 
   * @return Future(History)
   */
  def createHistoryUsingPOSTAsync(history: History): Future[History] = {
      helper.createHistoryUsingPOST(history)
  }

  /**
   * deleteHistory
   * 
   *
   * @param id id 
   * @return void
   */
  def deleteHistoryUsingDELETE(id: Long) = {
    val await = Try(Await.result(deleteHistoryUsingDELETEAsync(id), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * deleteHistory asynchronously
   * 
   *
   * @param id id 
   * @return Future(void)
   */
  def deleteHistoryUsingDELETEAsync(id: Long) = {
      helper.deleteHistoryUsingDELETE(id)
  }

  /**
   * getAllHistories
   * 
   *
   * @return List[History]
   */
  def getAllHistoriesUsingGET(): Option[List[History]] = {
    val await = Try(Await.result(getAllHistoriesUsingGETAsync(), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * getAllHistories asynchronously
   * 
   *
   * @return Future(List[History])
   */
  def getAllHistoriesUsingGETAsync(): Future[List[History]] = {
      helper.getAllHistoriesUsingGET()
  }

  /**
   * getHistory
   * 
   *
   * @param id id 
   * @return History
   */
  def getHistoryUsingGET(id: Long): Option[History] = {
    val await = Try(Await.result(getHistoryUsingGETAsync(id), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * getHistory asynchronously
   * 
   *
   * @param id id 
   * @return Future(History)
   */
  def getHistoryUsingGETAsync(id: Long): Future[History] = {
      helper.getHistoryUsingGET(id)
  }

  /**
   * updateHistory
   * 
   *
   * @param history history 
   * @return History
   */
  def updateHistoryUsingPUT(history: History): Option[History] = {
    val await = Try(Await.result(updateHistoryUsingPUTAsync(history), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * updateHistory asynchronously
   * 
   *
   * @param history history 
   * @return Future(History)
   */
  def updateHistoryUsingPUTAsync(history: History): Future[History] = {
      helper.updateHistoryUsingPUT(history)
  }

}

class HistoryResourceApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def createHistoryUsingPOST(history: History)(implicit reader: ClientResponseReader[History], writer: RequestWriter[History]): Future[History] = {
    // create path and map variables
    val path = (addFmt("/api/histories"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (history == null) throw new Exception("Missing required parameter 'history' when calling HistoryResourceApi->createHistoryUsingPOST")

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(history))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteHistoryUsingDELETE(id: Long)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/api/histories/{id}")
      replaceAll("\\{" + "id" + "\\}", id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getAllHistoriesUsingGET()(implicit reader: ClientResponseReader[List[History]]): Future[List[History]] = {
    // create path and map variables
    val path = (addFmt("/api/histories"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getHistoryUsingGET(id: Long)(implicit reader: ClientResponseReader[History]): Future[History] = {
    // create path and map variables
    val path = (addFmt("/api/histories/{id}")
      replaceAll("\\{" + "id" + "\\}", id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def updateHistoryUsingPUT(history: History)(implicit reader: ClientResponseReader[History], writer: RequestWriter[History]): Future[History] = {
    // create path and map variables
    val path = (addFmt("/api/histories"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (history == null) throw new Exception("Missing required parameter 'history' when calling HistoryResourceApi->updateHistoryUsingPUT")

    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(history))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}