
# Table `TruststoreInfo`
(mapped from: TruststoreInfo)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**aliases** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;TruststoreItems&gt;**](TruststoreItems.md) |  |  [optional]
**exists** | exists | boolean |  | **kotlin.Boolean** | False if truststore don&#39;t exist |  [optional]


# **Table `TruststoreInfoTruststoreItems`**
(mapped from: TruststoreInfoTruststoreItems)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
truststoreInfo | truststoreInfo | long | | kotlin.Long | Primary Key | *one*
truststoreItems | truststoreItems | long | | kotlin.Long | Foreign Key | *many*




