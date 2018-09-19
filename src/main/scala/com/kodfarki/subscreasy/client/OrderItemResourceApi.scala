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

import com.kodfarki.subscreasy.client.model.OrderItem
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

class OrderItemResourceApi(
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
  val helper = new OrderItemResourceApiAsyncHelper(client, config)

  /**
   * createOrderItem
   * 
   *
   * @param orderItem orderItem 
   * @return OrderItem
   */
  def createOrderItemUsingPOST(orderItem: OrderItem): Option[OrderItem] = {
    val await = Try(Await.result(createOrderItemUsingPOSTAsync(orderItem), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * createOrderItem asynchronously
   * 
   *
   * @param orderItem orderItem 
   * @return Future(OrderItem)
   */
  def createOrderItemUsingPOSTAsync(orderItem: OrderItem): Future[OrderItem] = {
      helper.createOrderItemUsingPOST(orderItem)
  }

  /**
   * deleteOrderItem
   * 
   *
   * @param id id 
   * @return void
   */
  def deleteOrderItemUsingDELETE(id: Long) = {
    val await = Try(Await.result(deleteOrderItemUsingDELETEAsync(id), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * deleteOrderItem asynchronously
   * 
   *
   * @param id id 
   * @return Future(void)
   */
  def deleteOrderItemUsingDELETEAsync(id: Long) = {
      helper.deleteOrderItemUsingDELETE(id)
  }

  /**
   * getAllOrderItems
   * 
   *
   * @return List[OrderItem]
   */
  def getAllOrderItemsUsingGET(): Option[List[OrderItem]] = {
    val await = Try(Await.result(getAllOrderItemsUsingGETAsync(), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * getAllOrderItems asynchronously
   * 
   *
   * @return Future(List[OrderItem])
   */
  def getAllOrderItemsUsingGETAsync(): Future[List[OrderItem]] = {
      helper.getAllOrderItemsUsingGET()
  }

  /**
   * getOrderItem
   * 
   *
   * @param id id 
   * @return OrderItem
   */
  def getOrderItemUsingGET(id: Long): Option[OrderItem] = {
    val await = Try(Await.result(getOrderItemUsingGETAsync(id), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * getOrderItem asynchronously
   * 
   *
   * @param id id 
   * @return Future(OrderItem)
   */
  def getOrderItemUsingGETAsync(id: Long): Future[OrderItem] = {
      helper.getOrderItemUsingGET(id)
  }

  /**
   * updateOrderItem
   * 
   *
   * @param orderItem orderItem 
   * @return OrderItem
   */
  def updateOrderItemUsingPUT(orderItem: OrderItem): Option[OrderItem] = {
    val await = Try(Await.result(updateOrderItemUsingPUTAsync(orderItem), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * updateOrderItem asynchronously
   * 
   *
   * @param orderItem orderItem 
   * @return Future(OrderItem)
   */
  def updateOrderItemUsingPUTAsync(orderItem: OrderItem): Future[OrderItem] = {
      helper.updateOrderItemUsingPUT(orderItem)
  }

}

class OrderItemResourceApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def createOrderItemUsingPOST(orderItem: OrderItem)(implicit reader: ClientResponseReader[OrderItem], writer: RequestWriter[OrderItem]): Future[OrderItem] = {
    // create path and map variables
    val path = (addFmt("/api/order-items"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (orderItem == null) throw new Exception("Missing required parameter 'orderItem' when calling OrderItemResourceApi->createOrderItemUsingPOST")

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(orderItem))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteOrderItemUsingDELETE(id: Long)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/api/order-items/{id}")
      replaceAll("\\{" + "id" + "\\}", id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getAllOrderItemsUsingGET()(implicit reader: ClientResponseReader[List[OrderItem]]): Future[List[OrderItem]] = {
    // create path and map variables
    val path = (addFmt("/api/order-items"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getOrderItemUsingGET(id: Long)(implicit reader: ClientResponseReader[OrderItem]): Future[OrderItem] = {
    // create path and map variables
    val path = (addFmt("/api/order-items/{id}")
      replaceAll("\\{" + "id" + "\\}", id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def updateOrderItemUsingPUT(orderItem: OrderItem)(implicit reader: ClientResponseReader[OrderItem], writer: RequestWriter[OrderItem]): Future[OrderItem] = {
    // create path and map variables
    val path = (addFmt("/api/order-items"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (orderItem == null) throw new Exception("Missing required parameter 'orderItem' when calling OrderItemResourceApi->updateOrderItemUsingPUT")

    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(orderItem))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
