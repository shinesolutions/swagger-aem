
# Table `BundleInfo`
(mapped from: BundleInfo)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**status** | status | text |  | **kotlin.String** | Status description of all bundles |  [optional]
**s** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.Int&gt;** |  |  [optional]
**data** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;BundleData&gt;**](BundleData.md) |  |  [optional]



# **Table `BundleInfoS`**
(mapped from: BundleInfoS)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
bundleInfo | bundleInfo | long | | kotlin.Long | Primary Key | *one*
s | s | int | | kotlin.Int | Foreign Key | *many*



# **Table `BundleInfoBundleData`**
(mapped from: BundleInfoBundleData)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
bundleInfo | bundleInfo | long | | kotlin.Long | Primary Key | *one*
bundleData | bundleData | long | | kotlin.Long | Foreign Key | *many*



