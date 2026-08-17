
# Table `BundleData`
(mapped from: BundleData)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** | Bundle ID |  [optional]
**name** | name | text |  | **kotlin.String** | Bundle name |  [optional]
**fragment** | fragment | boolean |  | **kotlin.Boolean** | Is bundle a fragment |  [optional]
**stateRaw** | stateRaw | int |  | **kotlin.Int** | Numeric raw bundle state value |  [optional]
**state** | state | text |  | **kotlin.String** | Bundle state value |  [optional]
**version** | version | text |  | **kotlin.String** | Bundle version |  [optional]
**symbolicName** | symbolicName | text |  | **kotlin.String** | Bundle symbolic name |  [optional]
**category** | category | text |  | **kotlin.String** | Bundle category |  [optional]
**props** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;BundleDataProp&gt;**](BundleDataProp.md) |  |  [optional]










# **Table `BundleDataBundleDataProp`**
(mapped from: BundleDataBundleDataProp)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
bundleData | bundleData | long | | kotlin.Long | Primary Key | *one*
bundleDataProp | bundleDataProp | long | | kotlin.Long | Foreign Key | *many*



