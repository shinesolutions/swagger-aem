
# Table `KeystoreItems`
(mapped from: KeystoreItems)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**alias** | alias | text |  | **kotlin.String** | Keystore alias name |  [optional]
**entryType** | entryType | text |  | **kotlin.String** | e.g. \&quot;privateKey\&quot; |  [optional]
**algorithm** | algorithm | text |  | **kotlin.String** | e.g. \&quot;RSA\&quot; |  [optional]
**format** | format | text |  | **kotlin.String** | e.g. \&quot;PKCS#8\&quot; |  [optional]
**chain** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;KeystoreChainItems&gt;**](KeystoreChainItems.md) |  |  [optional]






# **Table `KeystoreItemsKeystoreChainItems`**
(mapped from: KeystoreItemsKeystoreChainItems)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
keystoreItems | keystoreItems | long | | kotlin.Long | Primary Key | *one*
keystoreChainItems | keystoreChainItems | long | | kotlin.Long | Foreign Key | *many*



