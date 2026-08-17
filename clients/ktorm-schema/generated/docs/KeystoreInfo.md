
# Table `KeystoreInfo`
(mapped from: KeystoreInfo)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**aliases** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;KeystoreItems&gt;**](KeystoreItems.md) |  |  [optional]
**exists** | exists | boolean |  | **kotlin.Boolean** | False if truststore don&#39;t exist |  [optional]


# **Table `KeystoreInfoKeystoreItems`**
(mapped from: KeystoreInfoKeystoreItems)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
keystoreInfo | keystoreInfo | long | | kotlin.Long | Primary Key | *one*
keystoreItems | keystoreItems | long | | kotlin.Long | Foreign Key | *many*




