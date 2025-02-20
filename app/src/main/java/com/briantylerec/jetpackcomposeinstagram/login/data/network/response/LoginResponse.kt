package com.briantylerec.jetpackcomposeinstagram.login.data.network.response

import com.google.gson.annotations.SerializedName

data class LoginResponse (
    @SerializedName("data") val data: List<DataItem>
)

data class DataItem(
    @SerializedName("id") val id: Int,
    @SerializedName("sid") val sid: String,
    @SerializedName("date") val date: String,
    @SerializedName("title") val title: String,
    @SerializedName("type_id") val typeId: Int,
    @SerializedName("notice_type_id") val noticeTypeId: Int,
    @SerializedName("regime") val regime: String,
    @SerializedName("category") val category: String,
    @SerializedName("contracting_authority_id") val contractingAuthorityId: Int,
    @SerializedName("contracting_authority_type_id") val contractingAuthorityTypeId: Int,
    @SerializedName("cpv_count") val cpvCount: Int,
    @SerializedName("not_empty_sections_count") val notEmptySectionsCount: Int,
    @SerializedName("procurement_id") val procurementId: Int,
    @SerializedName("procurement_sid") val procurementSid: String
)
