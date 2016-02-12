package io.swagger.client.model

import org.joda.time.DateTime



case class AggregatedCorrelation (
  /* id */
  id: Integer,
  /* Pearson correlation coefficient between cause and effect measurements */
  correlation: Float,
  /* variable ID of the cause variable for which the user desires correlations */
  cause_id: Integer,
  /* variable ID of the effect variable for which the user desires correlations */
  effect_id: Integer,
  /* User estimated or default time after cause measurement before a perceivable effect is observed */
  onset_delay: Integer,
  /* Time over which the cause is expected to produce a perceivable effect following the onset delay */
  duration_of_action: Integer,
  /* Number of points that went into the correlation calculation */
  number_of_pairs: Integer,
  /* cause value that predicts an above average effect value (in default unit for cause variable) */
  value_predicting_high_outcome: Float,
  /* cause value that predicts a below average effect value (in default unit for cause variable) */
  value_predicting_low_outcome: Float,
  /* Optimal Pearson Product */
  optimal_pearson_product: Float,
  /* Vote */
  vote: Float,
  /* Number of Users by which correlation is aggregated */
  number_of_users: Integer,
  /* Number of Correlations by which correlation is aggregated */
  number_of_correlations: Integer,
  /* A function of the effect size and sample size */
  statistical_significance: Float,
  /* Unit of the predictor variable */
  cause_unit: String,
  /* Unit ID of the predictor variable */
  cause_unit_id: Integer,
  /* Cause changes */
  cause_changes: Integer,
  /* Effect changes */
  effect_changes: Integer,
  /* Aggregated QM Score */
  aggregate_qm_score: Float,
  /* When the record was first created. Use ISO 8601 datetime format */
  created_at: DateTime,
  /* When the record in the database was last updated. Use ISO 8601 datetime format */
  updated_at: DateTime,
  /* Status */
  status: String,
  /* Error Message */
  error_message: String,
  /* Last Successful update time */
  last_successful_update_time: DateTime,
  /* Correlation when cause and effect are reversed. For any causal relationship, the forward correlation should exceed the reverse correlation */
  reverse_pearson_correlation_coefficient: Float,
  /* Predictive Pearson Correlation Coefficient */
  predictive_pearson_correlation_coefficient: Float,
  /* Source of data for this correlation */
  data_source: String)
  
