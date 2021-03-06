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

import com.kodfarki.subscreasy.client.model.Coupon
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

class CouponResourceApi(
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
  val helper = new CouponResourceApiAsyncHelper(client, config)

  /**
   * createCoupon
   * 
   *
   * @param coupon coupon 
   * @return Coupon
   */
  def createCouponUsingPOST(coupon: Coupon): Option[Coupon] = {
    val await = Try(Await.result(createCouponUsingPOSTAsync(coupon), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * createCoupon asynchronously
   * 
   *
   * @param coupon coupon 
   * @return Future(Coupon)
   */
  def createCouponUsingPOSTAsync(coupon: Coupon): Future[Coupon] = {
      helper.createCouponUsingPOST(coupon)
  }

  /**
   * deleteCoupon
   * 
   *
   * @param id id 
   * @return void
   */
  def deleteCouponUsingDELETE(id: Long) = {
    val await = Try(Await.result(deleteCouponUsingDELETEAsync(id), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * deleteCoupon asynchronously
   * 
   *
   * @param id id 
   * @return Future(void)
   */
  def deleteCouponUsingDELETEAsync(id: Long) = {
      helper.deleteCouponUsingDELETE(id)
  }

  /**
   * getAllCoupons
   * 
   *
   * @return List[Coupon]
   */
  def getAllCouponsUsingGET(): Option[List[Coupon]] = {
    val await = Try(Await.result(getAllCouponsUsingGETAsync(), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * getAllCoupons asynchronously
   * 
   *
   * @return Future(List[Coupon])
   */
  def getAllCouponsUsingGETAsync(): Future[List[Coupon]] = {
      helper.getAllCouponsUsingGET()
  }

  /**
   * getCoupon
   * 
   *
   * @param id id 
   * @return Coupon
   */
  def getCouponUsingGET(id: Long): Option[Coupon] = {
    val await = Try(Await.result(getCouponUsingGETAsync(id), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * getCoupon asynchronously
   * 
   *
   * @param id id 
   * @return Future(Coupon)
   */
  def getCouponUsingGETAsync(id: Long): Future[Coupon] = {
      helper.getCouponUsingGET(id)
  }

  /**
   * updateCoupon
   * 
   *
   * @param coupon coupon 
   * @return Coupon
   */
  def updateCouponUsingPUT(coupon: Coupon): Option[Coupon] = {
    val await = Try(Await.result(updateCouponUsingPUTAsync(coupon), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * updateCoupon asynchronously
   * 
   *
   * @param coupon coupon 
   * @return Future(Coupon)
   */
  def updateCouponUsingPUTAsync(coupon: Coupon): Future[Coupon] = {
      helper.updateCouponUsingPUT(coupon)
  }

}

class CouponResourceApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def createCouponUsingPOST(coupon: Coupon)(implicit reader: ClientResponseReader[Coupon], writer: RequestWriter[Coupon]): Future[Coupon] = {
    // create path and map variables
    val path = (addFmt("/api/coupons"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (coupon == null) throw new Exception("Missing required parameter 'coupon' when calling CouponResourceApi->createCouponUsingPOST")

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(coupon))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteCouponUsingDELETE(id: Long)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/api/coupons/{id}")
      replaceAll("\\{" + "id" + "\\}", id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getAllCouponsUsingGET()(implicit reader: ClientResponseReader[List[Coupon]]): Future[List[Coupon]] = {
    // create path and map variables
    val path = (addFmt("/api/coupons"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getCouponUsingGET(id: Long)(implicit reader: ClientResponseReader[Coupon]): Future[Coupon] = {
    // create path and map variables
    val path = (addFmt("/api/coupons/{id}")
      replaceAll("\\{" + "id" + "\\}", id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def updateCouponUsingPUT(coupon: Coupon)(implicit reader: ClientResponseReader[Coupon], writer: RequestWriter[Coupon]): Future[Coupon] = {
    // create path and map variables
    val path = (addFmt("/api/coupons"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (coupon == null) throw new Exception("Missing required parameter 'coupon' when calling CouponResourceApi->updateCouponUsingPUT")

    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(coupon))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
