package io.swagger.client.model

import org.joda.time.DateTime



case class Source (
  /* id */
  id: Integer,
  /* client_id */
  client_id: String,
  /* Name of the application or device */
  name: String,
  /* When the record was first created. Use ISO 8601 datetime format */
  created_at: DateTime,
  /* When the record in the database was last updated. Use ISO 8601 datetime format */
  updated_at: DateTime)
  
