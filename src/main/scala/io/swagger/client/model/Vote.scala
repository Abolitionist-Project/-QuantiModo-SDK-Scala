package io.swagger.client.model

import org.joda.time.DateTime



case class Vote (
  /* id */
  id: Integer,
  /* client_id */
  client_id: String,
  /* ID of User */
  user_id: Integer,
  /* ID of the predictor variable */
  cause_id: Integer,
  /* ID of effect variable */
  effect_id: Integer,
  /* Value of Vote */
  value: Integer,
  /* When the record was first created. Use ISO 8601 datetime format */
  created_at: DateTime,
  /* When the record in the database was last updated. Use ISO 8601 datetime format */
  updated_at: DateTime)
  
