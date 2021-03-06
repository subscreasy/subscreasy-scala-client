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

import com.kodfarki.subscreasy.client.model.Service
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

class ServiceResourceApi(
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
  val helper = new ServiceResourceApiAsyncHelper(client, config)

  /**
   * createService
   * 
   *
   * @param service service 
   * @return Service
   */
  def createServiceUsingPOST(service: Service): Option[Service] = {
    val await = Try(Await.result(createServiceUsingPOSTAsync(service), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * createService asynchronously
   * 
   *
   * @param service service 
   * @return Future(Service)
   */
  def createServiceUsingPOSTAsync(service: Service): Future[Service] = {
      helper.createServiceUsingPOST(service)
  }

  /**
   * deleteService
   * 
   *
   * @param id id 
   * @return void
   */
  def deleteServiceUsingDELETE(id: Long) = {
    val await = Try(Await.result(deleteServiceUsingDELETEAsync(id), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * deleteService asynchronously
   * 
   *
   * @param id id 
   * @return Future(void)
   */
  def deleteServiceUsingDELETEAsync(id: Long) = {
      helper.deleteServiceUsingDELETE(id)
  }

  /**
   * getAllServices
   * 
   *
   * @return List[Service]
   */
  def getAllServicesUsingGET(): Option[List[Service]] = {
    val await = Try(Await.result(getAllServicesUsingGETAsync(), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * getAllServices asynchronously
   * 
   *
   * @return Future(List[Service])
   */
  def getAllServicesUsingGETAsync(): Future[List[Service]] = {
      helper.getAllServicesUsingGET()
  }

  /**
   * getService
   * 
   *
   * @param id id 
   * @return Service
   */
  def getServiceUsingGET(id: Long): Option[Service] = {
    val await = Try(Await.result(getServiceUsingGETAsync(id), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * getService asynchronously
   * 
   *
   * @param id id 
   * @return Future(Service)
   */
  def getServiceUsingGETAsync(id: Long): Future[Service] = {
      helper.getServiceUsingGET(id)
  }

  /**
   * updateService
   * 
   *
   * @param service service 
   * @return Service
   */
  def updateServiceUsingPUT(service: Service): Option[Service] = {
    val await = Try(Await.result(updateServiceUsingPUTAsync(service), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * updateService asynchronously
   * 
   *
   * @param service service 
   * @return Future(Service)
   */
  def updateServiceUsingPUTAsync(service: Service): Future[Service] = {
      helper.updateServiceUsingPUT(service)
  }

}

class ServiceResourceApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def createServiceUsingPOST(service: Service)(implicit reader: ClientResponseReader[Service], writer: RequestWriter[Service]): Future[Service] = {
    // create path and map variables
    val path = (addFmt("/api/services"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (service == null) throw new Exception("Missing required parameter 'service' when calling ServiceResourceApi->createServiceUsingPOST")

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(service))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteServiceUsingDELETE(id: Long)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/api/services/{id}")
      replaceAll("\\{" + "id" + "\\}", id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getAllServicesUsingGET()(implicit reader: ClientResponseReader[List[Service]]): Future[List[Service]] = {
    // create path and map variables
    val path = (addFmt("/api/services"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getServiceUsingGET(id: Long)(implicit reader: ClientResponseReader[Service]): Future[Service] = {
    // create path and map variables
    val path = (addFmt("/api/services/{id}")
      replaceAll("\\{" + "id" + "\\}", id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def updateServiceUsingPUT(service: Service)(implicit reader: ClientResponseReader[Service], writer: RequestWriter[Service]): Future[Service] = {
    // create path and map variables
    val path = (addFmt("/api/services"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (service == null) throw new Exception("Missing required parameter 'service' when calling ServiceResourceApi->updateServiceUsingPUT")

    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(service))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
