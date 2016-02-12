package io.swagger.client.api

import io.swagger.client.model.Number
import io.swagger.client.model.Inline_response_200_31
import io.swagger.client.model.VariableCategory
import io.swagger.client.model.Inline_response_200_32
import io.swagger.client.model.Inline_response_200_2
import io.swagger.client.ApiInvoker
import io.swagger.client.ApiException

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class VariableCategoryApi(val defBasePath: String = "https://app.quantimo.do/api/v2",
                        defApiInvoker: ApiInvoker = ApiInvoker) {
  var basePath = defBasePath
  var apiInvoker = defApiInvoker

  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  
  /**
   * Get all VariableCategories
   * The variable categories include Activity, Causes of Illness, Cognitive Performance, Conditions, Environment, Foods, Location, Miscellaneous, Mood, Nutrition, Physical Activity, Physique, Sleep, Social Interactions, Symptoms, Treatments, Vital Signs, and Work.
   * @param accessToken User&#39;s OAuth2 access token
   * @param name Name of the category
   * @param fillingValue Value for replacing null measurements
   * @param maximumAllowedValue Maximum recorded value of this category
   * @param minimumAllowedValue Minimum recorded value of this category
   * @param durationOfAction Estimated number of seconds following the onset delay in which a stimulus produces a perceivable effect
   * @param onsetDelay Estimated number of seconds that pass before a stimulus produces a perceivable effect
   * @param combinationOperation How to combine values of this variable (for instance, to see a summary of the values over a month) SUM or MEAN
   * @param updated updated
   * @param causeOnly A value of 1 indicates that this category is generally a cause in a causal relationship.  An example of a causeOnly category would be a category such as Work which would generally not be influenced by the behaviour of the user
   * @param public Is category public
   * @param outcome outcome
   * @param createdAt When the record was first created. Use ISO 8601 datetime format
   * @param updatedAt When the record was last updated. Use ISO 8601 datetime format
   * @param imageUrl Image URL
   * @param defaultUnitId ID of the default unit for the category
   * @param limit The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0. The maximum limit is 200 records.
   * @param offset OFFSET says to skip that many rows before beginning to return rows to the client. OFFSET 0 is the same as omitting the OFFSET clause. If both OFFSET and LIMIT appear, then OFFSET rows are skipped before starting to count the LIMIT rows that are returned.
   * @param sort Sort by given field. If the field is prefixed with &#39;-&#39;, it will sort in descending order.
   * @return Inline_response_200_31
   */
  def variableCategoriesGet (accessToken: String, name: String, fillingValue: Number, maximumAllowedValue: Number, minimumAllowedValue: Number, durationOfAction: Integer, onsetDelay: Integer, combinationOperation: String, updated: Integer, causeOnly: Boolean, public: Integer, outcome: Boolean, createdAt: String, updatedAt: String, imageUrl: String, defaultUnitId: Integer, limit: Integer, offset: Integer, sort: String) : Option[Inline_response_200_31] = {
    // create path and map variables
    val path = "/variableCategories".replaceAll("\\{format\\}","json")

    val contentTypes = List("application/json", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    if(String.valueOf(accessToken) != "null") queryParams += "access_token" -> accessToken.toString
    if(String.valueOf(name) != "null") queryParams += "name" -> name.toString
    if(String.valueOf(fillingValue) != "null") queryParams += "filling_value" -> fillingValue.toString
    if(String.valueOf(maximumAllowedValue) != "null") queryParams += "maximum_allowed_value" -> maximumAllowedValue.toString
    if(String.valueOf(minimumAllowedValue) != "null") queryParams += "minimum_allowed_value" -> minimumAllowedValue.toString
    if(String.valueOf(durationOfAction) != "null") queryParams += "duration_of_action" -> durationOfAction.toString
    if(String.valueOf(onsetDelay) != "null") queryParams += "onset_delay" -> onsetDelay.toString
    if(String.valueOf(combinationOperation) != "null") queryParams += "combination_operation" -> combinationOperation.toString
    if(String.valueOf(updated) != "null") queryParams += "updated" -> updated.toString
    if(String.valueOf(causeOnly) != "null") queryParams += "cause_only" -> causeOnly.toString
    if(String.valueOf(public) != "null") queryParams += "public" -> public.toString
    if(String.valueOf(outcome) != "null") queryParams += "outcome" -> outcome.toString
    if(String.valueOf(createdAt) != "null") queryParams += "created_at" -> createdAt.toString
    if(String.valueOf(updatedAt) != "null") queryParams += "updated_at" -> updatedAt.toString
    if(String.valueOf(imageUrl) != "null") queryParams += "image_url" -> imageUrl.toString
    if(String.valueOf(defaultUnitId) != "null") queryParams += "default_unit_id" -> defaultUnitId.toString
    if(String.valueOf(limit) != "null") queryParams += "limit" -> limit.toString
    if(String.valueOf(offset) != "null") queryParams += "offset" -> offset.toString
    if(String.valueOf(sort) != "null") queryParams += "sort" -> sort.toString
    
    
    

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      postBody = mp
    }
    else {
      
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[Inline_response_200_31]).asInstanceOf[Inline_response_200_31])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
  /**
   * Store VariableCategory
   * Store VariableCategory
   * @param accessToken User&#39;s OAuth2 access token
   * @param body VariableCategory that should be stored
   * @return Inline_response_200_32
   */
  def variableCategoriesPost (accessToken: String, body: VariableCategory) : Option[Inline_response_200_32] = {
    // create path and map variables
    val path = "/variableCategories".replaceAll("\\{format\\}","json")

    val contentTypes = List("application/json", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    if(String.valueOf(accessToken) != "null") queryParams += "access_token" -> accessToken.toString
    
    
    

    var postBody: AnyRef = body

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      postBody = mp
    }
    else {
      
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[Inline_response_200_32]).asInstanceOf[Inline_response_200_32])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
  /**
   * Get VariableCategory
   * Get VariableCategory
   * @param id id of VariableCategory
   * @param accessToken User&#39;s OAuth2 access token
   * @return Inline_response_200_32
   */
  def variableCategoriesIdGet (id: Integer, accessToken: String) : Option[Inline_response_200_32] = {
    // create path and map variables
    val path = "/variableCategories/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

    

    val contentTypes = List("application/json", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    if(String.valueOf(accessToken) != "null") queryParams += "access_token" -> accessToken.toString
    
    
    

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      postBody = mp
    }
    else {
      
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[Inline_response_200_32]).asInstanceOf[Inline_response_200_32])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
  /**
   * Update VariableCategory
   * Update VariableCategory
   * @param id id of VariableCategory
   * @param accessToken User&#39;s OAuth2 access token
   * @param body VariableCategory that should be updated
   * @return Inline_response_200_2
   */
  def variableCategoriesIdPut (id: Integer, accessToken: String, body: VariableCategory) : Option[Inline_response_200_2] = {
    // create path and map variables
    val path = "/variableCategories/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

    

    val contentTypes = List("application/json", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    if(String.valueOf(accessToken) != "null") queryParams += "access_token" -> accessToken.toString
    
    
    

    var postBody: AnyRef = body

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      postBody = mp
    }
    else {
      
    }

    try {
      apiInvoker.invokeApi(basePath, path, "PUT", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[Inline_response_200_2]).asInstanceOf[Inline_response_200_2])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
  /**
   * Delete VariableCategory
   * Delete VariableCategory
   * @param id id of VariableCategory
   * @param accessToken User&#39;s OAuth2 access token
   * @return Inline_response_200_2
   */
  def variableCategoriesIdDelete (id: Integer, accessToken: String) : Option[Inline_response_200_2] = {
    // create path and map variables
    val path = "/variableCategories/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}",apiInvoker.escape(id))

    

    val contentTypes = List("application/json", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    if(String.valueOf(accessToken) != "null") queryParams += "access_token" -> accessToken.toString
    
    
    

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      postBody = mp
    }
    else {
      
    }

    try {
      apiInvoker.invokeApi(basePath, path, "DELETE", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[Inline_response_200_2]).asInstanceOf[Inline_response_200_2])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
}
