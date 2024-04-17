package io.github.enyason.predictions.models

import com.google.gson.annotations.SerializedName

data class Prediction(
    var id: String? = null,
    var model: String? = null,
    var version: String? = null,
    var input: Input? = null,
    var logs: String? = null,
    var output: String? = null,
    var error: String? = null,
    var status: String? = null,
    var source: String? = null,
    @SerializedName("created_at")
    var createdAt: String? = null,
    @SerializedName("started_at")
    var startedAt: String? = null,
    @SerializedName("completed_at")
    var completedAt: String? = null,
    var metrics: Metrics? = null,
    var urls: Urls? = null
)
